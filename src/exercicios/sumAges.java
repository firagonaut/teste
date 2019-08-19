package exercicios;

import java.util.Scanner;


public class sumAges {
	/**
	 * You can write C code here or look at the examples.
	 * It will be translated as "demo/demo_translation.c".
	 * There are also translations of full programs below.
	 */
	public static void main(String[] args) {
		int[] age = new int[2];
		int total;
		String name1;
		String name2;
		
		System.out.println("Type your name:");
		Scanner scanner = new Scanner( System. in);
		name1 = scanner.nextLine();
	    System.out.println("Type age:");
	    age[1] = STDIN_SCANNER.nextInt();
	    System.out.println("Type your name:");
	    name2 = scanner.nextLine();
	    System.out.println("Type age:");
	    age[0] = STDIN_SCANNER.nextInt();
	   
	   total = age[0] + age[1];
	   
	   System.out.println(name1 + " and " + name2 + " are " + total + " years old in total.");
	   
	   
			
			
			
			
	
}
	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
}