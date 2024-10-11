package CursinhoCoder.Desafios.DesafioLambda;

import java.util.function.Function;
import java.util.function.UnaryOperator;

import CursinhoCoder.Desafios.DesafioComposicao.Produto;

public class Desafio {
	public static void main(String[] args) {
		Produto product = new Produto("iPad", 3235.89, 0.13);
		
		Function<Produto, Double> precoFinal = p ->  p.getPreco() - (p.getPreco() * p.getDesconto()) ;
		
		UnaryOperator<Double> imposto = preco -> preco >= 2500 ? preco + (preco * 0.085): preco;
		UnaryOperator<Double> frete = preco -> preco >= 2500 ? preco + 100 : preco + 50;
		UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco).replace(",", "."));
		Function<Double, String> formatar = preco -> ("R$" + preco).replace(".", ",");
		
		String preco = precoFinal
				.andThen(imposto)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(product);
		
		System.out.println(preco);
		
	}
}
