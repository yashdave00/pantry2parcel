/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Yash Dave
 */
public class DishesController implements Initializable {

    public Button bd1;
    public Button bd2;
    public Button bd3;
    public Button bd4;
    public Button bd5;
    public Button bd6;
    public Button bd7;
    public Button bd8;
    public Button bd9;
    public Button bd10;
    public ArrayList<String> dlist=new ArrayList<>(20);
    public static int resval;
    
    public Button close;
   public Button left;
   
    //private ScrollPane scroll; //this must match the fx:id of the ScrollPane element
    //scroll.setVvalue(1.0); 
    
   public void Clickclose( ActionEvent e)
   {
       Stage stage= (Stage) close.getScene().getWindow();
        stage.close();
       
   }
   
   public void Clickleft(ActionEvent event) throws IOException
   {
       Parent newroot3= FXMLLoader.load(this.getClass().getResource("Rest.fxml"));
            Scene newscene3= new Scene(newroot3);
            Stage newwindow3 =(Stage)((Node)event.getSource()).getScene().getWindow();
            newwindow3.setScene(newscene3);
            newwindow3.show();
   }
    public void setvals(int key) throws SQLException, Exception
    {
        Dishes D= new Dishes(key);
        D.getprices();
        dlist=D.namels;
        System.out.println();
        System.out.println("fcsvs");
        //System.out.println(dlist.get(2));
        bd1.setText(dlist.get(0));
        bd2.setText(dlist.get(1));
        bd3.setText(dlist.get(2));
        bd4.setText(dlist.get(3));
        bd5.setText(dlist.get(4));
        bd6.setText(dlist.get(5));
        bd7.setText(dlist.get(6));
        bd8.setText(dlist.get(7));
        bd9.setText(dlist.get(8));
        //bd10.setText(dlist.get(9));
    }
    public void Click(ActionEvent ae) throws IOException
    {
       // System.out.println("You clicked hadapsar!");
        //label.setText("Hello World!");
        if(ae.getSource()==bd1)
        {
             DishesController.resval=1;
            System.out.println(this.getClass().getResource("result.fxml"));
            Parent newroot4= FXMLLoader.load(this.getClass().getResource("result.fxml"));
            
            Scene newscene4;
            newscene4 = new Scene(newroot4);
           
            Stage newwindow4 =(Stage)((Node)ae.getSource()).getScene().getWindow();
            //newwindow4.initStyle(StageStyle.DECORATED);
            newwindow4.setScene(newscene4);
            newwindow4.show();
        }
        else if(ae.getSource()==bd2)
        {
            DishesController.resval=2;
            System.out.println(this.getClass().getResource("result.fxml"));
            Parent newroot4= FXMLLoader.load(this.getClass().getResource("result.fxml"));

            Scene newscene4;
            newscene4 = new Scene(newroot4);

            Stage newwindow4 =(Stage)((Node)ae.getSource()).getScene().getWindow();
            //newwindow4.initStyle(StageStyle.DECORATED);
            newwindow4.setScene(newscene4);
            newwindow4.show();
        }
        else if(ae.getSource()==bd3)
        {
            DishesController.resval=3;
            System.out.println(this.getClass().getResource("result.fxml"));
            Parent newroot4= FXMLLoader.load(this.getClass().getResource("result.fxml"));

            Scene newscene4;
            newscene4 = new Scene(newroot4);

            Stage newwindow4 =(Stage)((Node)ae.getSource()).getScene().getWindow();
            //newwindow4.initStyle(StageStyle.DECORATED);
            newwindow4.setScene(newscene4);
            newwindow4.show();
        }
       
        else if(ae.getSource()==bd4)
        {
            DishesController.resval=4;
            System.out.println(this.getClass().getResource("result.fxml"));
            Parent newroot4= FXMLLoader.load(this.getClass().getResource("result.fxml"));

            Scene newscene4;
            newscene4 = new Scene(newroot4);

            Stage newwindow4 =(Stage)((Node)ae.getSource()).getScene().getWindow();
            //newwindow4.initStyle(StageStyle.DECORATED);
            newwindow4.setScene(newscene4);
            newwindow4.show();
        }
       
        else if(ae.getSource()==bd5)
        {
            DishesController.resval=5;
            System.out.println(this.getClass().getResource("result.fxml"));
            Parent newroot4= FXMLLoader.load(this.getClass().getResource("result.fxml"));

            Scene newscene4;
            newscene4 = new Scene(newroot4);

            Stage newwindow4 =(Stage)((Node)ae.getSource()).getScene().getWindow();
            //newwindow4.initStyle(StageStyle.DECORATED);
            newwindow4.setScene(newscene4);
            newwindow4.show();
        }
       
        else if(ae.getSource()==bd6)
        {
            DishesController.resval=6;
            System.out.println(this.getClass().getResource("result.fxml"));
            Parent newroot4= FXMLLoader.load(this.getClass().getResource("result.fxml"));

            Scene newscene4;
            newscene4 = new Scene(newroot4);

            Stage newwindow4 =(Stage)((Node)ae.getSource()).getScene().getWindow();
            //newwindow4.initStyle(StageStyle.DECORATED);
            newwindow4.setScene(newscene4);
            newwindow4.show();
        }
       
        else if(ae.getSource()==bd7)
        {
            DishesController.resval=7;
            System.out.println(this.getClass().getResource("result.fxml"));
            Parent newroot4= FXMLLoader.load(this.getClass().getResource("result.fxml"));

            Scene newscene4;
            newscene4 = new Scene(newroot4);

            Stage newwindow4 =(Stage)((Node)ae.getSource()).getScene().getWindow();
            //newwindow4.initStyle(StageStyle.DECORATED);
            newwindow4.setScene(newscene4);
            newwindow4.show();
        }
       
        else if(ae.getSource()==bd8)
        {
            DishesController.resval=8;
            System.out.println(this.getClass().getResource("result.fxml"));
            Parent newroot4= FXMLLoader.load(this.getClass().getResource("result.fxml"));

            Scene newscene4;
            newscene4 = new Scene(newroot4);

            Stage newwindow4 =(Stage)((Node)ae.getSource()).getScene().getWindow();
            //newwindow4.initStyle(StageStyle.DECORATED);
            newwindow4.setScene(newscene4);
            newwindow4.show();
        }
       
        else if(ae.getSource()== bd9)
        {
            
            DishesController.resval=9;
            System.out.println(this.getClass().getResource("result.fxml"));
            Parent newroot4= FXMLLoader.load(this.getClass().getResource("result.fxml"));

            Scene newscene4;
            newscene4 = new Scene(newroot4);
            Stage newwindow4 =(Stage)((Node)ae.getSource()).getScene().getWindow();
            //newwindow4.initStyle(StageStyle.DECORATED);
            newwindow4.setScene(newscene4);
            newwindow4.show();
        }
         else if(ae.getSource()== bd10)
        {
            DishesController.resval=10;
            System.out.println(this.getClass().getResource("result.fxml"));
            Parent newroot4= FXMLLoader.load(this.getClass().getResource("result.fxml"));

            Scene newscene4;
            newscene4 = new Scene(newroot4);

            Stage newwindow4 =(Stage)((Node)ae.getSource()).getScene().getWindow();
            //newwindow4.initStyle(StageStyle.DECORATED);
            newwindow4.setScene(newscene4);
            newwindow4.show();
        }
    }
     /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            int key;
            key=RestpageController.dval;
            System.out.println(key);
            try {
                setvals(key);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            System.out.println("SETVALS CALLED");
            // TODO
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }      
    
}
