package ClassesDoodle;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    private static Scene scene;

    @Override
    public void start(Stage stage) throws Exception {
        scene = new Scene(loadFXML("Doodle"), 640, 480);
        stage.setTitle("Doodle - Absolut Brisbane");
        stage.setScene(scene);
        stage.show();
    }
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }
    private static Parent loadFXML(String fxml) throws IOException {
        String fxmlPath = "/view/ClasseDoodle/" + fxml + ".fxml";
        FXMLLoader fxmlLoader = new FXMLLoader(ClassesDoodle.Main.class.getResource(fxmlPath));
        return fxmlLoader.load();
    }
}
