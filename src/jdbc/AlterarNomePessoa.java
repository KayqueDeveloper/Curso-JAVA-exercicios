package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoa {
    
    public static void main(String[] args) throws SQLException {
        
        Connection conexao = FabricaConexao.getConexao();
        String sql = """
                UPDATE pessoas SET nome = ? WHERE id = ?;
                """;
//        Scanner entrada = new Scanner(System.in);

        

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o ID para alteracao: ");
        int id = entrada.nextInt();
        entrada.nextLine();
        
        System.out.print("Digite o novo nome: ");
        String nome = entrada.nextLine();


        
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nome);
        stmt.setInt(2, id);
        stmt.execute();
        
        sql = "SELECT * FROM pessoas;";
        
        ResultSet resultado = stmt.executeQuery(sql);
        
        while(resultado.next()) {
            int codigo = resultado.getInt("id");
            String nome2 = resultado.getString("nome");
            
            System.out.println(codigo + " --> " + nome2);
        }
        
        
        entrada.close();
        conexao.close();
    }

}
