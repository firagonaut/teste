package exercicios;

import java.util.Scanner;


public class CmpStr {
	/**
	 * You can write C code here or look at the examples.
	 * It will be translated as "demo/demo_translation.c".
	 * There are also translations of full programs below.
	 */
	public static void main(String[] args) {
		String user1,user2,pass1,pass2,userCheck,passCheck;
	
		
		
		user1 = "alex";
		user2 = "emily";
		pass1 = "mightyducks";
		pass2 = "cat";
		
	
			
		try(Scanner scanner = new Scanner(System.in)){
		    //rest of your code
			
		System.out.println("Type your username:");
	
		userCheck = scanner.nextLine();
		System.out.println("Type your password:");
		passCheck = scanner.nextLine();
	   
		
		if(userCheck.equals(user1) && passCheck.equals(pass1))
		{
			System.out.println("Logged in!");
		}
		else if (userCheck.equals(user2) && passCheck.equals(pass2))
		{
			System.out.println("Logged in!");
		}
		else
		{
			System.out.println("Error");
		}
	   
		} 
			  
	   
	   
			
			
			
			
	
}
	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}