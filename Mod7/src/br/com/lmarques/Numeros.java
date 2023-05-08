package br.com.lmarques;

public class Numeros {
	/**
	 * Declarando as variáveis do problema.
	 */
	private float primeiroNumero;
	private float segundoNumero;
	private float soma;
	private float subtracao;
	private float multiplicacao;
	private float divisao;

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
		this.soma = primeiroNumero + segundoNumero;
		return soma;
	}
	
	public float fazSubtracao() {
		this.subtracao = primeiroNumero - segundoNumero;
		return subtracao;
	}
	
	public float fazDivisao() {
		this.divisao = primeiroNumero / segundoNumero;
		return divisao;
	}
	
	public float fazMultiplicacao() {
		this.multiplicacao = primeiroNumero * segundoNumero;
		return multiplicacao;
	}

}
