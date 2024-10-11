package CursinhoCoder.Desafios.Lambdas;

public class CalculoTeste {
	public static void main(String[] args) {
		Calculo calculo = new Soma();
		
		calculo.executar(2, 4);
		
		calculo = new Multiplicar();

		calculo.executar(2, 4);
		
		Calculo calc = (x, y) -> { return x + y; };
		
		System.out.println(calc.executar(2, 3));
		
		calc = (x, y) -> x * y;
		
		System.out.println(calc.executar(2, 3));	
	}
}
