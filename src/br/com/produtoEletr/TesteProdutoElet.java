package br.com.produtoEletr;

public class TesteProdutoElet {

	public static void main(String[] args) {
		
		ProdutoEletr celular = new ProdutoEletr();
		ProdutoEletr tv = new ProdutoEletr();
		
		
		celular.setModelo("Iphone 13");
		celular.setPreço(10000.00);
		celular.setProduto("Celular");
		celular.setAnoLancamento(2021);
		
		System.out.println("Produto --> "+celular.getProduto());
		System.out.println("Modelo --> "+celular.getModelo());
		System.out.println("Preço --> R$ "+celular.getPreço());
		System.out.println("O ano de lançamento deste modelo foi --> "+celular.getAnoLancamento());
		
		celular.prodInicializando();
		
		celular.prodDesligando();

		
		System.out.println();
		tv.setModelo("Smart TV Samsung 4K");
		tv.setPreço(15000.00);
		tv.setProduto("Televisão");
		tv.setAnoLancamento(2022);
		
		System.out.println("Produto --> "+tv.getProduto());
		System.out.println("Modelo --> "+tv.getModelo());
		System.out.println("Preço --> R$ "+tv.getPreço());
		System.out.println("O ano de lançamento deste modelo foi --> "+tv.getAnoLancamento());
		
		tv.prodInicializando();
		
		tv.prodDesligando();
		
		
	}

}
