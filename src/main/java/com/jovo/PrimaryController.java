package com.jovo;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField inputBox;
    @FXML
    private ListView<String> listeView;


    ObservableList<String> observableList = FXCollections.observableArrayList();

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void test (){
        String inputListe = inputBox.getText();
        char[] listeArray = inputListe.toCharArray();
        System.out.println(inputListe.toCharArray());
        observableList.add(Arrays.toString(listeArray));
        listeView.setItems(observableList);
    }


}
