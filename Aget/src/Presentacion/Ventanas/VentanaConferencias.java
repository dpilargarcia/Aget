package Presentacion.Ventanas;

import Presentacion.ControlVtnPrincipal;
import Agenda.ControlVentanaConferencias;
import Presentacion.Modelo;
import java.awt.event.ItemEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class VentanaConferencias extends javax.swing.JFrame {

    private int cupos1 = 30;
    int cupos2 = 35;
    int cupos3 = 60;
    private Modelo modelo;
    private ControlVentanaConferencias ctrlVentanaConferencias;

    public VentanaConferencias(Modelo a) {
        initComponents();
        setSize(600, 660);
        setResizable(false);
        setLocationRelativeTo(null);
        modelo = a;
        capturarEventos();
    }

    @SuppressWarnings("unchecked")

    public Modelo getModelo() {
        if (modelo == null) {
            modelo = new Modelo();
        }
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public ControlVentanaConferencias getCtrlVtnConferencias() {
        if (ctrlVentanaConferencias == null) {
            ctrlVentanaConferencias = new ControlVentanaConferencias(this);
        }
        return ctrlVentanaConferencias;
    }

    public void setCtrlVentanaConferencias(ControlVentanaConferencias ctrlVentanaConferencias) {
        this.ctrlVentanaConferencias = ctrlVentanaConferencias;
    }
    
    

    public JButton getjBtnSalir() {
        return jBtnSalir;
    }

    public void setjBtnSalir(JButton jBtnSalir) {
        this.jBtnSalir = jBtnSalir;
    }

    public JButton getjButtonInscribete() {
        return jButtonInscribete;
    }

    public void setjButtonInscribete(JButton jButtonInscribete) {
        this.jButtonInscribete = jButtonInscribete;
    }

    public JComboBox getjComboBoxConferencias() {
        return jComboBoxConferencias;
    }

    public void setjComboBoxConferencias(JComboBox jComboBoxConferencias) {
        this.jComboBoxConferencias = jComboBoxConferencias;
    }

    public JTextField getjFecha() {
        return jFecha;
    }

    public void setjFecha(JTextField jFecha) {
        this.jFecha = jFecha;
    }

    public JTextField getjHora() {
        return jHora;
    }

    public void setjHora(JTextField jHora) {
        this.jHora = jHora;
    }

    public JTextField getjCupos() {
        return jCupos;
    }

    public int getCupos1() {
        return cupos1;
    }

    public void setCupos1(int cupos1) {
        this.cupos1 = cupos1;
    }

    public int getCupos2() {
        return cupos2;
    }

    public void setCupos2(int cupos2) {
        this.cupos2 = cupos2;
    }

    public int getCupos3() {
        return cupos3;
    }

    public void setCupos3(int cupos3) {
        this.cupos3 = cupos3;
    }

    public JTextField getTxtCedula() {
        return txtCedula;
    }

    public void setTxtCedula(JTextField txtCedula) {
        this.txtCedula = txtCedula;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxConferencias = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonInscribete = new javax.swing.JButton();
        jBtnSalir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jCupos = new javax.swing.JTextField();
        jHora = new javax.swing.JTextField();
        jFecha = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(0, 51, 102));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agendaConferencia_3.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 350));

        jLabel1.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        jLabel1.setText("Selecciona la conferencia a la que deseas asistir");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        jComboBoxConferencias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona la conferencia", "Administración de Ingresos y Gastos", "Técnicas de Gerencia", "Psicología del Ahorro" }));
        jComboBoxConferencias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxConferenciasItemStateChanged(evt);
            }
        });
        getContentPane().add(jComboBoxConferencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, -1, -1));

        jLabel2.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel2.setText("Cupos Disponibles:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, -1, -1));

        jLabel3.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel3.setText("Cédula");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        jLabel4.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel4.setText("Hora");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, -1, -1));

        jButtonInscribete.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jButtonInscribete.setForeground(new java.awt.Color(0, 102, 102));
        jButtonInscribete.setText("¡Inscríbete!");
        getContentPane().add(jButtonInscribete, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, -1, -1));

        jBtnSalir.setBackground(new java.awt.Color(0, 51, 51));
        jBtnSalir.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        jBtnSalir.setForeground(new java.awt.Color(255, 255, 255));
        jBtnSalir.setText("Volver");
        getContentPane().add(jBtnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, -1, -1));

        jLabel5.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Inscripción");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, -1, -1));

        jLabel8.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel8.setText("Conferencia");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        jLabel9.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel9.setText("Nombre");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));
        getContentPane().add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 200, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 200, -1));

        jCupos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jCupos, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, 40, -1));
        getContentPane().add(jHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 540, 70, -1));
        getContentPane().add(jFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 120, -1));

        jLabel10.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel10.setText("Fecha");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, -1, -1));

        jLabel7.setBackground(new java.awt.Color(0, 51, 102));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoGr.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 600, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxConferenciasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxConferenciasItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (this.jComboBoxConferencias.getSelectedIndex() > 0) {

                if (this.jComboBoxConferencias.getSelectedIndex() == 1) {
                    getjHora().setText("6:00pm");
                    getjFecha().setText("Diciembre 15");
                    //getjCupos().setText(getCtrlVtnConferencias().getCupos1S());
                    //cupos1--;
                } else if (this.jComboBoxConferencias.getSelectedIndex() == 2) {
                    getjHora().setText("6:00pm");
                    getjFecha().setText("Diciembre 20");
                    //getjCupos().setText(String.valueOf(cupos2));
                    //cupos2--;
                } else if (this.jComboBoxConferencias.getSelectedIndex() == 3) {
                    getjHora().setText("6:00pm");
                    getjFecha().setText("Diciembre 28");
                    //getjCupos().setText(String.valueOf(cupos3));
                    //cupos3--;
                }
            }
        }
    }//GEN-LAST:event_jComboBoxConferenciasItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JButton jButtonInscribete;
    private javax.swing.JComboBox jComboBoxConferencias;
    private javax.swing.JTextField jCupos;
    private javax.swing.JTextField jFecha;
    private javax.swing.JTextField jHora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void capturarEventos() {
        jBtnSalir.addActionListener(getCtrlVtnConferencias());
        jButtonInscribete.addActionListener(getCtrlVtnConferencias());
        //jComboBoxConferencias.addActionListener(getCtrlVentanaConferencias());
    }
}
