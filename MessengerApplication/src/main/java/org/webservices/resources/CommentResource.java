package org.webservices.resources;

import java.util.List;

import org.webservices.Service.CommentService;
import org.webservices.model.Comment;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public class CommentResource {

	private CommentService commentService = new CommentService();


	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Comment> getAllComments(@PathParam("messageId") Integer messageId) {
		return commentService.getAllComments(messageId);
	}

	@GET
	@Path("/{commentId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Comment getComment(@PathParam("messageId") Integer messageId, @PathParam("commentId") Integer commentId) {
		return commentService.getComment(messageId, commentId);
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Comment addComment(@PathParam("messageId") Integer messageId, Comment comment) {

		return commentService.addComment(messageId, comment);
	}

	@PUT
	@Path("/{commentId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Comment updateComment(@PathParam("messageId") Integer messageId, @PathParam("commentId") Integer commentId,
			Comment comment) {
		comment.setId(commentId);
		return commentService.updateComment(messageId, comment);

	}

	@DELETE
	@Path("/{commentId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Comment deleteComment(@PathParam("messageId") Integer messageId, @PathParam("commentId") Integer commentId) {
		return commentService.removeComment(messageId, commentId);
	}

}
