package CursinhoCoder.Desafios.Excecoes.ExcecaoPersonalizadaB;

@SuppressWarnings("serial")
public class StringVaziaException extends Exception {
	private String nomeAtributo;
	
	public StringVaziaException(String nomeAtributo) {
		this.nomeAtributo = nomeAtributo;
	}
	
	
	public String getMessage() {
		return "O atributo " + nomeAtributo + " está vazio!";
	}
	
}
