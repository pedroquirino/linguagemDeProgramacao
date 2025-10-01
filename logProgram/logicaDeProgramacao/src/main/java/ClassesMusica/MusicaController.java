package ClassesMusica;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MusicaController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnAveSalvar"
    private Button btnAveSalvar; // Value injected by FXMLLoader

    @FXML // fx:id="btnCeuSalvar"
    private Button btnCeuSalvar; // Value injected by FXMLLoader

    @FXML // fx:id="btnPaoSalvar"
    private Button btnPaoSalvar; // Value injected by FXMLLoader

    @FXML // fx:id="lbCelCondClima"
    private Label lbCelCondClima; // Value injected by FXMLLoader

    @FXML // fx:id="lbCelCor"
    private Label lbCelCor; // Value injected by FXMLLoader

    @FXML // fx:id="lbCelVisibilidade"
    private Label lbCelVisibilidade; // Value injected by FXMLLoader

    @FXML // fx:id="lblAveEspecie"
    private Label lblAveEspecie; // Value injected by FXMLLoader

    @FXML // fx:id="lblAveTamanho"
    private Label lblAveTamanho; // Value injected by FXMLLoader

    @FXML // fx:id="lblAveVelocidade"
    private Label lblAveVelocidade; // Value injected by FXMLLoader

    @FXML // fx:id="lblPaoEnergia"
    private Label lblPaoEnergia; // Value injected by FXMLLoader

    @FXML // fx:id="lblPaoFormato"
    private Label lblPaoFormato; // Value injected by FXMLLoader

    @FXML // fx:id="lblPaoTamanho"
    private Label lblPaoTamanho; // Value injected by FXMLLoader

    @FXML // fx:id="txtAveEspecie"
    private TextField txtAveEspecie; // Value injected by FXMLLoader

    @FXML // fx:id="txtAveTamanho"
    private TextField txtAveTamanho; // Value injected by FXMLLoader

    @FXML // fx:id="txtAveVelocidade"
    private TextField txtAveVelocidade; // Value injected by FXMLLoader

    @FXML // fx:id="txtCeuCondClima"
    private TextField txtCeuCondClima; // Value injected by FXMLLoader

    @FXML // fx:id="txtCeuCor"
    private TextField txtCeuCor; // Value injected by FXMLLoader

    @FXML // fx:id="txtCeuVisibilidade"
    private TextField txtCeuVisibilidade; // Value injected by FXMLLoader

    @FXML // fx:id="txtPaoEnergia"
    private TextField txtPaoEnergia; // Value injected by FXMLLoader

    @FXML // fx:id="txtPaoFormato"
    private TextField txtPaoFormato; // Value injected by FXMLLoader

    @FXML // fx:id="txtPaoTamanho"
    private TextField txtPaoTamanho; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnAveSalvar != null : "fx:id=\"btnAveSalvar\" was not injected: check your FXML file 'Musica.fxml'.";
        assert btnCeuSalvar != null : "fx:id=\"btnCeuSalvar\" was not injected: check your FXML file 'Musica.fxml'.";
        assert btnPaoSalvar != null : "fx:id=\"btnPaoSalvar\" was not injected: check your FXML file 'Musica.fxml'.";
        assert lbCelCondClima != null : "fx:id=\"lbCelCondClima\" was not injected: check your FXML file 'Musica.fxml'.";
        assert lbCelCor != null : "fx:id=\"lbCelCor\" was not injected: check your FXML file 'Musica.fxml'.";
        assert lbCelVisibilidade != null : "fx:id=\"lbCelVisibilidade\" was not injected: check your FXML file 'Musica.fxml'.";
        assert lblAveEspecie != null : "fx:id=\"lblAveEspecie\" was not injected: check your FXML file 'Musica.fxml'.";
        assert lblAveTamanho != null : "fx:id=\"lblAveTamanho\" was not injected: check your FXML file 'Musica.fxml'.";
        assert lblAveVelocidade != null : "fx:id=\"lblAveVelocidade\" was not injected: check your FXML file 'Musica.fxml'.";
        assert lblPaoEnergia != null : "fx:id=\"lblPaoEnergia\" was not injected: check your FXML file 'Musica.fxml'.";
        assert lblPaoFormato != null : "fx:id=\"lblPaoFormato\" was not injected: check your FXML file 'Musica.fxml'.";
        assert lblPaoTamanho != null : "fx:id=\"lblPaoTamanho\" was not injected: check your FXML file 'Musica.fxml'.";
        assert txtAveEspecie != null : "fx:id=\"txtAveEspecie\" was not injected: check your FXML file 'Musica.fxml'.";
        assert txtAveTamanho != null : "fx:id=\"txtAveTamanho\" was not injected: check your FXML file 'Musica.fxml'.";
        assert txtAveVelocidade != null : "fx:id=\"txtAveVelocidade\" was not injected: check your FXML file 'Musica.fxml'.";
        assert txtCeuCondClima != null : "fx:id=\"txtCeuCondClima\" was not injected: check your FXML file 'Musica.fxml'.";
        assert txtCeuCor != null : "fx:id=\"txtCeuCor\" was not injected: check your FXML file 'Musica.fxml'.";
        assert txtCeuVisibilidade != null : "fx:id=\"txtCeuVisibilidade\" was not injected: check your FXML file 'Musica.fxml'.";
        assert txtPaoEnergia != null : "fx:id=\"txtPaoEnergia\" was not injected: check your FXML file 'Musica.fxml'.";
        assert txtPaoFormato != null : "fx:id=\"txtPaoFormato\" was not injected: check your FXML file 'Musica.fxml'.";
        assert txtPaoTamanho != null : "fx:id=\"txtPaoTamanho\" was not injected: check your FXML file 'Musica.fxml'.";

    }
    @FXML
    public void cadastrarAve(ActionEvent event) {
        Ave ave= new Ave(txtAveEspecie.getText(),Double.valueOf(txtAveTamanho.getText()),Integer.parseInt(txtAveVelocidade.getText()));
        ave.salvarAve();
        txtAveEspecie.clear();
        txtAveTamanho.clear();
        txtAveVelocidade.clear();
    }
    public void cadastrarCeu(ActionEvent event) {
        Ceu ceu= new Ceu(txtCeuCor.getText(),txtCeuCondClima.getText(),txtCeuVisibilidade.getText());
        ceu.salvarCeu();
        txtCeuCor.clear();
        txtCeuCondClima.clear();
        txtCeuVisibilidade.clear();
    }

    public void cadastrarPao(ActionEvent event) {
        Pao pao= new Pao(Integer.parseInt(txtPaoEnergia.getText()),Double.valueOf(txtPaoTamanho.getText()),txtPaoFormato.getText());
        pao.salvarPao();
        txtPaoEnergia.clear();
        txtPaoTamanho.clear();
        txtPaoFormato.clear();
    }
}
