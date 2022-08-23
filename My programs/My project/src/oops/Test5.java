package oops;

class User {
	String name;
	String password;
	
	//default constructor
	User(){
		System.out.println("default constructor !!!");
	}
	//Parameterized constructor
	User(String name,String password){
		this.name = name;
		this.password = password;
		
	}
	void get_user_info() {
		System.out.println(this.name + " " +  this.password);
	}
	
}

public class Test5 {
public static void main(String[] args) {
	
	User obj0 = new User();
	User obj1 = new User("Sriraksha", "Sriraksha123");
	obj1.get_user_info();
	
	User obj2 = new User("Jimmy", "jimmy123");
	obj2.get_user_info();
	
}
}
