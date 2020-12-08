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


        AnchorPane pane=  FXMLLoader.load(getClass().getResource("patientProfile.fxml"));

        anchorPane.getChildren().setAll(pane);



    }

    @FXML
    void handleAccountEvent(ActionEvent event) throws IOException {
        AnchorPane pane=  FXMLLoader.load(getClass().getResource("AccountInfo.fxml"));

        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    void handleApptEvent(ActionEvent event) throws IOException {
        AnchorPane pane=  FXMLLoader.load(getClass().getResource("Appointment.fxml"));

        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    void handleNewPatientEvent(ActionEvent event) throws IOException {
        AnchorPane pane=  FXMLLoader.load(getClass().getResource("patientProfile.fxml"));

        anchorPane.getChildren().setAll(pane);
    }

    @FXML
    void handlePrescriptionsEvent(ActionEvent event) throws IOException {
        AnchorPane pane=  FXMLLoader.load(getClass().getResource("prescriptionInfo.fxml"));

        anchorPane.getChildren().setAll(pane);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }



}
