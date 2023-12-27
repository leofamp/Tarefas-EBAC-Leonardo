package br.com.lmarques.cadastro;

import java.util.ArrayList;
import java.util.List;

public class ListaCarro<T>{

	List<T> carros;

	public ListaCarro() {
	
		this.carros = new ArrayList<T>();
	}

	public void addCarro(T dado) {
	
		this.carros.add(dado);
	}

	public void listarCarros() {
	
		System.out.println(carros);
		
	}
	
}
