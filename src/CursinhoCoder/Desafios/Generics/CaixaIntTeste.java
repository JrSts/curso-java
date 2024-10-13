package CursinhoCoder.Desafios.Generics;

public class CaixaIntTeste {

	public static void main(String[] args) {
		CaixaInt caixa = new CaixaInt();
		caixa.guardar(123);
		
		Integer coisa = caixa.abrir();
		System.out.println(coisa);
	}

}
