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
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Yash Dave
 */
public class RestpageController implements Initializable {

    public Button b1;
    public Button b2;
    public Button b3;
    public Button b4;
    public Button b5;
    public Button b6;
    public Button b7;
    public Button b8;
    public Button b9;
    public Button b10;
    
    public static int dval;
    
    public Label n1;
    public Label n2;
    public Label n3;
    public Label n4;
    public Label n5;
    public Label n6;
    public Label n7;
    public Label n8;
    public Label n9;
    //public Label n10;
    
    public Label r1;
    public Label r2;
    public Label r3;
    public Label r4;
    public Label r5;
    public Label r6;
    public Label r7;
    public Label r8;
    public Label r9;
    //public Label r10;
    
    public Label p1;
    public Label p2;
    public Label p3;
    public Label p4;
    public Label p5;
    public Label p6;
    public Label p7;
    public Label p8;
    public Label p9;
    //public Label p10;
    
    
   
    
    public Button close;
    public Button left;
    
    /**
     *
     */
    public ResultSet rss;
    
    public Button sort1;
    public Button sort2;

   
    //private ScrollPane scroll; //this must match the fx:id of the ScrollPane element
    //scroll.setVvalue(1.0); 
    
   public void Clickclose( ActionEvent e)
   {
       Stage stage= (Stage) close.getScene().getWindow();
        stage.close();
       
   }
   
   
   public void Clickleft(ActionEvent event) throws IOException
   {
       Parent newroot3= FXMLLoader.load(this.getClass().getResource("page2.fxml"));
            Scene newscene3= new Scene(newroot3);
            Stage newwindow3 =(Stage)((Node)event.getSource()).getScene().getWindow();
            newwindow3.setScene(newscene3);
            newwindow3.show();
   }
    //public SecondpageController sp;
    
    //public ScrollPane scroll; //this must match the fx:id of the ScrollPane element
    //scroll.setVvalue(1.0);
   
   public void Clickprice(ActionEvent event) throws Exception
   {
       setvalues(3);
   }
   public void Clickrating(ActionEvent ev) throws Exception
   {
       setvalues(2);
   }
    /**
     *
     * @throws Exception
     */
    
    public void setvalues(int key) throws Exception
    {
       Restaurant rst=new Restaurant();
       ResultSet rsn=null;
       System.out.println(SecondpageController.val);
       if(key==0)
       {
           System.out.println(key);
           rsn=rst.showrestsbyid(SecondpageController.lol); 
       }
       else if(key==1)
       {
           System.out.println(key);
          rsn=rst.showrestsbyname(SecondpageController.lol); 
       }
       else if(key==2)
       {
           System.out.println(key);
           rsn=rst.showrestsbyrating(SecondpageController.lol); 
       }
       
       else
       {
           rsn=rst.showrestsbypprice(SecondpageController.lol); 
       }
       
     
       //rsn=rss;
       int count = 0;
       ArrayList<String> namelist=new ArrayList<>(10);
       ArrayList<String> ratlist=new ArrayList<>(10);
       ArrayList<String> pricelist=new ArrayList<>(10);
       while(rsn.next())
       {
           namelist.add(rsn.getString(3));
           ratlist.add(rsn.getString(5));
           pricelist.add(rsn.getString(4));
           count++;
       }
       System.out.println(namelist.get(3));
       
       n1.setText(namelist.get(0));
       n2.setText(namelist.get(1));
       n3.setText(namelist.get(2));
       n4.setText(namelist.get(3));
       n5.setText(namelist.get(4));
       n6.setText(namelist.get(5));
       n7.setText(namelist.get(6));
       n8.setText(namelist.get(7));
       n9.setText(namelist.get(8));
       //n10.setText(namelist.get(9));
       
       r1.setText(ratlist.get(0));
       r2.setText(ratlist.get(1));
       r3.setText(ratlist.get(2));
       r4.setText(ratlist.get(3));
       r5.setText(ratlist.get(4));
       r6.setText(ratlist.get(5));
       r7.setText(ratlist.get(6));
       r8.setText(ratlist.get(7));
       r9.setText(ratlist.get(8));
       //r10.setText(ratlist.get(9));
       
       
       p1.setText(pricelist.get(0));
       p2.setText(pricelist.get(1));
       p3.setText(pricelist.get(2));
       p4.setText(pricelist.get(3));
       p5.setText(pricelist.get(4));
       p6.setText(pricelist.get(5));
       p7.setText(pricelist.get(6));
       p8.setText(pricelist.get(7));
       p9.setText(pricelist.get(8));
       //p10.setText(pricelist.get(9));
       //int tmp
      
    }
    
    
    
    
    
    
    
    
    
