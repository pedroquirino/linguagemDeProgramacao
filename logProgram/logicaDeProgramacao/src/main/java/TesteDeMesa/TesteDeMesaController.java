package TesteDeMesa;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import java.util.Locale;

public class TesteDeMesaController{

    @FXML
    private Button btnCalcular;

    @FXML
    private Label lblResultadoNota;

    @FXML
    private TextField tfdApi;

    @FXML
    private TextField tfdE1;

    @FXML
    private TextField tfdE2;

    @FXML
    private TextField tfdP1;

    @FXML
    private TextField tfdX;

    @FXML
    private TextField tfdSub;

    @FXML
    void calcularNotaAction(ActionEvent event) {
        // Usamos um try-catch para evitar que o programa quebre se o usuário digitar texto em vez de números.
        try {
            // 1. Obter os valores dos TextFields e converter para double
            double sub = Double.parseDouble(tfdSub.getText());
            double x = Double.parseDouble(tfdX.getText());
            double api = Double.parseDouble(tfdApi.getText());
            double p1 = Double.parseDouble(tfdP1.getText());
            double e1 = Double.parseDouble(tfdE1.getText());
            double e2 = Double.parseDouble(tfdE2.getText());

            // 2. Aplicar a mesma lógica de cálculo da classe CalculadoraMedia
            double calcBase = p1 * 0.5 + e1 * 0.2 + e2 * 0.3 + x + sub * 0.15;

            double bonus;
            if (calcBase > 5.9) {
                bonus = 1.0;
            } else {
                bonus = 0.0;
            }

            double nota = calcBase * 0.5 + bonus * api * 0.5;
            if (nota > 10) {
                nota = 10.0;
            }

            // 3. Formatar o resultado para duas casas decimais e exibir no Label
            // Usamos Locale.US para garantir que o formato use ponto como separador decimal.
            String resultadoFormatado = String.format(Locale.US, "%.2f", nota);
            lblResultadoNota.setText(resultadoFormatado);

        } catch (NumberFormatException e) {
            // Se o usuário digitar algo que não seja um número, mostramos uma mensagem de erro.
            lblResultadoNota.setText("Erro: Insira apenas números válidos.");
        }
    }

}
