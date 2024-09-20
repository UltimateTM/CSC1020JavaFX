package week3;

import edu.msoe.cs1021.ImageUtil;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

import java.io.File;
import java.io.IOException;

public class Controller {

    private FileChooser chooser = new FileChooser();

    @FXML // must-have tag for FXML to see imageView object
    private ImageView imageView;

    @FXML
    private void open() {
        // Attaches FileChooser window to program; not needed but makes things
        // neater
        File file = chooser.showOpenDialog(imageView.getScene().getWindow());
        if (file != null) {
            try {
                Image image = ImageUtil.readImage(file.toPath());
                imageView.setImage(image);
            } catch (IOException e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("ERORR!!!!!");
                alert.setContentText("Could not load file");
                alert.show();
            }
        }
    }

    @FXML
    private void quit() {
        // For non-fx programs; System.exit(0);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Closing");
        alert.setHeaderText("Now closing");
        alert.setContentText("Now closing");
        alert.showAndWait();

        // For FX
        Platform.exit();
    }
}
