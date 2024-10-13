package CursinhoCoder.Desafios.Excecoes;

import CursinhoCoder.Desafios.DesafioClasses.Comida;

public class Basico {

	public static void main(String[] args) {
		
		Comida a1 = null;
		
		try {
			imprimirNomeComida(a1);
		} catch (Exception e) {
			System.out.println("Houve um erro: " + e.getMessage());
		}
		
		try {
			System.out.println(7 / 0);			
		} catch (Exception e) {
			System.out.println("Houve um erro: " + e.getMessage());
		}		
	}
	
	public static void imprimirNomeComida(Comida comida) {
		System.out.println(comida.nome);
	}
}
