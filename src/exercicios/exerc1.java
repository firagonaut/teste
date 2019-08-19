package exercicios;
import java.util.Scanner;

public class exerc1 {
	int x,y,z;
	
	
	public static int produto(int x1, int y1, int z1) {
		return x1 * y1 * z1;
	}
	
	public static void main(String[] args) {
		exerc1 MyObj = new exerc1();

		MyObj.x = STDIN_SCANNER.nextInt();
		MyObj.y = STDIN_SCANNER.nextInt();
		MyObj.z = STDIN_SCANNER.nextInt();

		System.out.print(produto(MyObj.x,MyObj.y,MyObj.z));
	}

	public final static Scanner STDIN_SCANNER = new Scanner(System.in);
	
}
		
		
		
		
	
