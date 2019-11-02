package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class NewUserController {
    @FXML
    private Button Done;

    public void DonePressed(ActionEvent event)throws IOException {
        Parent CutSceneScreen = FXMLLoader.load(getClass().getResource("CutScene.fxml"));
        Scene CutScene = new Scene(CutSceneScreen);
        Stage newWindow = (Stage)((Node)event.getSource()).getScene().getWindow();
        newWindow.setScene(CutScene);
        newWindow.show();
    }
}
