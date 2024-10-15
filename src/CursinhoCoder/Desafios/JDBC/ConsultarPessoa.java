package CursinhoCoder.Desafios.JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoa {
	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaConexao.getConexao();
		
		Statement stmt = conexao.createStatement();
		
		String sql = "select * from pessoas";
		
		ResultSet resultado = stmt.executeQuery(sql);
		
		List<Pessoa> pessoas = new ArrayList<>();
		while (resultado.next()) {
			int codigo = resultado.getInt("id");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		pessoas.stream().forEach(p -> System.out.println(p.toString()));
		
		stmt.close();
		conexao.close();
	}
}
