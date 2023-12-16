package br.com.lmarques;

public class FerrariSF90 extends Carro {

	private static String marca = "Ferrari";
	private static String modelo = "SF90";
	
	public FerrariSF90(int ano) {
		super(marca, modelo, ano);
	}

	@Override
	public void ligar() {
		System.out.println("Carro ligando.");
		
	}

}
