package CursinhoCoder.Desafios.Excecoes.ExcecaoPersonalizadaA;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends RuntimeException {
	private String nomeAtributo;
	
	public NumeroForaIntervaloException(String nomeAtributo) {
		this.nomeAtributo = nomeAtributo;
	}
	
	
	public String getMessage() {
		return "O atributo " + nomeAtributo + " está fora do intervalo!";
	}
	
}
