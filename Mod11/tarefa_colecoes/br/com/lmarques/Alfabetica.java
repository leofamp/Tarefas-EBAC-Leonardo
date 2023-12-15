package br.com.lmarques;

import java.util.Arrays;
import java.util.Scanner;

public class Alfabetica {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite nomes separados por vírgula(,): ");
		
		String[] nomes = (teclado.nextLine().split(","));
		
		Arrays.sort(nomes);
		System.out.print("\nNomes em ordem alfabética:");
		for (int i = 0; i < nomes.length; i++) {
			System.out.print(" " + nomes[i]);
		}
		//System.out.println(Arrays.toString(nomes));
		
	}

}
