
package datos;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author USUARIO
 */
public class Conexion {
    
    private static Connection cn = null;
    private static final Driver dr = new org.apache.derby.jdbc.ClientDriver();
    private static String dirBD = "jdbc:derby://localhost:1527/Aget";
    private static String usuario = "Aget";
    private static String contraseña = "123456";
    

    public static Connection getConexion() throws SQLException {
        //Se registra el driver para la conexion.
        DriverManager.registerDriver(dr);
        /*Usando el driver, se establece la conexion.. si la conexion falla
        lanza una SQL Exception*/
        cn = DriverManager.getConnection(dirBD, usuario, contraseña);
        //Regresa la conexion 
        return cn;
    }
    
}

