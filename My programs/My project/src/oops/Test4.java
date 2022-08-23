package oops;

class Employee{
	
	int emp_id;
	String emp_name;
	
	//constructor
	Employee(){
		System.out.println("Default constructor gets Executed !!! ");
		emp_id = 101;
		emp_name = "Sriraksha";
	}
	
	void display() {
		System.out.println(emp_id + " " + emp_name) ;
	}
}

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee el = new Employee();
		el.display();

	}

}
