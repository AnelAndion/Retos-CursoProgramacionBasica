import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.jar.Attributes.Name;

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

    //---------- Inicializar conección
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

        Double nb , mt , nt , gr;

        nb = Double.parseDouble(nombre.getText());
        mt = Double.parseDouble(materia.getText());
        nt = Double.parseDouble(nota.getText());
        gr = Double.parseDouble(genero.getText());

        Guardar.Guardar(nb,mt,nt,gr);

    }

    @FXML
    void actionProcesar(ActionEvent event) {

    }

}

