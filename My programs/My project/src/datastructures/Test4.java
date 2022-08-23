package datastructures;

import java.util.*;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> st = new Stack<String>();
		st.push("Alex");
		st.push("Garima");
		st.push("Arpit");
		st.push("Arun");
		st.push("Rahul");
		
		System.out.println("Stack Demo: ");
		Iterator it = st.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("===============================");
		st.pop();
		
		System.out.println("Stack Demo: ");
		Iterator it1 = st.iterator();
		
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
	}}
