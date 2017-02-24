/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Ventanas;

import Presentacion.Modelo;
import javax.swing.JButton;
import javax.swing.JTextField;
import Presentacion.Controladores.ControlVentanaLessPay;

/**
 *
 * @author Asus
 */
public class VentanaLessPay extends javax.swing.JFrame {

    private Modelo modelo;
    private ControlVentanaLessPay controlVtnIngresos;
    
    
    
    public VentanaLessPay(Modelo a) {
        initComponents();
        setSize(393,450);
        setResizable(false);
        setLocationRelativeTo(null);
        modelo = a;
        capturarEventos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        btnIGastos = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnSalir.setBackground(new java.awt.Color(0, 51, 51));
        btnSalir.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Volver");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(280, 330, 90, 29);

        jLabel1.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido a LessPay");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 10, 329, 47);

        jLabel3.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel3.setText("Valor");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 250, 50, 30);
        getContentPane().add(txtValor);
        txtValor.setBounds(160, 250, 130, 36);

        btnIGastos.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        btnIGastos.setText("Ingresar Gastos");
        getContentPane().add(btnIGastos);
        btnIGastos.setBounds(40, 330, 180, 30);

        jLabel6.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        jLabel6.setText("Registre el valor de sus gastos mensuales.");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 310, 250, 20);

        jLabel7.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        jLabel7.setText("Registre el valor de sus ingresos mensuales.");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 220, 310, 30);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lesspay2.png"))); // NOI18N
        jPanel1.add(jLabel8);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(130, 50, 130, 170);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-10, -10, 410, 440);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIGastos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

    public Modelo getModelo() {
        if(modelo == null){
            modelo = new Modelo();
        }
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public JTextField getTxtValor() {
        return txtValor;
    }

    public void setTxtValor(JTextField txtValor) {
        this.txtValor = txtValor;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public void setBtnSalir(JButton btnSalir) {
        this.btnSalir = btnSalir;
    }

    public JButton getBtnAceptar() {
        return btnIGastos;
    }

    public void setBtnAceptar(JButton btnAceptar) {
        this.btnIGastos = btnAceptar;
    }

    public ControlVentanaLessPay getControlVtnIngresos() {
        if(controlVtnIngresos==null){
            controlVtnIngresos= new ControlVentanaLessPay(this);
        }
        return controlVtnIngresos;
    }

    public void setControlVtnIngresos(ControlVentanaLessPay controlVtnIngresos) {
        this.controlVtnIngresos = controlVtnIngresos;
    }
    
    private void capturarEventos() {
        btnIGastos.addActionListener(getControlVtnIngresos());
        btnSalir.addActionListener(getControlVtnIngresos());
    }
}
