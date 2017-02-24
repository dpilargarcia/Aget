/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda;

import Presentacion.Modelo;
import Presentacion.Ventanas.VentanaConferencias;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Pili
 */
public class ControlVentanaConferencias implements ActionListener {

    private VentanaConferencias ventanaConferencias;
    private Modelo modelo;
    int cupos1 = 0;//
    int cupos2 = 35;
    int cupos3 = 60;
    String Cupos1S;
    String Cupos2S;
    String Cupos3S;
    
    public ControlVentanaConferencias(VentanaConferencias aThis){ 
            this.ventanaConferencias = aThis;
    }

    public String getCupos1S() {
        return Cupos1S;
    }

    public int restarCupos1() {
        cupos1=Integer.parseInt((ventanaConferencias.getModelo().consultarCupos("c1").toString()));
        cupos1--;
        Cupos1S =String.valueOf(cupos1);
        ventanaConferencias.getModelo().actualizarCupos("c1", Cupos1S);    
        return cupos1;
    }

    public int restarCupos2() {
        cupos2=Integer.parseInt((ventanaConferencias.getModelo().consultarCupos("c2").toString()));
        cupos2--;
        Cupos2S =String.valueOf(cupos2);
        ventanaConferencias.getModelo().actualizarCupos("c2", Cupos2S);    

        return cupos2;
    }

    public int restarCupos3() {
        cupos3=Integer.parseInt((ventanaConferencias.getModelo().consultarCupos("c3").toString()));
        cupos3--;
        Cupos3S =String.valueOf(cupos3);
        ventanaConferencias.getModelo().actualizarCupos("c3", Cupos3S);    
        return cupos3;
    }

    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == ventanaConferencias.getjButtonInscribete()) {
            String conf = ventanaConferencias.getjComboBoxConferencias().getSelectedItem().toString();            
            if (conf == "Administración de Ingresos y Gastos") {
                ventanaConferencias.getModelo().enviarDatosConferenciasC(ventanaConferencias.getTxtNombre().getText().trim().toUpperCase(), ventanaConferencias.getTxtCedula().getText().trim().toUpperCase(), "c1");
                System.out.println("En el control: " + ventanaConferencias.getTxtNombre().getText().trim().toUpperCase() + "*" + ventanaConferencias.getTxtCedula().getText().trim().toUpperCase() + "*" + "c1");
                ventanaConferencias.getjCupos().setText(String.valueOf(restarCupos1()));
                ventanaConferencias.getTxtNombre().setText(" ");
                ventanaConferencias.getTxtCedula().setText(" ");
            } else if (conf == "Técnicas de Gerencia") {
                ventanaConferencias.getModelo().enviarDatosConferenciasC(ventanaConferencias.getTxtNombre().getText().trim().toUpperCase(), ventanaConferencias.getTxtCedula().getText().trim().toUpperCase(), "c2");
                System.out.println("En el control: " + ventanaConferencias.getTxtNombre().getText().trim().toUpperCase() + "*" + ventanaConferencias.getTxtCedula().getText().trim().toUpperCase() + "*" + "c2");
                ventanaConferencias.getjCupos().setText(String.valueOf(restarCupos2()));
                ventanaConferencias.getTxtNombre().setText(" ");
                ventanaConferencias.getTxtCedula().setText(" ");
            } else if (conf == "Psicología del Ahorro") {
               ventanaConferencias.getModelo().enviarDatosConferenciasC(ventanaConferencias.getTxtNombre().getText().trim().toUpperCase(), ventanaConferencias.getTxtCedula().getText().trim().toUpperCase(), "c3");
                System.out.println("En el control: " + ventanaConferencias.getTxtNombre().getText().trim().toUpperCase() + "*" + ventanaConferencias.getTxtCedula().getText().trim().toUpperCase() + "*" + "c3");
                ventanaConferencias.getjCupos().setText(String.valueOf(restarCupos3()));
                ventanaConferencias.getTxtNombre().setText(" ");
                ventanaConferencias.getTxtCedula().setText(" ");
            }

        } else if (e.getSource() == ventanaConferencias.getjBtnSalir()) {
            ventanaConferencias.getModelo().iniciarAplicacion();
            ventanaConferencias.dispose();
        }
    }

}
