package javafxapplication1;
import database.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Discount {
    public  float UED = 1;
    public  float ZD = 1;
    public  float SD = 1;
    public  float FPD = 1;
    public int RID;
    Discount(int RtID) {
        this.RID = RtID;
    }
    
    void Discounts() {
        try {
            ResultSet resultSet = null;
            Connection connection = database.db.getConnection();

            Statement statement = connection.createStatement();


            // Create and execute a SELECT SQL statement.
            String selectSql = "SELECT * FROM discounttable WHERE RestID =" + RID;
            resultSet = statement.executeQuery(selectSql);
            // Print results from select statement
            while (resultSet.next())
            {
                this.FPD = resultSet.getInt(2);
                this.SD = resultSet.getInt(3);
                this.UED = resultSet.getInt(4);
                this.ZD = resultSet.getInt(5);
            }
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
