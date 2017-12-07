package org.soumitra.restapi.messanger.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.soumitra.restapi.messanger.database.DatabaseClass;
import org.soumitra.restapi.messanger.model.Message;

public class MessageService {

	
	private Map<Long, Message> messages= DatabaseClass.getMessages();
	
	public MessageService() {
		
		messages.put(1L, new Message(1, "Hey wassup", "soumitra mandal"));
	}


	public List<Message> getAllMessages(){
//		Message m1= new Message(1, "hello msg 1", "soumitra");
//		Message m2 = new Message(2, "hello msg 2", "mandl");
//		
//		List<Message> list = new ArrayList<>();
//		
//		list.add(m1);
//		list.add(m2);
//		return list;
		
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(long id) {
		return messages.get(id);
	}
	
	public Message addMessage(Message messageobj) {
		messageobj.setId(messages.size()+1);
		messageobj.setCreated();
		messages.put(messageobj.getId(), messageobj);
		return messageobj;
	}
	
	public Message deleteMessage(long id) {
		return messages.remove(id);
	}
	
	public void updateMessage(Message messageobj) {
		 messageobj.setCreated();
		 messages.put(messageobj.getId(), messageobj);
		
	}
}
