package datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class ProcesosBD {

    private ResultSet rs = null;
    private Statement st = null;
    private Connection conection;
    String cupos1 = "";
    String nombreC="";
    String ingresosC="";
    String nombreCG="";
    String gastosC="";
    String prioridadC="";
    

    public ProcesosBD() {
        try {
            conection = Conexion.getConexion();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Fallo al conectarse a la BD, Contacte con el fabricante.");
            System.out.println("Error en constructor de OperacionesBD.");
            System.out.println("Referencia del error: " + ex.getMessage());
            System.exit(0);
        }
    }

    public void registrarCliente(String id, String nombre, String apellido, String userName, String contrasenia, String correo) {
        String insertar = "INSERT INTO CLIENTES VALUES ('" + id + "','" + nombre + "','" + apellido + "','" + userName + "','" + contrasenia + "','" + correo + "')";
        System.out.println("Cliente Registrado: " + insertar);
        try {
            st = conection.createStatement();
            st.executeUpdate(insertar);
            JOptionPane.showMessageDialog(null, "Cliente Registrado.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo registrar el cliente.");

            System.out.println("Error en insertar Datos");
            System.out.println("Referencia del error: " + ex.getMessage());
        }
    }

    public void EliminarCliente(int id) {
        String delete = "DELETE FROM CLIENTE WHERE ID='" + id + "'";
        try {
            st = conection.createStatement();
            st.execute(delete);
            JOptionPane.showMessageDialog(null, "Cliente Eliminado.");
        } catch (SQLException ex) {
            System.out.println("Error en la cancelacion de la Reserva");
            System.out.println("Referencia del error: " + ex.getMessage());
        }
    }

    public String buscarCliente(String id, String nombreUsuario, String contrasenia) {
        System.out.println("llega a la bd " + " " + nombreUsuario + " " + id + " " + contrasenia);
        String resultado = " ";
        String consulta = "SELECT ID, USERNAME, CONTRASENIA FROM CLIENTES WHERE ID='" + id + "'";
        //System.out.println("ID "+consulta+id);  
        try {
            st = conection.createStatement();
            rs = st.executeQuery(consulta);
            while (rs.next()) {
                System.out.println(rs.getString("CONTRASENIA"));
                resultado = rs.getString("USERNAME") + "-" + rs.getString("ID");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la busqueda, los datos no son validos");
            System.out.println("Error en la busqueda ");
            System.out.println("Referencia del error: " + ex.getMessage());
        }
        return resultado;
    }

    public void cerrarConexion() {
        try {
            conection.close();
        } catch (SQLException ex) {
            System.out.println("Error en cerrar Conexión en OperacionesBD.");
            System.out.println("Referencia del error: " + ex.getMessage());
        }
    }

    public void registrarGastos(String nombre, int valor, int prioridad, String id) {

        String insertar = "INSERT INTO GASTOS VALUES ('" + nombre + "','" + valor + "','" + prioridad + "','" + id + "')";
        System.out.println("gasto Registrado: " + insertar);
        try {
            st = conection.createStatement();
            st.executeUpdate(insertar);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo registrar su gasto.");

            System.out.println("Error en insertar Datos");
            System.out.println("Referencia del error: " + ex.getMessage());
        }
    }

    public void registrarIngresos(String valor, String id) {

        String insertar = "INSERT INTO INGRESOS VALUES ('" + valor + "', '" + id + "')";
        System.out.println("Ingreso Registrado: " + insertar);
        try {
            st = conection.createStatement();
            st.executeUpdate(insertar);
            JOptionPane.showMessageDialog(null, "Sus ingresos han sido registrados.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo registrar su ingreso.");

            System.out.println("Error en insertar Datos");
            System.out.println("Referencia del error: " + ex.getMessage());
        }
    }

    public void registrarConferencia(String conferencia, String nombre, String cedula) {
        String insertar = "INSERT INTO CONFERENCIAS VALUES ('" + conferencia + "','" + nombre + "','" + cedula + "')";
        System.out.println("Conferencia Registrada: " + insertar);
        try {
            st = conection.createStatement();
            st.executeUpdate(insertar);
            JOptionPane.showMessageDialog(null, "Te has inscrito en la conferencia " + conferencia);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo inscribir el cliente en la conferencia.");

            System.out.println("Error en insertar Datos");
            System.out.println("Referencia del error: " + ex.getMessage());
        }
    }

    public void inscribirClienteConf(String nombre, String cedula, String conferencia) {
        String insertar = "INSERT INTO CLIENTES_CONFERENCIAS VALUES ('" + nombre + "','" + cedula + "','" + conferencia + "')";
        System.out.println("Conferencia Registrada: " + insertar);
        try {
            st = conection.createStatement();
            st.executeUpdate(insertar);
            JOptionPane.showMessageDialog(null, "Te has inscrito en la conferencia " + conferencia);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo inscribir al cliente en la conferencia.");

            System.out.println("Error en insertar Datos");
            System.out.println("Referencia del error: " + ex.getMessage());
        }
    }

    public String consultarCuposConf(String id) {

        String cuposC = "SELECT DISTINCT CUPOS FROM CLIENTES_CONFERENCIAS C, CUPOS_CONFERENCIAS D WHERE D.ID_CONFERENCIA ='" + id + "'";

        try {
            st = conection.createStatement();
            rs = st.executeQuery(cuposC);
            rs.next();
            cupos1 = rs.getString("CUPOS");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        System.out.println("Cupos: " + cuposC);
        System.out.println("Cupos NÚMERO: " + cupos1);

        return cupos1;
    }

    public void registrarTerapia(String nombre, String cedula, String especialidad, String fecha, String hora, String terapeuta) {
        String insertar = "INSERT INTO TERAPIAS VALUES ('" + nombre + "','" + cedula + "','" + especialidad + "','" + fecha + "','" + hora + "','" + terapeuta + "')";
        System.out.println("Conferencia Registrada: " + insertar);
        try {
            st = conection.createStatement();
            st.executeUpdate(insertar);
            JOptionPane.showMessageDialog(null, "Tu cita ha sido asignada para la especialidad: " + especialidad);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo inscribir la asignación.");

            System.out.println("Error en insertar Datos");
            System.out.println("Referencia del error: " + ex.getMessage());
        }
    }

    public boolean validarAcceso(String id, String usuario, String contrasenia) {
        boolean usuarioEncontrado = false;
        String ultimaPeticion = "SELECT ID,USERNAME,CONTRASENIA FROM CLIENTES where ID ='" + id + "'" + " AND USERNAME ='" + usuario + "'" + " AND CONTRASENIA ='" + contrasenia + "'";
        try {
            st = conection.createStatement();
            rs = st.executeQuery(ultimaPeticion);
            if (rs.next()) {
                usuarioEncontrado = true;
            } else {
                usuarioEncontrado = false;

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return usuarioEncontrado;
    }

    public String actualizarCupos(String id, String cupos) {

        String insertar = "UPDATE CUPOS_CONFERENCIAS SET CUPOS= '" + cupos + "'WHERE ID_CONFERENCIA='" + id + "'";
        System.out.println("cupo actualizado: " + insertar);
        try {
            st = conection.createStatement();
            st.executeUpdate(insertar);
            JOptionPane.showMessageDialog(null, "Cupo Actualizado.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar el campo.");

            System.out.println("Error en insertar Datos");
            System.out.println("Referencia del error: " + ex.getMessage());
        }
        return insertar;
    }

    public String consultarIngresos(String id) {

        String ingresos = "SELECT I.VALOR INGRESOS FROM CLIENTES C, INGRESOS I WHERE C.ID='"+"1023"+"'";

        try {
            st = conection.createStatement();
            rs = st.executeQuery(ingresos);
            rs.next();
            //nombreC = rs.getString("NOMBRE").trim();
            ingresosC = rs.getString("I.VALOR").trim();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        //System.out.println("ingresos: " + nombreC);
        System.out.println("ingresos: " + ingresosC);

        return ingresosC;
    }
    public String consultarGastos(String id) {

        String ingresos = "SELECT C.NOMBRE CLIENTE, G.NOMBRE GASTOS, G.VALOR V_GASTOS, G.PRIORIDAD, G.ID_CLIENTE FROM CLIENTES C, GASTOS G WHERE C.ID = '1023'";

        try {
            st = conection.createStatement();
            rs = st.executeQuery(ingresos);
            rs.next();
            nombreCG = rs.getString("C.NOMBRE").trim();
            gastosC = rs.getString("G.NOMBRE").trim();
            prioridadC = rs.getString("G.PRIORIDAD").trim();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        System.out.println("nombre cliente: " + nombreCG);
        System.out.println("ingresos cliente: " + gastosC);
        System.out.println("prioridad cliente: " + prioridadC);
        return (nombreCG+ ""+ gastosC+""+prioridadC);
    }    
    
}
