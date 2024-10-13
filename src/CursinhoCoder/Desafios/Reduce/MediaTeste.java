package CursinhoCoder.Desafios.Reduce;

public class MediaTeste {

	public static void main(String[] args) {

		Media m1 = new Media();
		
		m1.adicionar(9.1);
		m1.adicionar(7.1);

		Media m2 = new Media();
		
		m2.adicionar(8.5);
		m2.adicionar(7.3);
		
		System.out.println(m1.getValor());
		
		System.out.println(Media.combinar(m1, m2).getValor());
		
		
	}

}
