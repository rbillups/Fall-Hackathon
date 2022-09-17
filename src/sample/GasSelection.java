package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.io.IOException;
import java.text.DecimalFormat;

public class GasSelection {

    @FXML
    private Button back;

    @FXML
    private Button payment;

    @FXML
    private ToggleButton ten;

    @FXML
    private ToggleButton twenty;

    @FXML
    private ToggleButton thirty;

    @FXML
    private ToggleButton forty;

    @FXML
    private ToggleButton fifty;

    @FXML
    private ToggleButton sixty;

    @FXML
    private TextField prepayAmount;

    @FXML
    private TextField estGallons;

    boolean eightSeven=false;
    boolean eightNine=false;
    boolean nineThree=false;
    float total;

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

    @FXML
    private void handleBackButton(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/sample/timeSelection.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage(StageStyle.DECORATED);
        primaryStage.setScene(scene);
        ((Stage) back.getScene().getWindow()).close();
        primaryStage.show();
    }



    public void eightySevenSelected(){
        eightNine=false;
        nineThree=false;
        eightSeven=true;
    }
    public void eightyNineSelected(){
        eightSeven=false;
        nineThree=false;
        eightNine=true;
    }
    public void ninetyThreeSelected(){
        eightSeven=false;
        eightNine=false;
        nineThree=true;
    }

    public void tenPressed(){
        if(eightSeven==true){
            total=10/3.09f;
        }else if(eightNine==true){
            total=10/3.64f;
        }else if(nineThree==true){
            total=10/4.19f;
        }
        prepayAmount.setText("10");
        String ans=String.valueOf(total);
        estGallons.setText(ans);
    }
    public void twentyPressed(){
        if(eightSeven==true){
            total=20/3.09f;
        }else if(eightNine==true){
            total=20/3.64f;
        }else if(nineThree==true){
            total=20/4.19f;
        }
        prepayAmount.setText("20");
        String ans=String.valueOf(total);
        estGallons.setText(ans);
    }
    public void thirtyPressed(){
        if(eightSeven==true){
            total=30/3.09f;
        }else if(eightNine==true){
            total=30/3.64f;
        }else if(nineThree==true){
            total=30/4.19f;
        }
        prepayAmount.setText("30");
        String ans=String.valueOf(total);
        estGallons.setText(ans);
    }
    public void fortyPressed(){
        if(eightSeven==true){
            total=40/3.09f;
        }else if(eightNine==true){
            total=40/3.64f;
        }else if(nineThree==true){
            total=40/4.19f;
        }
        prepayAmount.setText("40");
        String ans=String.valueOf(total);
        estGallons.setText(ans);
    }
    public void fiftyPressed(){
        if(eightSeven==true){
            total=50/3.09f;
        }else if(eightNine==true){
            total=50/3.64f;
        }else if(nineThree==true){
            total=50/4.19f;
        }
        prepayAmount.setText("50");
        String ans=String.valueOf(total);
        estGallons.setText(ans);
    }
    public void sixtyPressed(){
        if(eightSeven==true){
            total=60/3.09f;
        }else if(eightNine==true){
            total=60/3.64f;
        }else if(nineThree==true){
            total=60/4.19f;
        }
        prepayAmount.setText("60");
        String ans=String.valueOf(total);
        estGallons.setText(ans);
    }
}
