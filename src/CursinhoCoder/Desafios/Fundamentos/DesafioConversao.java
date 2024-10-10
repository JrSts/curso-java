package CursinhoCoder.Desafios.Fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String numero1, numero2, numero3;
		double num1, num2, num3, media;
		
		System.out.println("Informe o primeiro numero: ");

		numero1 = scan.nextLine().replace(",", ".");
		
		System.out.println("Informe o segundo numero: ");

		numero2 = scan.nextLine().replace(",", ".");
		
		System.out.println("Informe o terceiro numero: ");

		numero3 = scan.nextLine().replace(",", ".");

		
		num1 = Double.parseDouble(numero1);
		num2 = Double.parseDouble(numero2);
		num3 = Double.parseDouble(numero3);
		

		media = (num1 + num2 + num3)/3;
		
		System.out.println("A media entre: " + num1 + " " + num2 + " " + num3 + " é igual a: " + media);
		
		scan.close();
	}

}
