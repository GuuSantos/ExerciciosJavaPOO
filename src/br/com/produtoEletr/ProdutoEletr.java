package br.com.produtoEletr;

public class ProdutoEletr {
	
	String produto, modelo;
	int anoLancamento;
	double pre�o;
	
	
	void prodInicializando() {
		System.out.println("O dispositivo eletr�nico esta inicializando, aguarde...");
	}
	
	void prodDesligando() {
		System.out.println("O dispositivo est� encerrando, at� mais!");
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

	public double getPre�o() {
		return pre�o;
	}

	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
	
	
	
}
