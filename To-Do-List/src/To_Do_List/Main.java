package To_Do_List;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
        primaryStage.setTitle("To Do List!");
        primaryStage.setMinHeight(500);
        primaryStage.setMaxHeight(500);
        primaryStage.setMinWidth(750);
        primaryStage.setMaxWidth(750);
        primaryStage.setScene(new Scene(root, 500, 750));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
