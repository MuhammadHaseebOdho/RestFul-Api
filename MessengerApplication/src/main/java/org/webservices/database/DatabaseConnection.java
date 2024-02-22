package org.webservices.database;

import java.util.HashMap;
import java.util.Map;

import org.webservices.model.Message;
import org.webservices.model.Profile;

public class DatabaseConnection {
	private static Map<Integer,Message> messages=new HashMap<>();
	private static Map<String,Profile> profiles=new HashMap<>();
	
	
	public static Map<Integer, Message> getMessages() {
		return messages;
	}
	public static void setMessages(Map<Integer, Message> messages) {
		DatabaseConnection.messages = messages;
	}
	public static Map<String, Profile> getProfiles() {
		return profiles;
	}
	public static void setProfiles(Map<String, Profile> profiles) {
		DatabaseConnection.profiles = profiles;
	}
	
	
	

}
