package br.com.lmarques;

import java.util.List;

public class Executar {

	public static void main(String[] args) {
		
		Backtracking backtracking = new Backtracking();
        List<Integer> listaInteiros = List.of(1,2,3,4,5,6,7,8);
        int X = 3;
        List<List<Integer>> resultado = backtracking.gerarCombinacoes(listaInteiros, X);
        System.out.println("Combinações possiveis:");
        for (List<Integer> combinacao : resultado) {
            System.out.println(combinacao);
        }

        AlgGuloso algoritmoGuloso = new AlgGuloso();
        System.out.println("Troco:");
        System.out.println(algoritmoGuloso.calcularTroco(45));
	}

}
