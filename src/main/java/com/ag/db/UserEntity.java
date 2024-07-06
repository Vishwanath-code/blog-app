package com.ag.db;

import java.time.LocalDate;



import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "TBL_USER")
public class UserEntity {

	@jakarta.persistence.Id
	@jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
	private Integer id;
	
	@jakarta.persistence.Column(unique = true)
	private String email;
	private String userFName;
	private String userLName;
	private String pwd;

	@CreationTimestamp
	private LocalDate createdOn;

	@UpdateTimestamp
	private LocalDate updatedOn;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserFName() {
		return userFName;
	}

	public void setUserFName(String userFName) {
		this.userFName = userFName;
	}

	public String getUserLName() {
		return userLName;
	}

	public void setUserLName(String userLName) {
		this.userLName = userLName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
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

	public UserEntity(Integer id, String email, String userFName, String userLName, String pwd, LocalDate createdOn,
			LocalDate updatedOn) {
		super();
		this.id = id;
		this.email = email;
		this.userFName = userFName;
		this.userLName = userLName;
		this.pwd = pwd;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
	}

	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
