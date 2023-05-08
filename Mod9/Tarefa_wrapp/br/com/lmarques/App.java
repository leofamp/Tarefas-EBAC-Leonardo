package br.com.lmarques;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		Conversor conversor = new Conversor();
		
		System.out.print("Digite um valor: ");
		conversor.setNumeroPrimitiva(teclado.nextFloat());
		System.out.printf("\nSeu valor é: %.2f", conversor.getNumeroPrimitiva());
		
	}

}
