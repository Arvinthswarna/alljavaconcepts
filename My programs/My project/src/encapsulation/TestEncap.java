package encapsulation;
public class TestEncap {
	public static void main(String[] args) {
		User userobj = new User();
		userobj.setEmail("Sriraksha@gmail.com");
        userobj.setPassword("123456");
        System.out.println(userobj.getEmail() + " " + userobj.getPassword());
	
	
       Employee empobj = new Employee();
       empobj.setEmp_id(123);
       empobj.setEmp_name("Sriraksha");
       System.out.println(empobj.getEmp_id() + " " + empobj.getEmp_name());
	}
}


