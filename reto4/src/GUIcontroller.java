import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

import java.sql.ResultSet;


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
    private TextField tamano;

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
    void actionCargar(ActionEvent event) throws Exception{

        String sql = "Select count(id) From infoEstudiante";
        PreparedStatement sentencia = ConexionDatabase.prepararConsulta(sql);
        ResultSet re = ConexionDatabase.consultaSelect(sentencia);
        
        String sql2 ="Select * From infoEstudiante";
        PreparedStatement sentencia2 = ConexionDatabase.prepararConsulta(sql2);
        ResultSet re2 = ConexionDatabase.consultaSelect(sentencia2);

        tamano.setText(Integer.toString(re.getInt(1)));

        try{
            inputDatosCargado.setText("");
            inputDatosCargado.getText();
            while(re2.next()){
                inputDatosCargado.appendText(re2.getDouble("Nombre")+" "+re2.getDouble("Genero")+" "+re2.getDouble("Materia")+" "+re2.getDouble("Notas")+"\n");
            }
        }catch (SQLException e){
            System.out.println("Error "+e.getMessage());
        }

    }

    @FXML
    void actionConsultar(ActionEvent event) {

    }

    @FXML
    void actionEliminar(ActionEvent event) {

    }

    @FXML
    void actionGuardar(ActionEvent event) {
        Guardar g = new Guardar();
        String nb , mt , nt , gr;
        Double a1, a2, a3;

        nb = nombre.getText();
        mt = materia.getText();
        nt = nota.getText();
        gr = genero.getText();

        a1 = g.name(nb);
        a2 = g.subject(mt);
        a3 = g.gener(gr);

        if(a1 != 0.5 && a2 != 0.6 && a3 != 0.7){
            g.G(nb,mt,nt,gr);
        }else{
            Alert alerta = new Alert(AlertType.INFORMATION);
            alerta.setContentText("Alguno de los datos Estudiante esta equivocado"); 
            alerta.show();
        }

    }

    @FXML
    void actionProcesar(ActionEvent event){
    
        input entrada = new input();
        // envio el numero de registros
        if(inputDatosCargado.getText().isEmpty()){
            Alert alerta = new Alert(AlertType.INFORMATION);
            alerta.setContentText("Por favor carge el campo de la isquierda"); 
            alerta.show();
        }else{
            
            entrada.loadData(Integer.parseInt(tamano.getText()), inputDatosCargado.getText());
            outputResultado.setText(entrada.stat1() + "\n" + entrada.stat2() + "\n" + entrada.stat3() + "\n" + entrada.stat4());
        }
    }

}

