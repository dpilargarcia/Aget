/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Controladores;

import Presentacion.Ventanas.VentanaLessPay;
import Presentacion.Ventanas.ventanaIngreso;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class ControlVentanaLessPay implements ActionListener{
    private VentanaLessPay vtnLessPay;
    private ventanaIngreso vtnIngreso;
    
     public ControlVentanaLessPay(VentanaLessPay aThis) {
        this.vtnLessPay=aThis;   
    }
     
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== vtnLessPay.getBtnAceptar()){
            vtnLessPay.getModelo().enviarDatosIngresos(vtnLessPay.getTxtValor().getText(),vtnLessPay.getModelo().getVtnIngreso().getTxtId().getText());
            //System.out.println("Control ventana lespay"+vtnLessPay.getModelo().getProcesosBd().);
            vtnLessPay.getModelo().abrirVentanaGastosAutomaticos();
            
        }else if(ae.getSource()== vtnLessPay.getBtnSalir()){
            vtnLessPay.getModelo().iniciarAplicacion();
        }
        }
    
    
}
