package week3;

import edu.msoe.cs1021.ImageUtil;
import javafx.application.Platform;
import javafx.fxml.FXML;
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
                System.out.println("error");
            }
        }
    }

    @FXML
    private void quit() {
        // For non-fx programs; System.exit(0);

        // For FX
        Platform.exit();
    }
}
