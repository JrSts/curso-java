package CursinhoCoder.Desafios.Fundamentos;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {

		String nome;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			nome = scanner.next();
			if (nome.equalsIgnoreCase("sair")) {
				break;
			}
		}
		scanner.close();
	}
}
