package br.com.lmarques;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		Banco banco = new Banco();
		
		do {
			banco.darInstrucao();
			
			int fazer = teclado.nextInt();
			
			if (fazer == 1){
				teclado.nextLine();
				System.out.println("Digite o tipo de conta(Poupança ou Corrente): ");
				String conta = teclado.nextLine();
				
				System.out.println("Digite seu nome completo: ");
				String nome = teclado.nextLine();
					
				banco.abrirConta(conta, nome);
				
			}else if (fazer == 2){
				
				if (banco.checarConta() == 0) {
					System.out.println("Não existe nenhuma conta.");
				} else {
					banco.fecharConta();
				}
				
			}else if (fazer == 6) {
				break;
				
			}
			
		} while (true);
		
		banco.mostrarStatusConta();
	}
}	
	
	
	
