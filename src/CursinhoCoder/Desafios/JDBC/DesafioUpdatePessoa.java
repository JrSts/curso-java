package CursinhoCoder.Desafios.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DesafioUpdatePessoa {

	public static void main(String[] args) throws SQLException {
		
		Scanner scan = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();
		
		System.out.println("Qual o id da pessoa voce quer alterar? ");
		int id = Integer.parseInt(scan.nextLine());
			
		String busca = "select id, nome from pessoas where id = ?";
		
		
		PreparedStatement stmt = conexao.prepareStatement(busca);
		Statement stmt2 = null;
		stmt.setInt(1, id);
		
		ResultSet resultado = stmt.executeQuery();
		
		if (resultado.next()) {
			System.out.println("informe o novo nome da pessoa: ");
			String nomeLido = scan.nextLine();
			
			stmt.close();
			stmt2 = conexao.createStatement();
			String atualizacao = "update pessoas set nome = '" + nomeLido + "' where id = " + id ;

			stmt2.execute(atualizacao);
			
			System.out.println("Pessoa Alterada com Sucesso!");
		} else {
			System.out.println("Pessoa não Encontrada!");
		}
				
		scan.close();
		stmt2.close();
		conexao.close();
	}
}
