package week3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.nio.file.Paths;

public class FXMLIntro extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("fxml.fxml"));

        Parent root = loader.load();

        Scene scene = new Scene(root);

        stage.setTitle("FXML Intro");
        stage.setScene(scene);
        stage.show();

    }

}
