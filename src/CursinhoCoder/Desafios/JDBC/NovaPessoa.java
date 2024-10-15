package CursinhoCoder.Desafios.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
	public static void main(String[] args) throws SQLException {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o nome da pessoa");
		String nome = scan.nextLine();
		
		String sql = "insert into pessoas (nome) values (?)";
		
		Connection conexao = FabricaConexao.getConexao();
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome);
		stmt.execute();
						
		scan.close();
	}

}
