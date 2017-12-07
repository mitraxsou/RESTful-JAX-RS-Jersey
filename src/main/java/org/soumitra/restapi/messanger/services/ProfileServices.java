package org.soumitra.restapi.messanger.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.soumitra.restapi.messanger.database.DatabaseClass;
import org.soumitra.restapi.messanger.model.Profile;

public class ProfileServices {
	
	private static Map<String,Profile> profiles = DatabaseClass.getProfile();

	public ProfileServices() {
		
		profiles.put("soumitra", new Profile(1L, "profilename", "firstname", "lastname"));
	}
	
	public List<Profile> getAllProfiles(){
		
		return new ArrayList<>(profiles.values());
	}
	

}
