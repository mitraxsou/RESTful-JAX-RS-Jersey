package org.soumitra.restapi.messanger.resources;


import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.soumitra.restapi.messanger.model.Profile;
import org.soumitra.restapi.messanger.services.ProfileServices;

@Path("profiles")
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})

public class ProfileResources {
	
	ProfileServices profileservices = new ProfileServices();
	
	@GET
	public List<Profile> getAllProfile() {
		
		return  profileservices.getAllProfiles();
		
	}
	
	@GET
	@Path("/{profileName}")
	public Profile getProfile(@PathParam ("profileName") String profileName ) {
		
		return profileservices.getProfile(profileName);
	}
	
	@POST
	public Profile postProfile(Profile profile) {
		
		return profileservices.addProfile(profile);
	}
	
	
	

}
