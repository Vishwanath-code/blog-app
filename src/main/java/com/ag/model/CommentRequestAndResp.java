package com.ag.model;

import lombok.Data;

@Data
public class CommentRequestAndResp {
	
	private String commentId;
	private String name;
	private String email;
	private String comment;
	private Integer blogId;
	private String commentedOn;
	public String getCommentId() {
		return commentId;
	}
	public void setCommentId(String commentId) {
		this.commentId = commentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Integer getBlogId() {
		return blogId;
	}
	public void setBlogId(Integer blogId) {
		this.blogId = blogId;
	}
	public String getCommentedOn() {
		return commentedOn;
	}
	public void setCommentedOn(String commentedOn) {
		this.commentedOn = commentedOn;
	}
	public CommentRequestAndResp(String commentId, String name, String email, String comment, Integer blogId,
			String commentedOn) {
		super();
		this.commentId = commentId;
		this.name = name;
		this.email = email;
		this.comment = comment;
		this.blogId = blogId;
		this.commentedOn = commentedOn;
	}
	public CommentRequestAndResp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
