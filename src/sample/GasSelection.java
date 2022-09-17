package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.swing.*;
import java.io.IOException;
import java.text.DecimalFormat;

public class GasSelection {


    @FXML
    private Button payment;
    @FXML
    private TextField prepayAmount;

    @FXML
    private TextField estGallons;

    boolean eightSeven=false;
    boolean eightNine=false;
    boolean nineThree=false;
    float total;

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public void submit(ActionEvent event){
        total= Float.parseFloat(prepayAmount.getText());
        if(eightSeven==true){
            total=total/3.09f;
        }else if(eightNine==true){
            total=total/3.64f;
        }else{
            total=total/4.19f;

        }
       String ans=String.valueOf(total);

        estGallons.setText(ans);
    }

    @FXML
    private void handlePayButton(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/sample/payment.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage(StageStyle.DECORATED);
        primaryStage.setScene(scene);
        ((Stage) payment.getScene().getWindow()).close();
        primaryStage.show();
    }

    public void eightySevenSelected(){
         eightSeven=false;
         eightNine=false;
         nineThree=false;
        eightSeven=true;
    }
    private void eightyNineSelected(){
        eightSeven=false;
        eightNine=false;
        nineThree=false;
        eightNine=true;
    }
    private void ninetyThreeSelected(){

        eightSeven=false;
        eightNine=false;
        nineThree=false;
        nineThree=true;
    }
}
