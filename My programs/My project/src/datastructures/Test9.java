package datastructures;
import java.util.*;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hashmp = new HashMap<Integer,String>();
		hashmp.put(1, "Vegetables");
		hashmp.put(2, "Fruits");
		hashmp.put(3, "Rice");
		hashmp.put(4, "Wheat");
		hashmp.put(1, "Fish");
		
		System.out.println("Map Demo: ");
		for(Map.Entry<Integer,String> m: hashmp.entrySet() ) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
	}

}
