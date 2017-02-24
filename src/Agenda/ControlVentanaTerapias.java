package Agenda;

import Presentacion.Ventanas.VentanaTerapias;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlVentanaTerapias implements ActionListener {
    
    private VentanaTerapias ventanaTerapias;

    public ControlVentanaTerapias(VentanaTerapias aThis) {
        this.ventanaTerapias = aThis;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ventanaTerapias.getBtnSolicitar()) {
            String esp = ventanaTerapias.getjComboBoxEspecialidad().getSelectedItem().toString();
            String fecha = ventanaTerapias.getjComboBoxFecha().getSelectedItem().toString();
            String hora = ventanaTerapias.getjComboBoxHora().getSelectedItem().toString();

            ventanaTerapias.getModelo().enviarDatosTerapias(ventanaTerapias.getjNombre().getText().trim().toUpperCase(), ventanaTerapias.getjCedula().getText().trim().toUpperCase(), esp, fecha, hora, ventanaTerapias.getTxtTerapeuta().getText().trim().toUpperCase());
            ventanaTerapias.getjCedula().setText(" ");
            ventanaTerapias.getjNombre().setText(" ");      

        } else if (e.getSource() == ventanaTerapias.getBtnSalir()) {
            ventanaTerapias.getModelo().iniciarAplicacion();
            ventanaTerapias.dispose();
        }
    }
    
}
