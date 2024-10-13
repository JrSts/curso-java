package CursinhoCoder.Desafios.DesafioFilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Caderno", 50.00, 0.33, 0);
		Produto p2 = new Produto("Agenda", 50.00, 0.20, 5.50);
		Produto p3 = new Produto("Lápis", 50.00, 0.10, 0);
		Produto p4 = new Produto("Apontador", 50.00, 0.05, 5.50);
		Produto p5 = new Produto("Estojo", 50.00, 0.12, 0);
		Produto p6 = new Produto("Monitor", 850.00, 0.40, 0);
		Produto p7 = new Produto("Impressora", 50.00, 0.28, 5.50);
		Produto p8 = new Produto("Gabinete", 350.60, 0.50, 0);
		Produto p9 = new Produto("Caneta", 50.00, 0.15, 5.50);

		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9);
		
		Predicate<Produto> estaNaPromocao = p -> p.getDesconto() >= 0.30;
		Predicate<Produto> freteGratis = p -> p.getFrete() == 0;
		Function<Produto, String> conversao = p -> "O produto " + p.getNome() + 
				" esta com uma super promoção de " + p.getDesconto() * 100 + 
				"% de desconto e frete gratis! Custando apenas: R$ " + String.format("%.2f", p.getPreco() * (1 - p.getDesconto())).replace(",", ".");
		
		produtos.stream()
			.filter(estaNaPromocao)
			.filter(freteGratis)
			.map(conversao)
			.forEach(System.out::println);
			
		
		
	}

}
