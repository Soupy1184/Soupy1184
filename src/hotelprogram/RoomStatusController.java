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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author chris
 */
public class RoomStatusController implements Initializable {

    @FXML
    private TextField roomNumber;
    @FXML
    private TextField roomStatus;
    @FXML
    private Button roomStatusChangeBtn;
    
    Room room100 = new Room("100", "VD", "Waterfront");
    @FXML
    private Label test;
    @FXML
    private Button backBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        test.setText(room100.getRoomNumber() + " " + room100.getRoomStatus() + " " + room100.getRoomType());
    }    

    @FXML
    private void onClickUpdateRoomStatus(ActionEvent event) {
        String getRoom = roomNumber.getText();
        String getStatus = roomStatus.getText();
        room100.setRoomStatus(getStatus);
        test.setText(room100.getRoomNumber() + " " + room100.getRoomStatus() + " " + room100.getRoomType());
    }

    @FXML
    private void onClickCloseWindow(ActionEvent event) {
        try { 
            FXMLLoader fxmlLoader = new FXMLLoader(); 
            fxmlLoader.setLocation(getClass().getResource("registrationMenu.fxml")); 
            //* * if "fx:controller" is not set in fxml * fxmlLoader.setController(NewWindowController); */ 
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
    
}
