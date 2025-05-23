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
public class Ttotal extends javax.swing.JFrame {

    /**
     * Creates new form Ttotal
     */
    public Ttotal() {
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
        jLabel7 = new javax.swing.JLabel();
        VelocidadInicialField = new javax.swing.JTextField();
        unidadVelocidadInicial = new javax.swing.JComboBox<>();
        distanciaLabel = new javax.swing.JLabel();
        anguloField = new javax.swing.JTextField();
        unidadAngulo = new javax.swing.JComboBox<>();
        TiempoLabel1 = new javax.swing.JLabel();
        AlcanceField = new javax.swing.JTextField();
        unidadAlcance = new javax.swing.JComboBox<>();
        unidadSalida1 = new javax.swing.JComboBox<>();
        alturaInicialField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        unidadSalida = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        hMaxField = new javax.swing.JTextField();
        unidadhMax = new javax.swing.JComboBox<>();
        VelocidadFinalLabel1 = new javax.swing.JLabel();
        V0xField = new javax.swing.JTextField();
        unidadV0x = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(241, 191, 217));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(190, 108, 157));
        jLabel4.setText("Calcular tiempo total");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        unidadV0y.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        unidadV0y.setForeground(new java.awt.Color(190, 108, 157));
        unidadV0y.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m/s", "km/h}" }));
        unidadV0y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadV0yActionPerformed(evt);
            }
        });
        getContentPane().add(unidadV0y, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 100, 30));

        V0yField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        V0yField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V0yFieldActionPerformed(evt);
            }
        });
        getContentPane().add(V0yField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 290, 30));

        AceleracionLabel.setBackground(new java.awt.Color(241, 191, 217));
        AceleracionLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        AceleracionLabel.setForeground(new java.awt.Color(190, 108, 157));
        AceleracionLabel.setText("V0y:");
        getContentPane().add(AceleracionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        Limpiar.setBackground(new java.awt.Color(245, 215, 226));
        Limpiar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        Limpiar.setForeground(new java.awt.Color(209, 129, 148));
        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, -1, -1));

        CalcularVelocidadInicial.setBackground(new java.awt.Color(241, 191, 217));
        CalcularVelocidadInicial.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        CalcularVelocidadInicial.setForeground(new java.awt.Color(190, 108, 157));
        CalcularVelocidadInicial.setText("calcular");
        CalcularVelocidadInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularVelocidadInicialActionPerformed(evt);
            }
        });
        getContentPane().add(CalcularVelocidadInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 550, -1, 50));

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
        jLabel5.setText("Ttotal:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 120, -1, -1));

        jLabel6.setBackground(new java.awt.Color(241, 191, 217));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(190, 108, 157));
        jLabel6.setText("Respuesta en:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 40, -1, -1));

        formula.setBackground(new java.awt.Color(241, 191, 217));
        formula.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        formula.setForeground(new java.awt.Color(190, 108, 157));
        getContentPane().add(formula, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 220, 630, 160));

        Respuesta.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        getContentPane().add(Respuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 120, 420, 40));

        jLabel7.setBackground(new java.awt.Color(241, 191, 217));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(190, 108, 157));
        jLabel7.setText("Velocidad inicial (v₀):");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        VelocidadInicialField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        VelocidadInicialField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VelocidadInicialFieldActionPerformed(evt);
            }
        });
        getContentPane().add(VelocidadInicialField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 260, 30));

        unidadVelocidadInicial.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        unidadVelocidadInicial.setForeground(new java.awt.Color(190, 108, 157));
        unidadVelocidadInicial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m/s", "km/h", " " }));
        unidadVelocidadInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadVelocidadInicialActionPerformed(evt);
            }
        });
        getContentPane().add(unidadVelocidadInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 110, 30));

        distanciaLabel.setBackground(new java.awt.Color(241, 191, 217));
        distanciaLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        distanciaLabel.setForeground(new java.awt.Color(190, 108, 157));
        distanciaLabel.setText("Angulo (θ):");
        getContentPane().add(distanciaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        anguloField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        anguloField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anguloFieldActionPerformed(evt);
            }
        });
        getContentPane().add(anguloField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 260, 30));

        unidadAngulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        unidadAngulo.setForeground(new java.awt.Color(190, 108, 157));
        unidadAngulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "°", "rad" }));
        unidadAngulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadAnguloActionPerformed(evt);
            }
        });
        getContentPane().add(unidadAngulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 90, 30));

        TiempoLabel1.setBackground(new java.awt.Color(241, 191, 217));
        TiempoLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TiempoLabel1.setForeground(new java.awt.Color(190, 108, 157));
        TiempoLabel1.setText("Alcance (R):");
        getContentPane().add(TiempoLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        AlcanceField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        AlcanceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlcanceFieldActionPerformed(evt);
            }
        });
        getContentPane().add(AlcanceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 260, 30));

        unidadAlcance.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        unidadAlcance.setForeground(new java.awt.Color(190, 108, 157));
        unidadAlcance.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m", "km" }));
        unidadAlcance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadAlcanceActionPerformed(evt);
            }
        });
        getContentPane().add(unidadAlcance, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 110, 30));

        unidadSalida1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        unidadSalida1.setForeground(new java.awt.Color(190, 108, 157));
        unidadSalida1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m", "km" }));
        unidadSalida1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadSalida1ActionPerformed(evt);
            }
        });
        getContentPane().add(unidadSalida1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 80, 30));

        alturaInicialField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        alturaInicialField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alturaInicialFieldActionPerformed(evt);
            }
        });
        getContentPane().add(alturaInicialField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 260, 30));

        jLabel10.setBackground(new java.awt.Color(241, 191, 217));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(190, 108, 157));
        jLabel10.setText("Altura inicial (y₀):");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 40));

        unidadSalida.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        unidadSalida.setForeground(new java.awt.Color(190, 108, 157));
        unidadSalida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "horas", "segundos" }));
        unidadSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadSalidaActionPerformed(evt);
            }
        });
        getContentPane().add(unidadSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 50, 180, 40));

        jLabel12.setBackground(new java.awt.Color(241, 191, 217));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(190, 108, 157));
        jLabel12.setText("Altura maxima (hmax):");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, 40));

        hMaxField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        hMaxField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hMaxFieldActionPerformed(evt);
            }
        });
        getContentPane().add(hMaxField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 260, 30));

        unidadhMax.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        unidadhMax.setForeground(new java.awt.Color(190, 108, 157));
        unidadhMax.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m", "km" }));
        unidadhMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadhMaxActionPerformed(evt);
            }
        });
        getContentPane().add(unidadhMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 80, 30));

        VelocidadFinalLabel1.setBackground(new java.awt.Color(241, 191, 217));
        VelocidadFinalLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        VelocidadFinalLabel1.setForeground(new java.awt.Color(190, 108, 157));
        VelocidadFinalLabel1.setText("V0x:");
        getContentPane().add(VelocidadFinalLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        V0xField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        V0xField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V0xFieldActionPerformed(evt);
            }
        });
        getContentPane().add(V0xField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 260, 30));

        unidadV0x.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        unidadV0x.setForeground(new java.awt.Color(190, 108, 157));
        unidadV0x.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m/s", "km/h}" }));
        unidadV0x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadV0xActionPerformed(evt);
            }
        });
        getContentPane().add(unidadV0x, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 110, 30));

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
        V0xField.setText("");
        VelocidadInicialField.setText("");
        anguloField.setText("");
        hMaxField.setText("");
        AlcanceField.setText("");
        alturaInicialField.setText("");
        Respuesta.setText("");
        formula.setText("");
    }//GEN-LAST:event_LimpiarActionPerformed

    private void CalcularVelocidadInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularVelocidadInicialActionPerformed
        try {
            double V0y = V0yField.getText().isEmpty() ? 0 : Double.parseDouble(V0yField.getText());
            double V0x = V0xField.getText().isEmpty() ? 0 : Double.parseDouble(V0xField.getText());
            double V0 = VelocidadInicialField.getText().isEmpty() ? 0 : Double.parseDouble(VelocidadInicialField.getText());
            double anguloDeg = anguloField.getText().isEmpty() ? 0 : Double.parseDouble(anguloField.getText());
            double alcance = AlcanceField.getText().isEmpty() ? 0 : Double.parseDouble(AlcanceField.getText());
            double hMax = hMaxField.getText().isEmpty() ? 0 : Double.parseDouble(hMaxField.getText());
            double y0 = alturaInicialField.getText().isEmpty() ? 0 : Double.parseDouble(alturaInicialField.getText());

            // Conversión de unidades
            if (unidadV0y.getSelectedItem().equals("km/h")) {
                V0y /= 3.6;
            }
            if (unidadV0x.getSelectedItem().equals("km/h")) {
                V0x /= 3.6;
            }
            if (unidadVelocidadInicial.getSelectedItem().equals("km/h")) {
                V0 /= 3.6;
            }
            if (unidadAlcance.getSelectedItem().equals("km")) {
                alcance *= 1000;
            }
            if (unidadhMax.getSelectedItem().equals("km")) {
                hMax *= 1000;
            }
            if (unidadSalida1.getSelectedItem().equals("km")) {
                y0 *= 1000;
            }

            double anguloRad = Math.toRadians(anguloDeg);
            if (unidadAngulo.getSelectedItem().equals("rad")) {
                anguloRad = anguloDeg;
            }

            double g = 9.81;
            double tiempo = 0;
            String formulaUsada = "";

            // Cálculos posibles
            if (y0 != 0 && V0y != 0) {
                // Usar fórmula cuadrática: 0 = y₀ + V₀y·t - ½·g·t²
                double a = -0.5 * g;
                double b = V0y;
                double c = y0;
                double discriminante = b * b - 4 * a * c;

                if (discriminante < 0) {
                    JOptionPane.showMessageDialog(this, "❌ No hay solución real para el tiempo con los datos dados.");
                    return;
                }

                double t1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double t2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                tiempo = Math.max(t1, t2); // Tiempo total es el mayor
                formulaUsada = "Resolviendo 0 = y₀ + V₀y·t - ½·g·t²";

            } else if (V0y != 0) {
                tiempo = (2 * V0y) / g;
                formulaUsada = "T = 2·V₀y / g";

            } else if (V0 != 0 && anguloRad != 0) {
                tiempo = (2 * V0 * Math.sin(anguloRad)) / g;
                formulaUsada = "T = 2·V₀·sen(θ) / g";

            } else if (alcance != 0 && V0x != 0) {
                tiempo = alcance / V0x;
                formulaUsada = "T = alcance / V₀x";

            } else if (alcance != 0 && V0 != 0 && anguloRad != 0) {
                double Vx = V0 * Math.cos(anguloRad);
                tiempo = alcance / Vx;
                formulaUsada = "T = alcance / (V₀·cos(θ))";

            } else if (hMax != 0) {
                double tSubida = Math.sqrt(2 * hMax / g);
                tiempo = 2 * tSubida;
                formulaUsada = "T = 2·√(2·hₘₐₓ / g)";

            } else {
                JOptionPane.showMessageDialog(this, "⚠️ Ingresa una combinación válida de datos.");
                return;
            }
            if (unidadSalida.getSelectedItem().equals("horas")) {
                tiempo /=3600;
            }
            // Mostrar resultado
            Respuesta.setText(String.format("%.2f ", tiempo));
            formula.setText(formulaUsada);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: Ingresa solo números válidos.");
        }
    }//GEN-LAST:event_CalcularVelocidadInicialActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        this.dispose();
        SeleccionProblemas volver = new SeleccionProblemas();
        volver.setVisible(true);
    }//GEN-LAST:event_VolverActionPerformed

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

    private void AlcanceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlcanceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlcanceFieldActionPerformed

    private void unidadAlcanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadAlcanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unidadAlcanceActionPerformed

    private void unidadSalida1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadSalida1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unidadSalida1ActionPerformed

    private void alturaInicialFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alturaInicialFieldActionPerformed

    }//GEN-LAST:event_alturaInicialFieldActionPerformed

    private void unidadSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unidadSalidaActionPerformed

    private void hMaxFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hMaxFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hMaxFieldActionPerformed

    private void unidadhMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadhMaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unidadhMaxActionPerformed

    private void V0xFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_V0xFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_V0xFieldActionPerformed

    private void unidadV0xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadV0xActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unidadV0xActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AceleracionLabel;
    private javax.swing.JTextField AlcanceField;
    private javax.swing.JButton CalcularVelocidadInicial;
    private javax.swing.JButton Limpiar;
    private javax.swing.JLabel Respuesta;
    private javax.swing.JLabel TiempoLabel1;
    private javax.swing.JTextField V0xField;
    private javax.swing.JTextField V0yField;
    private javax.swing.JLabel VelocidadFinalLabel1;
    private javax.swing.JTextField VelocidadInicialField;
    private javax.swing.JButton Volver;
    private javax.swing.JTextField alturaInicialField;
    private javax.swing.JTextField anguloField;
    private javax.swing.JLabel distanciaLabel;
    private javax.swing.JLabel formula;
    private javax.swing.JTextField hMaxField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> unidadAlcance;
    private javax.swing.JComboBox<String> unidadAngulo;
    private javax.swing.JComboBox<String> unidadSalida;
    private javax.swing.JComboBox<String> unidadSalida1;
    private javax.swing.JComboBox<String> unidadV0x;
    private javax.swing.JComboBox<String> unidadV0y;
    private javax.swing.JComboBox<String> unidadVelocidadInicial;
    private javax.swing.JComboBox<String> unidadhMax;
    // End of variables declaration//GEN-END:variables
}
