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
            
            sentencia.setDouble(1, name(nombre));
            sentencia.setDouble(2, gener(genero));
            sentencia.setDouble(3, subject(materia));
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

    public Double name(String n){
        if(n.equals("armando")){
            return 1.0;
        }else if(n.equals("nicolas")){
            return 2.0;
        }else if(n.equals("daniel")){
            return 3.0;
        }else if(n.equals("maria")){
            return 4.0;
        }else if(n.equals("marcela")){
            return 5.0;
        }else if(n.equals("alexandra")){
            return 6.0;
        }else if(n.equals("literatura")){
            return 1.0;
        }
        return 0.5;
    }

    public Double subject(String n){
        if(n.equals("literatura")){
            return 1.0;
        }else if(n.equals("biologia")){
            return 2.0;
        }else if(n.equals("geografia")){
            return 3.0;
        }
        return 0.6;
    }

    public Double gener(String n){
        if(n.equals("m")){
            return 0.0;
        }else if(n.equals("f")){
            return 1.0;
        }
        return 0.7;
    }
}
