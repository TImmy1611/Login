
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LigaBD {
    public static Connection ligacao(){
        String url= "jdbc:mysql://localhost:3306/dbcencal?useSSL=false&serverTimezone=UTC";
        String user="root";
        String password= "";
        Connection liga= null;
        try {
            liga=DriverManager.getConnection(url,user,password);
        } catch (SQLException ex) {
            System.out.println("Erro na tentativa de ligação à base de dados");
        }
        return liga;
    }
    public static void registaUtilizador(String login, String nome, String email, String morada, String password,int telefone, int nif) throws SQLException{
        String query="INSERT INTO utilizador(nome,email,morada,telefone,nif,login,password)"
        +"VALUES(?,?,?,?,?,?,?)";
        Connection liga=ligacao();
        PreparedStatement ps= liga.prepareStatement(query);
        ps.setString(1,nome);
        ps.setString(2,email);
        ps.setString(3,morada);
        ps.setInt(4,telefone);
        ps.setInt(5,nif);
        ps.setString(6,login);
        ps.setString(7,password);
        ps.execute();
    }

    public static void remove(int p) throws SQLException{
        Connection conn=ligacao();
        String sql= "DELETE FROM utilizador WHERE idUtilizador= '"+p+"'";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.executeUpdate();
    }
}
