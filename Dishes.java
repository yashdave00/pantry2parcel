package javafxapplication1;
import java.sql.*;
import database.*;
import java.util.ArrayList;


public class Dishes {
    public static int RID;
    String nameofdish;

    float price;
    float appprices[];

    /**
     *
     */
    public static ArrayList<String> namels = new ArrayList<>(20);
    Dishes(int ID)
    {
        Dishes.RID=Dishes.RID + ID;
        this.nameofdish="";
    }
    /**
     *
     * @throws Exception
     */
    public void getprices() throws Exception 
    {   ResultSet priceres = null;
        //ArrayList<String> namels = new ArrayList<>(10);
        try {
            Connection con = database.db.getConnection();
                Statement statement = con.createStatement();
                String RI = "r" + Dishes.RID;
                // Create and execute a SELECT SQL statement.
                String selectSql = "SELECT Dishname FROM " + RI;
                
                priceres = statement.executeQuery(selectSql);
                System.out.println("erdvd");
                while(priceres.next())
                {
                    System.out.println("Entered While");
                    Dishes.namels.add(priceres.getString(1));
                }
                System.out.println("sfdsvsv");
                System.out.println(Dishes.namels);
                con.close();
                statement.close();
            }catch (SQLException e) {
            System.out.println(e);
        }
    }

    ResultSet displaydishprices() {
        {
            ResultSet re = null;
            try {
                Connection conn = database.db.getConnection();
                Statement statement = conn.createStatement();
                String RI = "r" + RID;
                // Create and execute a SELECT SQL statement.
                String selectSql = "SELECT * FROM " + RI;
                Statement stmt = conn.createStatement();
                re = stmt.executeQuery(selectSql);
                Discount d = new Discount(RID);
                d.Discounts();
                while (re.next()) {
                    
                    System.out.println( re.getInt(2) + " "
                            + (re.getInt(2)-(re.getInt(2) * (d.FPD / 100)) ) + " "
                            + (re.getInt(2)-(re.getInt(2) * (d.SD / 100)) ) + " "
                            + (re.getInt(2)-(re.getInt(2) * (d.UED / 100)) ) + " "
                            + (re.getInt(2)-(re.getInt(2) * (d.ZD / 100)) ) );


                }
                //stmt.close();
                //conn.close();
                
            }
            catch (Exception e) {
                System.out.println(e);
            }
             return re; 
        }
        
       
    }
}

