package org.email;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public class Test {
	public static void main(String[] args) throws AddressException, MessagingException {
		MonitoringMail obj = new MonitoringMail();
		obj.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, TestConfig.messageBody);
	}

}
