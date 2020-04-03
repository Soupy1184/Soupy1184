/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelprogram;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author chris
 */
public class CreateNewReservationController implements Initializable {

    @FXML
    private Button backBtn;
    @FXML
    private Button confirmReservation;
    @FXML
    private TextField guestName;
    @FXML
    private TextField dateOfArrival;
    @FXML
    private TextField numberOfNights;
    @FXML
    private TextField roomRate;
    @FXML
    private TextField methodOfPayment;
    @FXML
    private TextField streetAddress;
    @FXML
    private TextField city;
    @FXML
    private TextField provinceState;
    @FXML
    private TextField country;
    @FXML
    private TextField postalZipCode;
    @FXML
    private TextField phoneNumber;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // create new guest reservation object
    }    

    @FXML
    private void onClickCloseWindow(ActionEvent event) {
        try { 
            FXMLLoader fxmlLoader = new FXMLLoader(); 
            fxmlLoader.setLocation(getClass().getResource("reservationsMenu.fxml")); 
            /* * if "fx:controller" is not set in fxml * fxmlLoader.setController(NewWindowController); */ 
            Scene scene = new Scene(fxmlLoader.load(), 600, 400); 
            Stage stage = (Stage) backBtn.getScene().getWindow();
            stage.setTitle("Reservations Menu"); 
            stage.setScene(scene); 
            stage.show(); 
        } 
        catch (IOException e) { 
            Logger logger = Logger.getLogger(getClass().getName()); 
            logger.log(Level.SEVERE, "Failed to create new Window.", e); 
        }
    }

    @FXML
    private void onClickConfirmReservation(ActionEvent event) {
    }
    
}
