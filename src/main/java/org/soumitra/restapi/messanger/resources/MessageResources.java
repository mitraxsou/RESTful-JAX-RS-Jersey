package org.soumitra.restapi.messanger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.soumitra.restapi.messanger.model.Message;
import org.soumitra.restapi.messanger.services.MessageService;

@Path("messages")
public class MessageResources {
	
	
	MessageService messageservice= new MessageService();
	
	@GET
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Message> getAllMessages() {
		
		return messageservice.getAllMessages();
	}
	
	
	
//	@Path("/{messageId}")
//	@GET
//	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
//	public /*List<Messages>*/ String getMessages(@PathParam ("messageId") String path) {
//		
//		return path;
//		//return messageservice.getAllMessages();
//	}
	
	@Path("/{messageId}")
	@GET
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Message getMessages(@PathParam ("messageId") long messageid) {
		
		return messageservice.getMessage(messageid);
		
	}
	@POST
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Consumes ({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Message addMessage(Message messageobj) {
		return messageservice.addMessage(messageobj);
		
	}
	
	@Path("/{messageId}")
	@DELETE
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Message  deleteMessage(@PathParam ("messageId") long messageid) {
		
		return  messageservice.deleteMessage(messageid);
		
	}
	
	@Path("/{messageId}")
	@PUT
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Message  updateMessage(@PathParam ("messageId") long messageid, Message messageobj) {
		if (messageid >= 0)
		messageobj.setId(messageid);
		messageservice.updateMessage(messageobj);
		return messageservice.getMessage(messageid);
		
	}
	
	
	

}
