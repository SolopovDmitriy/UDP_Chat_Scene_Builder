package com.company;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    @FXML
    private TextField serverAdr;
    @FXML
    private TextArea serverMsg;
    @FXML
    private TextArea clientMsg;

    @FXML
    public void sendHandler(){
        clientMsg.setText("Hello client!");
    }

    @FXML
    public void clearHandler(){
        clientMsg.clear();
        serverMsg.clear();
    }

}
