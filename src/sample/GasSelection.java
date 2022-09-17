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
    private ToggleButton eightySeven;

    @FXML
    private ToggleButton eightyNine;

    @FXML
    private ToggleButton ninetyThree;

    @FXML
    private void handleEightySevenButton(ActionEvent event) throws IOException {

        eightySeven.setStyle("-fx-border-color: #ff0000; -fx-border-width: 5px;");

    }
}
