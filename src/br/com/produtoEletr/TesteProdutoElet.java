package br.com.produtoEletr;

public class TesteProdutoElet {

	public static void main(String[] args) {
		
		ProdutoEletr celular = new ProdutoEletr();
		ProdutoEletr tv = new ProdutoEletr();
		
		
		celular.setModelo("Iphone 13");
		celular.setPre�o(10000.00);
		celular.setProduto("Celular");
		celular.setAnoLancamento(2021);
		
		System.out.println("Produto --> "+celular.getProduto());
		System.out.println("Modelo --> "+celular.getModelo());
		System.out.println("Pre�o --> R$ "+celular.getPre�o());
		System.out.println("O ano de lan�amento deste modelo foi --> "+celular.getAnoLancamento());
		
		celular.prodInicializando();
		
		celular.prodDesligando();

		
		System.out.println();
		tv.setModelo("Smart TV Samsung 4K");
		tv.setPre�o(15000.00);
		tv.setProduto("Televis�o");
		tv.setAnoLancamento(2022);
		
		System.out.println("Produto --> "+tv.getProduto());
		System.out.println("Modelo --> "+tv.getModelo());
		System.out.println("Pre�o --> R$ "+tv.getPre�o());
		System.out.println("O ano de lan�amento deste modelo foi --> "+tv.getAnoLancamento());
		
		tv.prodInicializando();
		
		tv.prodDesligando();
		
		
	}

}
