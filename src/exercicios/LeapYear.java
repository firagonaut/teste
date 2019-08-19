package exercicios;

import java.util.Scanner;


public class LeapYear {
	/**
	 * You can write C code here or look at the examples.
	 * It will be translated as "demo/demo_translation.c".
	 * There are also translations of full programs below.
	 */
	public static void main(String[] args) {
		
		
		
		System.out.println("Type a year:");
	    int year = STDIN_SCANNER.nextInt();
	   
	    if (year%4 == 0) 
	    {
	    	
	    	System.out.println("Leap year!");
	    }
	    else if (year%100 == 0 && year%400 == 0)
    	{
    		System.out.println("Leap year!");
    	
    	}
    	else
    	{
    		System.out.println("Not leap year...");
    	}
    	
	
	
	  
		
			
			
	
}
	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}