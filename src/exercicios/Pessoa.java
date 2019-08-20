package exercicios;

public class Pessoa {
     private String nome;
     private int idade;
     
	public String getNome() {
		return nome;
	}
	public void setNome(String nomeNovo) {
		nome = nomeNovo;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public Pessoa (String nome, int idade)
	{
		this.nome=nome;
		this.idade=idade;
	}
	
	public int idadeSoma()
	{
		return idade+10; 
	}

     
}
