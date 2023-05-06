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
		
		System.out.println("Calculadora");
		/**
		 * Inputs.
		 */
		System.out.print("Digite o primeiro valor: ");
		numeros.setPrimeiroNumero(teclado.nextInt());
		System.out.print("Digite o segundo valor: ");
		numeros.setSegundoNumero(teclado.nextInt());
		/**
		 * Saídas.
		 */
		System.out.printf("A soma é: %.2f \n", numeros.fazSoma());
		System.out.format("A subtração é: %.2f \n", numeros.fazSubtracao());
		System.out.format("A divisão é: %.2f \n", numeros.fazDivisao());
		System.out.format("A multiplicação é: %.2f \n", numeros.fazMultiplicacao());
		
	}
	
}
