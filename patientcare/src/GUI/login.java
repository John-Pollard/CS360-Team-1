package GUI;

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
    }
}
