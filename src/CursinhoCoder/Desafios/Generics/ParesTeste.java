package CursinhoCoder.Desafios.Generics;

public class ParesTeste {

	public static void main(String[] args) {
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.adicionar(1, "Maria");
		resultadoConcurso.adicionar(2, "Pedro");
		resultadoConcurso.adicionar(3, "João");
		resultadoConcurso.adicionar(4, "Carlos");
		resultadoConcurso.adicionar(5, "Clovis");
		resultadoConcurso.adicionar(6, "Vitor");
		resultadoConcurso.adicionar(2, "Larissa");
		
		
		System.out.println(resultadoConcurso.getValor(2));
	}

}
