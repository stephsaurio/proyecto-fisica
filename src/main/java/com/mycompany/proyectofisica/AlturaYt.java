/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectofisica;

import javax.swing.JOptionPane;

/**
 *
 * @author gomez
 */
public class AlturaYt extends javax.swing.JFrame {

    /**
     * Creates new form AlturaYt
     */
    public AlturaYt() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        unidadV0y = new javax.swing.JComboBox<>();
        V0yField = new javax.swing.JTextField();
        AceleracionLabel = new javax.swing.JLabel();
        Limpiar = new javax.swing.JButton();
        CalcularVelocidadInicial = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        formula = new javax.swing.JLabel();
        Respuesta = new javax.swing.JLabel();
        unidadSalida = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        VelocidadInicialField = new javax.swing.JTextField();
        unidadVelocidadInicial = new javax.swing.JComboBox<>();
        distanciaLabel = new javax.swing.JLabel();
        anguloField = new javax.swing.JTextField();
        unidadAngulo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        tiempoEnUnInstanteField = new javax.swing.JTextField();
        unidadTiempo = new javax.swing.JComboBox<>();
        unidadSalida1 = new javax.swing.JComboBox<>();
        alturaInicialField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(241, 191, 217));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(190, 108, 157));
        jLabel4.setText("Calcular altura en t'");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        unidadV0y.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        unidadV0y.setForeground(new java.awt.Color(190, 108, 157));
        unidadV0y.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m/s", "km/h}" }));
        unidadV0y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadV0yActionPerformed(evt);
            }
        });
        getContentPane().add(unidadV0y, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 100, 30));

        V0yField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        V0yField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V0yFieldActionPerformed(evt);
            }
        });
        getContentPane().add(V0yField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 290, 30));

        AceleracionLabel.setBackground(new java.awt.Color(241, 191, 217));
        AceleracionLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        AceleracionLabel.setForeground(new java.awt.Color(190, 108, 157));
        AceleracionLabel.setText("V0y:");
        getContentPane().add(AceleracionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        Limpiar.setBackground(new java.awt.Color(245, 215, 226));
        Limpiar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        Limpiar.setForeground(new java.awt.Color(209, 129, 148));
        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, -1, -1));

        CalcularVelocidadInicial.setBackground(new java.awt.Color(241, 191, 217));
        CalcularVelocidadInicial.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        CalcularVelocidadInicial.setForeground(new java.awt.Color(190, 108, 157));
        CalcularVelocidadInicial.setText("calcular");
        CalcularVelocidadInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularVelocidadInicialActionPerformed(evt);
            }
        });
        getContentPane().add(CalcularVelocidadInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 590, -1, 50));

        Volver.setBackground(new java.awt.Color(245, 215, 226));
        Volver.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        Volver.setForeground(new java.awt.Color(209, 129, 148));
        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        getContentPane().add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 590, -1, -1));

        jLabel1.setBackground(new java.awt.Color(241, 191, 217));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(190, 108, 157));
        jLabel1.setText("Formula:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 170, -1, -1));

        jLabel5.setBackground(new java.awt.Color(241, 191, 217));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(190, 108, 157));
        jLabel5.setText("y(t):");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, -1, -1));

        jLabel6.setBackground(new java.awt.Color(241, 191, 217));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(190, 108, 157));
        jLabel6.setText("Respuesta en:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 40, -1, -1));

        formula.setBackground(new java.awt.Color(241, 191, 217));
        formula.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        formula.setForeground(new java.awt.Color(190, 108, 157));
        getContentPane().add(formula, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 220, 630, 140));

        Respuesta.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(Respuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, 430, 40));

        unidadSalida.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        unidadSalida.setForeground(new java.awt.Color(190, 108, 157));
        unidadSalida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m", "km" }));
        unidadSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadSalidaActionPerformed(evt);
            }
        });
        getContentPane().add(unidadSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 40, 130, 50));

        jLabel7.setBackground(new java.awt.Color(241, 191, 217));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(190, 108, 157));
        jLabel7.setText("Velocidad inicial (v₀):");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        VelocidadInicialField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        VelocidadInicialField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VelocidadInicialFieldActionPerformed(evt);
            }
        });
        getContentPane().add(VelocidadInicialField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 260, 30));

        unidadVelocidadInicial.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        unidadVelocidadInicial.setForeground(new java.awt.Color(190, 108, 157));
        unidadVelocidadInicial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m/s", "km/h", " " }));
        unidadVelocidadInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadVelocidadInicialActionPerformed(evt);
            }
        });
        getContentPane().add(unidadVelocidadInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 110, 30));

        distanciaLabel.setBackground(new java.awt.Color(241, 191, 217));
        distanciaLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        distanciaLabel.setForeground(new java.awt.Color(190, 108, 157));
        distanciaLabel.setText("Angulo (θ):");
        getContentPane().add(distanciaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        anguloField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        anguloField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anguloFieldActionPerformed(evt);
            }
        });
        getContentPane().add(anguloField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 260, 30));

        unidadAngulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        unidadAngulo.setForeground(new java.awt.Color(190, 108, 157));
        unidadAngulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "°", "rad" }));
        unidadAngulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadAnguloActionPerformed(evt);
            }
        });
        getContentPane().add(unidadAngulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 90, 30));

        jLabel8.setBackground(new java.awt.Color(241, 191, 217));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(190, 108, 157));
        jLabel8.setText("Tiempo en un instante (t'):");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, 40));

        tiempoEnUnInstanteField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tiempoEnUnInstanteField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiempoEnUnInstanteFieldActionPerformed(evt);
            }
        });
        getContentPane().add(tiempoEnUnInstanteField, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 260, 30));

        unidadTiempo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        unidadTiempo.setForeground(new java.awt.Color(190, 108, 157));
        unidadTiempo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "horas", "minutos", "segundos" }));
        unidadTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadTiempoActionPerformed(evt);
            }
        });
        getContentPane().add(unidadTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 150, 30));

        unidadSalida1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        unidadSalida1.setForeground(new java.awt.Color(190, 108, 157));
        unidadSalida1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m", "km" }));
        unidadSalida1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadSalida1ActionPerformed(evt);
            }
        });
        getContentPane().add(unidadSalida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 80, 30));

        alturaInicialField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        alturaInicialField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alturaInicialFieldActionPerformed(evt);
            }
        });
        getContentPane().add(alturaInicialField, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 260, 30));

        jLabel10.setBackground(new java.awt.Color(241, 191, 217));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(190, 108, 157));
        jLabel10.setText("Altura inicial (y₀):");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void unidadV0yActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadV0yActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unidadV0yActionPerformed

    private void V0yFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_V0yFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_V0yFieldActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        V0yField.setText("");
        VelocidadInicialField.setText("");
        anguloField.setText("");
        tiempoEnUnInstanteField.setText("");
        alturaInicialField.setText("");
        Respuesta.setText("");
        formula.setText("");
    }//GEN-LAST:event_LimpiarActionPerformed

    private void CalcularVelocidadInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularVelocidadInicialActionPerformed
       try {
        double g = 9.81;
        double V0 = VelocidadInicialField.getText().isEmpty() ? 0 : Double.parseDouble(VelocidadInicialField.getText());
        double angulo = anguloField.getText().isEmpty() ? 0 : Double.parseDouble(anguloField.getText());
        double anguloRad = Math.toRadians(angulo);
        double V0y = V0yField.getText().isEmpty() ? (V0 != 0 && angulo != 0 ? V0 * Math.sin(anguloRad) : 0) : Double.parseDouble(V0yField.getText());
        double y0 = alturaInicialField.getText().isEmpty() ? 0 : Double.parseDouble(alturaInicialField.getText());
        double tiempo = tiempoEnUnInstanteField.getText().isEmpty() ? 0 : Double.parseDouble(tiempoEnUnInstanteField.getText());

        if (tiempo == 0) {
            JOptionPane.showMessageDialog(this, "Ingresa un tiempo válido.");
            return;
        }

        double y;
        String formulaUsada;

        if (V0 != 0 && angulo != 0) {
            // Caso con V0 y ángulo
            y = y0 + V0 * Math.sin(anguloRad) * tiempo - 0.5 * g * Math.pow(tiempo, 2);
            formulaUsada = "y = y₀ + V₀·sen(θ)·t - ½·g·t²";
        } else if (V0y != 0) {
            // Caso con V0y directamente
            y = y0 + V0y * tiempo - 0.5 * g * Math.pow(tiempo, 2);
            formulaUsada = "y = y₀ + V₀y·t - ½·g·t²";
        } else {
            JOptionPane.showMessageDialog(this, "Faltan datos para calcular la altura.");
            return;
        }

        Respuesta.setText(String.format("%.2f m", y));
        formula.setText(formulaUsada);

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Error: ingresa solo números válidos.");
    }

    }//GEN-LAST:event_CalcularVelocidadInicialActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        this.dispose();
        SeleccionProblemas volver = new SeleccionProblemas();
        volver.setVisible(true);
    }//GEN-LAST:event_VolverActionPerformed

    private void unidadSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadSalidaActionPerformed

    }//GEN-LAST:event_unidadSalidaActionPerformed

    private void VelocidadInicialFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VelocidadInicialFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VelocidadInicialFieldActionPerformed

    private void unidadVelocidadInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadVelocidadInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unidadVelocidadInicialActionPerformed

    private void anguloFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anguloFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anguloFieldActionPerformed

    private void unidadAnguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadAnguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unidadAnguloActionPerformed

    private void tiempoEnUnInstanteFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiempoEnUnInstanteFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tiempoEnUnInstanteFieldActionPerformed

    private void unidadTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadTiempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unidadTiempoActionPerformed

    private void unidadSalida1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadSalida1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unidadSalida1ActionPerformed

    private void alturaInicialFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alturaInicialFieldActionPerformed

    }//GEN-LAST:event_alturaInicialFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AceleracionLabel;
    private javax.swing.JButton CalcularVelocidadInicial;
    private javax.swing.JButton Limpiar;
    private javax.swing.JLabel Respuesta;
    private javax.swing.JTextField V0yField;
    private javax.swing.JTextField VelocidadInicialField;
    private javax.swing.JButton Volver;
    private javax.swing.JTextField alturaInicialField;
    private javax.swing.JTextField anguloField;
    private javax.swing.JLabel distanciaLabel;
    private javax.swing.JLabel formula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField tiempoEnUnInstanteField;
    private javax.swing.JComboBox<String> unidadAngulo;
    private javax.swing.JComboBox<String> unidadSalida;
    private javax.swing.JComboBox<String> unidadSalida1;
    private javax.swing.JComboBox<String> unidadTiempo;
    private javax.swing.JComboBox<String> unidadV0y;
    private javax.swing.JComboBox<String> unidadVelocidadInicial;
    // End of variables declaration//GEN-END:variables
}
