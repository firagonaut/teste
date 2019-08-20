package exercicios;

public class Principal {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("joao",14);
		
		p1.setIdade(10);
		
		
		
	     System.out.println(p1.getIdade() + " " + p1.getNome());
	     System.out.println(p1.idadeSoma());
	     
	    
	}
	

}
