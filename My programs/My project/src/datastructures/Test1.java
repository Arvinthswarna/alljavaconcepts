package datastructures;
import java.util.ArrayList;
import java.util.Iterator;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		ArrayList<String> names_list = new ArrayList<String>();
		names_list.add("Arvinth");
		names_list.add("sriraksha");
		names_list.add("prakash");
		names_list.add("John");
		names_list.add("Jimmy");
		names_list.add("Jackie");
		
		
		Iterator it = names_list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	
	
}