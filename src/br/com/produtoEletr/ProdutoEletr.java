package br.com.produtoEletr;

public class ProdutoEletr {
	
	String produto, modelo;
	int anoLancamento;
	double preço;
	
	
	void prodInicializando() {
		System.out.println("O dispositivo eletrônico esta inicializando, aguarde...");
	}
	
	void prodDesligando() {
		System.out.println("O dispositivo está encerrando, até mais!");
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public double getPreço() {
		return preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}
	
	
	
}
