package CursinhoCoder.Desafios.Reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

import CursinhoCoder.Desafios.Excecoes.ExcecaoPersonalizadaA.Aluno;

public class Reduce3 {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.1); 
		Aluno a2 = new Aluno("Ana", 9.1); 
		Aluno a3 = new Aluno("Ana", 6.1); 
		Aluno a4 = new Aluno("Ana", 4.1);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = aluno -> aluno.getNota() >= 7;
		
		Function<Aluno, Double> apenasNota = aluno -> aluno.getNota();
		
		BiFunction<Media, Double, Media> calcularMedia = (media, nota) -> media.adicionar(nota);
		
		BinaryOperator<Media> combinarMedia = (m1, m2) -> Media.combinar(m1, m2);
		
		
		Media media = alunos.stream()
			.filter(aprovado)
			.map(apenasNota)
			.reduce(new Media(), calcularMedia, combinarMedia);
		
		System.out.println(media.getValor());
		
	}

}
