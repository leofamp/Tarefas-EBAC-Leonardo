package br.com.lmarques;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GrupoPessoas {

    List<Pessoas> pessoas = new ArrayList<Pessoas>();

    public GrupoPessoas() {

    }

    public List<Pessoas> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoas> pessoas) {
        this.pessoas = pessoas;
    }

    public List<Pessoas> getHomens() {
        return getPessoas().stream()
                .filter(p -> p.getSexo().equalsIgnoreCase("M"))
                .collect(Collectors.toList());
    }

    public List<Pessoas> getMulheres() {
        return getPessoas().stream()
                .filter(p -> p.getSexo().equalsIgnoreCase("F"))
                .collect(Collectors.toList());
    }

    public void stringParaPessoas(String str){
        List<String> listStr = Arrays.asList(str.split(","));
        listStr.forEach(pessoa -> {
            String[] result = pessoa.split("-");
            getPessoas().add(new Pessoas(result[0], result[1]));
        });
        
    }

}
