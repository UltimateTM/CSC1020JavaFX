package week3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.BoxBlur;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

// inherit from Application
public class SimpleFX extends Application {
    // main method
    public static void main(String[] args) {
        launch(args);
    }

    // start method
    public void start(Stage stage) {
        // blueprint - pane
        Pane root = new StackPane();
        // props - components
        Button clickMe = new Button("Click Me");
        // lambda expression
        clickMe.setOnAction(e -> handle(e));
        // add the props to the blueprint
        root.getChildren().add(clickMe);
        // add blueprint to scene
        Scene scene = new Scene(root, 400, 300);
        // add scene to Stage
        stage.setScene(scene);
        // title stage
        stage.setTitle("Simple FX");
        // show the play
        stage.show();
    }

    private void handle(ActionEvent e) {
        Button button = (Button) e.getSource();
//        button.getParent().getChildrenUnmodifiable().get(0);
        if (button.getEffect() == null) {
            button.setEffect(new BoxBlur());
        } else {
            button.setEffect(null);
        }
    }


    // private inner class
//    private class ClickMeHandler implements EventHandler<ActionEvent> {
//        @Override
//        public void handle(ActionEvent e) {
//            Button button = (Button) e.getSource();
//            if (button.getEffect() == null) {
//                button.setEffect(new BoxBlur());
//            } else {
//                button.setEffect(null);
//            }
//        }
//    }
}