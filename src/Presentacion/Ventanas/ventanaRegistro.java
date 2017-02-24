/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion.Ventanas;

import Presentacion.Controladores.controlVentanaRegistro;
import Presentacion.Modelo;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author Asus
 */
public class ventanaRegistro extends javax.swing.JFrame {
    private Modelo modelo;
    private controlVentanaRegistro controlVentanaRegistro;
    
    public ventanaRegistro(Modelo aThis) {
        initComponents();
        setSize(540,430);
        setResizable(false);
        setLocationRelativeTo(null);
        modelo = aThis;
        capturarEventos();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        lblRegistro = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        lblNUsuario = new javax.swing.JLabel();
        lblcorreo = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtNUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        txtContrasenia = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        jTextField5.setText("jTextField5");

        jTextField6.setText("jTextField6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lblRegistro.setFont(new java.awt.Font("Candara", 0, 36)); // NOI18N
        lblRegistro.setForeground(new java.awt.Color(0, 102, 102));
        lblRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRegistro.setText("Registro");
        getContentPane().add(lblRegistro);
        lblRegistro.setBounds(150, 10, 220, 61);

        lblNombre.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lblNombre.setText("Nombre");
        getContentPane().add(lblNombre);
        lblNombre.setBounds(60, 80, 90, 31);

        lblApellidos.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lblApellidos.setText("Apellidos");
        getContentPane().add(lblApellidos);
        lblApellidos.setBounds(60, 120, 100, 31);

        lblNUsuario.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lblNUsuario.setText("Nombre de Usuario");
        getContentPane().add(lblNUsuario);
        lblNUsuario.setBounds(60, 200, 196, 30);

        lblcorreo.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lblcorreo.setText("Correo");
        getContentPane().add(lblcorreo);
        lblcorreo.setBounds(60, 160, 100, 30);

        lblContraseña.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lblContraseña.setText("Contraseña");
        getContentPane().add(lblContraseña);
        lblContraseña.setBounds(60, 280, 140, 30);

        btnAceptar.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(0, 102, 102));
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Checked-24.png"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAceptar);
        btnAceptar.setBounds(130, 320, 130, 40);

        btnSalir.setBackground(new java.awt.Color(0, 51, 51));
        btnSalir.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconoVolver.png"))); // NOI18N
        btnSalir.setText("Volver");
        getContentPane().add(btnSalir);
        btnSalir.setBounds(270, 320, 110, 40);

        txtNombre.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(51, 51, 51));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombre);
        txtNombre.setBounds(240, 80, 230, 30);

        txtApellido.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(txtApellido);
        txtApellido.setBounds(240, 120, 230, 30);

        txtCorreo.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(txtCorreo);
        txtCorreo.setBounds(240, 160, 230, 30);

        txtNUsuario.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        txtNUsuario.setForeground(new java.awt.Color(51, 51, 51));
        txtNUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtNUsuario);
        txtNUsuario.setBounds(240, 200, 230, 30);

        jLabel1.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        jLabel1.setText("Identificación");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 240, 137, 28);

        txtIdentificacion.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        txtIdentificacion.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(txtIdentificacion);
        txtIdentificacion.setBounds(240, 240, 230, 30);

        txtContrasenia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtContrasenia.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(txtContrasenia);
        txtContrasenia.setBounds(240, 280, 230, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 620, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNUsuarioActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblNUsuario;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRegistro;
    private javax.swing.JLabel lblcorreo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNUsuario;
    private javax.swing.JTextField txtNombre;
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

    public JButton getBtnAceptar() {
        return btnAceptar;
    }

    public void setBtnAceptar(JButton btnAceptar) {
        this.btnAceptar = btnAceptar;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public void setBtnSalir(JButton btnSalir) {
        this.btnSalir = btnSalir;
    }

    public JTextField getTxtApellido() {
        return txtApellido;
    }

    public void setTxtApellido(JTextField txtApellido) {
        this.txtApellido = txtApellido;
    }

    public JTextField getTxtContrasenia() {
        return txtContrasenia;
    }

    public JTextField getTxtCorreo() {
        return txtCorreo;
    }

    public void setTxtCorreo(JTextField txtCorreo) {
        this.txtCorreo = txtCorreo;
    }

    public JTextField getTxtIdentificacion() {
        return txtIdentificacion;
    }

    public void setTxtIdentificacion(JTextField txtIdentificacion) {
        this.txtIdentificacion = txtIdentificacion;
    }

    public JTextField getTxtNUsuario() {
        return txtNUsuario;
    }

    public void setTxtNUsuario(JTextField txtNUsuario) {
        this.txtNUsuario = txtNUsuario;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
        
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
        System.out.println(txtNombre);
    }

    public controlVentanaRegistro getControlVentanaRegistro() {
            if (controlVentanaRegistro == null) {
            controlVentanaRegistro = new controlVentanaRegistro(this);
        }
        return controlVentanaRegistro;
    }

    public void setControlVentanaRegistro(controlVentanaRegistro controlVentanaRegistro) {
        this.controlVentanaRegistro = controlVentanaRegistro;
    }
   
    private void capturarEventos() {
    btnAceptar.addActionListener(getControlVentanaRegistro());
    btnSalir.addActionListener(getControlVentanaRegistro());
    }
}
