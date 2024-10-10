package CursinhoCoder.Desafios.DesafioHeranca;

public class TesteCarro {
	
	public static void main(String[] args) {
		Carro c = new Civic(220);
		
		Carro f = new Ferrari(320);
		
		c.acelerar();
		
		System.out.println(f.velocidade + " " + c.velocidade);
		
		c.frear();

		System.out.println(f.velocidade + " " + c.velocidade);
	}
}
