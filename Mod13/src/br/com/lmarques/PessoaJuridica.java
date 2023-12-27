package br.com.lmarques;

public class PessoaJuridica extends Pessoa{

	private Integer anoAbertura;
	
	private String nomeFantasia;
	
	private String cnpj;

	public Integer getAnoAbertura() {
		return anoAbertura;
	}

	public void setAnoAbertura(Integer anoAbertura) {
		this.anoAbertura = anoAbertura;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
}
