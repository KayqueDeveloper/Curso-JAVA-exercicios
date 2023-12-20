package jdbc;

public class DAOteste {
    public static void main(String[] args) {
    
    DAO dao = new DAO();
    
    String sql = "INSERT INTO pessoas (nome) VALUES (?)";
    System.out.println(dao.incluir(sql, "Joao da Silva"));
    System.out.println(dao.incluir(sql, "Ana Julia"));
    System.out.println(dao.incluir(sql, "Djalma Pereira"));
    
    dao.close();
    
    
    
    }
}
