package GUI;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class patientList implements Initializable {

    @FXML
    private TextField filterField;
    @FXML
    private AnchorPane anchorPane;

    @FXML
    private TableView<patient> tableview;

    @FXML
    private TableColumn<patient, String> col_last;

    @FXML
    private TableColumn<Person,String> col_first;

    @FXML
    private TableColumn<patient,String> col_room;

    @FXML
    private TableColumn<patient,String> col_doc;
    @FXML
    private Button backButton;


    ObservableList<patient> dataList = FXCollections.observableArrayList();


    @FXML
    void handleReturnEvent(ActionEvent event) throws IOException {
        Pane returnPane = FXMLLoader.load(getClass().getResource("homepage.fxml"));
        anchorPane.getChildren().setAll(returnPane);

    }




    @FXML
    void search_user(){
        col_last.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        col_first.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        col_doc.setCellValueFactory(new PropertyValueFactory<>("primaryDoc"));
        col_room.setCellValueFactory(new PropertyValueFactory<>("roomNumber"));




        patient p1 = new patient();
        p1.setFirstName("John");
        p1.setLastName("Danger");
        p1.setPrimaryDoc("Dr.Dr");
        p1.setRoomNumber(104);

        patient p2 = new patient();
        p2.setFirstName("Liam");
        p2.setLastName("Fork");
        p2.setPrimaryDoc("Dr.Keener");
        p2.setRoomNumber(10);

        patient p3 = new patient();
        p3.setFirstName("Liam");
        p3.setLastName("Fork");
        p3.setPrimaryDoc("Dr.Keener");
        p3.setRoomNumber(120);

         dataList.addAll(p1,p2,p3);
       tableview.setItems(dataList);



        FilteredList<patient> filteredData = new FilteredList<>(dataList, b -> true);
        filterField.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredData.setPredicate(patient -> {
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }
                String lowerCaseFilter = newValue.toLowerCase();

                if (patient.getLastName().toLowerCase().indexOf(lowerCaseFilter) != -1 ) {
                    return true; // Filter matches username
                } else if (patient.getFirstName().toLowerCase().indexOf(lowerCaseFilter) != -1) {
                    return true; // Filter matches password
                }else if (String.valueOf(patient.getRoomNumber()).toLowerCase().indexOf(lowerCaseFilter) != -1) {
                    return true; // Filter matches password
                }
                else if (patient.getPrimaryDoc().indexOf(lowerCaseFilter)!=-1)
                    return true;// Filter matches email

                else
                    return false; // Does not match.
            });
        });
        SortedList<patient> sortedData = new SortedList<>(filteredData);
        sortedData.comparatorProperty().bind(tableview.comparatorProperty());
        tableview.setItems(sortedData);


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        search_user();
    }
}
