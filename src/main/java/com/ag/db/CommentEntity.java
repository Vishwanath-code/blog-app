package com.ag.db;

import java.time.LocalDate;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "TBL_COMMENT")
public class CommentEntity {

	@jakarta.persistence.Id
	@jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
	private Integer comment_id;

	private String name;
	private String email;
	private boolean deleted;
	@jakarta.persistence.Lob
	private String content;

	@CreationTimestamp
	private LocalDate createdOn;


	
	@jakarta.persistence.JoinColumn(name = "postId")
	@ManyToOne
	PostEntity post;


	public Integer getComment_id() {
		return comment_id;
	}


	public void setComment_id(Integer comment_id) {
		this.comment_id = comment_id;
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


	public boolean isDeleted() {
		return deleted;
	}


	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public LocalDate getCreatedOn() {
		return createdOn;
	}


	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}


	public PostEntity getPost() {
		return post;
	}


	public void setPost(PostEntity post) {
		this.post = post;
	}


	public CommentEntity(Integer comment_id, String name, String email, boolean deleted, String content,
			LocalDate createdOn, PostEntity post) {
		super();
		this.comment_id = comment_id;
		this.name = name;
		this.email = email;
		this.deleted = deleted;
		this.content = content;
		this.createdOn = createdOn;
		this.post = post;
	}


	public CommentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	
}
