package helloworld;

public class sample3 {
public static void main(String[] args) {
		
		String name = "sriraksha";
		             //0123
		String designation = "Mrs ";
		
		 System.out.println( "My Name is : " + name);
		 System.out.println(name.length());
		 System.out.println(name.charAt(2));
		 System.out.println(designation.concat(name));
		 System.out.println(designation);//Strings are Immutable
		 designation = designation.concat(name);
		 System.out.println(designation);
	}
}
