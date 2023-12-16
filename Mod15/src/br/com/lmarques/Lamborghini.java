package br.com.lmarques;

public class Lamborghini extends Fabrica{

	private static String marca = "Lamborghini";
	private static String[] modelos = {"Aventador", "Urus"};
	
	
	public Lamborghini() {
		super(marca, modelos);
	}
	
	@Override
		public Carro criarCarro(String modelo, int ano) {
		
		if(modelo.equals(modelos[0])) 
		{
			return new LamborghiniAventador(ano);
		
		}else if (modelo.equals(modelos[1])) {
			
			return new LamborghiniUrus(ano);
		}
		return null;
	}

	public static String getMarca() {
		return marca;
	}

	public static void setMarca(String marca) {
		Lamborghini.marca = marca;
	}
}
