package Number_Methods;

public class File1 {

	public static void main(String[] args) {
		//Wrapper class
		//converting Integer object into Float/double object
		Integer x=10;
		Float f=x.floatValue();
		System.out.println(x.floatValue());
		System.out.println("f ="+f);
		
		
		//converting Primitive data type into object
		String str="10";//Primitive Data Type
		Integer y=Integer.parseInt(str);
		Double d =y.doubleValue();
		System.out.println("y ="+y);
		System.out.println("d ="+d);
		//String str2=d.toString();
		System.out.println(d.toString());
		System.out.println(String.valueOf(str));
		
		
		Integer num1=3;
		Integer num2=5;
		System.out.println(num1.compareTo(num2));
		System.out.println(num1.equals(num2));
		
		
		String a ="hello";
		String b ="hello";
		if(a.equals(b))
			System.out.println("Both String are equal");
		
		if(a.compareTo(b)==0)
			System.out.println("Both String are equal");
		
		
		Double f1= -20.45;
		System.out.println("abs ="+Math.abs(4-7));
		System.out.println("ceil ="+Math.ceil(f1));
		System.out.println("round ="+Math.round(f1));
		System.out.println("Floor ="+Math.floor(f1));
		
		System.out.println("Minimum Value ="+Math.min(12, 24));
		System.out.println("Maximum Value ="+Math.min(12, 24));
		System.out.println(Math.pow(2,3));
		System.out.print("Escape Sequence = \r");
		System.out.print("Escape Sequence = \n");
		System.out.println("Completed");
		System.out.println("This is \'java\' program");//This is "java" Program
		
		
		System.out.println(Character.isLetter('a'));
		System.out.println(Character.isDigit('1'));
		//Lower Case or Upper case Checking
		System.out.println(Character.isLowerCase('c'));
		System.out.println(Character.isLowerCase('C'));
		System.out.println(Character.isLowerCase('\n'));
		System.out.println(Character.isLowerCase('\t'));
		
		System.out.println(Character.toUpperCase('c'));
		System.out.println(Character.toLowerCase('C'));
		
		String str2="Welcome";//A-65W=87
		String str3="welcome";//a-97w=119
		System.out.println(str2.charAt(5));
		//System.out.println(str2.charAt(10));
		System.out.println(str2.compareTo(str3)); //-32=87-119
		System.out.println(str2.compareToIgnoreCase(str3));
		
		
		
		System.out.println(str2.concat(str3));	
		System.out.println(str2.length());
		System.out.println(str2.substring(4));
		System.out.println(str2.substring(2,7));
		System.out.println(str2.replace('e','a'));
		
		


	}

	
	}

