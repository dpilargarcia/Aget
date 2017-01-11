/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

/**
 *
 * @author Familia prieto
 */
import Agenda.ControlVentanaConferencias;
import Presentacion.Ventanas.VentanaConferencias;
import Presentacion.Ventanas.ventanaGastosAutomaticos;
import Presentacion.Ventanas.ventanaIngreso;
import Presentacion.Ventanas.VentanaLessPay;
import Presentacion.Ventanas.ventanaRegistro;
import Presentacion.Ventanas.VentanaPlan;
import Presentacion.Ventanas.VentanaTerapias;
import datos.PlanLessPay;
import datos.ProcesosBD;
import javax.swing.JOptionPane;

public class Modelo {

    private VentanaPrincipal vtnPrincipal;
    private ventanaRegistro vtnRegistro;
    private ventanaIngreso vtnIngreso;
    private VentanaLessPay vtnLessPay;
    private VentanaConferencias vtnConferencias;
    private VentanaTerapias vtnTerapias;
    private ProcesosBD bd;
    private ventanaGastosAutomaticos vtnGastosAutomaticos;
    private VentanaPlan vtnPlan;
    private int prioridad;
    private ControlVentanaConferencias ctrlVtnConferencias;
    private PlanLessPay plan;

    public VentanaPrincipal getVtnPrincipal() {
        if (vtnPrincipal == null) {
            vtnPrincipal = new VentanaPrincipal(this);
        }
        return vtnPrincipal;
    }

