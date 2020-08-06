package com.factorymethod.implemented;

import com.factorymethod.interf.NotificationService;

public class PaperNotification implements NotificationService {

	@Override
	public void sendNotifications() {
		// TODO Auto-generated method stub
		System.out.println("sending paper notification");
	}
}
