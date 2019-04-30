/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import static java.awt.SystemColor.window;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 *
 * @author Yash Dave
 */
public class FirstpageController implements Initializable {
    
    @FXML
    private Label label1;
    private Label label2;
    private Button startbutton;
    private Button signbutton;
    private ImageView img;
    
    public Button close;
  
    
    public void Clickclose( ActionEvent e)
   {
       Stage stage= (Stage) close.getScene().getWindow();
        stage.close();
       
   }
    @FXML
    public void handleButtonAction(ActionEvent event) throws IOException {
        //System.out.println("You clicked me!");
        //label.setText("Hello World!");
        System.out.println(this.getClass().getResource("Signup.fxml"));
        Parent newroot2= FXMLLoader.load(this.getClass().getResource("LoginPage.fxml"));
        
        Scene newscene2= new Scene(newroot2);
        Stage newwindow2 =(Stage)((Node)event.getSource()).getScene().getWindow();
        newwindow2.setScene(newscene2);
        newwindow2.show();
    }
    
    public void handleSignButton(ActionEvent e )throws IOException
    {
        Parent newroot3= FXMLLoader.load(this.getClass().getResource("Signuppage.fxml"));
        
        Scene newscene3= new Scene(newroot3);
        Stage newwindow3 =(Stage)((Node)e.getSource()).getScene().getWindow();
        newwindow3.setScene(newscene3);
        newwindow3.show();
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // TODO
    }    
    
}
