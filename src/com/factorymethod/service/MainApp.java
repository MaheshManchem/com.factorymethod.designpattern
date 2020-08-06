package com.factorymethod.service;

import com.factorymethod.factory.NotificationFactory;
import com.factorymethod.interf.NotificationService;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NotificationFactory factory = new NotificationFactory();
		NotificationService service = factory.createNotification("mail");
	
		service.sendNotifications();
	}

}
