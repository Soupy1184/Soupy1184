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
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author chris
 */
public class GuestProfileController implements Initializable {

    @FXML
    private Button backBtn;
    @FXML
    private Label confirmationNumber;
    @FXML
    private Label guestName;
    @FXML
    private Label dateOfArrival;
    @FXML
    private Label numberOfNights;
    @FXML
    private Label roomRate;
    @FXML
    private Label methodOfPayment;
    @FXML
    private Label reservationStatus;
    @FXML
    private Button checkInBtn;
    @FXML
    private Button accountBtn;
    @FXML
    private Button changeRoomBtn;
    @FXML
    private Label streetAddress;
    @FXML
    private Label city;
    @FXML
    private Label provinceState;
    @FXML
    private Label country;
    @FXML
    private Label postalZipCode;
    @FXML
    private Label phoneNumber;
    @FXML
    private Button editDetailsBtn;
    @FXML
    private Label roomNumber;
    @FXML
    private Label roomType;
    @FXML
    private Label roomStatus;
    @FXML
    private Button checkOutBtn;

    Room room100 = new Room("100", "VR", "Waterfront");
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        confirmationNumber.setText("8375");
        guestName.setText("Sidney Crosby");
        dateOfArrival.setText("8/7/2020");
        numberOfNights.setText("3");
        roomRate.setText("187.00");
        methodOfPayment.setText("VS 8787");
        reservationStatus.setText("Not Arrived");
        streetAddress.setText("87 Crosby Lane");
        city.setText("Pittsburgh");
        provinceState.setText("PA");
        country.setText("USA");
        postalZipCode.setText("878787");
        phoneNumber.setText("878-787-8787");
        roomNumber.setText("878");
        roomType.setText("Waterfront");
        roomStatus.setText("VR");
        
    }    

    @FXML
    private void onClickCloseWindow(ActionEvent event) {
        try { 
            FXMLLoader fxmlLoader = new FXMLLoader(); 
            fxmlLoader.setLocation(getClass().getResource("registrationMenu.fxml")); 
            /* * if "fx:controller" is not set in fxml * fxmlLoader.setController(NewWindowController); */ 
            Scene scene = new Scene(fxmlLoader.load(), 600, 400); 
            Stage stage = (Stage) backBtn.getScene().getWindow();
            stage.setTitle("Registration Menu"); 
            stage.setScene(scene); 
            stage.show(); 
        } 
        catch (IOException e) { 
            Logger logger = Logger.getLogger(getClass().getName()); 
            logger.log(Level.SEVERE, "Failed to create new Window.", e); 
        }
    }

    @FXML
    private void onClickCheckIn(ActionEvent event) {
        var roomCheck = roomStatus.getText();
        var resCheck = reservationStatus.getText();
        if (resCheck.equals("Not Arrived") || resCheck.equals("Checked Out")){
            if (!roomCheck.equals("VR")){
                try { 
                    FXMLLoader fxmlLoader = new FXMLLoader(); 
                    fxmlLoader.setLocation(getClass().getResource("changeRoom.fxml")); 
                    /* * if "fx:controller" is not set in fxml * fxmlLoader.setController(NewWindowController); */ 
                    Scene scene = new Scene(fxmlLoader.load(), 600, 400); 
                    Stage stage = (Stage) checkInBtn.getScene().getWindow();
                    stage.setTitle("Room Change"); 
                    stage.setScene(scene); 
                    stage.show(); 
                } 
                catch (IOException e) { 
                    Logger logger = Logger.getLogger(getClass().getName()); 
                    logger.log(Level.SEVERE, "Failed to create new Window.", e); 
                }
            }
            else{
                roomStatus.setText("OR");
                reservationStatus.setText("In House");
            }
        }
    }

    @FXML
    private void onClickOpenAccount(ActionEvent event) {
        try { 
            FXMLLoader fxmlLoader = new FXMLLoader(); 
            fxmlLoader.setLocation(getClass().getResource("account.fxml")); 
            /* * if "fx:controller" is not set in fxml * fxmlLoader.setController(NewWindowController); */ 
            Scene scene = new Scene(fxmlLoader.load(), 600, 400); 
            Stage stage = (Stage) accountBtn.getScene().getWindow();
            stage.setTitle("Guest Account"); 
            stage.setScene(scene); 
            stage.show(); 
        } 
        catch (IOException e) { 
            Logger logger = Logger.getLogger(getClass().getName()); 
            logger.log(Level.SEVERE, "Failed to create new Window.", e); 
        }   
    }

    @FXML
    private void onClickChangeRoom(ActionEvent event) {
        try { 
            FXMLLoader fxmlLoader = new FXMLLoader(); 
            fxmlLoader.setLocation(getClass().getResource("changeRoom.fxml")); 
            /* * if "fx:controller" is not set in fxml * fxmlLoader.setController(NewWindowController); */ 
            Scene scene = new Scene(fxmlLoader.load(), 600, 400); 
            Stage stage = (Stage) changeRoomBtn.getScene().getWindow();
            stage.setTitle("Room Change"); 
            stage.setScene(scene); 
            stage.show(); 
        } 
        catch (IOException e) { 
            Logger logger = Logger.getLogger(getClass().getName()); 
            logger.log(Level.SEVERE, "Failed to create new Window.", e); 
        } 
    }

    @FXML
    private void onClickOpenEditDetails(ActionEvent event) {
        try { 
            FXMLLoader fxmlLoader = new FXMLLoader(); 
            fxmlLoader.setLocation(getClass().getResource("editDetails.fxml")); 
            /* * if "fx:controller" is not set in fxml * fxmlLoader.setController(NewWindowController); */ 
            Scene scene = new Scene(fxmlLoader.load(), 600, 400); 
            Stage stage = (Stage) editDetailsBtn.getScene().getWindow();
            stage.setTitle("Edit Guest Profile"); 
            stage.setScene(scene); 
            stage.show(); 
        } 
        catch (IOException e) { 
            Logger logger = Logger.getLogger(getClass().getName()); 
            logger.log(Level.SEVERE, "Failed to create new Window.", e); 
        }
    }

    @FXML
    private void onClickCheckOut(ActionEvent event) {
        var roomCheck = roomStatus.getText();
        if (roomCheck.equals("OR") || roomCheck.equals("OD")){
            roomStatus.setText("VD");
            reservationStatus.setText("Checked Out");
        }
    }
    
}
