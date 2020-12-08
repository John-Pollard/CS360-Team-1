package GUI;


import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class account implements Initializable {



    @FXML
    private TextField filterField;



    @FXML
    private ComboBox<String> filterComboBox;


    @FXML
    private TableView<Employee> tableview;

    @FXML
    private TableColumn<Employee,String> col_last;

    @FXML
    private TableColumn<Employee,String> col_first;

    @FXML
    private TableColumn<Employee,String> col_user;

    @FXML
    private TableColumn<Employee,String> col_acc;



    @FXML
    private Pane pane;

    @FXML
    private Button returnButton;

    ObservableList<Employee> dataList = FXCollections.observableArrayList();
    @FXML
    void handleReturnEvent(ActionEvent event) throws IOException {
        Pane returnPane = FXMLLoader.load(getClass().getResource("homepage.fxml"));
        pane.getChildren().setAll(returnPane);

    }




    @FXML
    void search_user(){
        col_last.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        col_first.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        col_user.setCellValueFactory(new PropertyValueFactory<>("userName"));
        col_acc.setCellValueFactory(new PropertyValueFactory<>("accType"));

        Employee emp1 = new Employee("dawson", "AMIT", "Doctor", "Finance");
        Employee emp2 = new Employee("Johnny", "Pete", "Nurse", "Defence System");
        Employee emp3 = new Employee( "Ariel", "SAM", "Admin", "Radar Anaysist");
        Employee emp4 = new Employee("Tyler", "Jhon", "Nurse", "Ground Staff");

        dataList.addAll(emp1,emp2, emp3, emp4);

        tableview.setItems(dataList);



        FilteredList<Employee> filteredData = new FilteredList<>(dataList, b -> true);
        filterField.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredData.setPredicate(employee -> {
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }
                String lowerCaseFilter = newValue.toLowerCase();

                if (employee.getLastName().toLowerCase().indexOf(lowerCaseFilter) != -1 ) {
                    return true; // Filter matches username
                } else if (employee.getFirstName().toLowerCase().indexOf(lowerCaseFilter) != -1) {
                    return true; // Filter matches password
                }else if (employee.getAccType().toLowerCase().indexOf(lowerCaseFilter) != -1) {
                    return true; // Filter matches password
                }
                else if (employee.getUserName().indexOf(lowerCaseFilter)!=-1)
                    return true;// Filter matches email

                else
                    return false; // Does not match.
            });
        });
        SortedList<Employee> sortedData = new SortedList<>(filteredData);
        sortedData.comparatorProperty().bind(tableview.comparatorProperty());
        tableview.setItems(sortedData);


        filterComboBox.setItems(FXCollections.observableArrayList("Doctor","Nurse"));
        FilteredList<Employee> filteredData2 = new FilteredList<>(dataList);
        filterComboBox.valueProperty().addListener(new ChangeListener<String>(){

            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue){
                filteredData2.setPredicate(newValue == null ? null : ( Employee e) -> newValue.equals(e.getAccType()));
            }

        });
        SortedList<Employee>  sortedData2 = new SortedList<>(filteredData2);
        tableview.setItems(sortedData2);



    }







    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        search_user();


    }
}
