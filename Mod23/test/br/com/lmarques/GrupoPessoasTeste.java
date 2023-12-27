package br.com.lmarques;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GrupoPessoasTeste {
	
    @Test
    public void pessoas() {
        GrupoPessoas pessoas = new GrupoPessoas();
        pessoas.stringParaPessoas("Marcos-M,Laura-F,Roberta-F,João-M");
        List<Pessoas> expected = new ArrayList<Pessoas>();
        expected.add(new Pessoas("Marcos","M"));
        expected.add(new Pessoas("Laura","F"));
        expected.add(new Pessoas("Roberta","F"));
        expected.add(new Pessoas("João","M"));
        Assert.assertEquals(expected.toString(), pessoas.getPessoas().toString());
        Assert.assertEquals(expected.toString(), pessoas.getPessoas().toString());
    }

    @Test
    public void homens() {
        GrupoPessoas pessoas = new GrupoPessoas();
        pessoas.stringParaPessoas("Marcos-M,Laura-F,Roberta-F,João-M");
        List<Pessoas> expected = new ArrayList<Pessoas>();
        expected.add(new Pessoas("Marcos","M"));
        expected.add(new Pessoas("João","M"));
        Assert.assertEquals(expected.toString(), pessoas.getHomens().toString());
    }

    @Test
    public void mulheres() {
        GrupoPessoas pessoas = new GrupoPessoas();
        pessoas.stringParaPessoas("Marcos-M,Laura-F,Roberta-F,João-M");
        List<Pessoas> expected = new ArrayList<Pessoas>();
        expected.add(new Pessoas("Laura","F"));
        expected.add(new Pessoas("Roberta","F"));
        Assert.assertEquals(expected.toString(), pessoas.getMulheres().toString());
    }
}
