/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Controladores;

import Presentacion.Ventanas.ventanaRegistro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class controlVentanaRegistro implements ActionListener {

    private ventanaRegistro vtnRegistro;

    public controlVentanaRegistro(ventanaRegistro aThis) {
        this.vtnRegistro = aThis;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == vtnRegistro.getBtnAceptar()) {
            vtnRegistro.getModelo().enviarDatosRegistro(vtnRegistro.getTxtIdentificacion().getText().trim().toUpperCase(), vtnRegistro.getTxtNombre().getText().trim().toUpperCase(), vtnRegistro.getTxtApellido().getText().trim().toUpperCase(), vtnRegistro.getTxtNUsuario().getText().trim().toUpperCase(), vtnRegistro.getTxtContrasenia().getText().trim().toUpperCase(), vtnRegistro.getTxtCorreo().getText().trim().toUpperCase());
            vtnRegistro.getTxtApellido().setText(" ");
            vtnRegistro.getTxtContrasenia().setText(" ");
            vtnRegistro.getTxtNombre().setText(" ");
            vtnRegistro.getTxtCorreo().setText(" ");
            vtnRegistro.getTxtIdentificacion().setText(" ");
            vtnRegistro.getTxtNUsuario().setText(" ");
            vtnRegistro.getModelo().abrirVentanaIngreso();
            vtnRegistro.getModelo().getVtnRegistro().dispose();
        } else if (ae.getSource() == vtnRegistro.getBtnSalir()) {
            vtnRegistro.getModelo().abrirVentanaIngreso();
        }
        vtnRegistro.dispose();
    }

}
