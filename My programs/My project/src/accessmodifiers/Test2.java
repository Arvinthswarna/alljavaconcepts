package accessmodifiers;

 
 class A1{
		 int number = 200;
		
		 void display() {
			System.out.println("Value is : " + number);
		}
		}


 public  class Test2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			A obj = new A();
			obj.display();
			//System.out.println(obj.number);
			
			Test11 obj1 = new Test11();
			System.out.println(obj1.num);
			// default modifier will work inside the same package

		}



	}