    public ProcesosBD getBd() {
        return bd;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public ControlVentanaConferencias getCtrlVtnConferencias() {
        return ctrlVtnConferencias;
    }

    public VentanaPlan getVtnPlan() {
        if (vtnPlan == null) {
            vtnPlan = new VentanaPlan(this);
            return vtnPlan;
        } else {
            return vtnPlan;
        }
    }

    public VentanaConferencias getVtnConferencias() {
        if (vtnConferencias == null) {
            vtnConferencias = new VentanaConferencias(this);
            return vtnConferencias;
        } else {
            return vtnConferencias;
        }
    }

    public PlanLessPay getPlan() {
        if(plan==null){
            this.plan= new PlanLessPay();
        }
        return plan;
    }
    

    public VentanaTerapias getVtnTerapias() {
        if (vtnTerapias == null) {
            vtnTerapias = new VentanaTerapias(this);
            return vtnTerapias;
        } else {
            return vtnTerapias;
        }
    }

    public ProcesosBD getProcesosBd() {
        System.out.println("inicio");
        if (bd == null) {
            bd = new ProcesosBD();
        }
        return bd;
    }

    public ventanaRegistro getVtnRegistro() {
        if (vtnRegistro == null) {
            vtnRegistro = new ventanaRegistro(this);
            return vtnRegistro;
        } else {
            return vtnRegistro;
        }
    }

    public ventanaIngreso getVtnIngreso() {
        if (vtnIngreso == null) {
            vtnIngreso = new ventanaIngreso(this);
            return vtnIngreso;
        } else {
            return vtnIngreso;
        }
    }

    public VentanaLessPay getVtnLessPay() {
        if (vtnLessPay == null) {
            vtnLessPay = new VentanaLessPay(this);
            return vtnLessPay;
        } else {
            return vtnLessPay;
        }
    }

    public ventanaGastosAutomaticos getVtnGastosAutomaticos() {
        if (vtnGastosAutomaticos == null) {
            vtnGastosAutomaticos = new ventanaGastosAutomaticos(this);
            return vtnGastosAutomaticos;
        } else {
            return vtnGastosAutomaticos;
        }
    }

    public void Terminar() {
        System.exit(0);
    }

    public void iniciarAplicacion() {
        getVtnPrincipal().setVisible(true);
    }

    public void abrirVentanaRegistro() {
        getVtnPrincipal().dispose();
        getVtnRegistro();
        getVtnRegistro().setVisible(true);
    }

    public void abrirVentanaGastosAutomaticos() {
        getVtnLessPay().dispose();
        getVtnGastosAutomaticos();
        getVtnGastosAutomaticos().setVisible(true);
    }

    public void abrirVentanaIngreso() {
        getVtnPrincipal().dispose();
        getVtnIngreso();
        getVtnIngreso().setVisible(true);
    }

    public void enviarDatosRegistro(String id, String nombre, String apellido, String NUsuario, String contrasenia, String correo) {
        System.out.println("llego" + id);
        getProcesosBd().registrarCliente(id, nombre, apellido, NUsuario, contrasenia, correo);
        System.out.println("enviar en el modelo" + id + nombre + apellido + NUsuario + contrasenia + correo);
    }

    public void enviarDatosConferencias(String conferencia, String nombre, String cedula) {
        System.out.println("llego: " + conferencia + " - " + nombre + " - " + cedula);
        getProcesosBd().registrarConferencia(conferencia, nombre, cedula);
        System.out.println("enviar en el modelo" + conferencia + nombre + cedula);
    }

    public void enviarDatosConferenciasC(String nombre, String cedula, String conferencia) {
        System.out.println("llego: " + conferencia + " - " + nombre + " - " + cedula);
        getProcesosBd().inscribirClienteConf(nombre, cedula, conferencia);
        System.out.println("enviar en el modelo" + conferencia + nombre + cedula);
    }

    public void enviarDatosTerapias(String nombre, String cedula, String especialidad, String fecha, String hora, String terapeuta) {
        System.out.println("llego: " + nombre + " - " + cedula + " - " + especialidad);
        getProcesosBd().registrarTerapia(nombre, cedula, especialidad, fecha, hora, terapeuta);
        System.out.println("enviar en el modelo" + especialidad + nombre + cedula);
    }

    public void enviarDatosGastos(String nombre, int valor, int prioridad, String id) {
        System.out.println("llego a enviar los valores " + nombre + " " + valor + " " + prioridad);
        if (nombre == "Arriendo" || nombre == "Servicios" || nombre == "Mercado") {
            prioridad = 1;
            getProcesosBd().registrarGastos(nombre, valor, prioridad, id);
            System.out.println("para cal" + nombre + valor + prioridad);
        } else if (nombre == "Transporte" || nombre == "Educación") {
            prioridad = 2;
            getProcesosBd().registrarGastos(nombre, valor, prioridad, id);
            System.out.println("para cal" + nombre + valor + prioridad);
        } else if (nombre == "Deudas") {
            prioridad = 3;
            getProcesosBd().registrarGastos(nombre, valor, prioridad, id);
            System.out.println("para cal" + nombre + valor + prioridad);
        } else if (nombre == "Ahorro") {
            prioridad = 4;
            getProcesosBd().registrarGastos(nombre, valor, prioridad, id);
            System.out.println("para cal" + nombre + valor + prioridad);
        } else if (nombre == "Lujos") {
            prioridad = 5;
            getProcesosBd().registrarGastos(nombre, valor, prioridad, id);
            System.out.println("para cal" + nombre + valor + prioridad);
        }

    }

    public void enviarDatosIngresos(String valor, String id) {
        System.out.println("llego" + valor);
        getProcesosBd().registrarIngresos(valor, id);
        System.out.println("enviar en el modelo" + valor);
    }

    public void buscarCliente(String id, String nombreUsuario, String contrasenia) {
        System.out.println("Estoy en buscar cliente" + id + nombreUsuario + contrasenia);
        getProcesosBd().buscarCliente(id, nombreUsuario, contrasenia);

    }

    public void abrirVentanaGastos() {
        getVtnLessPay().dispose();
        getVtnGastosAutomaticos();
        getVtnGastosAutomaticos().setVisible(true);
    }

    public void abrirVentanaPlan() {
        getVtnGastosAutomaticos().dispose();
        getVtnPlan();
        getVtnPlan().setVisible(true);
    }

    public void abrirVentanaLessPay() {
        getVtnPrincipal().dispose();
        getVtnLessPay();
        getVtnLessPay().setVisible(true);
    }

    public void LimpiarLessPay() {
        vtnLessPay.getTxtValor().setText("");
    }

    public void abrirVentanaConferencias() {
        getVtnConferencias().dispose();
        getVtnConferencias();
        getVtnConferencias().setVisible(true);
    }

    public void abrirVentanaTerapias() {
        getVtnTerapias().dispose();
        getVtnTerapias();
        getVtnTerapias().setVisible(true);
    }

    public boolean validarAcceso(String id, String usuario, String contrasenia) {
        return getProcesosBd().validarAcceso(id, usuario, contrasenia);
    }

    public String consultarCupos(String id) {
        return getProcesosBd().consultarCuposConf(id);
    }

    public String actualizarCupos(String id, String cupos) {
        return getProcesosBd().actualizarCupos(id, cupos);
    }

    public String consultarIngresos(String id) {
        return getProcesosBd().consultarIngresos(id);
    }

    public String consultarGastos(String id) {
        return getProcesosBd().consultarGastos(id);
    }
}
