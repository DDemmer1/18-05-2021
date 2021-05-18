package de.demmer.dennis;

public class User {
	
	private String id;
	private String name;
	private UserStatus status;

	
	public User(String id, String name, UserStatus status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
	}
	

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public UserStatus getStatus() {
		return status;
	}
	public void setStatus(UserStatus status) {
		this.status = status;
	}
	
	
	

}
