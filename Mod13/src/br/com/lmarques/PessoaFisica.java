package br.com.lmarques;


public class PessoaFisica extends Pessoa{

	private Integer anoNascimento;
	
	private String sobrenome;
	
	private String cpf;

	public Integer getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(Integer anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	
	}
	public void nomeCompleto(String  nome, String sobrenome) {
		System.out.println("Nome: " + nome + " " + sobrenome);
	}
	
}
