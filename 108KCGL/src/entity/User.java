package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="user")
public class User {
	private int id;
	private String name;
	private String password;
	private String phoneNum;
	private String email;
	
	@Column(name="name", length=30, nullable=false, unique=true)
	public String getName() {
		return name;
	}
	
	public void setName(String userName) {
		this.name = userName;
	}
	
	@Column(name="password", length=30, nullable=false, unique=true)
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name="phoneNum", length=30, nullable=false, unique=true)
	public String getPhoneNum() {
		return phoneNum;
	}
	
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	@Column(name="email", length=30, nullable=false, unique=true)
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
