package org.soumitra.restapi.messanger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.soumitra.restapi.messanger.model.Messages;
import org.soumitra.restapi.messanger.services.MessageService;

@Path("messages")
public class MessageResources {
	
	
	MessageService messageservice= new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Messages> getMessages() {
		
		return messageservice.getAllMessages();
	}
	
	

}
