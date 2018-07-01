package br.edu.unoesc.smo.carrinhodecompras;

public enum TipoProduto {
	
	BEBIDA(new DescontoCincoPorcento()),
	VESTUARIO(new DescontoVinteCincoPorcento());
	
	TipoProduto(RegraCalculo regraCalculo) {
		this.regraCalculo = regraCalculo;
	}
	
	private RegraCalculo regraCalculo;
	
	public Double calcular(Produto produto) {
		return regraCalculo.calcular(produto);
	}
}
