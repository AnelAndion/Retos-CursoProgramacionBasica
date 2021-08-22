import java.sql.PreparedStatement;
import java.sql.SQLException;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Guardar {

    private static String Sql;
    
    public static void Guardar(Double nombre, Double materia, Double nota , Double genero){

       Sql = "INSERT INTO infoEstudiante (Nombre,Genero,Materia,Notas)";
       Sql+= "Values(?,?,?,?)";

       PreparedStatement sentencia = ConexionDatabase.prepararConsulta(Sql);

       try {
           sentencia.setDouble(1, nombre);
           sentencia.setDouble(2, genero);
           sentencia.setDouble(3, materia);
           sentencia.setDouble(4, nota);
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
