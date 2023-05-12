package br.com.lmarques;

/*import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OutroApp {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner tecladoScanner = new Scanner(System.in);
		List<Float> notas = new ArrayList<Float>();
		float soma = 0;
		
		System.out.print("Digite a quantidade de notas: ");
		int valor = tecladoScanner.nextInt();
		System.out.print("Notas devem estar no intervalo de 0 a 10\n\n");
		
		for (int i = 0; i<valor; i++) {	
			
			System.out.print("Digite sua "+ (i+1) +"ª nota: ");
			notas.add (tecladoScanner.nextFloat());
			
				if (notas.get(i) > 10 || notas.get(i) < 0) {
					notas.remove(i);
					notas.add(0f);

				}
		}
		System.out.print("\nNotas: ");
		for (Float i: notas) {
			soma += i.floatValue();
			System.out.printf("%.2f ", i);
		}
		
		float media = soma/valor;
		System.out.printf("\nSua média é: %.2f", media);
		
		if (media >= 7) {
			System.out.printf("\n\nVocê foi APROVADO, parabens!");
			
		}else if (media < 7 && media >= 5) {
			System.out.printf("\n\nVocê está de RECUPERAÇÃO!");
		
		}else {
			System.out.printf("\n\nVocê foi REPROVADO!");
		}
		
	}

}
*/