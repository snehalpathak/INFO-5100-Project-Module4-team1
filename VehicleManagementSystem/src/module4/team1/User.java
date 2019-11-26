package module4.team1;

public class User {
	private String userId;
	private String firstName;
	private String lastName;
	private String email;
	private String contactNo;
	private String comment;
	
	public User(String firstName, String lastName, String email, String contactNo, String comment) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contactNo = contactNo;
		this.comment = comment;
	}
	
	public String getCustomerId() {
		return userId;
	}
	public void setCustomerId() {
		this.userId = DataObject.getInstance().getId();
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}	
}
