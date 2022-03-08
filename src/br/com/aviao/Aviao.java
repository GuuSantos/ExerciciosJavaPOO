package br.com.aviao;

public class Aviao {
	
	String modelo;
	int ano, qtdPassageiros;
	
	
	void levantarVoo() {
		System.out.println("O avião esta avançando na pista e irá decolar em segundos...");
	}
	
	void aterrissagem() {
		System.out.println("O avião está pousando na pista!");
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
