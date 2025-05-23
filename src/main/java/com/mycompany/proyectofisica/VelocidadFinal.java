package com.mycompany.proyectofisica;

import javax.swing.JOptionPane;

/**
 *
 * @author gomez
 */
public class VelocidadFinal extends javax.swing.JFrame {

    /**
     * Creates new form VelocidadFinal
     */
    public VelocidadFinal() {
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

        jLabel1 = new javax.swing.JLabel();
        Volver = new javax.swing.JButton();
        CalcularVelocidadFinal = new javax.swing.JButton();
        unidadSalida = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        TiempoLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tiempoField = new javax.swing.JTextField();
        unidadTiempo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        AceleracionLabel = new javax.swing.JLabel();
        AceleracionField = new javax.swing.JTextField();
        unidadAceleracion = new javax.swing.JComboBox<>();
        Respuesta = new javax.swing.JLabel();
        VelocidadFinalLabel1 = new javax.swing.JLabel();
        VelocidadInicialField = new javax.swing.JTextField();
        unidadVelocidadInicial = new javax.swing.JComboBox<>();
        distanciaLabel = new javax.swing.JLabel();
        distanciaField = new javax.swing.JTextField();
        unidadDistancia = new javax.swing.JComboBox<>();
        Limpiar = new javax.swing.JButton();
        formula = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(241, 191, 217));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(190, 108, 157));
        jLabel1.setText("Formula:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 200, -1, -1));

        Volver.setBackground(new java.awt.Color(245, 215, 226));
        Volver.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        Volver.setForeground(new java.awt.Color(209, 129, 148));
        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        getContentPane().add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 500, -1, -1));

        CalcularVelocidadFinal.setBackground(new java.awt.Color(241, 191, 217));
        CalcularVelocidadFinal.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        CalcularVelocidadFinal.setForeground(new java.awt.Color(190, 108, 157));
        CalcularVelocidadFinal.setText("calcular");
        CalcularVelocidadFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularVelocidadFinalActionPerformed(evt);
            }
        });
        getContentPane().add(CalcularVelocidadFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, -1, 50));

        unidadSalida.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        unidadSalida.setForeground(new java.awt.Color(190, 108, 157));
        unidadSalida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "km/h", "m/s" }));
        unidadSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadSalidaActionPerformed(evt);
            }
        });
        getContentPane().add(unidadSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 40, 130, 50));

        jLabel6.setBackground(new java.awt.Color(241, 191, 217));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(190, 108, 157));
        jLabel6.setText("Respuesta en:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 40, -1, -1));

        TiempoLabel.setBackground(new java.awt.Color(241, 191, 217));
        TiempoLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TiempoLabel.setForeground(new java.awt.Color(190, 108, 157));
        TiempoLabel.setText("Tiempo (t):");
        getContentPane().add(TiempoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        jLabel5.setBackground(new java.awt.Color(241, 191, 217));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(190, 108, 157));
        jLabel5.setText("Velocidad inicial (v₀):");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel4.setBackground(new java.awt.Color(241, 191, 217));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(190, 108, 157));
        jLabel4.setText("Calcular la velocidad final");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        tiempoField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        tiempoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiempoFieldActionPerformed(evt);
            }
        });
        getContentPane().add(tiempoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 260, 30));

        unidadTiempo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        unidadTiempo.setForeground(new java.awt.Color(190, 108, 157));
        unidadTiempo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "horas", "segundos" }));
        unidadTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadTiempoActionPerformed(evt);
            }
        });
        getContentPane().add(unidadTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 150, 30));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 550, 60, 40));

        AceleracionLabel.setBackground(new java.awt.Color(241, 191, 217));
        AceleracionLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        AceleracionLabel.setForeground(new java.awt.Color(190, 108, 157));
        AceleracionLabel.setText("Aceleracion (a):");
        getContentPane().add(AceleracionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        AceleracionField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        AceleracionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceleracionFieldActionPerformed(evt);
            }
        });
        getContentPane().add(AceleracionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 290, 30));

        unidadAceleracion.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        unidadAceleracion.setForeground(new java.awt.Color(190, 108, 157));
        unidadAceleracion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "km/h²", "m/s²" }));
        unidadAceleracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadAceleracionActionPerformed(evt);
            }
        });
        getContentPane().add(unidadAceleracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 160, 30));

        Respuesta.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(Respuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 140, 320, 40));

        VelocidadFinalLabel1.setBackground(new java.awt.Color(241, 191, 217));
        VelocidadFinalLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        VelocidadFinalLabel1.setForeground(new java.awt.Color(190, 108, 157));
        VelocidadFinalLabel1.setText("Velocidad final (v):");
        getContentPane().add(VelocidadFinalLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 140, -1, -1));

        VelocidadInicialField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        VelocidadInicialField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VelocidadInicialFieldActionPerformed(evt);
            }
        });
        getContentPane().add(VelocidadInicialField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 260, 30));

        unidadVelocidadInicial.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        unidadVelocidadInicial.setForeground(new java.awt.Color(190, 108, 157));
        unidadVelocidadInicial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "km/h", "m/s" }));
        unidadVelocidadInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadVelocidadInicialActionPerformed(evt);
            }
        });
        getContentPane().add(unidadVelocidadInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 110, 30));

        distanciaLabel.setBackground(new java.awt.Color(241, 191, 217));
        distanciaLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        distanciaLabel.setForeground(new java.awt.Color(190, 108, 157));
        distanciaLabel.setText("distancia (x):");
        getContentPane().add(distanciaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        distanciaField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        distanciaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distanciaFieldActionPerformed(evt);
            }
        });
        getContentPane().add(distanciaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 260, 30));

        unidadDistancia.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        unidadDistancia.setForeground(new java.awt.Color(190, 108, 157));
        unidadDistancia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "km", "mts" }));
        unidadDistancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadDistanciaActionPerformed(evt);
            }
        });
        getContentPane().add(unidadDistancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 110, 30));

        Limpiar.setBackground(new java.awt.Color(245, 215, 226));
        Limpiar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        Limpiar.setForeground(new java.awt.Color(209, 129, 148));
        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, -1));

        formula.setBackground(new java.awt.Color(241, 191, 217));
        formula.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        formula.setForeground(new java.awt.Color(190, 108, 157));
        getContentPane().add(formula, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 260, 560, 210));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        this.dispose();
        SeleccionProblemas volver = new SeleccionProblemas();
        volver.setVisible(true);
    }//GEN-LAST:event_VolverActionPerformed

    private void CalcularVelocidadFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularVelocidadFinalActionPerformed
      try {
            // Verificar si se ingresó cada campo
            boolean tieneV0 = !VelocidadInicialField.getText().isEmpty();
            boolean tieneA = !AceleracionField.getText().isEmpty();
            boolean tieneT = !tiempoField.getText().isEmpty();
            boolean tieneD = !distanciaField.getText().isEmpty();

            // Parsear valores o dejar como 0 si no se ingresó
            double v0 = tieneV0 ? Double.parseDouble(VelocidadInicialField.getText()) : 0;
            double a = tieneA ? Double.parseDouble(AceleracionField.getText()) : 0;
            double t = tieneT ? Double.parseDouble(tiempoField.getText()) : 0;
            double d = tieneD ? Double.parseDouble(distanciaField.getText()) : 0;

            // Convertir unidades a estándar
            if (tieneV0 && unidadVelocidadInicial.getSelectedItem().equals("km/h")) v0 /= 3.6;
            if (tieneA && unidadAceleracion.getSelectedItem().equals("km/h²")) a /= 12960;
            if (tieneT && unidadTiempo.getSelectedItem().equals("horas")) t *= 3600;
            if (tieneD && unidadDistancia.getSelectedItem().equals("km")) d *= 1000;

            double v = 0;
            String formulaUsada = "";

            // Caso 1: v = v₀ + a·t
            if (tieneV0 && tieneA && tieneT) {
                v = v0 + a * t;
                formulaUsada = "v = v₀ + a·t";
            }
            // Caso 2: v = √(v₀² + 2·a·d)
            else if (tieneV0 && tieneA && tieneD) {
                double resultado = Math.pow(v0, 2) + 2 * a * d;
                if (resultado < 0) {
                    JOptionPane.showMessageDialog(null, "Error: Raíz negativa, no se puede calcular v.");
                    return;
                }
                v = Math.sqrt(resultado);
                formulaUsada = "v = √(v₀² + 2·a·d)";
            }
            // Caso 3: v = (2·d / t) - v₀
            else if (tieneV0 && tieneD && tieneT && t != 0) {
                v = (2 * d / t) - v0;
                formulaUsada = "v = (2·d / t) - v₀";
            }
            else {
                JOptionPane.showMessageDialog(null, "Ingresa al menos 3 variables (excepto velocidad final).");
                return;
            }

            // Convertir a unidad de salida si se pidió en km/h
            if (unidadSalida.getSelectedItem().equals("km/h")) {
                v *= 3.6;
            }

            // Mostrar resultado
            Respuesta.setText(String.format("%.2f %s", v, unidadSalida.getSelectedItem().toString()));
            formula.setText(formulaUsada);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Error: Ingresa solo números válidos.");
        }

    }//GEN-LAST:event_CalcularVelocidadFinalActionPerformed

    private void unidadSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadSalidaActionPerformed

    }//GEN-LAST:event_unidadSalidaActionPerformed

    private void tiempoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiempoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tiempoFieldActionPerformed

    private void unidadTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadTiempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unidadTiempoActionPerformed

    private void AceleracionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceleracionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AceleracionFieldActionPerformed

    private void unidadAceleracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadAceleracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unidadAceleracionActionPerformed

    private void VelocidadInicialFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VelocidadInicialFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VelocidadInicialFieldActionPerformed

    private void unidadVelocidadInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadVelocidadInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unidadVelocidadInicialActionPerformed

    private void distanciaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distanciaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_distanciaFieldActionPerformed

    private void unidadDistanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadDistanciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unidadDistanciaActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        // Limpiar todos los campos de texto

        VelocidadInicialField.setText("");
        AceleracionField.setText("");
        VelocidadInicialField.setText("");
        distanciaField.setText("");

        // Reiniciar los JComboBox a su primer elemento (opcional)
        unidadAceleracion.setSelectedIndex(0);
        unidadVelocidadInicial.setSelectedIndex(0);
        unidadDistancia.setSelectedIndex(0);
        unidadTiempo.setSelectedIndex(0);

        // Limpiar los resultados y fórmulas mostradas
        Respuesta.setText("");
        formula.setText("");
    }//GEN-LAST:event_LimpiarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AceleracionField;
    private javax.swing.JLabel AceleracionLabel;
    private javax.swing.JButton CalcularVelocidadFinal;
    private javax.swing.JButton Limpiar;
    private javax.swing.JLabel Respuesta;
    private javax.swing.JLabel TiempoLabel;
    private javax.swing.JLabel VelocidadFinalLabel1;
    private javax.swing.JTextField VelocidadInicialField;
    private javax.swing.JButton Volver;
    private javax.swing.JTextField distanciaField;
    private javax.swing.JLabel distanciaLabel;
    private javax.swing.JLabel formula;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tiempoField;
    private javax.swing.JComboBox<String> unidadAceleracion;
    private javax.swing.JComboBox<String> unidadDistancia;
    private javax.swing.JComboBox<String> unidadSalida;
    private javax.swing.JComboBox<String> unidadTiempo;
    private javax.swing.JComboBox<String> unidadVelocidadInicial;
    // End of variables declaration//GEN-END:variables
}
