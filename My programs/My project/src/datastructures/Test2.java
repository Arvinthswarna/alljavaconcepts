package datastructures;
import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Alex");
		ll.add("Bob");
		ll.add("John");
		ll.add("Jimme");
		ll.add("sri");
		ll.add("Jack");	
	
		System.out.print("LinkedList Demo: ");
		Iterator it = ll.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
