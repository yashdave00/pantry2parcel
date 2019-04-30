package javafxapplication1;
import java.util.*;
import java.sql.*;

public class Useracc {
    String uid;
    String password;
    String email;

    Useracc(){
        uid = "";
        password = "";
        email = "";
    }

    Useracc(String uid,String password,String email){
        this.uid = uid;
        this.password = password;
        this.email = email;
    }


    void signup(String nm,String pass,String email ) throws Exception{

        this.uid = nm;
       
        this.password = pass;
      
        this.email = email;


        Connection conn = database.db.getConnection();
        Statement statement = conn.createStatement();

        statement.executeUpdate("INSERT INTO user VALUES (" + "\'" + uid + "\'" + ", " + "\'" +  password + "\'" + ", " + "\'" +  email + "\'" + ")");

    }

    int login(String id,String pass) throws Exception{
        String count="0";
        Scanner sc = new Scanner(System.in);
        Connection conn = database.db.getConnection();
        Statement statement = conn.createStatement();
        try {
            String a="";
            String query = "SELECT * FROM user WHERE uid =  "+"\'"+id+"\'"+"AND password =  "+"\'"+pass+"\'";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                a = resultSet.getString("uid");
            }
            if(a.equals(""))
                return -1;
            else
                return 1;

        }
        catch (SQLException ex){
            System.out.println("failed");
            System.out.println(ex);
            return -1;
        }

    }
}
