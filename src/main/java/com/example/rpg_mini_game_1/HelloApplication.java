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
        FileInputStream input = new FileInputStream("hero.png");
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);

        imageView.setFitWidth(40);
        imageView.setFitHeight(40);
        imageView.setLayoutX(400);
        imageView.setLayoutY(400);
        // Paneを作成して、ImageViewを追加する
        Pane pane = new Pane();


        // 新しい画像を追加
        FileInputStream input2 = new FileInputStream("treasureBox3.png");
        Image image2 = new Image(input2);
        ImageView imageView2 = new ImageView(image2);
        imageView2.setFitWidth(40);
        imageView2.setFitHeight(40);
        imageView2.setLayoutX(720);
        imageView2.setLayoutY(200);


        // 新しい画像を追加
        FileInputStream input3 = new FileInputStream("monster.png");
        Image image3 = new Image(input3);
        ImageView imageView3 = new ImageView(image3);
        imageView3.setFitWidth(40);
        imageView3.setFitHeight(40);
        imageView3.setLayoutX(320);
        imageView3.setLayoutY(200);


        pane.getChildren().addAll(imageView, imageView2, imageView3);


        // キー入力を受け付けるようにする
        pane.setFocusTraversable(true);
        // 画像の表示サイズを指定する
        Scene scene = new Scene(pane, 900, 1000);
        scene.setOnKeyPressed(event -> {
            // 上キーが押されたら画像を上に移動する
            if (event.getCode() == KeyCode.UP) {
                imageView.setLayoutY(imageView.getLayoutY() - 40);
            }
            if (event.getCode() == KeyCode.DOWN) {
                imageView.setLayoutY(imageView.getLayoutY() + 40);
            }
            if (event.getCode() == KeyCode.LEFT) {
                imageView.setLayoutX(imageView.getLayoutX() - 40);
            }
            if (event.getCode() == KeyCode.RIGHT) {
                imageView.setLayoutX(imageView.getLayoutX() + 40);
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