package demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Hello extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello");
        StackPane root = new StackPane() {{
            getChildren().add(new Button("Alert") {{
                setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent event) {
                        Alert alert = new Alert(Alert.AlertType.INFORMATION) {{
                            this.setTitle("Hello");
                            this.setHeaderText("Head message");
                            this.setContentText("This is some information for you");
                        }};
                        alert.showAndWait();
                    }
                });
            }});
        }};
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}