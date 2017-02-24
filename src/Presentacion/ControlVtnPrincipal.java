/*}
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Familia prieto
 */
public class ControlVtnPrincipal implements ActionListener{

    private VentanaPrincipal vtnPrincipal;
    
    
    ControlVtnPrincipal(VentanaPrincipal aThis) {
        this.vtnPrincipal=aThis;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vtnPrincipal.getBtnLessPay()){
            vtnPrincipal.getModelo().abrirVentanaLessPay();
            vtnPrincipal.dispose();
        }else if(e.getSource()==vtnPrincipal.getBtnSalir()){
            vtnPrincipal.getModelo().Terminar();
        }else if(e.getSource()==vtnPrincipal.getBtnTerapias()){
            vtnPrincipal.getModelo().abrirVentanaTerapias();
            vtnPrincipal.dispose();
        }else if(e.getSource()==vtnPrincipal.getBtnConferencias()){
            vtnPrincipal.getModelo().abrirVentanaConferencias();
            vtnPrincipal.dispose();
        
        }else if(e.getSource()==vtnPrincipal.getBtnLogin()){
            vtnPrincipal.getModelo().abrirVentanaIngreso();
            vtnPrincipal.dispose();
        }
    
    }
}