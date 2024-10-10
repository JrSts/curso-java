package CursinhoCoder.Desafios.Fundamentos;

public class DesafioFor {

	public static void main(String[] args) {

		String valor = "#";
		
		for (;!valor.equals("######");) {
			System.out.println(valor);
			valor += "#";
		}
		
	}

}
