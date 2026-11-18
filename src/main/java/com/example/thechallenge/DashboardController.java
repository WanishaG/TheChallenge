package com.example.thechallenge;

import javafx.fxml.FXML;

public class DashboardController {

    @FXML
    private NavbarController navbarController;

    @FXML
    public void initialize() {
        navbarController.setActivePage("verbruik");
    }
}
