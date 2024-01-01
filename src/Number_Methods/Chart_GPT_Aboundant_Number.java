package Number_Methods;

import java.util.Scanner;

public class Chart_GPT_Aboundant_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        
        int num = scanner.nextInt();
        
        if (isAbundant(num)) {
            System.out.println(num + " is an abundant number.");
        } else {
            System.out.println(num + " is not an abundant number.");
        }
        
        scanner.close();
    }
    
    // Function to check if a number is abundant
    public static boolean isAbundant(int num) {
        if (num <= 0) {
            return false;
        }
        
        int sum = 0;
        
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        
        return sum > num;
    }
}




