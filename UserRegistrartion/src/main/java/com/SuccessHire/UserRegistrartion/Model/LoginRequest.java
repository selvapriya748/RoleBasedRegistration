package com.SuccessHire.UserRegistrartion.Model;

import java.util.Set;

public class LoginRequest {

	private String Username;
	private String password;
	private Set<Role> rolename;
	
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Set<Role> getRolename() {
		return rolename;
	}
	public void setRolename(Set<Role> set) {
		this.rolename = set;
	}
	
	
	public LoginRequest() {

		// TODO Auto-generated constructor stub
	}
	
	public LoginRequest(String username, String password, Set<Role> rolename) {
		
		Username = username;
		this.password = password;
		this.rolename = rolename;
	}
	@Override
	public String toString() {
		return "LoginRequest [Username=" + Username + ", password=" + password + ", rolename=" + rolename + "]";
	}
	
	
}
