package Coffeeshop;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBconnection {
    private static final String url = "jdbc:mysql://localhost:3306/coffeeshop";
    private static final String user = "java";
    private static final String password = "1111";
    public static void getconnection (){
        try{
            Connection con=DriverManager.getConnection(url,user,password);
            System.out.println("Connected");


        }catch(SQLException e){
            System.err.println(e.getMessage());
        }


    }
}
