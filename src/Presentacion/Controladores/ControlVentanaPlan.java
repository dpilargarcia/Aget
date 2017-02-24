/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Controladores;

import Presentacion.Ventanas.VentanaPlan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class ControlVentanaPlan implements ActionListener{
    
    private VentanaPlan vtnPlan;

    public ControlVentanaPlan(VentanaPlan aThis) {
        this.vtnPlan= aThis;
    }
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== vtnPlan.getBtnAtras()){
            JOptionPane.showMessageDialog(vtnPlan, "Su Plan ha sido Guardado");
            vtnPlan.getModelo().abrirVentanaGastosAutomaticos();
            vtnPlan.dispose();
        }else if(ae.getSource()== vtnPlan.getBtnAget()){
            vtnPlan.dispose();
            vtnPlan.getModelo().iniciarAplicacion();
            vtnPlan.getModelo().LimpiarLessPay();
            vtnPlan.dispose();
        }
    }
    
}
