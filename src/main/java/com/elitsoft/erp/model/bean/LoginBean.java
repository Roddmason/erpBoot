package com.elitsoft.erp.model.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="_erpLogin")
public class LoginBean {
	
	@Id
	private Integer id;
	private String userId;
	private Date loginDate;
	private String ip;
	private String browser;
	private String version;
	private String platform;
	private String sistemaOperativo;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Date getLoginDate() {
		return loginDate;
	}
	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getBrowser() {
		return browser;
	}
	public void setBrowser(String browser) {
		this.browser = browser;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getSistemaOperativo() {
		return sistemaOperativo;
	}
	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}
	
	public LoginBean(Integer id, String userId, Date loginDate, String ip, String browser, String version,
			String platform, String sistemaOperativo) {
		super();
		this.id = id;
		this.userId = userId;
		this.loginDate = loginDate;
		this.ip = ip;
		this.browser = browser;
		this.version = version;
		this.platform = platform;
		this.sistemaOperativo = sistemaOperativo;
	}
	
	public LoginBean() {
		super();
	}
}
