package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Payment {

    @FXML
    private Button back;

    @FXML
    private Button payNow;

    @FXML
    private void handlePayNowButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/sample/timeSelection.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage(StageStyle.DECORATED);
        primaryStage.setScene(scene);
        //((Stage) back.getScene().getWindow()).close();
        //primaryStage.show();
        paymentSuccessful();
    }

    @FXML
    private void handleBackButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/sample/timeSelection.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage(StageStyle.DECORATED);
        primaryStage.setScene(scene);
        ((Stage) back.getScene().getWindow()).close();
        primaryStage.show();
    }

    private void paymentSuccessful(){
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setHeaderText("Success");
        a.setContentText("PrePayment has been made successfully");
        a.showAndWait();
    }
}
