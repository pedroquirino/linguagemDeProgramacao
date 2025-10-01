package TesteDeMesa;

import javafx.application.Application;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // 1. Carrega o arquivo FXML da interface gráfica.
            //    Certifique-se de que o nome "TelaCalculadora.fxml" corresponde ao nome do seu arquivo!
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/TesteDeMesa/TesteDeMesa.fxml"));
            Parent root = loader.load();

            // 2. Cria uma nova "Cena" com o conteúdo carregado do FXML.
            Scene scene = new Scene(root);

            // 3. Configura o "Palco" (a janela).
            primaryStage.setTitle("Calculadora de Média"); // Define o título da janela
            primaryStage.setScene(scene); // Define a cena a ser exibida na janela
            primaryStage.setResizable(false); // Opcional: impede o redimensionamento da janela

            // 4. Mostra a janela para o usuário.
            primaryStage.show();

        } catch (IOException e) {
            // Em caso de erro ao carregar o FXML, imprime o erro no console.
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}