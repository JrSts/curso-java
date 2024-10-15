package CursinhoCoder.Desafios.JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoas {
	
	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaConexao.getConexao();
		
		Statement stmt = conexao.createStatement();
		
		String sql = "create table if not exists pessoas ("
				+ "id int unsigned not null auto_increment primary key,"
				+ "nome varchar(255) not null"
				+ ");";
		stmt.execute(sql);
	}
}
