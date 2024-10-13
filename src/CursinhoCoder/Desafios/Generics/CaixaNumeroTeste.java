package CursinhoCoder.Desafios.Generics;

public class CaixaNumeroTeste {

	public static void main(String[] args) {
		CaixaNumero<Double> caixa = new CaixaNumero<>();
		caixa.guardar(3.5);
		
		System.out.println(caixa.abrir());
	}

}
