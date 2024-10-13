package CursinhoCoder.Desafios.Excecoes.ExcecaoPersonalizadaB;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends Exception {
	private String nomeAtributo;
	
	public NumeroForaIntervaloException(String nomeAtributo) {
		this.nomeAtributo = nomeAtributo;
	}
	
	
	public String getMessage() {
		return "O atributo " + nomeAtributo + " está fora do intervalo!";
	}
	
}
