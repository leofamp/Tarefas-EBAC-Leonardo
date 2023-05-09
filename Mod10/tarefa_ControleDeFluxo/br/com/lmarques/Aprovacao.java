package br.com.lmarques;

public class Aprovacao {
	
	public String getMsgAprovado(float media) {

		if (media >= 7) {
			return "\n\nVocê foi APROVADO, parabens!";
			
		}else if (media < 7 && media >= 5) {
			return "\n\nVocê está de RECUPERAÇÃO!";
		
		}else {
			return "\n\nVocê foi REPROVADO!";
		}
	}
}
