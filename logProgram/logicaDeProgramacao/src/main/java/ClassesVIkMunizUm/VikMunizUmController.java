package ClassesVIkMunizUm; /**
 * Sample Skeleton for 'VikMunizUm.fxml' Controller Class
 */
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;

public class VikMunizUmController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnSalvarAgua"
    private Button btnSalvarAgua; // Value injected by FXMLLoader

    @FXML // fx:id="btnSalvarBarco"
    private Button btnSalvarBarco; // Value injected by FXMLLoader

    @FXML // fx:id="btnSalvarCidade"
    private Button btnSalvarCidade; // Value injected by FXMLLoader

    @FXML // fx:id="lblAgua"
    private Label lblAgua; // Value injected by FXMLLoader

    @FXML // fx:id="lblCidade"
    private Label lblCidade; // Value injected by FXMLLoader

    @FXML // fx:id="lblCombustivel"
    private Label lblCombustivel; // Value injected by FXMLLoader

    @FXML // fx:id="lblDisponivelParaAtracar"
    private Label lblDisponivelParaAtracar; // Value injected by FXMLLoader

    @FXML // fx:id="lblModelo"
    private Label lblModelo; // Value injected by FXMLLoader

    @FXML // fx:id="lblNomeCidade"
    private Label lblNomeCidade; // Value injected by FXMLLoader

    @FXML // fx:id="lblSentidoDoFluxo"
    private Label lblSentidoDoFluxo; // Value injected by FXMLLoader

    @FXML // fx:id="lblTipoDeAgua"
    private Label lblTipoDeAgua; // Value injected by FXMLLoader

    @FXML // fx:id="lblTotalDeBarcos"
    private Label lblTotalDeBarcos; // Value injected by FXMLLoader

    @FXML // fx:id="lblVelocidade"
    private Label lblVelocidade; // Value injected by FXMLLoader

    @FXML // fx:id="lblbarco"
    private Label lblbarco; // Value injected by FXMLLoader

    @FXML // fx:id="tabAgua"
    private Tab tabAgua; // Value injected by FXMLLoader

    @FXML // fx:id="tabBarco"
    private Tab tabBarco; // Value injected by FXMLLoader

    @FXML // fx:id="tabCidade"
    private Tab tabCidade; // Value injected by FXMLLoader

    @FXML // fx:id="txtCombustivel"
    private TextField txtCombustivel; // Value injected by FXMLLoader

    @FXML // fx:id="txtDisponivelParaAtracar"
    private TextField txtDisponivelParaAtracar; // Value injected by FXMLLoader

    @FXML // fx:id="txtForcaDaCorrenteza"
    private TextField txtForcaDaCorrenteza; // Value injected by FXMLLoader

    @FXML // fx:id="txtModelo"
    private TextField txtModelo; // Value injected by FXMLLoader

    @FXML // fx:id="txtNomeCidade"
    private TextField txtNomeCidade; // Value injected by FXMLLoader

    @FXML // fx:id="txtSentidoDoFluxo"
    private TextField txtSentidoDoFluxo; // Value injected by FXMLLoader

    @FXML // fx:id="txtTipoDeAgua"
    private TextField txtTipoDeAgua; // Value injected by FXMLLoader

    @FXML // fx:id="txtTotalDeBarcos"
    private TextField txtTotalDeBarcos; // Value injected by FXMLLoader

    @FXML // fx:id="txtVelocidade"
    private TextField txtVelocidade; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnSalvarAgua != null : "fx:id=\"btnSalvarAgua\" was not injected: check your FXML file 'VikMunizUm.fxml'.";
        assert btnSalvarBarco != null : "fx:id=\"btnSalvarBarco\" was not injected: check your FXML file 'VikMunizUm.fxml'.";
        assert btnSalvarCidade != null : "fx:id=\"btnSalvarCidade\" was not injected: check your FXML file 'VikMunizUm.fxml'.";
        assert lblAgua != null : "fx:id=\"lblAgua\" was not injected: check your FXML file 'VikMunizUm.fxml'.";
        assert lblCidade != null : "fx:id=\"lblCidade\" was not injected: check your FXML file 'VikMunizUm.fxml'.";
        assert lblCombustivel != null : "fx:id=\"lblCombustivel\" was not injected: check your FXML file 'VikMunizUm.fxml'.";
        assert lblDisponivelParaAtracar != null : "fx:id=\"lblDisponivelParaAtracar\" was not injected: check your FXML file 'VikMunizUm.fxml'.";
        assert lblModelo != null : "fx:id=\"lblModelo\" was not injected: check your FXML file 'VikMunizUm.fxml'.";
        assert lblNomeCidade != null : "fx:id=\"lblNomeCidade\" was not injected: check your FXML file 'VikMunizUm.fxml'.";
        assert lblSentidoDoFluxo != null : "fx:id=\"lblSentidoDoFluxo\" was not injected: check your FXML file 'VikMunizUm.fxml'.";
        assert lblTipoDeAgua != null : "fx:id=\"lblTipoDeAgua\" was not injected: check your FXML file 'VikMunizUm.fxml'.";
        assert lblTotalDeBarcos != null : "fx:id=\"lblTotalDeBarcos\" was not injected: check your FXML file 'VikMunizUm.fxml'.";
        assert lblVelocidade != null : "fx:id=\"lblVelocidade\" was not injected: check your FXML file 'VikMunizUm.fxml'.";
        assert lblbarco != null : "fx:id=\"lblbarco\" was not injected: check your FXML file 'VikMunizUm.fxml'.";
        assert tabAgua != null : "fx:id=\"tabAgua\" was not injected: check your FXML file 'VikMunizUm.fxml'.";
        assert tabBarco != null : "fx:id=\"tabBarco\" was not injected: check your FXML file 'VikMunizUm.fxml'.";
        assert tabCidade != null : "fx:id=\"tabCidade\" was not injected: check your FXML file 'VikMunizUm.fxml'.";
        assert txtCombustivel != null : "fx:id=\"txtCombustivel\" was not injected: check your FXML file 'VikMunizUm.fxml'.";
        assert txtDisponivelParaAtracar != null : "fx:id=\"txtDisponivelParaAtracar\" was not injected: check your FXML file 'VikMunizUm.fxml'.";
        assert txtForcaDaCorrenteza != null : "fx:id=\"txtForcaDaCorrenteza\" was not injected: check your FXML file 'VikMunizUm.fxml'.";
        assert txtModelo != null : "fx:id=\"txtModelo\" was not injected: check your FXML file 'VikMunizUm.fxml'.";
        assert txtNomeCidade != null : "fx:id=\"txtNomeCidade\" was not injected: check your FXML file 'VikMunizUm.fxml'.";
        assert txtSentidoDoFluxo != null : "fx:id=\"txtSentidoDoFluxo\" was not injected: check your FXML file 'VikMunizUm.fxml'.";
        assert txtTipoDeAgua != null : "fx:id=\"txtTipoDeAgua\" was not injected: check your FXML file 'VikMunizUm.fxml'.";
        assert txtTotalDeBarcos != null : "fx:id=\"txtTotalDeBarcos\" was not injected: check your FXML file 'VikMunizUm.fxml'.";
        assert txtVelocidade != null : "fx:id=\"txtVelocidade\" was not injected: check your FXML file 'VikMunizUm.fxml'.";

    }
    @FXML
    public void cadastrarAgua(ActionEvent event) {

        Agua info =new Agua(txtTipoDeAgua.getText(),Integer.parseInt(txtForcaDaCorrenteza.getText()),txtSentidoDoFluxo.getText());
        info.salvarAgua();
        txtTipoDeAgua.clear();
        txtForcaDaCorrenteza.clear();
        txtSentidoDoFluxo.clear();
    }
    public void cadastrarBarco(ActionEvent event) {
        Barco info =new Barco(txtModelo.getText(),Integer.parseInt(txtCombustivel.getText()),Integer.parseInt(txtVelocidade.getText()));
        info.salvarBarco();
        txtModelo.clear();
        txtCombustivel.clear();
        txtVelocidade.clear();
    }
    public void cadastrarCidade(ActionEvent event) {
        Cidade info =new Cidade(txtNomeCidade.getText(),Integer.parseInt(txtTotalDeBarcos.getText()),Integer.parseInt(txtDisponivelParaAtracar.getText()));
        info.salvarCidade();
        txtNomeCidade.clear();
        txtTotalDeBarcos.clear();
        txtDisponivelParaAtracar.clear();
    }
}
