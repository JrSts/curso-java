package CursinhoCoder.Desafios.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost/";
		String usuario = "root";
		String senha = "123456";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		System.out.println("Conexao efetuada com sucesso!");
		
		conexao.close();
	}
}
