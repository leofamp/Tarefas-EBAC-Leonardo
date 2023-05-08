package br.com.lmarques;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		Numeros numeros = new Numeros();
		Texto texto = new Texto();
		
		System.out.println(texto.mostraExercicio());
		
		System.out.print(texto.mostraTexto1());
		numeros.setPrimeiroNumero(teclado.nextFloat());
		
		System.out.print(texto.mostraTexto2());
		numeros.setSegundoNumero(teclado.nextFloat());
		
		System.out.print(texto.mostraTexto3());
		numeros.setTerceiroNumero(teclado.nextFloat());
		
		System.out.print(texto.mostraTexto4());
		numeros.setQuartoNumero(teclado.nextFloat());
		
		System.out.printf("\nA média das suas QUATRO notas é : %.2f", numeros.fazMedia());
	}

}
