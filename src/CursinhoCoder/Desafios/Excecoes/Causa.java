package CursinhoCoder.Desafios.Excecoes;

import CursinhoCoder.Desafios.Excecoes.ExcecaoPersonalizadaA.Aluno;

public class Causa {
	
	public static void main(String[] args) {
		try {
			metodoA(null);
		} catch (IllegalArgumentException e) {
			if (e.getCause() != null) {
				System.out.println(e.getCause().getMessage());
			}
		}
	}

	public static void metodoA (Aluno aluno) {
		try {
			metodoB(aluno);
		} catch (Exception causa) {
			throw new IllegalArgumentException(causa);
		}
	}
	
	public static void metodoB (Aluno aluno) {
		if (aluno == null) {
			throw new NullPointerException("O aluno esta NULOOOOO!");
		}
		
		System.out.println(aluno.getNome());
	}
}
