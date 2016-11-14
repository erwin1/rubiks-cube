package com.gluonhq.rubik.views;

import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class Splash extends StackPane {

    public Splash() {
        Label access = new Label("Loading...");
        access.setTranslateY(200);
//        access.setVisible(false);
        
        StackPane pane = new StackPane();
        pane.getStyleClass().add("pane");
        getChildren().addAll(pane, access);

        getStylesheets().add(Splash.class.getResource("splash.css").toExternalForm());
    }

}
