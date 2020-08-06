package com.factorymethod.implemented;

import com.factorymethod.interf.NotificationService;

public class SmsNotification implements NotificationService {
	
	@Override
	public void sendNotifications() {
		System.out.println("Sending SMS Notification");
	}
	
}
