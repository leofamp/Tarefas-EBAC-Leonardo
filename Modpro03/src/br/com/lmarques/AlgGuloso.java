package br.com.lmarques;

import java.util.ArrayList;
import java.util.List;

public class AlgGuloso {

    public List<Integer> calcularTroco(Integer valor){
        List<Integer> moedas = new ArrayList<>();
        return calcularTrocoRecursivo(valor, moedas);
    }

    private List<Integer> calcularTrocoRecursivo(Integer valor, List<Integer> moedas){
        if(somaMoedas(moedas, 5) <= valor){
            moedas.add(5);
        }
        else if(somaMoedas(moedas, 2) <= valor){
            moedas.add(2);
        }
        else if(somaMoedas(moedas, 1) <= valor){
            moedas.add(1);
        }
        if(somaMoedas(moedas, 0) != valor){
            return calcularTrocoRecursivo(valor, moedas);
        }
        return moedas;
    }

    public static int somaMoedas(List<Integer> moedas, Integer valor) {
        // Soma dos elementos
        return moedas.stream()
                .mapToInt(Integer::intValue)
                .sum() + valor;
    }
}
	
