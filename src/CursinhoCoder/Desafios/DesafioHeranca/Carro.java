package CursinhoCoder.Desafios.DesafioHeranca;

public class Carro {
	final int VELOCIDADE_MAXIMA;
	int velocidade;
	
	public Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	void acelerar() {
		if (velocidade + 5 >= VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
			System.out.println("O carro atingiu o limite de velocidade!");
		} else {
			velocidade += 5;			
		}
	}
	
	void frear() {
		if (velocidade >= 5) {
			velocidade -= 5;			
		} else {
			velocidade = 0;
			System.out.println("O carro está parado!");
		}
	}
}
