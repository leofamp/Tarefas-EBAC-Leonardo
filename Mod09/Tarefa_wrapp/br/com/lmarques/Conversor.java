package br.com.lmarques;

public class Conversor {
	
	private float numeroPrimitiva;

	public float getNumeroPrimitiva() {
		return numeroPrimitiva;
	}

	public void setNumeroPrimitiva(float numeroWrapper) {
		this.numeroPrimitiva = (Float) numeroWrapper;
	}
	
}
