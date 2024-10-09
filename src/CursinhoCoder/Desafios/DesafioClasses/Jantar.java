package CursinhoCoder.Desafios.DesafioClasses;

public class Jantar {

	public static void main(String[] args) {
		Pessoa p = new Pessoa("Maria", 60);
		
		Comida comida = new Comida("feijao", .300);
	
		Comida comida2 = new Comida("arroz", .200);

		p.comer(comida);
		p.comer(comida2);
		
		System.out.println("o peso de maria depois da comida " + p.peso);
	}
}
