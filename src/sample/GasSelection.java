package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.swing.*;
import java.io.IOException;

public class GasSelection {


    @FXML
    private Button payment;

    @FXML
    private void handlePayButton(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/sample/payment.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage(StageStyle.DECORATED);
        primaryStage.setScene(scene);
        ((Stage) payment.getScene().getWindow()).close();
        primaryStage.show();
    }
}
