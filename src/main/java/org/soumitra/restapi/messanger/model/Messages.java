package org.soumitra.restapi.messanger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Messages {
	private long id;
	private String msg;
	private Date created;
	private String author;
	
	
	
	public Messages() {
		//no op constructor
	}
	
	//cheat
	
	public Messages(long id, String msg, String author) {
		
		this.id=id;
		this.msg=msg;
		this.created=new Date();
		this.author=author;
		
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	

}
