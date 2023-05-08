package br.com.lmarques;

public class Numeros {

	private float primeiroNumero;
	private float segundoNumero;
	private float terceiroNumero;
	private float quartoNumero;
	private float media;

	public void setPrimeiroNumero(float primeiroNumero) {
		this.primeiroNumero = primeiroNumero;
	}

	public void setSegundoNumero(float segundoNumero) {
		this.segundoNumero = segundoNumero;
	}
	
	public void setTerceiroNumero(float terceiroNumero) {
		this.terceiroNumero = terceiroNumero;
	}
	
	public void setQuartoNumero(float quartoNumero) {
		this.quartoNumero = quartoNumero;
	}
	
	public float fazMedia() {
		this.media = (primeiroNumero + segundoNumero + terceiroNumero + quartoNumero) / 4;
		return media;
	}

}