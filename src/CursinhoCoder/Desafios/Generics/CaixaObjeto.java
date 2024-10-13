package CursinhoCoder.Desafios.Generics;

public class CaixaObjeto {

	private Object coisa;
	
	public CaixaObjeto(Object coisa) {
		this.coisa = coisa;
	}
	

	public CaixaObjeto() {}


	public Object abrir() {
		return coisa;
	}

	public void guardar(Object coisa) {
		this.coisa = coisa;
	}
	
	
}
