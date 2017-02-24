/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Controladores;

import Presentacion.Ventanas.ventanaIngreso;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class controlVentanaIngreso implements ActionListener {

    private ventanaIngreso vtnIngreso;

    public controlVentanaIngreso(ventanaIngreso aThis) {
        this.vtnIngreso = aThis;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        boolean c = false;
        if (ae.getSource() == vtnIngreso.getBtnAceptar()) {
            if (vtnIngreso.getTxtId().getText().equals(" ") || vtnIngreso.getTxtContrasenia().getText().equals(" ") || vtnIngreso.getTxtUsuario().getText().equals(" ")) {
                JOptionPane.showMessageDialog(vtnIngreso, "Por favor ingrese todos sus datos");
            } else {
                c = vtnIngreso.getModelo().validarAcceso(vtnIngreso.getTxtId().getText().trim().toUpperCase(), vtnIngreso.getTxtUsuario().getText().trim().toUpperCase(), vtnIngreso.getTxtContrasenia().getText().trim().toUpperCase());
                if (c == true) {
                    vtnIngreso.getModelo().iniciarAplicacion();
                    vtnIngreso.getModelo().getVtnPrincipal().getBtnConferencias().setVisible(true);
                    vtnIngreso.getModelo().getVtnPrincipal().getBtnTerapias().setVisible(true);
                    vtnIngreso.getModelo().getVtnPrincipal().getBtnLessPay().setVisible(true);
                    vtnIngreso.dispose();
                }else if(c==false){
                    JOptionPane.showMessageDialog(vtnIngreso, "El usuario ingresado no existe");
                }
            }
        } else if (ae.getSource() == vtnIngreso.getBtnSalir()) {
            vtnIngreso.getModelo().iniciarAplicacion();
            vtnIngreso.dispose();
        } else if (ae.getSource() == vtnIngreso.getBtnRegistrarse()) {
            vtnIngreso.getModelo().abrirVentanaRegistro();
            vtnIngreso.dispose();
        }

    }

}
