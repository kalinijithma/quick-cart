package com.devstackl.quickcart.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;

public class Dashboardcontroller {
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
    public void openCustomerAction(MouseEvent mouseEvent) {
        setUi("Customer_management");
    }

    public void onProductAction(MouseEvent mouseEvent) {
        setUi("Product_management");
    }

    public void UsermanagementController(MouseEvent mouseEvent) {
        setUi("User_Management");
    }

    public void activity_logAction(MouseEvent mouseEvent) {
        setUi("Activity_Log");
    }


    public void SettingsonAction(MouseEvent mouseEvent) {
        setUi("Settings");
    }

    public void OrderManagemetonAction(MouseEvent mouseEvent) {
        setUi("Orders");
    }
}
