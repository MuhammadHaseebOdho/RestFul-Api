package org.webservices.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import jakarta.json.bind.annotation.JsonbAnnotation;
//import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.json.bind.annotation.JsonbTransient;



@JsonbAnnotation
public class Message {

	private Integer id;
	private String message;
	private Date created;
	private String author;
	private Map<Integer,Comment> comments=new HashMap<>();

	public Message() {

	}

	public Message(Integer id, String message, String author) {
		super();
		this.id = id;
		this.message = message;
		this.created = new Date();
		this.author = author;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
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

	@JsonbTransient
	public Map<Integer, Comment> getComments() {
		return comments;
	}

	public void setComments(Map<Integer, Comment> comments) {
		this.comments = comments;
	}
	
	

}
