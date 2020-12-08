package GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

import java.net.URL;
import java.util.ResourceBundle;

public class PrescriptionInfo implements Initializable {

    @FXML
    private Button prescpriptionButton;

    @FXML
    private CheckBox emailcheckBox;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



    }


    @FXML
    void handlePrescriptionEvent(ActionEvent event) {
        System.out.println("pog");
    }

}
