package br.com.aviao;

public class TesteAviao {

	public static void main(String[] args) {
		
		Aviao a1 = new Aviao();
		Aviao a2 = new Aviao();
		
		
		a1.setAno(2012);
		a1.setModelo("Airbus A350");
		a1.setQtdPassageiros(350);
		
		System.out.println("Modelo do avião 1 --> "+a1.getModelo());
		System.out.println("Ano do avião 1 --> "+a1.getAno());
		System.out.println("Quantidade de passageiros permitida no avião 1 --> "+a1.getQtdPassageiros());
		
		
		a2.setAno(2021);
		a2.setModelo("Boeing 747");
		a2.setQtdPassageiros(410);
		System.out.println();
		System.out.println("Modelo do avião 2 --> "+a2.getModelo());
		System.out.println("Ano do avião 2 --> "+a2.getAno());
		System.out.println("Quantidade de passageiros permitida no avião 2--> "+a2.getQtdPassageiros());
		
	}

}
