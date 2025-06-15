package org.log4J2;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class TestLog4J {

	
	static Logger log = LogManager.getLogger(TestLog4J.class);
	
	public static void main(String[] args) {


		log.debug("This is a Debug Log");
		log.info("This is a Info Log");
		log.error("Error in a Project");
	}

}
