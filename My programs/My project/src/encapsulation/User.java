package encapsulation;

public class User {
	private String email;
	private String password;
	//setter
	void setEmail(String email) {
		this.email = email;
	}
	//getter
	String getEmail() {
		return this.email;
	}
 void setPassword(String password) {
	 this.password = password;
 }
String getPassword() {
	return this.password;
}
}