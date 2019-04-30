/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Yash Dave
 */
public class SecondpageController implements Initializable {

    /**
     * Initializes the controller class.
     */
    private Button banerbutton;
    public static int banervalue=0;
    public int aundhvalue=10;
    public int hinjewadivalue=20;
    public int hadapsarvalue=30;
    public int deccanvalue=40;
   
    //public static RestpageController rpc;
    
    private Button aundhbutton;
    private Button vimannagarbutton;
    private Button hadapsarbutton;
    private Button hinjewadibutton;
    private ImageView img;
    public static int val;
    
     public Button close;
    public static int lol;
   
    //private ScrollPane scroll; //this must match the fx:id of the ScrollPane element
    //scroll.setVvalue(1.0); 
    
   public void Clickclose( ActionEvent e)
   {
       Stage stage= (Stage) close.getScene().getWindow();
        stage.close();
       
   }
   
   
    
    public void BanerClick(ActionEvent event) throws IOException, Exception
    {
        System.out.println("You clicked baner!");
        SecondpageController.lol=1;
        //int temp=getval(banervalue);
        //label.setText("Hello World!");
        SecondpageController.val=SecondpageController.banervalue;
        System.out.println(this.getClass().getResource("Rest.fxml"));
        Parent newroot4= FXMLLoader.load(this.getClass().getResource("Rest.fxml"));
        Scene newscene4;
        newscene4 = new Scene(newroot4);
        Stage newwindow4 =(Stage)((Node)event.getSource()).getScene().getWindow();
        newwindow4.setScene(newscene4);
        newwindow4.show();
    }
    /**
     *
     * @param hadapsarevent
     * @throws IOException
     */
    public void HadapsarClick(ActionEvent hadapsarevent) throws IOException
    {
        System.out.println("You clicked hadapsar!");
         SecondpageController.lol=4;
        //label.setText("Hello World!");
        SecondpageController.val=this.hadapsarvalue;
        System.out.println(this.getClass().getResource("Rest.fxml"));
        Parent newroot4= FXMLLoader.load(this.getClass().getResource("Rest.fxml"));
        
        Scene newscene4;
        newscene4 = new Scene(newroot4);
        Stage newwindow4 =(Stage)((Node)hadapsarevent.getSource()).getScene().getWindow();
        newwindow4.setScene(newscene4);
        newwindow4.show();
    }
    
    public void VimanagarClick(ActionEvent ve) throws IOException
    {
        //System.out.println("You clicked hadapsar!");
        //label.setText("Hello World!");
        SecondpageController.val=this.deccanvalue;
        System.out.println(this.getClass().getResource("Rest.fxml"));
        Parent newroot4= FXMLLoader.load(this.getClass().getResource("Rest.fxml"));
         SecondpageController.lol=5;
        Scene newscene4;
        newscene4 = new Scene(newroot4);
        Stage newwindow4 =(Stage)((Node)ve.getSource()).getScene().getWindow();
        newwindow4.setScene(newscene4);
        newwindow4.show();
    }
    
    public void HinjewadiClick(ActionEvent he) throws IOException
    {
        //System.out.println("You clicked hadapsar!");
        //label.setText("Hello World!");
        SecondpageController.val=this.hinjewadivalue;
         SecondpageController.lol=3;
        System.out.println(this.getClass().getResource("Rest.fxml"));
        Parent newroot4= FXMLLoader.load(this.getClass().getResource("Rest.fxml"));
        
        Scene newscene4;
        newscene4 = new Scene(newroot4);
        Stage newwindow4 =(Stage)((Node)he.getSource()).getScene().getWindow();
        newwindow4.setScene(newscene4);
        newwindow4.show();
    }
    
    public void AundhClick(ActionEvent ae) throws IOException
    {
        System.out.println("You clicked aundh!");
         SecondpageController.lol=2;
        //label.setText("Hello World!");
        SecondpageController.val=this.aundhvalue;
        
        System.out.println(this.getClass().getResource("Rest.fxml"));
        Parent newroot4= FXMLLoader.load(this.getClass().getResource("Rest.fxml"));
        
        Scene newscene4;
        newscene4 = new Scene(newroot4);
        Stage newwindow4 =(Stage)((Node)ae.getSource()).getScene().getWindow();
        newwindow4.setScene(newscene4);
        newwindow4.show();
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
