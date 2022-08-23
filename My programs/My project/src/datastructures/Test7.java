package datastructures;

import java.util.*;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		set.add("Ajay");
		set.add("Arun");
		set.add("Bob");
		set.add("Ajay");
		
		Iterator it1 = set.iterator();
		
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
	}}