    public void Click(ActionEvent ae) throws IOException
    {
       // System.out.println("You clicked hadapsar!");
        //label.setText("Hello World!");
        
        
        
        if(ae.getSource()==b1)
        {   
            Dishes D=new Dishes(SecondpageController.val+1);
            System.out.println(this.getClass().getResource("dishes.fxml"));
            Parent newroot4= FXMLLoader.load(this.getClass().getResource("dishes.fxml"));
            System.out.println(RestpageController.dval);
            RestpageController.dval=SecondpageController.val+1;
            System.out.println(RestpageController.dval);
            Scene newscene4;
            newscene4 = new Scene(newroot4);
            Stage newwindow4 =(Stage)((Node)ae.getSource()).getScene().getWindow();
            newwindow4.setScene(newscene4);
            newwindow4.show();
        }
        else if(ae.getSource()==b2)
        {
            Dishes D=new Dishes(SecondpageController.val+2);
            System.out.println(this.getClass().getResource("dishes.fxml"));
            Parent newroot4= FXMLLoader.load(this.getClass().getResource("dishes.fxml"));
            RestpageController.dval=SecondpageController.val+2;
            Scene newscene4;
            newscene4 = new Scene(newroot4);
            Stage newwindow4 =(Stage)((Node)ae.getSource()).getScene().getWindow();
            newwindow4.setScene(newscene4);
            newwindow4.show();
        }
        else if(ae.getSource()==b3)
        {
            Dishes D=new Dishes(SecondpageController.val+3);
            System.out.println(this.getClass().getResource("dishes.fxml"));
            Parent newroot4= FXMLLoader.load(this.getClass().getResource("dishes.fxml"));
            RestpageController.dval=SecondpageController.val+3;
            Scene newscene4;
            newscene4 = new Scene(newroot4);
            Stage newwindow4 =(Stage)((Node)ae.getSource()).getScene().getWindow();
            newwindow4.setScene(newscene4);
            newwindow4.show();
        }
        else if(ae.getSource()==b4)
        {
            Dishes D=new Dishes(SecondpageController.val+4);
            System.out.println(this.getClass().getResource("dishes.fxml"));
            Parent newroot4= FXMLLoader.load(this.getClass().getResource("dishes.fxml"));
            RestpageController.dval=SecondpageController.val+4;
            Scene newscene4;
            newscene4 = new Scene(newroot4);
            Stage newwindow4 =(Stage)((Node)ae.getSource()).getScene().getWindow();
            newwindow4.setScene(newscene4);
            newwindow4.show();
        }
        else if(ae.getSource()==b5)
        {
            Dishes D=new Dishes(SecondpageController.val+5);
            System.out.println(this.getClass().getResource("dishes.fxml"));
            Parent newroot4= FXMLLoader.load(this.getClass().getResource("dishes.fxml"));
            RestpageController.dval=SecondpageController.val+5;
            Scene newscene4;
            newscene4 = new Scene(newroot4);
            Stage newwindow4 =(Stage)((Node)ae.getSource()).getScene().getWindow();
            newwindow4.setScene(newscene4);
            newwindow4.show();
        }
        else if(ae.getSource()==b6)
        {
            Dishes D=new Dishes(SecondpageController.val+6);
            System.out.println(this.getClass().getResource("dishes.fxml"));
            Parent newroot4= FXMLLoader.load(this.getClass().getResource("dishes.fxml"));
            RestpageController.dval=SecondpageController.val+6;
            Scene newscene4;
            newscene4 = new Scene(newroot4);
            Stage newwindow4 =(Stage)((Node)ae.getSource()).getScene().getWindow();
            newwindow4.setScene(newscene4);
            newwindow4.show();
        }
        else if(ae.getSource()==b7)
        {
            Dishes D=new Dishes(SecondpageController.val+7);
            System.out.println(this.getClass().getResource("dishes.fxml"));
            Parent newroot4= FXMLLoader.load(this.getClass().getResource("dishes.fxml"));
            RestpageController.dval=SecondpageController.val+7;
            Scene newscene4;
            newscene4 = new Scene(newroot4);
            Stage newwindow4 =(Stage)((Node)ae.getSource()).getScene().getWindow();
            newwindow4.setScene(newscene4);
            newwindow4.show();
        }
        else if(ae.getSource()==b8)
        {
            Dishes D=new Dishes(SecondpageController.val+8);
            System.out.println(this.getClass().getResource("dishes.fxml"));
            Parent newroot4= FXMLLoader.load(this.getClass().getResource("dishes.fxml"));
            RestpageController.dval=SecondpageController.val+8;
            Scene newscene4;
            newscene4 = new Scene(newroot4);
            Stage newwindow4 =(Stage)((Node)ae.getSource()).getScene().getWindow();
            newwindow4.setScene(newscene4);
            newwindow4.show();
        }
        else if(ae.getSource()==b9)
        {
            Dishes D=new Dishes(SecondpageController.val+9);
            System.out.println(this.getClass().getResource("dishes.fxml"));
            Parent newroot4= FXMLLoader.load(this.getClass().getResource("dishes.fxml"));
            RestpageController.dval=SecondpageController.val+9;
            Scene newscene4;
            newscene4 = new Scene(newroot4);
            Stage newwindow4 =(Stage)((Node)ae.getSource()).getScene().getWindow();
            newwindow4.setScene(newscene4);
            newwindow4.show();
        }
        else if(ae.getSource()==b10)
        {
            Dishes D=new Dishes(SecondpageController.val+10);
            System.out.println(this.getClass().getResource("dishes.fxml"));
            Parent newroot4= FXMLLoader.load(this.getClass().getResource("dishes.fxml"));
            RestpageController.dval=SecondpageController.val+10;
            Scene newscene4;
            newscene4 = new Scene(newroot4);
            Stage newwindow4 =(Stage)((Node)ae.getSource()).getScene().getWindow();
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
            /*Rad1.setToggleGroup(t1);
            Rad2.setToggleGroup(t1);
            Rad3.setToggleGroup(t1);*/
            System.out.println("Inside init");
            setvalues(0);
            System.out.println("init done");
            // TODO
        } catch (Exception ex) 
        {
             ex.printStackTrace();
        }
    }    
    
}
