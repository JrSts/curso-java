package CursinhoCoder.Desafios.Excecoes.ExcecaoPersonalizadaA;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException {
	private String nomeAtributo;
	
	public StringVaziaException(String nomeAtributo) {
		this.nomeAtributo = nomeAtributo;
	}
	
	
	public String getMessage() {
		return "O atributo " + nomeAtributo + " está vazio!";
	}
	
}
