package org.soumitra.restapi.messanger.database;

import java.util.HashMap;
import java.util.Map;

import org.soumitra.restapi.messanger.model.Message;
import org.soumitra.restapi.messanger.model.Profile;

public class DatabaseClass {

	private static Map <String, Profile> profiles = new HashMap<>();
	private static Map<Long, Message> messages = new HashMap<>();
	
	public static Map<Long, Message> getMessages (){
		return messages;
	}
	
	public static Map<String, Profile> getProfile (){
		return profiles;
	}
}
