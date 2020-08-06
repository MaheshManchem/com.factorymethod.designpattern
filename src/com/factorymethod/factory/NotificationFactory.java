package com.factorymethod.factory;

import com.factorymethod.implemented.MailNotifications;
import com.factorymethod.implemented.PaperNotification;
import com.factorymethod.implemented.SmsNotification;
import com.factorymethod.interf.NotificationService;

public class NotificationFactory {
	String mail = "mail";
	String sms  = "sms";
	String paper = "paper";
	
	public NotificationService createNotification(String type) {
		
		if(type == null || type.isEmpty()) {
			return null;
		}
		
		if(type == sms) {
			return new SmsNotification();
		}
		
		if(type == mail) {
			return new MailNotifications();
		}
		
		if(type == paper) {
			return new PaperNotification();
		}
		return null;
	}
}