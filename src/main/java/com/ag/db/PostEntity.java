package com.ag.db;

import java.time.LocalDate;



import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Table(name = "TBL_POST")
@Entity
public class PostEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer post_id;

	private String description;
	private String title;
	
	private boolean deleted;

	@Lob
	private String content;

	@CreationTimestamp
	@jakarta.persistence.Column(updatable = false)
	private LocalDate createdOn;

	@UpdateTimestamp
	@Column(updatable = true)
	private LocalDate updatedOn;

	@ManyToOne
	@JoinColumn(name = "user_id")
	UserEntity user;

	public Integer getPost_id() {
		return post_id;
	}

	public void setPost_id(Integer post_id) {
		this.post_id = post_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public LocalDate getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(LocalDate updatedOn) {
		this.updatedOn = updatedOn;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public PostEntity(Integer post_id, String description, String title, boolean deleted, String content,
			LocalDate createdOn, LocalDate updatedOn, UserEntity user) {
		super();
		this.post_id = post_id;
		this.description = description;
		this.title = title;
		this.deleted = deleted;
		this.content = content;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.user = user;
	}

	public PostEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
