package javafxapplication1;
import java.sql.*;

import java.util.Scanner;

import database.*;

public class Restaurant
{
    float rating;
    public int RID;
    String name;
    float avgcost;
    //broke D;
    String cuisine;
    String UElink;
    String Zlink;
    String Slink;
    String FPlink;

   
 /*   int getid()throws Exception{
        ResultSet resultSet = null;
            Connection connection = database.db.getConnection();
            Statement statement = connection.createStatement();
            // Create and execute a SELECT SQL statement.
            String selectSql = "SELECT * FROM mytable WHERE Restaurant_Name = " + "\"" + this.name + "\"";
            resultSet = statement.executeQuery(selectSql);
            // Print results from select statement
        int id=2;
        while (resultSet.next()) {
            if (resultSet.getString(2).equals(this.name))
                id = resultSet.getInt(0);
            else
                id=-1;

        }
        return id;
    }*/
    ResultSet showrestsbyname(int key) throws Exception
    {
        ResultSet resultSet = null;
        try
        {
            Connection connection = database.db.getConnection();
            Statement statement = connection.createStatement();
            // Create and execute a SELECT SQL statement.
            String selectSql="";
            key=key+1;
            switch (key) {
                case 1:
                    selectSql = "SELECT * FROM mytable WHERE Area = \"BANER-BALEWADI\" ORDER BY Restaurant_Name ";
                    break;
                case 2:
                    selectSql = "SELECT * FROM mytable WHERE Area = \"AUNDH\" ORDER BY Restaurant_Name ";
                    break;
                case 3:
                    selectSql = "SELECT * FROM mytable WHERE Area = \"HINJEWADI-WAKAD\" ORDER BY Restaurant_Name ";
                    break;
                case 4:
                    selectSql = "SELECT * FROM mytable WHERE Area = \"HADAPSAR\" ORDER BY Restaurant_Name ";
                    break;
                default:
                    selectSql = "SELECT * FROM mytable WHERE Area = \"DECCAN\" ORDER BY Restaurant_Name ";
                    break;
            }
            
            resultSet = statement.executeQuery(selectSql);
            ResultSet ne = resultSet;
            // Print results from select statement
            int bid=0;
            /*while (resultSet.next())
            {
                bid= Integer.parseInt(ne.getString(1));
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2)+ " "+resultSet.getString(3)+ " " +
                        resultSet.getString(4)+ " "+resultSet.getString(5));

            }*/
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return resultSet;
    }
    ResultSet showrestsbyrating(int key) throws Exception
    {
        ResultSet resultSet = null;
        try
        {
            Connection connection = database.db.getConnection();
            Statement statement = connection.createStatement();
            // Create and execute a SELECT SQL statement.
            String selectSql;
            switch (key) {
                case 1:
                    selectSql = "SELECT * FROM mytable WHERE Area = \"BANER-BALEWADI\" ORDER BY Rating DESC ";
                    break;
                case 2:
                    selectSql = "SELECT * FROM mytable WHERE Area = \"AUNDH\" ORDER BY Rating DESC ";
                    break;
                case 3:
                    selectSql = "SELECT * FROM mytable WHERE Area = \"HINJEWADI-WAKAD\" ORDER BY Rating DESC ";
                    break;
                case 4:
                    selectSql = "SELECT * FROM mytable WHERE Area = \"HADAPSAR\" ORDER BY Rating DESC ";
                    break;
                default:
                    selectSql = "SELECT * FROM mytable WHERE Area = \"DECCAN\" ORDER BY Rating DESC ";
                    break;
            }
            
            resultSet = statement.executeQuery(selectSql);
            ResultSet ne = resultSet;
            // Print results from select statement
            int bid=0;
            /*while (resultSet.next())
            {
                bid= Integer.parseInt(ne.getString(1));
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2)+ " "+resultSet.getString(3)+ " " +
                        resultSet.getString(4)+ " "+resultSet.getString(5));

            }*/
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return resultSet;
    }
    
    
    ResultSet showrestsbyid(int key) throws Exception
    {
        ResultSet resultSet = null;
        try
        {
            Connection connection = database.db.getConnection();
            Statement statement = connection.createStatement();
            // Create and execute a SELECT SQL statement.
            String selectSql="";
            System.out.println("KEY"+key);
            
            switch (key) {
                case 1:
                    selectSql = "SELECT * FROM mytable WHERE Area = \"BANER-BALEWADI\" ORDER BY ID ";
                    break;
                case 2:
                    selectSql = "SELECT * FROM mytable WHERE Area = \"AUNDH\" ORDER BY ID ";
                    break;
                case 3:
                    selectSql = "SELECT * FROM mytable WHERE Area = \"HINJEWADI-WAKAD\" ORDER BY ID ";
                    break;
                case 4:
                    selectSql = "SELECT * FROM mytable WHERE Area = \"HADAPSAR\" ORDER BY ID ";
                    break;
                case 5:
                    selectSql = "SELECT * FROM mytable WHERE Area = \"DECCAN\" ORDER BY ID ";
                    break;
                default:
                    System.out.println("LOL");
                    break;
            }
            
            resultSet = statement.executeQuery(selectSql);
            ResultSet ne = resultSet;
            // Print results from select statement
            int bid=0;
            /*while (resultSet.next())
            {
                bid= Integer.parseInt(ne.getString(1));
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2)+ " "+resultSet.getString(3)+ " " +
                        resultSet.getString(4)+ " "+resultSet.getString(5));

            }*/
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return resultSet;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    ResultSet showrestsbypprice(int k) throws Exception
    {
        ResultSet resultSet = null;
        try
        {
            Connection connection = database.db.getConnection();
            Statement statement = connection.createStatement();
            // Create and execute a SELECT SQL statement.
            String selectSql;
            switch (k) {
                case 1:
                    selectSql = "SELECT * FROM mytable WHERE Area = \"BANER-BALEWADI\" ORDER BY Price_for_two";
                    break;
                case 2:
                    selectSql = "SELECT * FROM mytable WHERE Area = \"AUNDH\"ORDER BY Price_for_two ";
                    break;
                case 3:
                    selectSql = "SELECT * FROM mytable WHERE Area =\" HINJEWADI-WAKAD\" ORDER BY Price_for_two ";
                    break;
                case 4:
                    selectSql = "SELECT * FROM mytable WHERE Area = \"HADAPSAR\" ORDER BY Price_for_two ";
                    break;
                default:
                    selectSql = "SELECT * FROM mytable WHERE Area = \"DECCAN\" ORDER BY Price_for_two ";
                    break;
            }
            
            resultSet = statement.executeQuery(selectSql);
            ResultSet ne = resultSet;
            // Print results from select statement
            int bid=0;
            /*while (resultSet.next())
            {
                bid= Integer.parseInt(ne.getString(1));
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2)+ " "+resultSet.getString(3)+ " " +
                        resultSet.getString(4)+ " "+resultSet.getString(5));

            }*/
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return resultSet;
    }


}