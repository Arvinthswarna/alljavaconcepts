package intrface;
interface Shape{
	abstract void circle();
	// Interface will always follow abstract.If abstract is kept or not it wil always considered as abstract only
	void square();
	// it will automatically consider abstract before void whether abstract is written or not.By default it will consider as abstract
}
interface Line{
	void drawline();
}

public class IterfceDemo1 implements Shape,Line {
	public void circle(){
    System.out.println("msg from circle()");		
	}
	
	public void square() {
		System.out.println("msg from square()");
	}
	public void drawline() {
		System.out.println("msg from line");
	}
public static void main(String[] args) {
	IterfceDemo1 il = new IterfceDemo1();
	il.circle();
	il.square();
	il.drawline();
}
}
