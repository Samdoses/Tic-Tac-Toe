package main;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Simple UI test
        Label label = new Label("Tic-Tac-Toe with JavaFX!");
        StackPane root = new StackPane(label);
        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        // Note: You can call TUI.start() here if you want to run the console version 
        // in a separate thread, but usually you replace TUI with the GUI.
    }

    public static void main(String[] args) {
        // Launch the JavaFX application
        launch(args);
        TUI.start();
    }
}