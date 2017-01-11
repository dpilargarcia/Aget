/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Controladores;

import Presentacion.Modelo;
import Presentacion.Ventanas.ventanaGastosAutomaticos;
import datos.ProcesosBD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Asus
 */
public class controlVentanaGastosAutomaticos implements ActionListener {

    private ventanaGastosAutomaticos vtnGastosAutomaticos;
    private int prioridad = 1;

    private ProcesosBD bd;
    private Modelo modelo;
    private int ingresos;
    private int arriendo;
    private int servicios;
    private int mercado;
    private int transporte;
    private int educacion;
    private int deudas;
    private int lujos;
    private int ahorro;
    private String a, s, m, e, d, l, ah, t;

    public ProcesosBD getBd() {
        return bd;
    }

    public Modelo getModelo() {
        if (modelo == null) {
            this.modelo = new Modelo();
        }
        return modelo;
    }

    public int getIngresos() {
        return ingresos;
    }

    public int getArriendo() {
        return arriendo;
    }

    public int getServicios() {
        return servicios;
    }

    public int getMercado() {
        return mercado;
    }

    public int getTransporte() {
        return transporte;
    }

    public int getEducacion() {
        return educacion;
    }

    public int getDeudas() {
        return deudas;
    }

    public int getLujos() {
        return lujos;
    }

    public int getAhorro() {
        return ahorro;
    }

