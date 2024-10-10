package CursinhoCoder.Desafios.Fundamentos;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe quantas notas voce quer cadastrar: ");
		
		int cont = scan.nextInt();
		double[] notas = new double[cont];
		
		for (int i = 0; i < cont; i++) {
			System.out.printf("Informe a %dª nota: ", i+1);
			notas[i] = scan.nextDouble();
		}
		
		double somatorio = 0;
		
		for (double nota : notas) {
			somatorio += nota;
		}
		
		double media = somatorio/cont;
		
		System.out.println("A media das notas é: " + media);
		scan.close();
	}

}
