/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelprogram;

import java.io.IOException;
import static java.lang.Integer.parseInt;
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
public class RegistrationMenuController implements Initializable {

    @FXML
    private Button guestNameSearchBtn;
    @FXML
    private Button roomAvailBtn;
    @FXML
    private Button confirmationSearchBtn;
    @FXML
    private Button roomStatusBtn;
    @FXML
    private Button inventoryBtn;
    @FXML
    private TextField confirmationNumInput;
    @FXML
    private Button backBtn;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onClickGuestNameSearch(ActionEvent event) {
        try { 
            FXMLLoader fxmlLoader = new FXMLLoader(); 
            fxmlLoader.setLocation(getClass().getResource("guestNameSearch.fxml")); 
            /* * if "fx:controller" is not set in fxml * fxmlLoader.setController(NewWindowController); */ 
            Scene scene = new Scene(fxmlLoader.load(), 600, 400); 
            Stage stage = (Stage) guestNameSearchBtn.getScene().getWindow();
            stage.setTitle("Guest Name Search"); 
            stage.setScene(scene); 
            stage.show(); 
        } 
        catch (IOException e) { 
            Logger logger = Logger.getLogger(getClass().getName()); 
            logger.log(Level.SEVERE, "Failed to create new Window.", e); 
        }
    }

    @FXML
    private void onClickRoomAvailability(ActionEvent event) {
        try { 
            FXMLLoader fxmlLoader = new FXMLLoader(); 
            fxmlLoader.setLocation(getClass().getResource("roomAvailability.fxml")); 
            /* * if "fx:controller" is not set in fxml * fxmlLoader.setController(NewWindowController); */ 
            Scene scene = new Scene(fxmlLoader.load(), 600, 400); 
            Stage stage = (Stage) roomAvailBtn.getScene().getWindow();
            stage.setTitle("Room Availability"); 
            stage.setScene(scene); 
            stage.show(); 
        } 
        catch (IOException e) { 
            Logger logger = Logger.getLogger(getClass().getName()); 
            logger.log(Level.SEVERE, "Failed to create new Window.", e); 
        }        
    }

    @FXML
    private void onClickConfirmationNumSearch(ActionEvent event) {
        var confIn = parseInt(confirmationNumInput.getText(), 10);
        
        if (confIn == 8375){ //search for confirmation number
            try { 
                FXMLLoader fxmlLoader = new FXMLLoader(); 
                fxmlLoader.setLocation(getClass().getResource("guestProfile.fxml")); 
                /* * if "fx:controller" is not set in fxml * fxmlLoader.setController(NewWindowController); */ 
                Scene scene = new Scene(fxmlLoader.load(), 600, 400); 
                Stage stage = (Stage) confirmationSearchBtn.getScene().getWindow(); 
                stage.setTitle("Guest Profile"); 
                stage.setScene(scene); 
                stage.show(); 
            } 
            catch (IOException e) { 
                Logger logger = Logger.getLogger(getClass().getName()); 
                logger.log(Level.SEVERE, "Failed to create new Window.", e); 
            }
        }
    }

    @FXML
    private void onClickRoomStatus(ActionEvent event) {
        try { 
            FXMLLoader fxmlLoader = new FXMLLoader(); 
            fxmlLoader.setLocation(getClass().getResource("roomStatus.fxml")); 
            /* * if "fx:controller" is not set in fxml * fxmlLoader.setController(NewWindowController); */ 
            Scene scene = new Scene(fxmlLoader.load(), 600, 400); 
            Stage stage = (Stage) roomStatusBtn.getScene().getWindow();
            stage.setTitle("Update Room Status"); 
            stage.setScene(scene); 
            stage.show(); 
        } 
        catch (IOException e) { 
            Logger logger = Logger.getLogger(getClass().getName()); 
            logger.log(Level.SEVERE, "Failed to create new Window.", e); 
        }
    }

    @FXML
    private void onClickInvetory(ActionEvent event) {
        try { 
            FXMLLoader fxmlLoader = new FXMLLoader(); 
            fxmlLoader.setLocation(getClass().getResource("inventory.fxml")); 
            //* * if "fx:controller" is not set in fxml * fxmlLoader.setController(NewWindowController); */ 
            Scene scene = new Scene(fxmlLoader.load(), 600, 400); 
            Stage stage = (Stage) inventoryBtn.getScene().getWindow(); 
            stage.setTitle("Inventory Available"); 
            stage.setScene(scene); 
            stage.show(); 
        } 
        catch (IOException e) { 
            Logger logger = Logger.getLogger(getClass().getName()); 
            logger.log(Level.SEVERE, "Failed to create new Window.", e); 
        }  
    }

    @FXML
    private void onClickCloseWindow(ActionEvent event) {
        try { 
            FXMLLoader fxmlLoader = new FXMLLoader(); 
            fxmlLoader.setLocation(getClass().getResource("frontOfficeMenu.fxml")); 
            //* * if "fx:controller" is not set in fxml * fxmlLoader.setController(NewWindowController); */ 
            Scene scene = new Scene(fxmlLoader.load(), 600, 400); 
            Stage stage = (Stage) backBtn.getScene().getWindow(); 
            stage.setTitle("Front Office Menu"); 
            stage.setScene(scene); 
            stage.show(); 
        } 
        catch (IOException e) { 
            Logger logger = Logger.getLogger(getClass().getName()); 
            logger.log(Level.SEVERE, "Failed to create new Window.", e); 
        }   
    }    
}
