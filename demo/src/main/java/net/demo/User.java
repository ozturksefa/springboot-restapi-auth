package net.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	private Integer id;
	private Integer tckn;
	private String email;
	private String password;
	private Integer gsm;
	private String address;

	public User() {
	}

	public User(Integer id, Integer tckn, String email, String password, Integer gsm, String address) {
		super();
		this.id = id;
		this.tckn = tckn;
		this.email = email;
		this.password = password;
		this.gsm = gsm;
		this.address = address;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTckn() {
		return tckn;
	}

	public void setTckn(Integer tckn) {
		this.tckn = tckn;
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

	public Integer getGsm() {
		return gsm;
	}

	public void setGsm(Integer gsm) {
		this.gsm = gsm;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
