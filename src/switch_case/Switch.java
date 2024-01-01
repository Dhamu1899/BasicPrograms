package switch_case;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		int stud_id,mark1,mark2,mark3;
		String stud_name;
		Float total,avg;
		Scanner s=new Scanner (System.in);
		System.out.print("Enter The Student Id =");
		stud_id = s.nextInt();
		System.out.print("Enter The Student name =");
		stud_name=s.next();
		System.out.print("Enter the mark1 =");
		mark1=s.nextInt();
		System.out.print("Enter the mark2 =");
		mark2=s.nextInt();
		System.out.print("Enter the mark3 =");
		mark3=s.nextInt();
		total= (float) (mark1+mark2+mark3);
		avg=total/3;
		if(avg>=90)
			System.out.println("Excellent");
		else if(avg>=80)
			System.out.println("Very Good");
		else if(avg>=70)
			System.out.println("Very Good");
		else if(avg>=60)
			System.out.println("Very Good");
		else if(avg>=50)
			System.out.println("Very Good");
		else if(avg>=40)
			System.out.println("Very Good");
		else
			System.out.println("Not Eligible");
		s.close();
		
		
	}

}
