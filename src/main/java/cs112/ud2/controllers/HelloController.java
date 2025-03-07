package cs112.ud2.controllers;

import cs112.ud2.InintialView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Button addEventButton;
    @FXML
    private Button viewDataButton;

    @FXML
    protected void onAddEventButtonClick() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(InintialView.class.getResource("opponent-input.fxml"));
        Parent opponentInputParent = loader.load();

        OpponentInput opponentInput = loader.getController();
        opponentInput.initializeData();

        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(new Scene(opponentInputParent));
        stage.setResizable(false);
        stage.show();
    }

    public void onViewDataClick(ActionEvent actionEvent) throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(InintialView.class.getResource("view-events.fxml"));
        Parent viewEventsParent = loader.load();

        ViewEvents viewEvents = loader.getController();
        viewEvents.initializeData();

        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(new Scene(viewEventsParent));
        stage.setResizable(false);
        stage.show();
    }


}