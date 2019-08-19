package br.edu.udc;

public class PrimeiraClasse {

	public static void main(String[] args) {
		int valor = 34;
		String frase = "Um programa em Java!";
		String frase_2 = "um programa java";
		
		System.out.println("Primeiro programa Java!!!");
		
		System.out.printf("Estruturando saida com:\nTexto: %s\n Valor inteiro: %d", frase, valor);
		
		System.out.printf("%d\n%s\n%s\n%s\n%b", frase.length(), frase + "aumentando", frase,frase_2,frase.compareTo(frase_2));
		
		Aula02 obj = new Aula02();
		obj.repetirFrase(frase,3);
		
		
		Aula02.mostraAoContrario(frase);

	}
	
	void repetirFrase(String frase, int vezes) {
		for(int i=0; i<vezes; i++)
			System.out.println(frase);
	}

}
