package CursinhoCoder.Desafios.JDBC;

public class Pessoa {
	
	private int id;
	private String nome;
	
	Pessoa (int id, String nome) {
		setId(id);
		setNome(nome);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String toString() {	
		return id + " | " + nome;
	}
	
	
}
