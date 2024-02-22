package org.webservices.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.webservices.database.DatabaseConnection;
import org.webservices.model.Comment;
import org.webservices.model.Message;

public class CommentService {

	private Map<Integer, Message> messages = DatabaseConnection.getMessages();

	
	public List<Comment> getAllComments(Integer messageId) {
		Map<Integer, Comment> comments = messages.get(messageId).getComments();
		return new ArrayList<Comment>(comments.values());

	}

	public Comment getComment(Integer messageId, Integer commentId) {
		Map<Integer, Comment> comments = messages.get(messageId).getComments();
		return comments.get(commentId);

	}

	public Comment addComment(Integer messageId, Comment comment) {
		Map<Integer, Comment> comments = messages.get(messageId).getComments();
		comment.setId(comments.size() + 1);
		comments.put(comment.getId(), comment);
		return comment;
	}

	public Comment updateComment(Integer messageId, Comment comment) {
		Map<Integer, Comment> comments = messages.get(messageId).getComments();
		if (comment.getId() <= 0) {
			return null;
		}

		comments.put(comment.getId(), comment);
		return comment;

	}

	public Comment removeComment(Integer messageId, Integer commentId) {
		Map<Integer, Comment> comments = messages.get(messageId).getComments();
		return comments.remove(commentId);
	}

}
