package br.com.lmarques;

import br.com.lmarques.cadastro.ListaCarro;
import br.com.lmarques.carros.Lamborghini;
import br.com.lmarques.carros.Ferrari;
import br.com.lmarques.carros.Carro;

public class App {

    public static void main(String[] args) {
    	
        ListaCarro<Carro> carros = new ListaCarro<Carro>();
        
        carros.addCarro(new Ferrari("Ferrari","SF90"));
        carros.addCarro(new Ferrari("Ferrari","812"));
        carros.addCarro(new Ferrari("Ferrari","Roma"));
        carros.addCarro(new Lamborghini("Lamborghini","Aventador"));
        carros.addCarro(new Lamborghini("Lamborghini","Urus"));
        carros.addCarro(new Lamborghini("Lamborghini","Huracan"));
        carros.listarCarros();
        
    }
    
}
