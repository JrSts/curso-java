package CursinhoCoder.Desafios.Excecoes;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		try {
			gerarErro1();			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			gerarErro2();
		} catch (Exception e) {			
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim :)");
	}
	
	// Exceção não checada | nao verificada
	static void gerarErro1() {
		throw new RuntimeException("Ocorreu um erro #01!");
	}
	
	// Exceção checada
	static void gerarErro2() throws Exception {
		throw new Exception("Ocorreu um erro #02!");
	}
}
