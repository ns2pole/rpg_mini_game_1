package com.example.rpg_mini_game_1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.IOException;
import java.io.FileInputStream;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FileInputStream input = new FileInputStream("block.png");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);

        // Paneを作成して、ImageViewを追加する
        Pane pane = new Pane(imageView);

        // キー入力を受け付けるようにする
        pane.setFocusTraversable(true);

        // 画像の表示サイズを指定する
        imageView.setFitWidth(20);
        imageView.setFitHeight(20);
        imageView.setLayoutX(400);
        imageView.setLayoutY(400);
        Scene scene = new Scene(pane, 900, 1000);
        scene.setOnKeyPressed(event -> {
            // 上キーが押されたら画像を上に移動する
            if (event.getCode() == KeyCode.UP) {
                imageView.setLayoutY(imageView.getLayoutY() - 20);
            }
            if (event.getCode() == KeyCode.DOWN) {
                imageView.setLayoutY(imageView.getLayoutY() + 20);
            }
            if (event.getCode() == KeyCode.LEFT) {
                imageView.setLayoutX(imageView.getLayoutX() - 20);
            }
            if (event.getCode() == KeyCode.RIGHT) {
                imageView.setLayoutX(imageView.getLayoutX() + 20);
            }
            
        });
        stage.setTitle("こんにちは!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}