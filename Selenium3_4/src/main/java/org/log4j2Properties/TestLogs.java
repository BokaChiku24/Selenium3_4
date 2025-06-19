package org.log4j2Properties;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestLogs {
	
	
	public static Logger log = LogManager.getLogger(TestLogs.class.getName());

	public static void main(String[] args) {
		
		System.setProperty("log4j.configurationFile", "./src/main/resources/log4j2_properties/log4j2.properties");
		log.error("Test Error");

	}

}
