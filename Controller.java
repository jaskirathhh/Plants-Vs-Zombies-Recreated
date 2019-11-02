package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Button NewGame;
    private Button LoadGame;
    private Button Exit;


    public void NewGamePressed(ActionEvent event)throws IOException {
        Parent NewuserScreen = FXMLLoader.load(getClass().getResource("NewUser.fxml"));
        Scene NewUserScene = new Scene(NewuserScreen);
        Stage newWindow = (Stage)((Node)event.getSource()).getScene().getWindow();
        newWindow.setScene(NewUserScene);
        newWindow.show();

    }
    public void LoadGamePressed(ActionEvent event){}
    public void ExitPressed(ActionEvent event){
        System.exit(1);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb){

    }



    }


