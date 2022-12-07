/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author LENOVO
 */
public class InscriptionController implements Initializable {


        @FXML
    private ComboBox combo_box_choix;


    @FXML
    void Select(ActionEvent event){
        String s = combo_box_choix.getSelectionModel().getSelectedItem().toString();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<String> list = FXCollections.observableArrayList("Etudiant","Enseignant","Administrateur");
        combo_box_choix.setItems(list);
    }    
    
}

    
    
    
    
    
 
