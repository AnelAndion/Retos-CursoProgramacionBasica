import java.sql.PreparedStatement;
import java.sql.SQLException;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Guardar {

    private String Sql; 

    
    public void G(String nombre, String materia, String nota , String genero){

        Sql = "INSERT INTO infoEstudiante (Nombre,Genero,Materia,Notas)";
        Sql+= "Values(?,?,?,?)";

        PreparedStatement sentencia = ConexionDatabase.prepararConsulta(Sql);
        try {
            
            sentencia.setString(1, nombre);
            sentencia.setString(2, genero);
            sentencia.setString(3, materia);
            sentencia.setDouble(4, Double.parseDouble(nota));

            int nreg = ConexionDatabase.ejecutarConsulta(sentencia);
            if (nreg > 0){
                Alert alerta = new Alert(AlertType.INFORMATION);
                alerta.setContentText(" Se insertaron Registros correctamente"); 
                alerta.show();
            }

        } catch (SQLException e) {
            System.out.println("error "+ e.getMessage());
        }
    }

}
