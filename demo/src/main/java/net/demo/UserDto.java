package net.demo;

public class UserDto {

	private Integer tckn;
	private String email;
	private String password;
	private Integer gsm;
	private String address;
	
	public UserDto() {
		
	}
	
	public UserDto(Integer tckn, String email, String password, Integer gsm, String address) {
		super();
		this.tckn=tckn;
		this.email = email;
		this.password = password;
		this.gsm=gsm;
		this.address=address;
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
