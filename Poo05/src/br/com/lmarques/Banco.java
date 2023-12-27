package br.com.lmarques;

import java.util.Scanner;

public class Banco {
	
	private int numConta = 0;
	private String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	Scanner teclado = new Scanner(System.in);
	
	public void abrirConta(String tipo, String dono) {
		this.numConta += 1;
		this.tipo = tipo;
		this.dono = dono;
		System.out.println("Conta aberta com sucesso!\n");
	}
	
	public void mostrarStatusConta() {
		System.out.println(numConta);
		System.out.println(tipo);
		System.out.println(dono);
		System.out.println(saldo);
	}
	
	public void fecharConta() {
		this.numConta += 1;
		this.tipo = null;
		this.dono = null;
		System.out.println("Conta fechada com sucesso!");
		
	}
	public int checarConta() {
		return numConta;
	}
	
	public void darInstrucao() {
		
		System.out.println("Olá, oque deseja fazer: ");
		System.out.println("1 - Abrir conta.");
		System.out.println("2 - Fechar conta.");
		System.out.println("3 - Checar Status da conta.");
		System.out.println("4 - Depositar.");
		System.out.println("5 - Sacar.");
		System.out.println("6 - Sair.");
		
	}
}
