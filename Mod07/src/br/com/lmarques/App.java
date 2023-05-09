package br.com.lmarques;

import java.util.Scanner;


public class App {
	
	/**
	 * Rodando a calculadora.
	 * @param args
	 */
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		Numeros numeros = new Numeros();
		Texto texto = new Texto();
		
		System.out.println(texto.mostraCalculadora());
		/**
		 * Inputs.
		 */
		System.out.print(texto.mostraTexto1());
		numeros.setPrimeiroNumero(teclado.nextFloat());
		System.out.print(texto.mostraTexto2());
		numeros.setSegundoNumero(teclado.nextFloat());
		/**
		 * Saídas.
		 */
		System.out.printf("\nA soma é: %.2f \n", numeros.fazSoma());
		System.out.format("A subtração é: %.2f \n", numeros.fazSubtracao());
		System.out.format("A divisão é: %.2f \n", numeros.fazDivisao());
		System.out.format("A multiplicação é: %.2f \n", numeros.fazMultiplicacao());
		
	}
	
}