    public controlVentanaGastosAutomaticos(ventanaGastosAutomaticos aThis) {
        this.vtnGastosAutomaticos = aThis;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == vtnGastosAutomaticos.getBtnGenerarPlan()) {
            vtnGastosAutomaticos.getModelo().enviarDatosGastos(vtnGastosAutomaticos.getLblArriendo().getText(), Integer.parseInt(vtnGastosAutomaticos.getTxtV1().getText().trim().toUpperCase()), prioridad, vtnGastosAutomaticos.getModelo().getVtnIngreso().getTxtId().getText());
            vtnGastosAutomaticos.getModelo().enviarDatosGastos(vtnGastosAutomaticos.getLblServicios().getText(), Integer.parseInt(vtnGastosAutomaticos.getTxtV2().getText().trim().toUpperCase()), prioridad, vtnGastosAutomaticos.getModelo().getVtnIngreso().getTxtId().getText());
            vtnGastosAutomaticos.getModelo().enviarDatosGastos(vtnGastosAutomaticos.getLblMercado().getText(), Integer.parseInt(vtnGastosAutomaticos.getTxtV3().getText().trim().toUpperCase()), prioridad, vtnGastosAutomaticos.getModelo().getVtnIngreso().getTxtId().getText());
            vtnGastosAutomaticos.getModelo().enviarDatosGastos(vtnGastosAutomaticos.getLblTransporte().getText(), Integer.parseInt(vtnGastosAutomaticos.getTxtV4().getText().trim().toUpperCase()), prioridad, vtnGastosAutomaticos.getModelo().getVtnIngreso().getTxtId().getText());
            vtnGastosAutomaticos.getModelo().enviarDatosGastos(vtnGastosAutomaticos.getLblEducacion().getText(), Integer.parseInt(vtnGastosAutomaticos.getTxtV5().getText().trim().toUpperCase()), prioridad, vtnGastosAutomaticos.getModelo().getVtnIngreso().getTxtId().getText());
            vtnGastosAutomaticos.getModelo().enviarDatosGastos(vtnGastosAutomaticos.getLblDeudas().getText(), Integer.parseInt(vtnGastosAutomaticos.getTxtV6().getText().trim().toUpperCase()), prioridad, vtnGastosAutomaticos.getModelo().getVtnIngreso().getTxtId().getText());

            calcularPlan();
            mostraPlan();
            vtnGastosAutomaticos.getModelo().abrirVentanaPlan();
        }else if(ae.getSource() == vtnGastosAutomaticos.getBtnAget()){
            vtnGastosAutomaticos.getModelo().iniciarAplicacion();
            vtnGastosAutomaticos.dispose();
        }else if(ae.getSource() == vtnGastosAutomaticos.getBtnSalir()){
            vtnGastosAutomaticos.getModelo().abrirVentanaLessPay();
            vtnGastosAutomaticos.dispose();
        }
    }

    public void calcularPlan() {
        ingresos = Integer.parseInt(vtnGastosAutomaticos.getModelo().getVtnLessPay().getTxtValor().getText());

        arriendo = Integer.parseInt(vtnGastosAutomaticos.getTxtV1().getText());
        servicios = Integer.parseInt(vtnGastosAutomaticos.getTxtV2().getText());
        mercado = Integer.parseInt(vtnGastosAutomaticos.getTxtV3().getText());
        educacion = Integer.parseInt(vtnGastosAutomaticos.getTxtV4().getText());
        transporte = Integer.parseInt(vtnGastosAutomaticos.getTxtV5().getText());
        deudas = Integer.parseInt(vtnGastosAutomaticos.getTxtV6().getText());

        if (ingresos >= arriendo) {
            ingresos = ingresos - arriendo;
            a = "Arriendo tiene prioridad 1. El valor del arriendo es: " + String.valueOf(arriendo)+ "\n";
            if (ingresos >= servicios) {
                ingresos = ingresos - servicios;
                s = "Servicios tiene prioridad 1. El valor de los servicios es: " + String.valueOf(servicios)+ "\n";
                if (ingresos >= mercado) {
                    ingresos = ingresos - mercado;
                    m = "Mercado tiene prioridad 1. El valor del mercado es: " + String.valueOf(mercado)+ "\n";
                    if (ingresos >= educacion) {
                        ingresos = ingresos - educacion;
                        e = "Educación tiene prioridad 2. El valor de la educación es: " + String.valueOf(educacion)+ "\n";
                        if (ingresos > transporte) {
                            ingresos = ingresos - transporte;
                            t = "Transporte tiene prioridad 2. El valor del transporte es: " + String.valueOf(transporte)+ "\n";
                            if (ingresos > deudas) {
                                ingresos = ingresos - deudas;
                                d = "Deudastiene prioridad 3. El valor de las deudas  es: " + String.valueOf(deudas) + "\n";
                                if (ingresos > 0) {
                                    ahorro = ingresos / 2;
                                    lujos = ingresos / 2;
                                    ah = "Este mes puedes ahorar: " + String.valueOf(ahorro)+ "\n";
                                    l = "Este mes puedes darte el LUJO de gastarte : " + String.valueOf(lujos) + " ¡en lo que quieras! ;)" + "\n";
                                } else {
                                    d = "Puedes pagar todos tus gastos así\n"
                                            + "Arriendo: " + String.valueOf(arriendo) + "\n"
                                            + "Servicios: " + String.valueOf(servicios) + "\n"
                                            + "Mercado: " + String.valueOf(mercado) + "\n"
                                            + "Transporte: " + String.valueOf(transporte) + "\n"
                                            + "Educación: " + String.valueOf(educacion) + "\n"
                                            + "Deudas: " + String.valueOf(deudas) + "\n";
                                }
                            } else {
                                d = "Este mes tus ingresos cubren el valor del arriendo: " + String.valueOf(arriendo)
                                        + " los servicios: " + String.valueOf(servicios) + " el mercado: " + String.valueOf(mercado)
                                        + " eduación: " + String.valueOf(educacion) + " y transporte: " + String.valueOf(transporte)+ "\n";
                            }
                        } else {
                            t = "Este mes tus ingresos cubren el valor del arriendo: " + String.valueOf(arriendo)
                                    + " los servicios: " + String.valueOf(servicios) + " el mercado: " + String.valueOf(mercado)
                                    + " y eduación: " + String.valueOf(educacion)+ "\n";
                        }

                    } else {
                        e = "Este mes tus ingresos cubren el valor del arriendo: " + String.valueOf(arriendo)
                                + " los servicios: " + String.valueOf(servicios) + " y el mercado: " + String.valueOf(mercado)+ "\n";
                    }
                } else {
                    m = "Este mes tus ingresos cubren el valor del arriendo: " + String.valueOf(arriendo)
                            + " y los servicios: " + String.valueOf(servicios)+ "\n";
                }
            } else {
                s = "Este mes tus ingresos sólo cubren el valor del arriendo: " + String.valueOf(arriendo) + "\n";
            }
        } else {
            a = "Este mes tus ingresos no cubren ningún gasto :'( \n";
        }
        System.out.println(a + "-" + s + "-" + m + "-" + e + "-" + t + "-" + d + "-" + ah + "-" + l);
    }

    public void mostraPlan() {
        vtnGastosAutomaticos.getModelo().getVtnPlan().getTxtPlan1().setText(a);
        vtnGastosAutomaticos.getModelo().getVtnPlan().getTxtPlan2().setText(s);
        vtnGastosAutomaticos.getModelo().getVtnPlan().getTxtPlan3().setText(m);
        vtnGastosAutomaticos.getModelo().getVtnPlan().getTxtPlan4().setText(t);
        vtnGastosAutomaticos.getModelo().getVtnPlan().getTxtPlan5().setText(e);
        vtnGastosAutomaticos.getModelo().getVtnPlan().getTxtPlan6().setText(d);
        vtnGastosAutomaticos.getModelo().getVtnPlan().getTxtPlan7().setText(ah);
        vtnGastosAutomaticos.getModelo().getVtnPlan().getTxtPlan8().setText(l);
    }
}
