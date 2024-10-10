package CursinhoCoder.Desafios.DesafioComposicao;

import java.util.ArrayList;

public class CompraTeste {

	public static void main(String[] args) {

		Produto produto1 = new Produto("Caneta", 5.20);
		Produto produto2 = new Produto("Lapis", 2.50);
		
		
		Item item1 = new Item(5, produto1);
		Item item2 = new Item(2, produto2);
		
		Compra compra1 = new Compra();
		
		compra1.itens.add(item1);
		compra1.itens.add(item2);
		
		Item item3 = new Item(2, produto1);
		Item item4 = new Item(5, produto2);
		
		Compra compra2 = new Compra();
		
		compra1.itens.add(item3);
		compra1.itens.add(item4);
		
		ArrayList<Compra> compras = new ArrayList<>();
		
		compras.add(compra1);		
		compras.add(compra2);		
		
		Cliente cliente1 = new Cliente("Maria", compras);
		
		Double total = cliente1.valorTotal();
		
		System.out.println("O cliente "+ cliente1.nome + " gastou na loja: " + total);		
	}
}
