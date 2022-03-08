package br.com.cliente;

import java.util.Scanner;

public class TesteCliente {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double saldo, valorCompra, valorAtual;
		
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		
		c1.setNome("Gustavo");
		c1.setIdade(20);
		c1.setCpf("514.325.324.23");
		
		System.out.println("Cliente --> "+c1.getNome());
		System.out.print("Informe o saldo da disponível --> ");
		saldo = teclado.nextDouble();
		
		c1.setSaldo(saldo);
		
		System.out.print("Informe o valor final da compra --> ");
		valorCompra = teclado.nextDouble();
		
		c1.pagarCompras(c1.getSaldo(), valorCompra);
		

		
		System.out.println("Saldo Atual --> "+(c1.getSaldo() - valorCompra));
		
		c1.fazerTrocas();
		
		System.out.println();
		c2.setNome("Roberta");
		c2.setIdade(34);
		c2.setCpf("512.455.567.32");
		
		System.out.println("Cliente --> "+c2.getNome());
		System.out.print("Informe o saldo da disponível --> ");
		saldo = teclado.nextDouble();
		
		c2.setSaldo(saldo);
		
		System.out.print("Informe o valor final da compra --> ");
		valorCompra = teclado.nextDouble();
		
		c1.pagarCompras(c2.getSaldo(), valorCompra);
		
		
		
		System.out.println("Saldo Atual --> "+(c2.getSaldo() - valorCompra));
		
		c2.fazerTrocas();
		
		
		
		
	}

}
