package br.com.lmarques;

public class Numeros {

	private float primeiraNota;
	private float segundaNota;
	private float terceiraNota;
	private float quartaNota;
	private float media;

	public void setPrimeiraNota(float primeiraNota) {
		
		if (primeiraNota >= 0 && primeiraNota <= 10) {
			this.primeiraNota = primeiraNota;
		}
		else {
			this.primeiraNota = 0;
		}
	}

	public void setSegundaNota(float segundaNota) {
		
		if (segundaNota >= 0 && segundaNota <= 10) {
			this.segundaNota = segundaNota;
		}
		else {
			this.segundaNota = 0;
		}
	}

	public void setTerceiraNota(float terceiraNota) {
		
		if (terceiraNota >= 0 && terceiraNota <= 10) {
			this.terceiraNota = terceiraNota;
		}
		else {
			this.terceiraNota = 0;
		}
	}
	
	public void setQuartaNota(float quartaNota) {
		
		if (quartaNota >= 0 && quartaNota <= 10) {
			this.quartaNota = quartaNota;
		}
		else {
			this.quartaNota = 0;
		}
	}
	
	public float fazMedia() {
		this.media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;
		return media;
	}
		
	public float getPrimeiraNota() {
		return primeiraNota;
	}

	public float getSegundaNota() {
		return segundaNota;
	}

	public float getTerceiraNota() {
		return terceiraNota;
	}

	public float getQuartaNota() {
		return quartaNota;
	}
	
	public String getMsgAprovado() {

		if (fazMedia() >= 7) {
			return "\n\nVocê foi APROVADO, parabens!";
			
		}else if (fazMedia() < 7 && fazMedia() >= 5) {
			return "\n\nVocê foi APROVADO, parabens!";
		
		}else {
			return "\n\nVocê foi APROVADO, parabens!";
		}
	}

}