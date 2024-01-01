package ClassTest;

import java.util.Stack;
import java.util.Iterator;
import java.util.ListIterator;

public class StackExample {
    public static void main(String[] args) {
        
        Stack<Integer> stack = new Stack<>();
        stack.push(24);
        stack.push(5);
        stack.push(11);
        stack.push(36);
        stack.push(65);

        
        stack.pop();

       
        System.out.print("Elements using Iterator: ");
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        
        System.out.print("\nElement printing reverse :");
	      ListIterator<Integer>deIterate=stack.listIterator(stack.size());
	      while(deIterate.hasPrevious()) {
	    	  System.out.print(deIterate.previous());
	            if (deIterate.hasPrevious()) {
	                System.out.print(" ");
	            }
	      }

        
        
    }
}
