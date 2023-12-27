package br.com.lmarques;

public class LamborghiniUrus extends Carro {

	private static String marca = "Lamborghini";
	private static String modelo = "Urus";
	
	public LamborghiniUrus(int ano) {
		super(marca, modelo, ano);
	}

	@Override
	public void ligar() {
		System.out.println("Ligando");

	}

}
