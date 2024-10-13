package CursinhoCoder.Desafios.Generics;

public class Caixa<TIPO> {

	private TIPO coisa;
	
	public Caixa(TIPO coisa) {
		this.coisa = coisa;
	}
	

	public Caixa() {}


	public TIPO abrir() {
		return coisa;
	}

	public void guardar(TIPO coisa) {
		this.coisa = coisa;
	}
	
}
