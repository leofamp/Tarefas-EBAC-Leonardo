package br.com.lmarques;

public class Numeros {

	private float primeiroNumero;
	private float segundoNumero;
	private float terceiroNumero;
	private float quartoNumero;
	private float media;

	public void setPrimeiroNumero(float primeiroNumero) {
		
		if (primeiroNumero >= 0 && primeiroNumero <= 10) {
			this.primeiroNumero = primeiroNumero;
		}
		else {
			this.primeiroNumero = 0;
		}
	}

	public void setSegundoNumero(float segundoNumero) {
		
		if (segundoNumero >= 0 && segundoNumero <= 10) {
			this.segundoNumero = segundoNumero;
		}
		else {
			this.segundoNumero = 0;
		}
	}

	public void setTerceiroNumero(float terceiroNumero) {
		
		if (terceiroNumero >= 0 && terceiroNumero <= 10) {
			this.terceiroNumero = terceiroNumero;
		}
		else {
			this.terceiroNumero = 0;
		}
	}
	
	public void setQuartoNumero(float quartoNumero) {
		
		if (quartoNumero >= 0 && quartoNumero <= 10) {
			this.quartoNumero = quartoNumero;
		}
		else {
			this.quartoNumero = 0;
		}
	}
	
	public float fazMedia() {
		this.media = (primeiroNumero + segundoNumero + terceiroNumero + quartoNumero) / 4;
		return media;
	}
		
	public float getPrimeiroNumero() {
		return primeiroNumero;
	}

	public float getSegundoNumero() {
		return segundoNumero;
	}

	public float getTerceiroNumero() {
		return terceiroNumero;
	}

	public float getQuartoNumero() {
		return quartoNumero;
	}

}