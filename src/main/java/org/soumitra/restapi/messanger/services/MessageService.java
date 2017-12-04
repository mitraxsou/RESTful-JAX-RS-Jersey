package org.soumitra.restapi.messanger.services;

import java.util.ArrayList;
import java.util.List;

import org.soumitra.restapi.messanger.model.Messages;

public class MessageService {

	
	public List<Messages> getAllMessages(){
		Messages m1= new Messages(1, "hello msg 1", "soumitra");
		Messages m2 = new Messages(2, "hello msg 2", "mandl");
		
		List<Messages> list = new ArrayList<>();
		
		list.add(m1);
		list.add(m2);
		return list;
	}
}
