/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Ventanas;

import Presentacion.Controladores.ControlVentanaPlan;
import Presentacion.Modelo;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Asus
 */
public class VentanaPlan extends javax.swing.JFrame {

        private Modelo modelo;
        private ControlVentanaPlan controlVentanaRelacion;
        
    public VentanaPlan(Modelo a) {
        initComponents();
        setSize(925,570);
        setResizable(false);
        setLocationRelativeTo(null);
        modelo = a;
        capturarEventos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnAget = new javax.swing.JButton();
        txtPlan2 = new javax.swing.JTextField();
        txtPlan3 = new javax.swing.JTextField();
        txtPlan4 = new javax.swing.JTextField();
        txtPlan5 = new javax.swing.JTextField();
        txtPlan6 = new javax.swing.JTextField();
        txtPlan7 = new javax.swing.JTextField();
        txtPlan8 = new javax.swing.JTextField();
        txtPlan1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Candara", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Plan Generado");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 10, 310, 64);

        btnAtras.setBackground(new java.awt.Color(0, 51, 51));
        btnAtras.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setText("Volver");
        getContentPane().add(btnAtras);
        btnAtras.setBounds(430, 430, 100, 27);

        btnAget.setBackground(new java.awt.Color(0, 51, 51));
        btnAget.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        btnAget.setForeground(new java.awt.Color(255, 255, 255));
        btnAget.setText("Aget");
        btnAget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgetActionPerformed(evt);
            }
        });
        getContentPane().add(btnAget);
        btnAget.setBounds(10, 10, 73, 27);

        txtPlan2.setBackground(new java.awt.Color(204, 204, 204));
        txtPlan2.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        txtPlan2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtPlan2);
        txtPlan2.setBounds(50, 120, 830, 40);

        txtPlan3.setBackground(new java.awt.Color(204, 204, 204));
        txtPlan3.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        txtPlan3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtPlan3);
        txtPlan3.setBounds(50, 160, 830, 40);

        txtPlan4.setBackground(new java.awt.Color(204, 204, 204));
        txtPlan4.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        txtPlan4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPlan4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlan4ActionPerformed(evt);
            }
        });
        getContentPane().add(txtPlan4);
        txtPlan4.setBounds(50, 200, 830, 40);

        txtPlan5.setBackground(new java.awt.Color(204, 204, 204));
        txtPlan5.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        txtPlan5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtPlan5);
        txtPlan5.setBounds(50, 240, 830, 40);

        txtPlan6.setBackground(new java.awt.Color(204, 204, 204));
        txtPlan6.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        txtPlan6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtPlan6);
        txtPlan6.setBounds(50, 280, 830, 40);

        txtPlan7.setBackground(new java.awt.Color(204, 204, 204));
        txtPlan7.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        txtPlan7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtPlan7);
        txtPlan7.setBounds(140, 330, 660, 40);

        txtPlan8.setBackground(new java.awt.Color(204, 204, 204));
        txtPlan8.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        txtPlan8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtPlan8);
        txtPlan8.setBounds(140, 370, 660, 40);

        txtPlan1.setBackground(new java.awt.Color(204, 204, 204));
        txtPlan1.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        txtPlan1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtPlan1);
        txtPlan1.setBounds(50, 80, 830, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoPlan.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -100, 950, 660);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPlan4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlan4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlan4ActionPerformed

    private void btnAgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgetActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAget;
    private javax.swing.JButton btnAtras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtPlan1;
    private javax.swing.JTextField txtPlan2;
    private javax.swing.JTextField txtPlan3;
    private javax.swing.JTextField txtPlan4;
    private javax.swing.JTextField txtPlan5;
    private javax.swing.JTextField txtPlan6;
    private javax.swing.JTextField txtPlan7;
    private javax.swing.JTextField txtPlan8;
    // End of variables declaration//GEN-END:variables

    
    
    public Modelo getModelo() {
        if(modelo==null){
            modelo = new Modelo();
        }
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public ControlVentanaPlan getControlVentanaRelacion() {
        if(controlVentanaRelacion==null){
            controlVentanaRelacion = new ControlVentanaPlan(this);
        }
        return controlVentanaRelacion;
    }

    public void setControlVentanaRelacion(ControlVentanaPlan controlVentanaRelacion) {
        this.controlVentanaRelacion = controlVentanaRelacion;
    }

    public JButton getBtnSalir() {
        return btnAtras;
    }

    public void setBtnSalir(JButton btnSalir) {
        this.btnAtras = btnSalir;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    
    public JButton getBtnAget() {
        return btnAget;
    }

    public void setBtnAget(JButton btnAget) {
        this.btnAget = btnAget;
    }

    public JButton getBtnAtras() {
        return btnAtras;
    }

    public void setBtnAtras(JButton btnAtras) {
        this.btnAtras = btnAtras;
    }
    
    private void capturarEventos() {
        btnAtras.addActionListener(getControlVentanaRelacion());
        btnAget.addActionListener(getControlVentanaRelacion());
    }

    public JTextField getTxtPlan1() {
        return txtPlan1;
    }

    public JTextField getTxtPlan2() {
        return txtPlan2;
    }

    public JTextField getTxtPlan3() {
        return txtPlan3;
    }

    public JTextField getTxtPlan4() {
        return txtPlan4;
    }

    public JTextField getTxtPlan5() {
        return txtPlan5;
    }

    public JTextField getTxtPlan6() {
        return txtPlan6;
    }

    public JTextField getTxtPlan7() {
        return txtPlan7;
    }

    public JTextField getTxtPlan8() {
        return txtPlan8;
    }

    
    
}
