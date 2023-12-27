package br.com.lmarques;

public class App {

	public static void main(String[] args) {

		Fabrica ferrari = new Ferrari();
		
		Carro carro = ferrari.criarCarro(ferrari.getModelos()[1], 1965);
		System.out.println("Marca: " + carro.getMarca());
		System.out.println("Modelo: " + carro.getModelo());
		System.out.println("Ano: " + carro.getAno());
		
		carro.ligar();
		carro.abastecer();
		carro.limpar();
		
		System.out.println("");
		
		Fabrica lamborghini = new Lamborghini();
		
		Carro carro2 = lamborghini.criarCarro(lamborghini.getModelos()[0], 2001);
		
		System.out.println("Marca: " + carro2.getMarca());
		System.out.println("Modelo: " + carro2.getModelo());
		System.out.println("Ano: " + carro2.getAno());
		
		carro2.ligar();
		carro2.abastecer();
		carro2.limpar();
	}

}
