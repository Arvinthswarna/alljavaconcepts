package datastructures;
import java.util.*;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<String>();
		v.add("Alex");
		v.add("Bob");
		v.add("Julie");
		v.add("June");
		v.add("Jack");
	

		System.out.println("Vector Demo: ");
		Iterator it = v.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
	}}
