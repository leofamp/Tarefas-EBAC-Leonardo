package br.com.lmarques;

public class Ferrari extends Fabrica{

	private static String marca = "Ferrari";
	private static String[] modelos = {"SF90", "812"};
	
	public Ferrari() {
		super(marca, modelos);
	}

	@Override
	public Carro criarCarro(String modelo, int ano) {
		
		if(modelo.equals(modelos[0])) 
		{
			return new FerrariSF90(ano);
		
		}else if (modelo.equals(modelos[1])) {
			
			return new Ferrari812(ano);
		}
		return null;
	}

	public static String getMarca() {
		return marca;
	}

	public static void setMarca(String marca) {
		Ferrari.marca = marca;
	}
}
