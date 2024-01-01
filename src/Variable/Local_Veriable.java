package Variable;

public class Local_Veriable {
	int b=100;
	public static int x;
	public void local_var() {
	int a=10;
	System.out.println("a ="+a);
	System.out.println("b ="+b);
}
void display()
{
	//System.out.println("a");
	System.out.println("display b ="+b);
}
	
	public static void main(String[] args) {
		Local_Veriable obj=new Local_Veriable();
		obj.local_var();
		obj.display();
		System.out.println(obj.b);
		System.out.println("x ="+x);
		
	}

}
