package CursinhoCoder.Desafios.DesafioComposicao;

import java.util.ArrayList;

public class Cliente {

	String nome;
	
	ArrayList<Compra> compras = new ArrayList<>();

	public Cliente(String nome, ArrayList<Compra> compras) {
		this.nome = nome;
		this.compras = compras;
	}
		
	double valorTotal() {
		double total = 0;
		for (int i = 0; i < compras.size(); i++) {
			for (int j = 0; j < compras.get(i).itens.size(); j++) {
				total += (compras.get(i).itens.get(j).quantidade * compras.get(i).itens.get(j).produto.getPreco());
			}
		}
		return total;
	}
 	
}
