package intrface;
//AIC: Anonymous Inner Class
interface Task {
	void counting();
}

public class TestAIC {
	public static void main(String[] args) {
		Task obj = new Task() {
			public void counting() {
			System.out.println("Counting completed sri");
			}
		
	};
	obj.counting();
	}}


