package GUI;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class login implements Initializable {


    @FXML
    public TextField usernameField= new TextField();
    public TextField passwordField = new TextField();
    public Button signButton = new Button();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



        usernameField.setPromptText("username");

        passwordField.setPromptText("password");


        signButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent a) {
                //authenticate the username and password

                try{
                    System.out.println("Login Button Clicked"); // clicking the button isn't working
                }catch(Exception e2){
                    System.out.println("Invalid username or password");
                }
            }
        });
        System.out.println("Check 1"); // passed the check so it fully loads the page
    }


}
