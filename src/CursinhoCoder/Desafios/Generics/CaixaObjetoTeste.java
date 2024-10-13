package CursinhoCoder.Desafios.Generics;

public class CaixaObjetoTeste {

	public static void main(String[] args) {
		CaixaObjeto caixa = new CaixaObjeto();
		caixa.guardar(2.3);
			
		// Erro de casting
		//Integer coisa = (Integer) caixa.abrir();
		Double coisa = (Double) caixa.abrir();
		
		
		System.out.println(coisa);
	}

}
