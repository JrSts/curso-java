package CursinhoCoder.Desafios.JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioJDBC {
	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaConexao.getConexao();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um nome para buscar uma pessoa no banco de dados: ");
		String nomeLido = scan.nextLine();
		
		String sql = "select * from pessoas where nome like (?)";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		stmt.setString(1, "%" + nomeLido + "%");
		ResultSet resultado = stmt.executeQuery();
		
		List<Pessoa> pessoas = new ArrayList<>();
		while (resultado.next()) {
			int codigo = resultado.getInt("id");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		pessoas.stream().forEach(p -> System.out.println(p.toString()));
		
		scan.close();
		stmt.close();
		conexao.close();
		
	}
}
