package datastructures;
import java.util.*;
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Alex");
		deque.add("John");
		deque.add("Jimmy");
		
		
		
		for(String name: deque) {
			System.out.println(name);
		}
	}}
