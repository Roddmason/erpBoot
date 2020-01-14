package com.elitsoft.erp.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "_erpuser")
public class UserModel {
	
	@Id
	private Integer id;
	private String name;
	private String lastName;
	private String mail;
	private String credentialID;
	private Integer PersonalID;
	private String job_title;
	private Integer salary;
	private String notes;
	private String password;
	private Date birthday;
	private Date creation_date;
	private Date updated_at;
	private Integer companyID;
	private boolean enabled;
	private boolean admin;
	private String profile;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getCredentialID() {
		return credentialID;
	}
	public void setCredentialID(String credentialID) {
		this.credentialID = credentialID;
	}
	public Integer getPersonalID() {
		return PersonalID;
	}
	public void setPersonalID(Integer personalID) {
		PersonalID = personalID;
	}
	public String getJob_title() {
		return job_title;
	}
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Date getCreation_date() {
		return creation_date;
	}
	public void setCreation_date(Date creation_date) {
		this.creation_date = creation_date;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	public Integer getCompanyID() {
		return companyID;
	}
	public void setCompanyID(Integer companyID) {
		this.companyID = companyID;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	
	public UserModel(Integer id, String name, String lastName, String mail, String credentialID, Integer personalID,
			String job_title, Integer salary, String notes, String password, Date birthday, Date creation_date,
			Date updated_at, Integer companyID, boolean enabled, boolean admin, String profile) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.mail = mail;
		this.credentialID = credentialID;
		PersonalID = personalID;
		this.job_title = job_title;
		this.salary = salary;
		this.notes = notes;
		this.password = password;
		this.birthday = birthday;
		this.creation_date = creation_date;
		this.updated_at = updated_at;
		this.companyID = companyID;
		this.enabled = enabled;
		this.admin = admin;
		this.profile = profile;
	}
	
	public UserModel() {
		super();
	}
}
