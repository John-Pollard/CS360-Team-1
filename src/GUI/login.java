package GUI;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.sql.*;

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

                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/softwareEngineeringDatabase", "root", "Glory16!");

                    ResultSet rs = null;

                    String user = usernameField.getText();
                    String password = passwordField.getText();

                    if(user.equals("") || password.equals("")){
                        throw new Exception();
                    }else {

                        PreparedStatement stmt = conn.prepareStatement("select ID from loginTable where userName = ? and pass = ?");

                        stmt.setString(1, user);
                        stmt.setString(2, password);
                        rs = stmt.executeQuery();

                        while(rs.next()){
                            System.out.println(rs.getString("ID"));
                            JOptionPane.showMessageDialog(null, "Login Successful");
                            System.exit(0);
                            //reroute to other page
                        }

                        if(!rs.next()){
                            throw new Exception();
                        }
                    }

                }catch(Exception e2){
                    JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                    System.out.println("Invalid Username or Password");
                  //  e2.printStackTrace();
                }
            }
        });



    }
}
