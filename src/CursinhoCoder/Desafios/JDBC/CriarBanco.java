package CursinhoCoder.Desafios.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost/";
		String usuario = "root";
		String senha = "123456";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
//		Connection conexao  = FabricaConexao.getConexao();
		
		Statement stmt = conexao.createStatement();
		
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");
		
		System.out.println("Banco Criado com Sucesso!!!");
		
		conexao.close();
	}
}
