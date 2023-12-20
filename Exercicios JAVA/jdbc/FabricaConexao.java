package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {

    public static Connection getConexao() {
       
        try {
            Properties prop = getProperties();
            final String stringDeConexao = prop.getProperty("banco.url");
            final String usuario = prop.getProperty("banco.usuario");;
            final String senha = prop.getProperty("banco.senha");
            
            return DriverManager.getConnection(stringDeConexao, usuario, senha);
      
        } catch (SQLException | IOException e) {
              throw new RuntimeException(e);
        }
       
    }
    
    private static Properties getProperties() throws IOException{
        Properties pro = new Properties();
        String caminho = "/conexao.properties"; 
        pro.load(FabricaConexao.class.getResourceAsStream(caminho));
        return pro;
    }
    
}
