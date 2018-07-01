package br.edu.unoesc.smo.carrinhodecompras;

public class Produto {

	private String nome;
	private TipoProduto tipoProduto;
	private Double valor;

	public Produto(String nome, TipoProduto tipoProduto, Double valor) {
		this.nome = nome;
		this.tipoProduto = tipoProduto;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoProduto getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(TipoProduto tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
