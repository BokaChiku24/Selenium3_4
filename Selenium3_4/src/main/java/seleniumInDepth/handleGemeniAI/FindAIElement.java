package seleniumInDepth.handleGemeniAI;

import java.io.IOException;
import java.time.Duration;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoSuchElementException; // Import NoSuchElementException

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class FindAIElement {

	// IMPORTANT: In a real application, keep API keys secure (e.g., environment variables).
	// For demonstration purposes, it's placed here.
	static String GEMINI_API_KEY = "AIzaSyCl4QFPQBH1KbfKJINgoqTO3TBviB3MNNs";

	/**
	 * Makes a call to the Gemini AI API to generate an XPath for a given element description.
	 *
	 * @param elementDescription A natural language description of the web element.
	 * @return A string containing the AI-generated XPath.
	 * @throws IOException If there's an issue with the HTTP request or response.
	 * @throws JSONException If there's an issue parsing the JSON response from Gemini.
	 */
	public static String getAIEnhancedXPath(String elementDescription) throws IOException, JSONException {
		OkHttpClient client = new OkHttpClient();

		// Refined prompt: Clearly instruct Gemini to provide ONLY the raw XPath.
		String prompt = "Generate an optimized xPath for the following WebElement based on its description: '"
				+ elementDescription + "'. Provide only the raw xPath string without any explanation, markdown formatting (like ```xpath), or additional text. Ensure it's a valid and complete XPath expression.";

		JSONObject json = new JSONObject();
		json.put("contents", new JSONArray()
				.put(new JSONObject().put("parts", new JSONArray().put(new JSONObject().put("text", prompt)))));

		RequestBody body = RequestBody.create(json.toString(), MediaType.get("application/json; charset=utf-8"));

		Request request = new Request.Builder().url(
				"https://generativelanguage.googleapis.com/v1/models/gemini-pro:generateContent?key=" + GEMINI_API_KEY)
				.post(body).build();

		Response response = null;
		String responseData = "";
		try {
			response = client.newCall(request).execute();
			// Use response.body().string() to get the actual content of the response body.
			responseData = response.body().string();
		} finally {
			if (response != null && response.body() != null) {
				response.body().close(); // Ensure the response body is closed
			}
		}

		System.out.println("Gemini AI raw response: " + responseData);

		JSONObject jsonResponse = new JSONObject(responseData);

		// Basic validation for the expected JSON structure
		if (!jsonResponse.has("candidates") || jsonResponse.getJSONArray("candidates").isEmpty()) {
			throw new JSONException("Invalid Gemini API response: 'candidates' key is missing or empty.");
		}

		JSONObject candidate = jsonResponse.getJSONArray("candidates").getJSONObject(0);
		if (!candidate.has("content") || !candidate.getJSONObject("content").has("parts")
				|| candidate.getJSONObject("content").getJSONArray("parts").isEmpty()) {
			throw new JSONException("Invalid Gemini API response: 'content' or 'parts' missing/empty in candidate.");
		}

		// Extract the raw xPath from the first part of the first candidate
		String rawXPath = candidate.getJSONObject("content").getJSONArray("parts").getJSONObject(0).getString("text").trim();

		// Clean up any remaining markdown or unwanted characters, although the prompt tries to prevent this.
		rawXPath = rawXPath.replaceAll("```xpath", "").replaceAll("```", "").trim();

		return rawXPath;
	}

	public static void main(String[] args) {

		WebDriver driver = null; // Initialize driver to null for proper cleanup
		try {
			driver = new ChromeDriver();
			driver.manage().window().maximize(); // Maximize window for better visibility
			driver.get("https://www.gmail.com");

			System.out.println("Navigated to Gmail.com");

			// AI Generate xPath for an element commonly found on the initial Gmail page
			String elementDescription = "Forgot email link"; // Target the "Forgot email?" link
			String aiGeneratedXPath = getAIEnhancedXPath(elementDescription);
			System.out.println("AI Generated XPath for '" + elementDescription + "': " + aiGeneratedXPath);

			// Attempt to find and click the element using the AI-generated XPath
			try {
				// Wait a bit to ensure the page is loaded and element is present
				// In a real scenario, use WebDriverWait for explicit waits.
				Thread.sleep(Duration.ofSeconds(10));

				WebElement element = driver.findElement(By.xpath(aiGeneratedXPath));
				System.out.println("Found element using AI-generated XPath: " + element.getText());
				element.click();
				System.out.println("Clicked the element: " + elementDescription);

				// Wait to observe the result of the click
				Thread.sleep(Duration.ofSeconds(10));

			} catch (NoSuchElementException e) {
				System.err.println("Error: Element with AI-generated XPath '" + aiGeneratedXPath + "' not found.");
				e.printStackTrace(); // Print stack trace for debugging
			} catch (InterruptedException e) {
				System.err.println("Thread sleep interrupted.");
				Thread.currentThread().interrupt(); // Restore interrupt status
			}

		} catch (IOException e) {
			System.err.println("An I/O error occurred during API call or web interaction: " + e.getMessage());
			e.printStackTrace();
		} catch (JSONException e) {
			System.err.println("Error parsing JSON response from Gemini API: " + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("An unexpected error occurred: " + e.getMessage());
			e.printStackTrace();
		} finally {
			if (driver != null) {
				driver.quit(); // Ensure the browser is closed even if an error occurs
				System.out.println("Browser closed.");
			}
		}
	}
}
