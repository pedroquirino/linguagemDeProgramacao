package ClassesVideo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;


/**
 * Sample Skeleton for 'Video.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;

public class VideoController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnCoracaoSalvar"
    private Button btnCoracaoSalvar; // Value injected by FXMLLoader

    @FXML // fx:id="btnPessoaSalvar"
    private Button btnPessoaSalvar; // Value injected by FXMLLoader

    @FXML // fx:id="btnRoboSalvar"
    private Button btnRoboSalvar; // Value injected by FXMLLoader

    @FXML // fx:id="lblCoracaoBPM"
    private Label lblCoracaoBPM; // Value injected by FXMLLoader

    @FXML // fx:id="lblCoracaoHorario"
    private Label lblCoracaoHorario; // Value injected by FXMLLoader

    @FXML // fx:id="lblCoracaoSentimento"
    private Label lblCoracaoSentimento; // Value injected by FXMLLoader

    @FXML // fx:id="lblPessoaGenero"
    private Label lblPessoaGenero; // Value injected by FXMLLoader

    @FXML // fx:id="lblPessoaIntAmoroso"
    private Label lblPessoaIntAmoroso; // Value injected by FXMLLoader

    @FXML // fx:id="lblPessoaNome"
    private Label lblPessoaNome; // Value injected by FXMLLoader

    @FXML // fx:id="lblRoboBateria"
    private Label lblRoboBateria; // Value injected by FXMLLoader

    @FXML // fx:id="lblRoboMaterial"
    private Label lblRoboMaterial; // Value injected by FXMLLoader

    @FXML // fx:id="lblRoboOleo"
    private Label lblRoboOleo; // Value injected by FXMLLoader

    @FXML // fx:id="tabCoracao"
    private Tab tabCoracao; // Value injected by FXMLLoader

    @FXML // fx:id="tabPessoa"
    private Tab tabPessoa; // Value injected by FXMLLoader

    @FXML // fx:id="tabRobo"
    private Tab tabRobo; // Value injected by FXMLLoader

    @FXML // fx:id="txtCoracaoBPM"
    private TextField txtCoracaoBPM; // Value injected by FXMLLoader

    @FXML // fx:id="txtCoracaoHorario"
    private TextField txtCoracaoHorario; // Value injected by FXMLLoader

    @FXML // fx:id="txtCoracaoSentimento"
    private TextField txtCoracaoSentimento; // Value injected by FXMLLoader

    @FXML // fx:id="txtPessoaGenero"
    private TextField txtPessoaGenero; // Value injected by FXMLLoader

    @FXML // fx:id="txtPessoaIntAmoroso"
    private TextField txtPessoaIntAmoroso; // Value injected by FXMLLoader

    @FXML // fx:id="txtPessoaNome"
    private TextField txtPessoaNome; // Value injected by FXMLLoader

    @FXML // fx:id="txtRoboBateria"
    private TextField txtRoboBateria; // Value injected by FXMLLoader

    @FXML // fx:id="txtRoboMaterial"
    private TextField txtRoboMaterial; // Value injected by FXMLLoader

    @FXML // fx:id="txtRoboOleo"
    private TextField txtRoboOleo; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnCoracaoSalvar != null : "fx:id=\"btnCoracaoSalvar\" was not injected: check your FXML file 'Video.fxml'.";
        assert btnPessoaSalvar != null : "fx:id=\"btnPessoaSalvar\" was not injected: check your FXML file 'Video.fxml'.";
        assert btnRoboSalvar != null : "fx:id=\"btnRoboSalvar\" was not injected: check your FXML file 'Video.fxml'.";
        assert lblCoracaoBPM != null : "fx:id=\"lblCoracaoBPM\" was not injected: check your FXML file 'Video.fxml'.";
        assert lblCoracaoHorario != null : "fx:id=\"lblCoracaoHorario\" was not injected: check your FXML file 'Video.fxml'.";
        assert lblCoracaoSentimento != null : "fx:id=\"lblCoracaoSentimento\" was not injected: check your FXML file 'Video.fxml'.";
        assert lblPessoaGenero != null : "fx:id=\"lblPessoaGenero\" was not injected: check your FXML file 'Video.fxml'.";
        assert lblPessoaIntAmoroso != null : "fx:id=\"lblPessoaIntAmoroso\" was not injected: check your FXML file 'Video.fxml'.";
        assert lblPessoaNome != null : "fx:id=\"lblPessoaNome\" was not injected: check your FXML file 'Video.fxml'.";
        assert lblRoboBateria != null : "fx:id=\"lblRoboBateria\" was not injected: check your FXML file 'Video.fxml'.";
        assert lblRoboMaterial != null : "fx:id=\"lblRoboMaterial\" was not injected: check your FXML file 'Video.fxml'.";
        assert lblRoboOleo != null : "fx:id=\"lblRoboOleo\" was not injected: check your FXML file 'Video.fxml'.";
        assert tabCoracao != null : "fx:id=\"tabCoracao\" was not injected: check your FXML file 'Video.fxml'.";
        assert tabPessoa != null : "fx:id=\"tabPessoa\" was not injected: check your FXML file 'Video.fxml'.";
        assert tabRobo != null : "fx:id=\"tabRobo\" was not injected: check your FXML file 'Video.fxml'.";
        assert txtCoracaoBPM != null : "fx:id=\"txtCoracaoBPM\" was not injected: check your FXML file 'Video.fxml'.";
        assert txtCoracaoHorario != null : "fx:id=\"txtCoracaoHorario\" was not injected: check your FXML file 'Video.fxml'.";
        assert txtCoracaoSentimento != null : "fx:id=\"txtCoracaoSentimento\" was not injected: check your FXML file 'Video.fxml'.";
        assert txtPessoaGenero != null : "fx:id=\"txtPessoaGenero\" was not injected: check your FXML file 'Video.fxml'.";
        assert txtPessoaIntAmoroso != null : "fx:id=\"txtPessoaIntAmoroso\" was not injected: check your FXML file 'Video.fxml'.";
        assert txtPessoaNome != null : "fx:id=\"txtPessoaNome\" was not injected: check your FXML file 'Video.fxml'.";
        assert txtRoboBateria != null : "fx:id=\"txtRoboBateria\" was not injected: check your FXML file 'Video.fxml'.";
        assert txtRoboMaterial != null : "fx:id=\"txtRoboMaterial\" was not injected: check your FXML file 'Video.fxml'.";
        assert txtRoboOleo != null : "fx:id=\"txtRoboOleo\" was not injected: check your FXML file 'Video.fxml'.";

    }
    @FXML
    public void cadastrarCoracao(ActionEvent event) {

        Coracao info =new Coracao(Integer.parseInt(txtCoracaoBPM.getText()),txtCoracaoSentimento.getText(),txtCoracaoHorario.getText());
        info.salvarCoracao();
        txtCoracaoBPM.setText("");
        txtCoracaoSentimento.setText("");
        txtCoracaoHorario.setText("");
    }
    public void cadastrarPessoa(ActionEvent event) {
        Pessoa info =new Pessoa(txtPessoaNome.getText(),txtPessoaGenero.getText(),txtPessoaIntAmoroso.getText());
        info.salvarPessoa();
        txtPessoaNome.setText("");
        txtPessoaGenero.setText("");
        txtPessoaIntAmoroso.setText("");
    }
    public void cadastrarRobo(ActionEvent event) {
        Robo info =new Robo(txtRoboMaterial.getText(),Integer.parseInt(txtRoboBateria.getText()),Integer.parseInt(txtRoboOleo.getText()));
        info.salvarRobo();
        txtRoboMaterial.setText("");
        txtRoboBateria.setText("");
        txtRoboOleo.setText("");
    }

}
