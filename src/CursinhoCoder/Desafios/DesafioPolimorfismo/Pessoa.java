package CursinhoCoder.Desafios.DesafioPolimorfismo;

public class Pessoa {

	private double peso;

	public double getPeso() {
		return peso;
	}
	
	public void comer(Comida comida) {
		this.peso += comida.getPeso();
	}

	public void setPeso(double peso) {
		if (peso >= 0) {
			this.peso = peso;			
		}
	}

	public Pessoa(double peso) {
		this.peso = peso;
	}
}
