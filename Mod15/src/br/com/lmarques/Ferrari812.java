package br.com.lmarques;

public class Ferrari812 extends Carro {

	private static String marca = "Ferrari";
	private static String modelo = "812";
	
	public Ferrari812(int ano) {
		super(marca, modelo, ano);
	}

	@Override
	public void ligar() {
		System.out.println("Carro ligando.");
		
	}

}