package br.com.lmarques;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		
		Scanner teclado = new Scanner(System.in);
		
        System.out.println("Digite nomes separados por vírgula(,) e com '-m' para HOMENS e '-f' para MULHERES: ");
        System.out.println("Ex: Marcos-m,Laura-f,...,João-m");
        
        List<String> res = Arrays.asList(teclado.next().split("\\s*,\\s*"));
        System.out.println("--Pessoas--");
        List<Pessoas> pessoas = new ArrayList<Pessoas>();
        res.forEach(str -> {
            String[] result = str.split("\\s*-\\s*");
            pessoas.add(new Pessoas(result[0], result[1]));
        });
        
        System.out.println(pessoas.toString());
        System.out.println("--Masculino--");
        List<Pessoas> homens = pessoas.stream().filter(p -> p.getSexo().equalsIgnoreCase("M")).collect(Collectors.toList());
        System.out.println(homens.toString());
        System.out.println("--Feminino--");
        List<Pessoas> mulheres = pessoas.stream().filter(p -> p.getSexo().equalsIgnoreCase("F")).collect(Collectors.toList());
        System.out.println(mulheres.toString());
	}

}
