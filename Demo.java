import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Demo{
    public static void main(String [] args){
        String url= "jdbc:mysql://localhost:3306/bca";
        String user="root";
        String password = "9696";
        try(Connection com=
        DriverManager.getConnection(url,user ,password)){
            System.out.println("JDBC Connection Succesfull");
        }catch (SQLException e){
            System.out.println("Connection Failed");
            e.printStackTrace();
        }
    }
}