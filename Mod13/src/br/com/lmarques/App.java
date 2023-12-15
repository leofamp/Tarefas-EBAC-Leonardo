package br.com.lmarques;

public class App {

	public static void main(String[] args) {
		
		PessoaFisica pessoaFisica = new PessoaFisica();
		PessoaJuridica pessoaJuridica = new PessoaJuridica();
		
		
		pessoaFisica.setAnoNascimento(1990);
		pessoaFisica.setContato("3895-6698");
		pessoaFisica.setCpf("166.487.498-08");
		pessoaFisica.setNome("Marcelo");
		pessoaFisica.setEndereco("São Paulo - SP");
		pessoaFisica.setSobrenome("Garcia");
		
		pessoaJuridica.setAnoAbertura(1956);
		pessoaJuridica.setContato("3433-3333");
		pessoaJuridica.setCnpj("00016318849475");
		pessoaJuridica.setNome("Vendas de Carro LTDA");
		pessoaJuridica.setEndereco("Petrópolis - RJ");
		pessoaJuridica.setNomeFantasia("Carro 10");
		
		
		
		
		pessoaFisica.nomeCompleto();
		System.out.println("Cpf: " + pessoaFisica.getCpf());
		System.out.println("Endereço: " + pessoaFisica.getEndereco());
		System.out.println("Ano de Nascimento: " + pessoaFisica.getAnoNascimento());
		System.out.println("Contato: " + pessoaFisica.getContato());
		
		System.out.println("\nNome real: " + pessoaJuridica.getNome());
		System.out.println("Nome fantasia: " + pessoaJuridica.getNomeFantasia());
		System.out.println("CNPJ: " + pessoaJuridica.getCnpj());
		System.out.println("Endereço: " + pessoaJuridica.getEndereco());
		System.out.println("Ano de Abertura: " + pessoaJuridica.getAnoAbertura());
		System.out.println("Contato: " + pessoaJuridica.getContato());
		
		
	}
	

}
