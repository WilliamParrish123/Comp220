package examples;
import java.util.Scanner;

public class LabXpt2 {
	 public static void main(String[] args)
	    {
	    	Scanner scanner = new Scanner(System.in);
	    	
	    	System.out.println("Enter a number: ");
	        int number = scanner.nextInt();
	        
	        int sum = addNumbers(number);
	        
	        System.out.println("Sum = " + sum);
	    }

	    public static int addNumbers(int n)
	    {
	        if (n != 0)
	            return n + addNumbers(n - 1);
	        else
	            return n;
	    }
}
