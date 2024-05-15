public class Pessoa {
	private String nome;
	private int idade;
	private double altura;
	
	public Pessoa(String novoNome, int novaIdade, double novaAltura) {
		this.nome = novoNome;
		this.idade = novaIdade;
		this.altura = novaAltura;
	}
	
	public String getNome() {
		return nome;
	}
	public int idade() {
		return idade;
	}
	public double altura() {
		return altura;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	public void setIdade(int novaIdade) {
		this.idade = novaIdade;
	}
	public void setAltura(double novaAltura) {
		this.altura = novaAltura;
	}
	
	public String toString() {
		return "Nome: " + this.nome + "\nIdade: " + this.idade + "anos\n" + "Altura: " + this.altura + " m";
	}
}
