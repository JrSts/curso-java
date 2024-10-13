package CursinhoCoder.Desafios.Excecoes;

import java.util.Scanner;

public class Finaly {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println(7/ scan.nextInt());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			scan.close();
		}
	}
}
