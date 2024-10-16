package CursinhoCoder.Desafios.Reduce;

public class Media {

	private double total;
	private int quantidade;
	
	
	public Media adicionar(double valor) {
		this.total += valor;
		this.quantidade++;
		return this;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		this.total = total;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getValor() {
		return total / quantidade;
	}
	
	public static Media combinar(Media m1, Media m2) {
		Media resultante = new Media();
		resultante.quantidade = m2.quantidade + m2.quantidade;
		resultante.total = m1.total + m2.total;
		
		return resultante;
	}
	
}
