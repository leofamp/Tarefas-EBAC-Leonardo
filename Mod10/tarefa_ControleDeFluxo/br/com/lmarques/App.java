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
		numeros.setPrimeiraNota(teclado.nextFloat());
		
		System.out.print(texto.mostraTexto2());
		numeros.setSegundaNota(teclado.nextFloat());
		
		System.out.print(texto.mostraTexto3());
		numeros.setTerceiraNota(teclado.nextFloat());
		
		System.out.print(texto.mostraTexto4());
		numeros.setQuartaNota(teclado.nextFloat());
		
		System.out.printf("\nNota 1: %.2f", numeros.getPrimeiraNota());
		System.out.printf("\nNota 2: %.2f", numeros.getSegundaNota());
		System.out.printf("\nNota 3: %.2f", numeros.getTerceiraNota());
		System.out.printf("\nNota 4: %.2f", numeros.getQuartaNota());
		System.out.printf("\n\nA média das suas QUATRO notas é : %.2f", numeros.fazMedia());
		
		System.out.println(numeros.fazMensagem());
	}

}
