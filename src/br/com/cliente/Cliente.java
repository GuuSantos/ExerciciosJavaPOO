package br.com.cliente;

public class Cliente {
	
	String nome, cpf;
	int idade;
	double saldo;
	
	void pagarCompras(double saldo, double saldoCompra) {
		System.out.println("Cliente fazendo compras..");
		saldo -= saldoCompra;
	}
	
	void fazerTrocas() {
		System.out.println("Cliente fazendo uma troca...");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
