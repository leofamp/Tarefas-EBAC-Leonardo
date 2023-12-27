package br.com.lmarques;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
        @SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
        GrupoPessoas pessoas = new GrupoPessoas();
        
        System.out.println("Digite nomes separados por vírgula(,) e com '-m' para HOMENS e '-f' para MULHERES: ");
		System.out.println("Ex: Marcos-m,Laura-f,...,João-m");
        
        pessoas.stringParaPessoas(teclado.next());
        System.out.println("****** Pessoas ******");
        System.out.println(pessoas.getPessoas());
        System.out.println("****** Homens ******");
        System.out.println(pessoas.getHomens().toString());
        System.out.println("****** Mulheres ******");
        System.out.println(pessoas.getMulheres().toString());
	}

}
