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
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author chris
 */
public class AccountController implements Initializable {
    
    
    @FXML
    private ListView<String> chargesList;
    @FXML
    private Button postChargeBtn;
    @FXML
    private TextField chargeAmount;
    @FXML
    private TextField chargeAccount;
    @FXML
    private Label balanceDisplay;
    @FXML
    private TextField debitAmount;
    @FXML
    private Button debitAccountBtn;
    
    
    
    int count = 1;
    double balance = 0; //get balance from database guest object
    @FXML
    private Button backBtn;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //var accountBalance = Double.toString(balance);
        balanceDisplay.setText(Double.toString(balance));
    }    

    @FXML
    private void onClickPostCharge(ActionEvent event) {
        double charge = Double.parseDouble(chargeAmount.getText());
        if ((chargeAccount.getText()).equals("11")){
            double tax;
            tax = charge * 0.13;
            tax = Math.round(tax * 100.0) / 100.0;
            chargesList.getItems().add(Integer.toString(count) + ". " + Double.toString(charge));
            count++;
            chargesList.getItems().add(Integer.toString(count) + ". " + Double.toString(tax));
            count++;
            balance = balance + charge + tax;
            balance = Math.round(balance * 100.0) / 100.0;
            balanceDisplay.setText(Double.toString(balance));
            chargeAmount.setText("");
            chargeAccount.setText("");
        }
        else{
            chargesList.getItems().add(Integer.toString(count) + ". " + Double.toString(charge));
            count++;
            balance = balance + charge;
            balance = Math.round(balance * 100.0) / 100.0;
            balanceDisplay.setText(Double.toString(balance));
            chargeAmount.setText("");
            chargeAccount.setText("");
        }
        
    }

    @FXML
    private void onClickDebitAccount(ActionEvent event) {
        double debit = Double.parseDouble(debitAmount.getText());
        chargesList.getItems().add(Integer.toString(count) + ". \t\t" + Double.toString(debit));
        count++;
        balance = balance - debit;
        balance = Math.round(balance * 100.0) / 100.0;
        balanceDisplay.setText(Double.toString(balance));
        debitAmount.setText("");
    }

    @FXML
    private void onClickCloseWindow(ActionEvent event) {
        try { 
            FXMLLoader fxmlLoader = new FXMLLoader(); 
            fxmlLoader.setLocation(getClass().getResource("guestProfile.fxml")); 
            /* * if "fx:controller" is not set in fxml * fxmlLoader.setController(NewWindowController); */ 
            Scene scene = new Scene(fxmlLoader.load(), 600, 400); 
            Stage stage = (Stage) backBtn.getScene().getWindow();
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
