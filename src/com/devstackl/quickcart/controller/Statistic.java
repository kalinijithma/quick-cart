package com.devstackl.quickcart.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class Statistic {
    public AnchorPane container;

    private void setUi(String location){
        URL resource =
                getClass().getResource("../view/"+location+".fxml");
        Parent parent = null;
        try {
            parent = FXMLLoader.load(resource);
            Scene scene = new Scene(parent);
            Stage stage = (Stage) container.getScene().getWindow();
            stage.setScene(scene);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void back(MouseEvent mouseEvent) {
        setUi("Dashboard");

    }

    public void PrintData(MouseEvent mouseEvent) {
        setUi("Orders");
    }
}
