package br.edu.unoesc.smo.carrinhodecompras;

public class DescontoVinteCincoPorcento implements RegraCalculo {
	
	@Override
	public Double calcular(Produto produto) {
		Double desconto = produto.getValor() * 0.25;
		return produto.getValor() - desconto;
	}
}
