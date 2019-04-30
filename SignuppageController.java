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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * 
 * FXML Controller class
 *
 * @author Yash Dave
 */
public class SignuppageController implements Initializable {
private Button but;
private ImageView img;
private Label l1;
private Label l2;
private Label l3;
private Label l4;
public TextField t1;
public TextField t2;
public PasswordField p1;
public PasswordField p2;
private Label h1;
private Label h2;
public String name;
public String ps;
public String em;
public Button close;
  
    
    public void Clickclose( ActionEvent e)
   {
       Stage stage= (Stage) close.getScene().getWindow();
        stage.close();
       
   }

public void Submit() throws IOException
    {
        this.name=t1.getText();
        this.em=t2.getText();
        if(this.checkpass()==1)
        {
            this.ps=p2.getText();
        }
        else
        {
            //add alert dialog
            Parent newroot5 = (Parent) FXMLLoader.load(this.getClass().getResource("Popup.fxml"));
            Scene sc= new Scene(newroot5);
            Stage window = new Stage();
             //window = (Stage)((Node)event.getSource()).getScene().getWindow();
            window.setScene(sc);
            window.initStyle(StageStyle.UNDECORATED);
            window.initModality(Modality.APPLICATION_MODAL);
            window.showAndWait();
            System.out.println("Password mismatch");
        }
    }
public int checkpass()
{
    if(p1.getText().equals(p2.getText()))
    {
        return 1;
    }
    else
        return 0;
}
public void ClickButton(ActionEvent event) throws IOException, Exception
    {
        System.out.println("You clicked signon!");
        //label.setText("Hello World!");
        Useracc x = new Useracc();
        Submit();
        System.out.println(" nm:"+ this.name);
        System.out.println(p1.getText());
        x.signup(this.name, this.ps, this.em);
        System.out.println(this.getClass().getResource("firstpage.fxml"));
        Parent newroot3= FXMLLoader.load(this.getClass().getResource("firstpage.fxml"));
        
        Scene newscene3= new Scene(newroot3);
        Stage newwindow3 =(Stage)((Node)event.getSource()).getScene().getWindow();
        newwindow3.setScene(newscene3);
        newwindow3.show();
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
