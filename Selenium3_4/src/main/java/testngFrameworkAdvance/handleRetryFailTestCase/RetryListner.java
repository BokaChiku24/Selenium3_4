package testngFrameworkAdvance.handleRetryFailTestCase;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class RetryListner implements IAnnotationTransformer {

	@SuppressWarnings("rawtypes")
	@Override
	public void transform(final ITestAnnotation annotation, final Class testClass, final Constructor testConstructor,
			final Method testMethod) {
		annotation.setRetryAnalyzer(Retry.class);

	}

}
