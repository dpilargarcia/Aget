/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Ventanas;

import Presentacion.Controladores.controlVentanaGastosAutomaticos;
import Presentacion.Modelo;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Asus
 */
public class ventanaGastosAutomaticos extends javax.swing.JFrame {
    
    private Modelo modelo;
    private controlVentanaGastosAutomaticos controlVtnGastosAutomaticos;

    public ventanaGastosAutomaticos(Modelo a) {
        initComponents();
        setSize(395,470);
        setResizable(false);
        setLocationRelativeTo(null);
        modelo = a;
        capturarEventos();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtV5 = new javax.swing.JTextField();
        txtV4 = new javax.swing.JTextField();
        txtV3 = new javax.swing.JTextField();
        txtV2 = new javax.swing.JTextField();
        txtV1 = new javax.swing.JTextField();
        txtV6 = new javax.swing.JTextField();
        btnGenerarPlan = new javax.swing.JButton();
        lblArriendo = new javax.swing.JLabel();
        lblServicios = new javax.swing.JLabel();
        lblMercado = new javax.swing.JLabel();
        lblTransporte = new javax.swing.JLabel();
        lblEducacion = new javax.swing.JLabel();
        lblDeudas = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnAget = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Candara", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingrese el valor de sus gastos");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 50, 305, 45);

        jLabel3.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 90, 90, 36);

        jLabel4.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Valor");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(220, 100, 76, 22);

        txtV5.setText("0");
        getContentPane().add(txtV5);
        txtV5.setBounds(200, 260, 112, 20);

        txtV4.setText("0");
        getContentPane().add(txtV4);
        txtV4.setBounds(200, 230, 112, 20);

        txtV3.setText("0");
        getContentPane().add(txtV3);
        txtV3.setBounds(200, 200, 112, 20);

        txtV2.setText("0");
        getContentPane().add(txtV2);
        txtV2.setBounds(200, 170, 112, 20);

        txtV1.setText("0");
        txtV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtV1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtV1);
        txtV1.setBounds(200, 140, 112, 20);

        txtV6.setText("0");
        getContentPane().add(txtV6);
        txtV6.setBounds(200, 290, 112, 20);

        btnGenerarPlan.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        btnGenerarPlan.setForeground(new java.awt.Color(0, 102, 102));
        btnGenerarPlan.setText("Generar Plan");
        btnGenerarPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPlanActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerarPlan);
        btnGenerarPlan.setBounds(60, 330, 130, 30);

        lblArriendo.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        lblArriendo.setText("Arriendo");
        getContentPane().add(lblArriendo);
        lblArriendo.setBounds(80, 140, 90, 20);

        lblServicios.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        lblServicios.setText("Servicios");
        getContentPane().add(lblServicios);
        lblServicios.setBounds(80, 170, 90, 20);

        lblMercado.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        lblMercado.setText("Mercado");
        getContentPane().add(lblMercado);
        lblMercado.setBounds(80, 200, 90, 20);

        lblTransporte.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        lblTransporte.setText("Transporte");
        getContentPane().add(lblTransporte);
        lblTransporte.setBounds(80, 230, 90, 20);

        lblEducacion.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        lblEducacion.setText("Educación");
        getContentPane().add(lblEducacion);
        lblEducacion.setBounds(80, 260, 90, 21);

        lblDeudas.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        lblDeudas.setText("Deudas");
        getContentPane().add(lblDeudas);
        lblDeudas.setBounds(80, 290, 90, 21);

        btnSalir.setBackground(new java.awt.Color(0, 51, 51));
        btnSalir.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Volver");
        getContentPane().add(btnSalir);
        btnSalir.setBounds(220, 330, 90, 30);

        btnAget.setBackground(new java.awt.Color(0, 153, 153));
        btnAget.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        btnAget.setForeground(new java.awt.Color(255, 255, 255));
        btnAget.setText("Aget");
        btnAget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgetActionPerformed(evt);
            }
        });
        getContentPane().add(btnAget);
        btnAget.setBounds(10, 10, 80, 30);

        jLabel2.setFont(new java.awt.Font("Candara", 0, 28)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoGr.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -180, 600, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtV1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtV1ActionPerformed

    private void btnGenerarPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPlanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenerarPlanActionPerformed

    private void btnAgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAget;
    private javax.swing.JButton btnGenerarPlan;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblArriendo;
    private javax.swing.JLabel lblDeudas;
    private javax.swing.JLabel lblEducacion;
    private javax.swing.JLabel lblMercado;
    private javax.swing.JLabel lblServicios;
    private javax.swing.JLabel lblTransporte;
    private javax.swing.JTextField txtV1;
    private javax.swing.JTextField txtV2;
    private javax.swing.JTextField txtV3;
    private javax.swing.JTextField txtV4;
    private javax.swing.JTextField txtV5;
    private javax.swing.JTextField txtV6;
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

    public controlVentanaGastosAutomaticos getControlVtnGastosAutomaticos() {
        if(controlVtnGastosAutomaticos==null){
            controlVtnGastosAutomaticos= new controlVentanaGastosAutomaticos(this);
        }
        return controlVtnGastosAutomaticos;
    }

    public void setControlVtnGastosAutomaticos(controlVentanaGastosAutomaticos controlVtnGastosAutomaticos) {
        this.controlVtnGastosAutomaticos = controlVtnGastosAutomaticos;
    }

    public JButton getBtnGenerarPlan() {
        return btnGenerarPlan;
    }

    public void setBtnGenerarPlan(JButton btnGenerarPlan) {
        this.btnGenerarPlan = btnGenerarPlan;
    }

    public JTextField getTxtV1() {
        return txtV1;
    }

    public void setTxtV1(JTextField txtV1) {
        this.txtV1 = txtV1;
    }

    public JTextField getTxtV2() {
        return txtV2;
    }

    public void setTxtV2(JTextField txtV2) {
        this.txtV2 = txtV2;
    }

    public JTextField getTxtV3() {
        return txtV3;
    }

    public void setTxtV3(JTextField txtV3) {
        this.txtV3 = txtV3;
    }

    public JTextField getTxtV4() {
        return txtV4;
    }

    public void setTxtV4(JTextField txtV4) {
        this.txtV4 = txtV4;
    }

    public JTextField getTxtV5() {
        return txtV5;
    }

    public void setTxtV5(JTextField txtV5) {
        this.txtV5 = txtV5;
    }

    public JTextField getTxtV6() {
        return txtV6;
    }

    public void setTxtV6(JTextField txtV6) {
        this.txtV6 = txtV6;
    }



    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

   

    public JLabel getLblArriendo() {
        return lblArriendo;
    }

    public void setLblArriendo(JLabel lblArriendo) {
        this.lblArriendo = lblArriendo;
    }

    public JLabel getLblDeudas() {
        return lblDeudas;
    }

    public void setLblDeudas(JLabel lblDeudas) {
        this.lblDeudas = lblDeudas;
    }

    public JLabel getLblEducacion() {
        return lblEducacion;
    }

    public void setLblEducacion(JLabel lblEducacion) {
        this.lblEducacion = lblEducacion;
    }



    public JLabel getLblMercado() {
        return lblMercado;
    }

    public void setLblMercado(JLabel lblMercado) {
        this.lblMercado = lblMercado;
    }

    public JLabel getLblServicios() {
        return lblServicios;
    }

    public void setLblServicios(JLabel lblServicios) {
        this.lblServicios = lblServicios;
    }

    public JLabel getLblTransporte() {
        return lblTransporte;
    }

    public void setLblTransporte(JLabel lblTransporte) {
        this.lblTransporte = lblTransporte;
    }

    public JButton getBtnAget() {
        return btnAget;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    
        
     
    private void capturarEventos() {
        btnGenerarPlan.addActionListener(getControlVtnGastosAutomaticos());
        btnAget.addActionListener(getControlVtnGastosAutomaticos());
        btnSalir.addActionListener(getControlVtnGastosAutomaticos());
    }
}
