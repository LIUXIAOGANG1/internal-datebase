package com.gmail.zhangtiejun.spring.mvc.validation.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class User {
	@NotNull(message = "{validator.username.NotNull.message}")
	@Size(min = 2, max = 20, message = "{validator.username.Range.message}")
	private String username;
	
	@NotNull(message = "{validator.password.NotNull.message}")
	@Size(min = 6, max = 32, message = "{validator.password.Range.message}")
	private String password;
	
	@NotNull(message = "{validator.email.NotNull.message}")
	@Email(message = "{org.hibernate.validator.constraints.Email.message}")
	private String email;
	
	@Pattern(regexp="^[0]{1}[0-9]{2,3}-[0-9]{7,8}$", message="{validator.constraints.telephone.message}")
	private String telephone;
	
	@Pattern(regexp="^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$", message="{validator.constraints.mobile.message}")
	private String mobile;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", email=" + email + ", telephone=" + telephone + ", mobile=" + mobile + "]";
	}
}
