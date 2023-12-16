package br.com.lmarques;

public abstract class Carro {
	
	private String marca;
	private String modelo;
	private int ano;
	
	public Carro(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void limpar() {
		System.out.println("Carro está limpo.");
	}
	
	public void abastecer() {
		System.out.println("Carro abastecido.");
	}
	
	public abstract void ligar();
	

}
