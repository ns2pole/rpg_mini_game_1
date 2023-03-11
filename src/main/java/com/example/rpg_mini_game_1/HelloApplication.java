package com.example.rpg_mini_game_1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import java.io.IOException;
import java.io.FileInputStream;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FileInputStream input = new FileInputStream("block.png");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        StackPane root = new StackPane();
        root.getChildren().add(imageView);
        Scene scene = new Scene(root, 400, 300);

        stage.setTitle("こんにちは!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}