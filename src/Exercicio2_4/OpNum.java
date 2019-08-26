package Exercicio2_4;

public class OpNum {
	private float a, b, c;

	public OpNum() {

	}

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	public float getC() {
		return c;
	}

	public void setC(float c) {
		this.c = c;
	}
	
	public float prodABC()
	{
		return a*b*c;
	}
	
	public float calcAB(int cod) {
		if (cod ==0) {
			return a+b;
		}
		else if(cod == 1)
		{
			return a*b;
		}
		else if(cod == 2) {
			return a-b;
		}
		else if(cod == 3) {
			return a/b;
		}
		else {
			System.out.println("Opcao invalida\n");
			return -1;
		}
			
	
		
	}

}
