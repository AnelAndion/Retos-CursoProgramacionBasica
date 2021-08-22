import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexionDatabase {

public static String url; //ubicacin del ODBC
public static String database; //Nombre d ela Base de datos
public static Statement stmt; //variable para crear la conexion
public static  Connection conexion=null;

//--- Para abriri la conexion a la BD-----------
public static void Open() {
        try {
            //url = "jdbc:sqlite:C:/SQlite3/BD/almacen.db";
            url = "jdbc:sqlite:/home/nelll/Desktop/Anel/CoursesMinintic/ProgramacionBasica/retos/reto4/db/School.db";
            conexion = DriverManager.getConnection(url);
            stmt = conexion.createStatement();
            System.out.println("Conexion ok.");
        } catch (SQLException e) {
            System.out.println("Error: "+e.getMessage());
        } 
       
    }//end Opend


//--- Para la consulta-----------
public static PreparedStatement prepararConsulta(String sql) {
    PreparedStatement stm=null;
    try {
     stm=conexion.prepareStatement(sql);
        
    } catch (SQLException e) {
        System.out.println("Error: "+e.getMessage());
    } 
    return stm;
   
}//end Opend

//---- ejecutar Consultas con parametros tipo -Insert, Update,Delete 
public static int ejecutarConsulta(PreparedStatement sentencia)
{
    int nReg=0;
    try {
        nReg = sentencia.executeUpdate();//ejecuta la sentencia y retorna el numero de reg afectados
    } catch (SQLException e) {
        System.err.println("Error generado: "+e.getMessage());
    }

    return nReg;
}
//======== para ejecutar consultas de tipo Select=========
public static ResultSet consultaSelect(PreparedStatement sentencia)
{
    try {
        ResultSet cursor = sentencia.executeQuery();
        return cursor;
    }
    // Si se presenta Un Error
    catch(SQLException exc)
    {
      System.err.println("Error generado: "+exc.getMessage());
      return null;
    } 
}
//---------- metdos viejos--------------------------------------------------------- 

//======== para ejecutar consultas de tipo Select=========
    public static ResultSet Query(String SQLquery)
    {
      try {
         ResultSet cursor = stmt.executeQuery(SQLquery);
          return cursor;
     }
     // Si se presenta Un Error
     catch(SQLException exc)
     {
       System.err.println("Error generado: "+exc.getMessage());
       return null;
     }
    }


//------Para consultas de tipo INSERT, DELETE Y UPDATE-------
public static boolean Execute(String registro)
{
   boolean ok = true;
    try
    {
        stmt.executeUpdate(registro);
    }catch(SQLException exc)
        {
            System.err.println(exc.getMessage());
            ok= false;
        }
    return ok;
    } // end execute
}//EndClass
