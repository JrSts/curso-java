package CursinhoCoder.Desafios.DesafioHeranca;

public class Ferrari extends Carro {

	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
	}

	@Override
	void acelerar() {
		if (velocidade + 25 >= super.VELOCIDADE_MAXIMA) {
			velocidade = super.VELOCIDADE_MAXIMA;
			System.out.println("O carro atingiu o limite de velocidade!");
		}else {
			velocidade += 25;			
		}
	}

	@Override
	void frear() {
		if (velocidade - 25 <= 0) {
			velocidade = 0;
			System.out.println("O carro esta parado!");
		} else {
			velocidade -= 25;			
		}
	}
}
