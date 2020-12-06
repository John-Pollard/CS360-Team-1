package GUI;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class AccountInfo implements Initializable {
    ObservableList<String> list= FXCollections.observableArrayList();

    @FXML
    private ListView<String> listView;


    @Override
    public void initialize(URL url, ResourceBundle rb){

        loadData();
    }

    private void loadData(){

        list.addAll("Debbie Butcher","Ariel Pink","Kevin Shields","Earl Stone","Rachel Goswell","Melinda Lawson","Alessandra Neville","Mohamed Rudd","Kara Atkins");

        listView.setItems(list);

    }

}
