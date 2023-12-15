package br.com.lmarques;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PorSexo {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		List<String> nomesMasc = new ArrayList<String>();
		List<String> nomesFem = new ArrayList<String>();
		
		System.out.println("Digite nomes separados por vírgula(,) e com '-m' para HOMENS e '-f' para MULHERES: ");
		System.out.println("Ex: Marcos-m,Laura-f,...,João-m");
		String[] nomes = (teclado.nextLine().split(","));
		System.out.println(Arrays(nomes));
		
		for(int i = 0; i< nomes.length; i++) {
			if (nomes[i].contains("-m")) {
				nomesMasc.add(nomes[i]);
			}
			else if (nomes[i].contains("-f")){
				nomesFem.add(nomes[i]);	
			}
			else {
				nomes[i] = null;
			}
			
		}
		System.out.println("\nLista completa:" + Arrays.toString(nomes));
		System.out.println("\nHomens:" + nomesMasc);
		System.out.println("Mulheres:" + nomesFem);
		
	}

	private static char[] Arrays(String[] nomes) {
		// TODO Auto-generated method stub
		return null;
	}

}
