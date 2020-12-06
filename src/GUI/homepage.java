package GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class homepage  implements Initializable {

        @FXML
        private AnchorPane anchorPane;

    @FXML
    void handlePatientListEvent(ActionEvent event) throws IOException {


                FXMLLoader loader = FXMLLoader.load(getClass().getResource("patientProfile.fxml"));

               anchorPane = loader.load();



    }

    @FXML
    void handleAccountEvent(ActionEvent event) {

    }

    @FXML
    void handleApptEvent(ActionEvent event) {

    }

    @FXML
    void handleNewPatientEvent(ActionEvent event) {

    }

    @FXML
    void handlePrescriptionsEvent(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }



}
