package CursinhoCoder.Desafios.Fundamentos;

public class DesafioLogicos {

	public static void main(String[] args) {

		boolean trabalho1 = !true, trabalho2 = !true;

		if (trabalho1 && trabalho2) {
			System.out.println("Comprou a tv de 50\"");
		} else if (trabalho1 ^ trabalho2) {
			System.out.println("Comprou a tv de 32\"");
		} else {
			System.out.println("Ficaram sem sorvete.");
		}

	}

}