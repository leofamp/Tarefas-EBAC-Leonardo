package br.com.lmarques;

public class LamborghiniAventador extends Carro {

	
	private static String marca = "Lamborghini";
	private static String modelo = "Aventador";
	
	public LamborghiniAventador(int ano) {
		super(marca, modelo, ano);
	}
	@Override
	public void ligar() {
		System.out.println("Ligando");

	}

}
