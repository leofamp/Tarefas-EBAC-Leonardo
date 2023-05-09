package br.com.lmarques;

public class Texto {
	
	private String exercicio = ("TAREFA CÁLCULO MÉDIA\n");
	private String regra = ("Coloque suas 4 notas, notas < 0 ou > 10 receberão 0.\n");
	private String texto1 = ("Digite sua primeira nota(0 a 10): ");
	private String texto2 = ("Digite sua segunda nota(0 a 10): ");
	private String texto3 = ("Digite sua terceira nota(0 a 10): ");
	private String texto4 = ("Digite sua quarta nota(0 a 10): ");
	
	
	public String mostraExercicio() {
		return (exercicio);
	}
	
	public String mostraRegra() {
		return (regra);
	}
	
	public String mostraTexto1() {
		return (texto1);
	}
	
	public String mostraTexto2() {
		return (texto2);
	}
	
	public String mostraTexto3() {
		return (texto3);
		
	}
	
	public String mostraTexto4() {
		return (texto4);
		
	}

}
