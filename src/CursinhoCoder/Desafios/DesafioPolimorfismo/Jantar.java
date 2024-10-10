package CursinhoCoder.Desafios.DesafioPolimorfismo;

public class Jantar {

	public static void main(String[] args) {

		Pessoa convidado = new Pessoa(99.65);
		
		Arroz arroz = new Arroz(0.100);
		Feijao feijao = new Feijao(0.150);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(arroz);
		convidado.comer(feijao);
		
		System.out.println(convidado.getPeso());
		
		Sorvete sobremesa = new Sorvete(0.3);
		
		convidado.comer(sobremesa);
		
		System.out.println(convidado.getPeso());
	}

}
