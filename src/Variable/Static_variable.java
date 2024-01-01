package Variable;

public class Static_variable {
	private static char grade='A';
	
	static void test() {
		System.out.println("Grade:Inside static method"+grade);
	}
	
	static class Nested{
		public void fun(){
			System.out.println("Grade:Inside Nested Class :"+grade);
		}
		
	}
	public class check{
		void display() {
			System.out.println("check class grade:"+grade);
		}
		}
	public static void main(String[] args) {
		Static_variable.Nested obj=new Static_variable.Nested();
		
		obj.fun();
		System.out.println("static variable :"+grade);
		test();
		Static_variable.check ck=new Static_variable().new check();
		ck.display();
		
		

	}

}
