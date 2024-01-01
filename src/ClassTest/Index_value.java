package ClassTest;

public class Index_value {

	public static void main(String[] args) {
		int [] a = {7,21,15,13,5,19,16};
		Min_Max_index al = new Min_Max_index();
		
		
		System.out.println("min :" + al.minArray(a));
		System.out.println("max :" + al.maxArray(a));
		System.out.println("find :" + al.findArray(a,7));
		 al.arrayPrimenumber(a);
		

	}

}
