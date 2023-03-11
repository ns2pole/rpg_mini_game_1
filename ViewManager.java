import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ViewManager extends Application {
  @Override
  public void start(Stage stage) {
    String javaVersion = System.getProperty("java.version");
    String javafxVersion = System.getProperty("javafx.version");
    Image image = new Image("https://example.com/image.png");
    ImageView imageView = new ImageView(image);
    StackPane root = new StackPane();
    root.getChildren().add(imageView);
    Scene scene = new Scene(root, 400, 300);
    stage.setScene(scene);
    stage.setTitle("ImageView Example");
    stage.show();
  }
  public static void main(String[] args) {
    launch();
  }
}