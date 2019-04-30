/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import static javafxapplication1.Dishes.RID;

/**
 *
 * @author Yash Dave
 */
public class ResultpageController implements Initializable {

   public Label res1;
   public Label res2;
   public Label res3;
   public Label res4;
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
       Parent newroot3= FXMLLoader.load(this.getClass().getResource("dishes.fxml"));
            Scene newscene3= new Scene(newroot3);
            Stage newwindow3 =(Stage)((Node)event.getSource()).getScene().getWindow();
            newwindow3.setScene(newscene3);
            newwindow3.show();
   }
   public void setvalus() throws Exception
    {
        ResultSet re;
        try {
                Connection conn = database.db.getConnection();
                Statement statement = conn.createStatement();
                String RI = "r" + RestpageController.dval;
                // Create and execute a SELECT SQL statement.
                System.out.println(RI);
                Discount dsc=new Discount(RestpageController.dval);
                dsc.Discounts();
                System.out.println(DishesController.resval);
                String selectSql = "SELECT Price FROM " + RI + " LIMIT "+DishesController.resval+",1 ";
                Statement stmt = conn.createStatement();
                re = stmt.executeQuery(selectSql);
                int tmp=0;
                while(re.next())
                {
                    tmp=re.getInt(1);
                }
                
                System.out.println(tmp);
                ArrayList<Integer> ls=new ArrayList<Integer>(10);
                //re.next();
                ls.add(tmp);
                float fp=(ls.get(0)-(ls.get(0) * (dsc.FPD / 100)) );
                float sw=(ls.get(0)-(ls.get(0) * (dsc.SD / 100)) );
                float ues=(ls.get(0)-(ls.get(0) * (dsc.UED / 100)));
                float zm=(ls.get(0)-(ls.get(0) * (dsc.ZD / 100)) ) ;
                stmt.close();
                conn.close();
                String z=String.valueOf(fp);
                String ue=String.valueOf(sw);
                String s=String.valueOf(ues);
                String fpp=String.valueOf(zm);
                 res1.setText(fpp);
                res2.setText(z);
                res3.setText(ue);
                res4.setText(s);       
                
            }
            catch (Exception e) {
                e.printStackTrace();
            }
      
       
       
      
    }
    
            
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       try {
           setvalus();
           // TODO
       } catch (Exception ex) {
          System.out.println(ex);
       }
    }    
}