package org.webservices.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.webservices.database.DatabaseConnection;
import org.webservices.model.Message;

public class MessageService {

	private Map<Integer, Message> messages = DatabaseConnection.getMessages();

	public MessageService() {
		
		/*
		 * messages.put(1,new Message(1,"I am at CL","Haseeb")); messages.put(2,new
		 * Message(2,"I am at Home","Zoha"));
		 */
		 

	}

	public List<Message> getAllMessagesForYear(Integer year) {
		List<Message> messagesForYear = new ArrayList<>();
		Calendar calendar = Calendar.getInstance();
		for (Message message : messages.values()) {
			calendar.setTime(message.getCreated());
			if (calendar.get(Calendar.YEAR) == year) {
				messagesForYear.add(message);
			}
		}
		return messagesForYear;

	}

	public List<Message> getAllMessagesPaginated(int start, int size) {
		ArrayList<Message> list = new ArrayList<Message>(messages.values());
		if (start + size > list.size()) {
			return new ArrayList<Message>();
		}
		return list.subList(start, start + size);
	}

	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values());
	}

	public Message getMessage(Integer id) {
		return messages.get(id);
	}

	public Message addMessage(Message message) {
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}

	public Message updateMessage(Message message) {
		if (message.getId() <= 0) {
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}

	public Message removeMessage(Integer id) {
		return messages.remove(id);
	}

}
