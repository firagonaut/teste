package exercicios;

import java.util.Scanner;


public class bigger {
	/**
	 * You can write C code here or look at the examples.
	 * It will be translated as "demo/demo_translation.c".
	 * There are also translations of full programs below.
	 */
	public static void main(String[] args) {
		int big;
		
		
		System.out.println("Type a number:");
	    int a = STDIN_SCANNER.nextInt();
	    System.out.println("Type another number:");
	    int b = STDIN_SCANNER.nextInt();
	   
	   big = Math.max(a, b);
			   
	   
	   System.out.println("The bigger number of the two numbers given was: " + big);
	   
	   
			
			
			
			
	
}
	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}