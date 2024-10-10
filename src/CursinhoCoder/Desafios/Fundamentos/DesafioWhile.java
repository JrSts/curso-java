package CursinhoCoder.Desafios.Fundamentos;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double nota = 0;
		double media, total = 0;
		int contador = 0;
		
		while (nota != -1) {
			System.out.println("Digite uma nota: ");
			nota = scan.nextDouble();
			
			if (nota < 0 || nota > 10) {
				System.out.println("Nota Invalida!");
			} else {
				total += nota;
				contador++;
			}
		}
		
		media = total / contador;
		
		System.out.println("A media entre as notas são: " + media);
		scan.close();
		
	}

}
