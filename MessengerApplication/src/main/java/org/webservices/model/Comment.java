package org.webservices.model;

import java.util.Date;

import jakarta.json.bind.annotation.JsonbAnnotation;

@JsonbAnnotation
public class Comment{

	private Integer id;
	private String message;
	private String Author;
	private Date created;
	
	
	public Comment() {
	
	}
	public Comment(Integer id, String message, String author, Date created) {
		super();
		this.id = id;
		this.message = message;
		Author = author;
		this.created = created;
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
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	
	
	
}
