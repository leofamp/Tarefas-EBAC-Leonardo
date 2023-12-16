package br.com.lmarques;

public abstract class Fabrica {
	
	private String marca;
	private String[] modelos;
	
	public Fabrica(String marca, String[] modelos) {
		this.marca = marca;
		this.modelos = modelos;
	}

	public String getNome() {
		return marca;
	}
	
	public String[] getModelos() {
		return modelos;
	}
	
	public abstract Carro criarCarro(String modelo, int ano);
	
}
