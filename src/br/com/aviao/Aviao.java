package br.com.aviao;

public class Aviao {
	
	String modelo;
	int ano, qtdPassageiros;
	
	
	void levantarVoo() {
		System.out.println("O avi�o esta avan�ando na pista e ir� decolar em segundos...");
	}
	
	void aterrissagem() {
		System.out.println("O avi�o est� pousando na pista!");
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getQtdPassageiros() {
		return qtdPassageiros;
	}

	public void setQtdPassageiros(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}
	
	
	
	
}
