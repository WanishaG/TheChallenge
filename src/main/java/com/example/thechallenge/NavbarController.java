package com.example.thechallenge;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class NavbarController {

    @FXML
    private Button usageButton;

    @FXML
    private Button neighborhoodButton;

    @FXML
    private Button notificationsButton;

    @FXML
    private Button settingsButton;

    public void setActivePage(String page) {

        usageButton.getStyleClass().setAll("nav-button");
        neighborhoodButton.getStyleClass().setAll("nav-button");
        notificationsButton.getStyleClass().setAll("nav-button");
        settingsButton.getStyleClass().setAll("nav-button");

        switch (page) {
            case "verbruik" ->
                    usageButton.getStyleClass().setAll("nav-button-active");

            case "buurt" ->
                    neighborhoodButton.getStyleClass().setAll("nav-button-active");

            case "meldingen" ->
                    notificationsButton.getStyleClass().setAll("nav-button-active");

            case "instellingen" ->
                    settingsButton.getStyleClass().setAll("nav-button-active");
        }
    }
}
