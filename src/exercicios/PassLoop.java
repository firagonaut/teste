package exercicios;

import java.util.Scanner;


public class PassLoop {
	/**
	 * You can write C code here or look at the examples.
	 * It will be translated as "demo/demo_translation.c".
	 * There are also translations of full programs below.
	 */
	public static void main(String[] args) {
		String password,passCheck;
	
		
		password = "carrot";
	
		
	
			
		try(Scanner scanner = new Scanner(System.in))
		{
		    //rest of your code
			
		while (true) 
		{
				
			System.out.println("Type your password:");
			passCheck = scanner.nextLine();
		    if (passCheck.equals(password)) {
		    	System.out.println("Right!\n");
		    	System.out.println("The secret is: Jujumanga");
		    }
		    else
		    {
		    	System.out.println("Wrong!");
		    }
			   
	
	   
		
	   
			
			
			
			
	
       }}
			
	
      }
		public final static Scanner STDIN_SCANNER = new Scanner(System.in);
		
	}