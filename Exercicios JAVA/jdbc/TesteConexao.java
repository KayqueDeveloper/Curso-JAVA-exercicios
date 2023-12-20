package jdbc;

import java.sql.*;

public class TesteConexao {

    public static void main(String[] args) throws SQLException {
        
        final String stringDeConexao = "jdbc:mysql://localhost?useSSL=true"; // posso colocar a porta tbm localhost:3303
        final String usuario = "root";
        final String senha = "k0203h27";
        
        Connection conexao = DriverManager.getConnection(stringDeConexao, usuario, senha);
        
        
        System.out.println("Conexão efetuada com sucesso.");
    
    
        conexao.close();
    
    }
}
