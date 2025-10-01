package ClassesVIkMunizDois; /**
 * Sample Skeleton for 'VikMunizDois.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;

public class VikMunizDoisController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnSalvarCesto"
    private Button btnSalvarCesto; // Value injected by FXMLLoader

    @FXML // fx:id="btnSalvarLixo"
    private Button btnSalvarLixo; // Value injected by FXMLLoader

    @FXML // fx:id="btnSalvarMulher"
    private Button btnSalvarMulher; // Value injected by FXMLLoader

    @FXML // fx:id="lblForcaMulher"
    private Label lblForcaMulher; // Value injected by FXMLLoader

    @FXML // fx:id="lblIdadeMulher"
    private Label lblIdadeMulher; // Value injected by FXMLLoader

    @FXML // fx:id="lblMateiralCesto"
    private Label lblMateiralCesto; // Value injected by FXMLLoader

    @FXML // fx:id="lblNomeMulher"
    private Label lblNomeMulher; // Value injected by FXMLLoader

    @FXML // fx:id="lblPesoCesto"
    private Label lblPesoCesto; // Value injected by FXMLLoader

    @FXML // fx:id="lblPesoLixo"
    private Label lblPesoLixo; // Value injected by FXMLLoader

    @FXML // fx:id="lblQuantidadeLixo"
    private Label lblQuantidadeLixo; // Value injected by FXMLLoader

    @FXML // fx:id="lblTamnhoCesto"
    private Label lblTamnhoCesto; // Value injected by FXMLLoader

    @FXML // fx:id="lblTipoLixo"
    private Label lblTipoLixo; // Value injected by FXMLLoader

    @FXML // fx:id="paneCesto"
    private Tab paneCesto; // Value injected by FXMLLoader

    @FXML // fx:id="txtForcaMulher"
    private TextField txtForcaMulher; // Value injected by FXMLLoader

    @FXML // fx:id="txtIdadeMulher"
    private TextField txtIdadeMulher; // Value injected by FXMLLoader

    @FXML // fx:id="txtMaterialCesto"
    private TextField txtMaterialCesto; // Value injected by FXMLLoader

    @FXML // fx:id="txtNomeMulher"
    private TextField txtNomeMulher; // Value injected by FXMLLoader

    @FXML // fx:id="txtPesoCesto"
    private TextField txtPesoCesto; // Value injected by FXMLLoader

    @FXML // fx:id="txtPesoLixo"
    private TextField txtPesoLixo; // Value injected by FXMLLoader

    @FXML // fx:id="txtQuantidadeLixo"
    private TextField txtQuantidadeLixo; // Value injected by FXMLLoader

    @FXML // fx:id="txtTamanhoCesto"
    private TextField txtTamanhoCesto; // Value injected by FXMLLoader

    @FXML // fx:id="txtTipoLixo"
    private TextField txtTipoLixo; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnSalvarCesto != null : "fx:id=\"btnSalvarCesto\" was not injected: check your FXML file 'VikMunizDois.fxml'.";
        assert btnSalvarLixo != null : "fx:id=\"btnSalvarLixo\" was not injected: check your FXML file 'VikMunizDois.fxml'.";
        assert btnSalvarMulher != null : "fx:id=\"btnSalvarMulher\" was not injected: check your FXML file 'VikMunizDois.fxml'.";
        assert lblForcaMulher != null : "fx:id=\"lblForcaMulher\" was not injected: check your FXML file 'VikMunizDois.fxml'.";
        assert lblIdadeMulher != null : "fx:id=\"lblIdadeMulher\" was not injected: check your FXML file 'VikMunizDois.fxml'.";
        assert lblMateiralCesto != null : "fx:id=\"lblMateiralCesto\" was not injected: check your FXML file 'VikMunizDois.fxml'.";
        assert lblNomeMulher != null : "fx:id=\"lblNomeMulher\" was not injected: check your FXML file 'VikMunizDois.fxml'.";
        assert lblPesoCesto != null : "fx:id=\"lblPesoCesto\" was not injected: check your FXML file 'VikMunizDois.fxml'.";
        assert lblPesoLixo != null : "fx:id=\"lblPesoLixo\" was not injected: check your FXML file 'VikMunizDois.fxml'.";
        assert lblQuantidadeLixo != null : "fx:id=\"lblQuantidadeLixo\" was not injected: check your FXML file 'VikMunizDois.fxml'.";
        assert lblTamnhoCesto != null : "fx:id=\"lblTamnhoCesto\" was not injected: check your FXML file 'VikMunizDois.fxml'.";
        assert lblTipoLixo != null : "fx:id=\"lblTipoLixo\" was not injected: check your FXML file 'VikMunizDois.fxml'.";
        assert paneCesto != null : "fx:id=\"paneCesto\" was not injected: check your FXML file 'VikMunizDois.fxml'.";
        assert txtForcaMulher != null : "fx:id=\"txtForcaMulher\" was not injected: check your FXML file 'VikMunizDois.fxml'.";
        assert txtIdadeMulher != null : "fx:id=\"txtIdadeMulher\" was not injected: check your FXML file 'VikMunizDois.fxml'.";
        assert txtMaterialCesto != null : "fx:id=\"txtMaterialCesto\" was not injected: check your FXML file 'VikMunizDois.fxml'.";
        assert txtNomeMulher != null : "fx:id=\"txtNomeMulher\" was not injected: check your FXML file 'VikMunizDois.fxml'.";
        assert txtPesoCesto != null : "fx:id=\"txtPesoCesto\" was not injected: check your FXML file 'VikMunizDois.fxml'.";
        assert txtPesoLixo != null : "fx:id=\"txtPesoLixo\" was not injected: check your FXML file 'VikMunizDois.fxml'.";
        assert txtQuantidadeLixo != null : "fx:id=\"txtQuantidadeLixo\" was not injected: check your FXML file 'VikMunizDois.fxml'.";
        assert txtTamanhoCesto != null : "fx:id=\"txtTamanhoCesto\" was not injected: check your FXML file 'VikMunizDois.fxml'.";
        assert txtTipoLixo != null : "fx:id=\"txtTipoLixo\" was not injected: check your FXML file 'VikMunizDois.fxml'.";

    }
    @FXML
    public void cadastrarCesto(ActionEvent event) {

        Cesto info =new Cesto(Integer.parseInt(txtTamanhoCesto.getText()),txtMaterialCesto.getText(),Double.parseDouble(txtPesoCesto.getText()));
        info.salvarCesto();
        txtTamanhoCesto.setText("");
        txtMaterialCesto.setText("");
        txtPesoCesto.setText("");
    }
    public void cadastrarLixo(ActionEvent event) {
        Lixo info =new Lixo(txtTipoLixo.getText(),Double.parseDouble(txtPesoLixo.getText()),Integer.parseInt(txtQuantidadeLixo.getText()));
        info.salvarLixo();
        txtTipoLixo.setText("");
        txtPesoLixo.setText("");
        txtQuantidadeLixo.setText("");
    }
    public void cadastrarMulher(ActionEvent event) {
        Mulher info =new Mulher(Integer.parseInt(txtIdadeMulher.getText()),txtNomeMulher.getText(),Integer.parseInt(txtForcaMulher.getText()));
        info.salvarMulher();
        txtIdadeMulher.setText(null);
        txtNomeMulher.setText("");
        txtForcaMulher.setText("");
    }

}
