package CursinhoCoder.Desafios.Fundamentos;

import java.util.Scanner;

public class DesafioAdivinhacao {

	public static void main(String[] args) {

		int num = (int) (Math.random() * 100);
		Scanner scan = new Scanner(System.in);
		int palpite = 0;
		
		for (int i = 10; i > 0; i--) {
			System.out.printf("Dê seu palpite, voce tem %d chances: ", i);
			palpite = scan.nextInt();
			
			if (palpite == num) {
				System.out.println("Parabens, Voce acertou o numero sorteado!!");
				break;
			} else if (palpite > num) {
				System.out.println("o numero sorteado é menor que o seu palpite");
			} else {
				System.out.println("o numero sorteado é maior que o seu palpite");
			}
		}
		scan.close();
	}

}
