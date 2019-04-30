/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.awt.Image;
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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Yash Dave
 */
public class LoginpageController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    public Button close;
  
   
    //private ScrollPane scroll; //this must match the fx:id of the ScrollPane element
    //scroll.setVvalue(1.0); 
    
   
    private Button signupbutton;
    private ImageView img;
    public TextField u1;
    public PasswordField p1;
    private String us;
    private String ps;
    public void Submit()
    {
        this.ps=p1.getText();
        this.us=u1.getText();
    }
    public void Clickclose( ActionEvent e)
   {
       Stage stage= (Stage) close.getScene().getWindow();
        stage.close();
       
   }
    public void ClickButton(ActionEvent event) throws IOException, Exception
    {
        System.out.println("You clicked signup!");
        Useracc U = new Useracc();
        Submit();
        int r=1;
        System.out.println(" UR:"+ this.us);
        System.out.println(p1.getText());
        r = U.login(this.us,this.ps);
        
        //label.setText("Hello World!");
        if(r==1)
        {
            
            System.out.println(this.getClass().getResource("page2.fxml"));
            Parent newroot3= FXMLLoader.load(this.getClass().getResource("page2.fxml"));
            Scene newscene3= new Scene(newroot3);
            Stage newwindow3 =(Stage)((Node)event.getSource()).getScene().getWindow();
            newwindow3.setScene(newscene3);
            newwindow3.show();
        }
        else
        {
            
            Parent newroot5 = (Parent) FXMLLoader.load(this.getClass().getResource("Popup.fxml"));
            Scene sc= new Scene(newroot5);
            Stage window = new Stage();
             //window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(sc);
            window.initStyle(StageStyle.UNDECORATED);
            window.initModality(Modality.APPLICATION_MODAL);
            window.showAndWait();
            
            
            /////////////add dialog box
        }
        System.out.println("End of login");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
