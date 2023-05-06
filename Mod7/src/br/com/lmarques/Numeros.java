package br.com.lmarques;

public class Numeros {
	/**
	 * Declarando as variáveis do problema.
	 */
	public float primeiroNumero;
	public float segundoNumero;
	public float soma;
	public float subtracao;
	public float multiplicacao;
	public float divisao;

	/**
	 * Funções de cada variável.
	 * @return
	 */
	public float getPrimeiroNumero() {
		return primeiroNumero;
	}

	public void setPrimeiroNumero(float primeiroNumero) {
		this.primeiroNumero = primeiroNumero;
	}

	public float getSegundoNumero() {
		return segundoNumero;
	}

	public void setSegundoNumero(float segundoNumero) {
		this.segundoNumero = segundoNumero;
	}
	
	public float fazSoma() {
		return primeiroNumero + segundoNumero;
	}
	
	public float fazSubtracao() {
		return primeiroNumero - segundoNumero;
	}
	
	public float fazDivisao() {
		return primeiroNumero / segundoNumero;
	}
	
	public float fazMultiplicacao() {
		return primeiroNumero * segundoNumero;
	}

}
