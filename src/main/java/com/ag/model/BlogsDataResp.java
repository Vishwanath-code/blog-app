package com.ag.model;

import lombok.Data;

@Data
public class BlogsDataResp {

	private Integer userId;
	private String title;
	private String shortDescription;
	private String content;
	private Integer blogId;
	private String createdOn;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getBlogId() {
		return blogId;
	}
	public void setBlogId(Integer blogId) {
		this.blogId = blogId;
	}
	public String getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	public BlogsDataResp(Integer userId, String title, String shortDescription, String content, Integer blogId,
			String createdOn) {
		super();
		this.userId = userId;
		this.title = title;
		this.shortDescription = shortDescription;
		this.content = content;
		this.blogId = blogId;
		this.createdOn = createdOn;
	}
	public BlogsDataResp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
