package Exercicio2_4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		OpNum prod1 = new OpNum();
		
		   prod1.setA(STDIN_SCANNER.nextFloat());
		   prod1.setB(STDIN_SCANNER.nextFloat());
		   prod1.setC(STDIN_SCANNER.nextFloat());
		
		   System.out.println(prod1.prodABC());
		
		
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);

}
