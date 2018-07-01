package br.edu.unoesc.smo.carrinhodecompras;

public class DescontoCincoPorcento implements RegraCalculo {

	@Override
	public Double calcular(Produto produto) {
		Double desconto = produto.getValor() * 0.05;
		return produto.getValor() - desconto;
	}
}
