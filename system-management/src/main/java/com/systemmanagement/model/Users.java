package com.systemmanagement.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

import javax.annotation.Generated;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Document(collection="users")
public class Users {

	  @Id
	  private String id;

	  @NotBlank
	  @Size(max = 20)
	  @Pattern(regexp = "^[a-zA-Z]+$", message = "Accepts only alphabets")
	  private String username;

	  @NotBlank(message = "Email Should Not Be Blank")
	  @Size(max = 50)
	  @Email
	  @Pattern(regexp = "[a-z0-9]+@[a-z]+\\.[a-z]{2,3}", message = "Please enter a valid email!")
	  private String email;

	  @NotBlank
	  @Size(max = 120)
	  @Pattern(regexp = "^((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&-+()](?=\\S+$).{8,20})$",message = "Password Should Contain One Lowercase,Oneuppercase,SpecialCharacter and No Space")
	  private String password;

	  @DBRef
	  private Set<Role> roles = new HashSet<>();
//	  private String roles = new String();

	  
	  

	  public Users() {
	  }

	  public Users(String username, String email, String password) {
	    this.username = username;
	    this.email = email;
	    this.password = password;
	  }

	  public String getId() {
	    return id;
	  }

	  public void setId(String id) {
	    this.id = id;
	  }

	  public String getUsername() {
	    return username;
	  }

	  public void setUsername(String username) {
	    this.username = username;
	  }

	  public String getEmail() {
	    return email;
	  }

	  public void setEmail(String email) {
	    this.email = email;
	  }

	  public String getPassword() {
	    return password;
	  }

	  public void setPassword(String password) {
	    this.password = password;
	  }

//	public String getRoles() {
//		return roles;
//	}
//
//	public void setRoles(String roles) {
//		this.roles = roles;
//	}

	  public Set<Role> getRoles() {
	    return roles;
	  }

	  public void setRoles(Set<Role> roles) {
	    this.roles = roles;
	  }
	  
	  
	}

