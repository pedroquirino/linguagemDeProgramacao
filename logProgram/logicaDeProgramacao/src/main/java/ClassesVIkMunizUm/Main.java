package ClassesVIkMunizUm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    private static Scene scene;

    @Override
    public void start(Stage stage) throws Exception {
        scene = new Scene(loadFXML("VikMunizUm"), 640, 480);
        stage.setTitle("Vik Muniz Um - Lampedusa");
        stage.setScene(scene);
        stage.show();
    }
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }
    private static Parent loadFXML(String fxml) throws IOException {
        String fxmlPath = "/view/VikMunizUm/" + fxml + ".fxml";
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(fxmlPath));
        return fxmlLoader.load();
    }
}
