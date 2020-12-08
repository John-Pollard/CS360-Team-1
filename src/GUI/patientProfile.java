package GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Menu;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class patientProfile implements Initializable {

    @FXML
    private Pane pane;

    @FXML
    private TextField lastnamefield;

    @FXML
    private TextField middleField;

    @FXML
    private TextField firstnameField;

    @FXML
    private TextField ssnField;

    @FXML
    private TextField dateOfBirthField;

    @FXML
    private TextField address1Field;

    @FXML
    private TextField address2Field;

    @FXML
    private TextField cszField;

    @FXML
    private TextField doctorField;

    @FXML
    private TextField cellField;

    @FXML
    private TextArea notesFIeld;

    @FXML
    private ChoiceBox<String> sexBox;

    @FXML
    private TextField workField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField emnameField;

    @FXML
    private TextArea allergiesField;

    @FXML
    private TextField emrelationField;

    @FXML
    private TextField emcellField;

    @FXML
    private TextField emworkField;


    @FXML
    private DatePicker firstvisitDate;

    @FXML
    private DatePicker lastvisitDate;

    @FXML
    private TextField roomField;

    @FXML
    private Button deleteButton;

    @FXML
    private Button saveButton;

    @FXML
    private Button prescriptionButton;

    @FXML
    void handledeleteEvent(ActionEvent event) throws IOException {


        //After deleting the patient it goes back to the homepage
            Pane homepage =  FXMLLoader.load(getClass().getResource("homepage.fxml"));
        pane.getChildren().setAll(homepage);
    }

    @FXML
    void handlesaveEvent(ActionEvent event) {

    }

    @FXML
    void handlewriteEvent(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {




    }


}
