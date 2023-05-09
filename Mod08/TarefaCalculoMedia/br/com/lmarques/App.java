package br.com.lmarques;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		Numeros numeros = new Numeros();
		Texto texto = new Texto();
		
		System.out.println(texto.mostraExercicio());
		System.out.println(texto.mostraRegra());
		
		System.out.print(texto.mostraTexto1());
		numeros.setPrimeiroNumero(teclado.nextFloat());
		
		System.out.print(texto.mostraTexto2());
		numeros.setSegundoNumero(teclado.nextFloat());
		
		System.out.print(texto.mostraTexto3());
		numeros.setTerceiroNumero(teclado.nextFloat());
		
		System.out.print(texto.mostraTexto4());
		numeros.setQuartoNumero(teclado.nextFloat());
		
		System.out.printf("\nNota1: %.2f", numeros.getPrimeiroNumero());
		System.out.printf("\nNota2: %.2f", numeros.getSegundoNumero());
		System.out.printf("\nNota3: %.2f", numeros.getTerceiroNumero());
		System.out.printf("\nNota4: %.2f", numeros.getQuartoNumero());
		System.out.printf("\n\nA média das suas QUATRO notas é : %.2f", numeros.fazMedia());
	}

}
