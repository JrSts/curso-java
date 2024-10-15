package CursinhoCoder.Desafios.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException {

		Connection conexao = FabricaConexao.getConexao();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o id: ");
		int id = Integer.parseInt(scan.nextLine());
		
		String busca = "select * from pessoas where id = ?";
		String sql = "delete from pessoas where id = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(busca);
		
		stmt.setInt(1, id);
		ResultSet res = stmt.executeQuery();
		
		if (res.next()) {
			stmt.close();
			
			stmt = conexao.prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.execute();
			System.out.println("Pessoa deletada com sucesso!");
		} else {
			System.out.println("Pessoa nao encontrada");
		}
		
		stmt.close();
		scan.close();
		conexao.close();
		
	}

}
