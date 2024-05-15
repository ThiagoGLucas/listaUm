public class Cliente {
	private String nome;
	private String cpf;
	private Data dataNascimento;
	
	public Cliente(String novoNome, String novoCpf, Data novaDataNascimento) {
		this.nome = novoNome;
		this.cpf = novoCpf;
		this.dataNascimento = novaDataNascimento;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public Data getDataNascimento() {
		return dataNascimento;
	}
	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	public void setCpf(String novoCpf) {
		this.cpf = novoCpf;
	}
	public void setDataNascimento(Data novaDataNascimento) {
		this.dataNascimento = novaDataNascimento;
	}
	
}
