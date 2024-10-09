package CursinhoCoder.Desafios.DesafioClasses;

public class Pessoa {

	String nome;
	double peso;
	
	public void comer(Comida comida) {
		this.peso += comida.peso;
	}

	public Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	
}
