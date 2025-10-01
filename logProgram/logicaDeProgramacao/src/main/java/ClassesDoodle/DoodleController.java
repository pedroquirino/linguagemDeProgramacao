package ClassesDoodle;
import java.net.URL;
import java.util.ResourceBundle;

import ClassesMusica.Ave;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DoodleController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnAnimalSalvar"
    private Button btnAnimalSalvar; // Value injected by FXMLLoader

    @FXML // fx:id="btnCidadeSalvar"
    private Button btnCidadeSalvar; // Value injected by FXMLLoader

    @FXML // fx:id="btnPessoaSalvar"
    private Button btnPessoaSalvar; // Value injected by FXMLLoader

    @FXML // fx:id="lblAnimalEspecie"
    private Label lblAnimalEspecie; // Value injected by FXMLLoader

    @FXML // fx:id="lblAnimalNPericulosidade"
    private Label lblAnimalNPericulosidade; // Value injected by FXMLLoader

    @FXML // fx:id="lblAnimalNome"
    private Label lblAnimalNome; // Value injected by FXMLLoader

    @FXML // fx:id="lblCidadeNome"
    private Label lblCidadeNome; // Value injected by FXMLLoader

    @FXML // fx:id="lblCidadePredioComercial"
    private Label lblCidadePredioComercial; // Value injected by FXMLLoader

    @FXML // fx:id="lblCidadeVagasEmprego"
    private Label lblCidadeVagasEmprego; // Value injected by FXMLLoader

    @FXML // fx:id="lblPessoaGenero"
    private Label lblPessoaGenero; // Value injected by FXMLLoader

    @FXML // fx:id="lblPessoaIdade"
    private Label lblPessoaIdade; // Value injected by FXMLLoader

    @FXML // fx:id="lblPessoaNome"
    private Label lblPessoaNome; // Value injected by FXMLLoader

    @FXML // fx:id="txtAnimalEspecie"
    private TextField txtAnimalEspecie; // Value injected by FXMLLoader

    @FXML // fx:id="txtAnimalNPericulosidade"
    private TextField txtAnimalNPericulosidade; // Value injected by FXMLLoader

    @FXML // fx:id="txtAnimalNome"
    private TextField txtAnimalNome; // Value injected by FXMLLoader

    @FXML // fx:id="txtCidadeNome"
    private TextField txtCidadeNome; // Value injected by FXMLLoader

    @FXML // fx:id="txtCidadePredioComercial"
    private TextField txtCidadePredioComercial; // Value injected by FXMLLoader

    @FXML // fx:id="txtCidadeVagaEmprego"
    private TextField txtCidadeVagaEmprego; // Value injected by FXMLLoader

    @FXML // fx:id="txtPessoaGenero"
    private TextField txtPessoaGenero; // Value injected by FXMLLoader

    @FXML // fx:id="txtPessoaIdade"
    private TextField txtPessoaIdade; // Value injected by FXMLLoader

    @FXML // fx:id="txtPessoaNome"
    private TextField txtPessoaNome; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert btnAnimalSalvar != null : "fx:id=\"btnAnimalSalvar\" was not injected: check your FXML file 'Doodle.fxml'.";
        assert btnCidadeSalvar != null : "fx:id=\"btnCidadeSalvar\" was not injected: check your FXML file 'Doodle.fxml'.";
        assert btnPessoaSalvar != null : "fx:id=\"btnPessoaSalvar\" was not injected: check your FXML file 'Doodle.fxml'.";
        assert lblAnimalEspecie != null : "fx:id=\"lblAnimalEspecie\" was not injected: check your FXML file 'Doodle.fxml'.";
        assert lblAnimalNPericulosidade != null : "fx:id=\"lblAnimalNPericulosidade\" was not injected: check your FXML file 'Doodle.fxml'.";
        assert lblAnimalNome != null : "fx:id=\"lblAnimalNome\" was not injected: check your FXML file 'Doodle.fxml'.";
        assert lblCidadeNome != null : "fx:id=\"lblCidadeNome\" was not injected: check your FXML file 'Doodle.fxml'.";
        assert lblCidadePredioComercial != null : "fx:id=\"lblCidadePredioComercial\" was not injected: check your FXML file 'Doodle.fxml'.";
        assert lblCidadeVagasEmprego != null : "fx:id=\"lblCidadeVagasEmprego\" was not injected: check your FXML file 'Doodle.fxml'.";
        assert lblPessoaGenero != null : "fx:id=\"lblPessoaGenero\" was not injected: check your FXML file 'Doodle.fxml'.";
        assert lblPessoaIdade != null : "fx:id=\"lblPessoaIdade\" was not injected: check your FXML file 'Doodle.fxml'.";
        assert lblPessoaNome != null : "fx:id=\"lblPessoaNome\" was not injected: check your FXML file 'Doodle.fxml'.";
        assert txtAnimalEspecie != null : "fx:id=\"txtAnimalEspecie\" was not injected: check your FXML file 'Doodle.fxml'.";
        assert txtAnimalNPericulosidade != null : "fx:id=\"txtAnimalNPericulosidade\" was not injected: check your FXML file 'Doodle.fxml'.";
        assert txtAnimalNome != null : "fx:id=\"txtAnimalNome\" was not injected: check your FXML file 'Doodle.fxml'.";
        assert txtCidadeNome != null : "fx:id=\"txtCidadeNome\" was not injected: check your FXML file 'Doodle.fxml'.";
        assert txtCidadePredioComercial != null : "fx:id=\"txtCidadePredioComercial\" was not injected: check your FXML file 'Doodle.fxml'.";
        assert txtCidadeVagaEmprego != null : "fx:id=\"txtCidadeVagaEmprego\" was not injected: check your FXML file 'Doodle.fxml'.";
        assert txtPessoaGenero != null : "fx:id=\"txtPessoaGenero\" was not injected: check your FXML file 'Doodle.fxml'.";
        assert txtPessoaIdade != null : "fx:id=\"txtPessoaIdade\" was not injected: check your FXML file 'Doodle.fxml'.";
        assert txtPessoaNome != null : "fx:id=\"txtPessoaNome\" was not injected: check your FXML file 'Doodle.fxml'.";

    }
    @FXML
    public void cadastrarAnimal(ActionEvent event) {
        Animal animal= new Animal(txtAnimalEspecie.getText(),txtAnimalNome.getText(),Integer.parseInt(txtAnimalNPericulosidade.getText()));
        animal.salvarAnimal();
        txtAnimalEspecie.clear();
        txtAnimalNome.clear();
        txtAnimalNPericulosidade.clear();
    }

    public void cadastrarCidade(ActionEvent event) {
        Cidade cidade= new Cidade(Integer.parseInt(txtCidadeVagaEmprego.getText()), Integer.parseInt(txtCidadePredioComercial.getText()), txtCidadeNome.getText());
        cidade.salvarCidade();
        txtCidadeVagaEmprego.clear();
        txtCidadePredioComercial.clear();
        txtCidadeNome.clear();
    }
    public void cadastrarPessoa(ActionEvent event) {
        Pessoa pessoa= new Pessoa(txtPessoaNome.getText(),Integer.parseInt(txtPessoaIdade.getText()),txtPessoaGenero.getText());
        pessoa.salvarPessoa();
        txtPessoaNome.clear();
        txtPessoaIdade.clear();
        txtPessoaGenero.clear();
    }
}
