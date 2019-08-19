package exercicios;

import java.util.Scanner;


public class GreaterN {
	/**
	 * You can write C code here or look at the examples.
	 * It will be translated as "demo/demo_translation.c".
	 * There are also translations of full programs below.
	 */
	public static void main(String[] args) {
		
		
		
		System.out.println("Type a number:");
	    int a = STDIN_SCANNER.nextInt();
	    System.out.println("Type a number:");
	    int b = STDIN_SCANNER.nextInt();
	   
	    if (a > b) {
	    	System.out.println("Greater number: " + a);	
	    }
	    else if (a < b)
	    {
	    	System.out.println("Greater number: " + b);
	    }
	    else
	    {
	    	System.out.println("They're equal");
	    }
	  
			  
	   
	   
			
			
			
			
	
}
	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}