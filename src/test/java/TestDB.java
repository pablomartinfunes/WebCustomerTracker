import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by pfunes on 10/07/17.
 */
public class TestDB {


    public static void main(String[] args) {

        String jdbc = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
        String user = "springstudent";
        String password = "springstudent";


        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to: " + jdbc);
            Connection myConn = DriverManager.getConnection(jdbc, user, password);
            System.out.println("Connected!!");

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
