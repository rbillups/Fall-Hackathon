package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class SelectLocation {

    @FXML
    private Button select1;

    @FXML
    private Button back;

    @FXML
    private void handleSelectButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/sample/timeSelection.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage(StageStyle.DECORATED);
        primaryStage.setScene(scene);
        ((Stage) select1.getScene().getWindow()).close();
        primaryStage.show();
    }

    @FXML
    private void handleBackButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/sample/Home.fxml"));
        Scene scene = new Scene(root);
        Stage primaryStage = new Stage(StageStyle.DECORATED);
        primaryStage.setScene(scene);
        ((Stage) back.getScene().getWindow()).close();
        primaryStage.show();
    }
}
