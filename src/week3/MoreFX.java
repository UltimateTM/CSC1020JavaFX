package week3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.event.KeyEvent;

public class MoreFX extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) {
        VBox root = new VBox();
        HBox upper = new HBox();
        //set spacing of 10
        HBox middle = new HBox(10);
        HBox lower = new HBox(10);

        // set spacing to 10
        upper.setSpacing(10);
        upper.setAlignment(Pos.CENTER_LEFT);
        middle.setAlignment(Pos.CENTER_LEFT);
        lower.setAlignment(Pos.CENTER_RIGHT);

        Label username = new Label("Username: ");
        HBox.setMargin(username, new Insets(10));
        TextField userField = new TextField();
        Label password = new Label("Password: ");
        HBox.setMargin(password, new Insets(10));
        PasswordField passwordField = new PasswordField();
        Button ok = new Button("OK");
        Button cancel = new Button("Cancel");

        HBox.setMargin(ok, new Insets(10));

        //adding components
        upper.getChildren().addAll(username, userField);
        middle.getChildren().addAll(password, passwordField);
        lower.getChildren().addAll(cancel, ok);
        root.getChildren().addAll(upper, middle, lower);


        // adding listeners/events handlers
        ok.setOnAction(event -> ok(userField.getText(), passwordField.getText()));
        cancel.setOnAction(event -> cancel(userField, passwordField));
        userField.setOnAction(event -> ok(userField.getText(), passwordField.getText()));
        passwordField.setOnAction(event -> cancel(userField, passwordField));
        //userField.setOnKeyTyped(event -> echo(event));


        // Scene
        Scene scene = new Scene(root,300, 150);

        // add to stage
        stage.setScene(scene);
        stage.setTitle("Log in");

        // Show stage
        stage.show();


    }

    private void ok(String username, String password) {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

    private void cancel(TextField username, TextField password) {
        username.setText("");
        password.setText("");
    }

    private void echo(KeyEvent e) {
        System.out.println(e.getKeyChar());
    }
}
