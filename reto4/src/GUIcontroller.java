import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class GUIcontroller {

    @FXML
    private TextField nombre;

    @FXML
    private TextField genero;

    @FXML
    private TextField materia;

    @FXML
    private TextField nota;

    @FXML
    private Button guardar;

    @FXML
    private TextArea textAreaCE;

    @FXML
    private TextArea inputDatosCargado;

    @FXML
    private TextArea outputResultado;

    @FXML
    private Button cargar;

    @FXML
    private Button procesar;

    @FXML
    private TextField CEnombre;

    @FXML
    private TextField CEmateria;

    @FXML
    private Button consultar;

    @FXML
    private Button eliminar;

    @FXML
    public void initialize(){
        ConexionDatabase.Open();
    }

    @FXML
    void actionCargar(ActionEvent event) {

    }

    @FXML
    void actionConsultar(ActionEvent event) {

    }

    @FXML
    void actionEliminar(ActionEvent event) {

    }

    @FXML
    void actionGuardar(ActionEvent event) {
        // hey bro here
    }

    @FXML
    void actionProcesar(ActionEvent event) {

    }

}

