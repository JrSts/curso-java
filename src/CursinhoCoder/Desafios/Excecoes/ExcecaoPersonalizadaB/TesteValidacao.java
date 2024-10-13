package CursinhoCoder.Desafios.Excecoes.ExcecaoPersonalizadaB;

public class TesteValidacao {

	public static void main(String[] args) {

		try {
			Aluno aluno = new Aluno("Maria", 7);
			Validar.aluno(aluno);
			Validar.aluno(null);

		} catch (StringVaziaException | NumeroForaIntervaloException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("fim");
	}

}
