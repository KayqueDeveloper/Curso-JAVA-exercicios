package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelaPessoas {
    public static void main(String[] args) throws SQLException{
        
        Connection conexao = FabricaConexao.getConexao();
        
        String sql = """
                CREATE TABLE IF NOT EXISTS pessoas(
                    id INT AUTO_INCREMENT NOT NULL PRIMARY KEY, 
                    nome VARCHAR(80) NOT NULL
                );
                """;
        
        Statement stmt = conexao.createStatement();
        stmt.execute(sql);
        
        conexao.close();
    }

}
