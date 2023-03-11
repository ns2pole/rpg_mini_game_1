module com.example.rpg_mini_game_1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.rpg_mini_game_1 to javafx.fxml;
    exports com.example.rpg_mini_game_1;
}