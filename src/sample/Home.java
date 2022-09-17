package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Home {

    @FXML
    private Button prepay;

    @FXML
    private void handlePrePayButton(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/sample/selectLocation.fxml"));

        Scene scene = new Scene(root);

        Stage primaryStage = new Stage(StageStyle.DECORATED);
        primaryStage.setScene(scene);
        ((Stage) prepay.getScene().getWindow()).close();
        primaryStage.show();

    }


}
