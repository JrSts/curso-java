package CursinhoCoder.Desafios.Generics;

public class CaixaTeste {

	public static void main(String[] args) {
		Caixa<Double> caixa = new Caixa<>();
		caixa.guardar(2.3);
				
		Double coisa = caixa.abrir();
			
			
		System.out.println(coisa);
	}

}
