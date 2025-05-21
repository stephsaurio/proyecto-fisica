/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyectofisica;

import javax.swing.JOptionPane;

public class MovimientoDeProyectiles extends javax.swing.JFrame {

    public MovimientoDeProyectiles() {
        initComponents();
    }

    private double convertirVelocidadASi(double valor, String unidad) {
        switch (unidad) {
            case "km/h":
                return valor / 3.6;
            case "m/s":
                return valor;
            default:
                return valor; // por si hay más, o agregar excepción
        }
    }

    private double convertirDistanciaASi(double valor, String unidad) {
        switch (unidad) {
            case "km":
                return valor * 1000;
            case "m":
                return valor;
            default:
                return valor;
        }
    }

    private double convertirTiempoASi(double tiempo, String unidad) {
        switch (unidad.toLowerCase()) {
            case "segundos":
                return tiempo;
            case "minutos":
                return tiempo * 60;
            case "horas":
                return tiempo * 3600;
            default:
                return tiempo;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        unidadVelocidadInicial = new javax.swing.JComboBox<>();
        VelocidadInicialField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        anguloField = new javax.swing.JTextField();
        unidadAngulo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        alturaInicialField = new javax.swing.JTextField();
        unidadSalida = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        tiempoEnUnInstanteField = new javax.swing.JTextField();
        distanciaField = new javax.swing.JTextField();
        tiempoTotalField = new javax.swing.JTextField();
        unidadTiempo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        unidadDistancia = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        CalcularAceleracion = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        Respuesta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        formula = new javax.swing.JLabel();
        unidadTiempo1 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        hMaxField = new javax.swing.JTextField();
        unidadhMax = new javax.swing.JComboBox<>();
        unidadV0y = new javax.swing.JComboBox<>();
        V0yField = new javax.swing.JTextField();
        AceleracionLabel = new javax.swing.JLabel();
        VelocidadFinalLabel1 = new javax.swing.JLabel();
        V0xField = new javax.swing.JTextField();
        unidadV0x = new javax.swing.JComboBox<>();
        Volver = new javax.swing.JButton();
        alturayField = new javax.swing.JTextField();
        unidadY = new javax.swing.JComboBox<>();
        TiempoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(241, 191, 217));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(190, 108, 157));
        jLabel4.setText("ingrese los datos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, -1));

        jLabel5.setBackground(new java.awt.Color(241, 191, 217));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(190, 108, 157));
        jLabel5.setText("Tiempo en un instante (t'):");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 30));

        unidadVelocidadInicial.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        unidadVelocidadInicial.setForeground(new java.awt.Color(190, 108, 157));
        unidadVelocidadInicial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m/s", "km/h", " " }));
        unidadVelocidadInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadVelocidadInicialActionPerformed(evt);
            }
        });
        getContentPane().add(unidadVelocidadInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, 80, 30));

        VelocidadInicialField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        VelocidadInicialField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VelocidadInicialFieldActionPerformed(evt);
            }
        });
        getContentPane().add(VelocidadInicialField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 240, 30));

        jLabel6.setBackground(new java.awt.Color(241, 191, 217));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(190, 108, 157));
        jLabel6.setText("Velocidad inicial (v₀):");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        anguloField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        anguloField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anguloFieldActionPerformed(evt);
            }
        });
        getContentPane().add(anguloField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 240, 30));

        unidadAngulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        unidadAngulo.setForeground(new java.awt.Color(190, 108, 157));
        unidadAngulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "°", "rad" }));
        unidadAngulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadAnguloActionPerformed(evt);
            }
        });
        getContentPane().add(unidadAngulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 80, 30));

        jLabel7.setBackground(new java.awt.Color(241, 191, 217));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(190, 108, 157));
        jLabel7.setText("Ángulo de lanzamiento (θ):");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        alturaInicialField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        alturaInicialField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alturaInicialFieldActionPerformed(evt);
            }
        });
        getContentPane().add(alturaInicialField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 220, 30));

        unidadSalida.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        unidadSalida.setForeground(new java.awt.Color(190, 108, 157));
        unidadSalida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m", "km" }));
        unidadSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadSalidaActionPerformed(evt);
            }
        });
        getContentPane().add(unidadSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 80, 30));

        jLabel8.setBackground(new java.awt.Color(241, 191, 217));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(190, 108, 157));
        jLabel8.setText("Altura inicial (y₀):");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 40));

        tiempoEnUnInstanteField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tiempoEnUnInstanteField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiempoEnUnInstanteFieldActionPerformed(evt);
            }
        });
        getContentPane().add(tiempoEnUnInstanteField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 230, 30));

        distanciaField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        distanciaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distanciaFieldActionPerformed(evt);
            }
        });
        getContentPane().add(distanciaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 240, 30));

        tiempoTotalField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tiempoTotalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiempoTotalFieldActionPerformed(evt);
            }
        });
        getContentPane().add(tiempoTotalField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 240, 30));

        unidadTiempo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        unidadTiempo.setForeground(new java.awt.Color(190, 108, 157));
        unidadTiempo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "horas", "minutos", "segundos" }));
        unidadTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadTiempoActionPerformed(evt);
            }
        });
        getContentPane().add(unidadTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 100, 30));

        jLabel9.setBackground(new java.awt.Color(241, 191, 217));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(190, 108, 157));
        jLabel9.setText("Tiempo total de vuelo (t):");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 30));

        unidadDistancia.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        unidadDistancia.setForeground(new java.awt.Color(190, 108, 157));
        unidadDistancia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m", "km" }));
        unidadDistancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadDistanciaActionPerformed(evt);
            }
        });
        getContentPane().add(unidadDistancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 70, 30));

        jLabel10.setBackground(new java.awt.Color(241, 191, 217));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(190, 108, 157));
        jLabel10.setText("Distancia horizontal (R):");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 30));

        CalcularAceleracion.setBackground(new java.awt.Color(241, 191, 217));
        CalcularAceleracion.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        CalcularAceleracion.setForeground(new java.awt.Color(190, 108, 157));
        CalcularAceleracion.setText("calcular");
        CalcularAceleracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularAceleracionActionPerformed(evt);
            }
        });
        getContentPane().add(CalcularAceleracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 520, -1, 50));

        Limpiar.setBackground(new java.awt.Color(245, 215, 226));
        Limpiar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        Limpiar.setForeground(new java.awt.Color(209, 129, 148));
        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, -1, -1));

        jLabel11.setBackground(new java.awt.Color(241, 191, 217));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(190, 108, 157));
        jLabel11.setText("Respuesta:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, -1, -1));

        Respuesta.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        Respuesta.setForeground(new java.awt.Color(190, 108, 157));
        getContentPane().add(Respuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, 650, 260));

        jLabel1.setBackground(new java.awt.Color(241, 191, 217));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(190, 108, 157));
        jLabel1.setText("Formulas:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 310, -1, -1));

        formula.setBackground(new java.awt.Color(241, 191, 217));
        formula.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        formula.setForeground(new java.awt.Color(190, 108, 157));
        getContentPane().add(formula, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 350, 630, 290));

        unidadTiempo1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        unidadTiempo1.setForeground(new java.awt.Color(190, 108, 157));
        unidadTiempo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "horas", "minutos", "segundos" }));
        unidadTiempo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadTiempo1ActionPerformed(evt);
            }
        });
        getContentPane().add(unidadTiempo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, -1, 30));

        jLabel12.setBackground(new java.awt.Color(241, 191, 217));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(190, 108, 157));
        jLabel12.setText("Altura maxima (hmax):");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, 30));

        hMaxField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        hMaxField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hMaxFieldActionPerformed(evt);
            }
        });
        getContentPane().add(hMaxField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 210, 30));

        unidadhMax.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        unidadhMax.setForeground(new java.awt.Color(190, 108, 157));
        unidadhMax.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m", "km" }));
        unidadhMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadhMaxActionPerformed(evt);
            }
        });
        getContentPane().add(unidadhMax, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 60, 30));

        unidadV0y.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        unidadV0y.setForeground(new java.awt.Color(190, 108, 157));
        unidadV0y.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m/s", "km/h}" }));
        unidadV0y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadV0yActionPerformed(evt);
            }
        });
        getContentPane().add(unidadV0y, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 90, 30));

        V0yField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        V0yField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V0yFieldActionPerformed(evt);
            }
        });
        getContentPane().add(V0yField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 220, 30));

        AceleracionLabel.setBackground(new java.awt.Color(241, 191, 217));
        AceleracionLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AceleracionLabel.setForeground(new java.awt.Color(190, 108, 157));
        AceleracionLabel.setText("V0y:");
        getContentPane().add(AceleracionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, -1, -1));

        VelocidadFinalLabel1.setBackground(new java.awt.Color(241, 191, 217));
        VelocidadFinalLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        VelocidadFinalLabel1.setForeground(new java.awt.Color(190, 108, 157));
        VelocidadFinalLabel1.setText("V0x:");
        getContentPane().add(VelocidadFinalLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        V0xField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        V0xField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V0xFieldActionPerformed(evt);
            }
        });
        getContentPane().add(V0xField, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 200, 30));

        unidadV0x.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        unidadV0x.setForeground(new java.awt.Color(190, 108, 157));
        unidadV0x.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m/s", "km/h}" }));
        unidadV0x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadV0xActionPerformed(evt);
            }
        });
        getContentPane().add(unidadV0x, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 90, 30));

        Volver.setBackground(new java.awt.Color(245, 215, 226));
        Volver.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        Volver.setForeground(new java.awt.Color(209, 129, 148));
        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        getContentPane().add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 10, -1, -1));

        alturayField.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        alturayField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alturayFieldActionPerformed(evt);
            }
        });
        getContentPane().add(alturayField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 200, 30));

        unidadY.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        unidadY.setForeground(new java.awt.Color(190, 108, 157));
        unidadY.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "m", "km" }));
        unidadY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unidadYActionPerformed(evt);
            }
        });
        getContentPane().add(unidadY, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 90, 30));

        TiempoLabel.setBackground(new java.awt.Color(241, 191, 217));
        TiempoLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TiempoLabel.setForeground(new java.awt.Color(190, 108, 157));
        TiempoLabel.setText("altura especifica (y):");
        getContentPane().add(TiempoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VelocidadInicialFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VelocidadInicialFieldActionPerformed
    }//GEN-LAST:event_VelocidadInicialFieldActionPerformed

    private void unidadVelocidadInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadVelocidadInicialActionPerformed
    }//GEN-LAST:event_unidadVelocidadInicialActionPerformed

    private void anguloFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anguloFieldActionPerformed
    }//GEN-LAST:event_anguloFieldActionPerformed

    private void unidadAnguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadAnguloActionPerformed
    }//GEN-LAST:event_unidadAnguloActionPerformed

    private void alturaInicialFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alturaInicialFieldActionPerformed
    }//GEN-LAST:event_alturaInicialFieldActionPerformed

    private void unidadSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadSalidaActionPerformed
    }//GEN-LAST:event_unidadSalidaActionPerformed

    private void tiempoEnUnInstanteFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiempoEnUnInstanteFieldActionPerformed
    }//GEN-LAST:event_tiempoEnUnInstanteFieldActionPerformed

    private void distanciaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distanciaFieldActionPerformed
    }//GEN-LAST:event_distanciaFieldActionPerformed

    private void tiempoTotalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiempoTotalFieldActionPerformed
    }//GEN-LAST:event_tiempoTotalFieldActionPerformed
    private void unidadTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadTiempoActionPerformed
    }//GEN-LAST:event_unidadTiempoActionPerformed
    private void unidadDistanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadDistanciaActionPerformed
    }//GEN-LAST:event_unidadDistanciaActionPerformed
    private void CalcularAceleracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularAceleracionActionPerformed
        try {
            double g = 9.81;
            // Leer datos, convertir a SI
            double y0 = alturaInicialField.getText().isEmpty() ? 0 : convertirDistanciaASi(Double.parseDouble(alturaInicialField.getText()), unidadSalida.getSelectedItem().toString());
            double V0 = VelocidadInicialField.getText().isEmpty() ? 0 : convertirVelocidadASi(Double.parseDouble(VelocidadInicialField.getText()), unidadVelocidadInicial.getSelectedItem().toString());
            double angulo = anguloField.getText().isEmpty() ? 0 : Double.parseDouble(anguloField.getText());
            double V0x = V0xField.getText().isEmpty() ? 0 : convertirVelocidadASi(Double.parseDouble(V0xField.getText()), unidadV0x.getSelectedItem().toString());
            double V0y = V0yField.getText().isEmpty() ? 0 : convertirVelocidadASi(Double.parseDouble(V0yField.getText()), unidadV0y.getSelectedItem().toString());
            double hMax = hMaxField.getText().isEmpty() ? 0 : convertirDistanciaASi(Double.parseDouble(hMaxField.getText()), unidadhMax.getSelectedItem().toString());
            double h = alturayField.getText().isEmpty() ? 0 : convertirDistanciaASi(Double.parseDouble(alturayField.getText()), unidadY.getSelectedItem().toString());
            double tTotal = tiempoTotalField.getText().isEmpty() ? 0 : convertirTiempoASi(Double.parseDouble(tiempoTotalField.getText()), unidadTiempo1.getSelectedItem().toString());
            double alcance = distanciaField.getText().isEmpty() ? 0 : convertirDistanciaASi(Double.parseDouble(distanciaField.getText()), unidadDistancia.getSelectedItem().toString());

            // Calcular V0 si no está dado pero sí V0x y V0y
            if (V0 == 0 && V0x != 0 && V0y != 0) {
                V0 = Math.sqrt(V0x * V0x + V0y * V0y);
            }
            // Calcular angulo si no está dado pero sí V0x y V0y
            if (angulo == 0 && V0x != 0 && V0y != 0) {
                angulo = Math.toDegrees(Math.atan2(V0y, V0x));
            }
            // Calcular V0x o V0y si están faltando y se tiene V0 y angulo
            double anguloRad = Math.toRadians(angulo);
            if (V0x == 0 && V0 != 0 && angulo != 0) {
                V0x = V0 * Math.cos(anguloRad);
            }
            if (V0y == 0 && V0 != 0 && angulo != 0) {
                V0y = V0 * Math.sin(anguloRad);
            }

            // Si se tiene altura máxima y tiempo total, calcular V0y y V0
            if (hMax > 0 && tTotal > 0) {
                double tSubida = tTotal / 2.0;
                V0y = g * tSubida;
                V0 = Math.sqrt(V0x * V0x + V0y * V0y);
                angulo = Math.toDegrees(Math.atan2(V0y, V0x));
            }

            // Si se tiene alcance y tiempo total, calcular V0x si no está dado
            if (alcance > 0 && tTotal > 0 && V0x == 0) {
                V0x = alcance / tTotal;
            }

            // Calcular tiempo total de vuelo si no está dado (considerando y0)
            if (tTotal == 0 && V0y != 0) {
                if (y0 == 0) {
                    tTotal = 2 * V0y / g;
                } else {
                    double a = -0.5 * g;
                    double b = V0y;
                    double c = y0;
                    double discriminante = b * b - 4 * a * c;
                    if (discriminante >= 0) {
                        double t1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                        double t2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                        tTotal = Math.max(t1, t2);
                        if (tTotal < 0) {
                            tTotal = 0;
                        }
                    }
                }
            }

            StringBuilder sb = new StringBuilder("<html>");

            // Mostrar velocidades y ángulo
            sb.append(String.format("Velocidad inicial (V₀): %.2f m/s<br>", V0));
            sb.append(String.format("Componente V₀x: %.2f m/s<br>", V0x));
            sb.append(String.format("Componente V₀y: %.2f m/s<br>", V0y));
            sb.append(String.format("Ángulo: %.2f°<br><br>", angulo));

            // Altura máxima y tiempo para alcanzarla
            if (V0y != 0) {
                double tMax = V0y / g;
                double alturaMaxCalc = y0 + (V0y * V0y) / (2 * g);
                sb.append(String.format("Altura máxima: %.2f m<br>", alturaMaxCalc));
                sb.append(String.format("Tiempo para alcanzar altura máxima: %.2f s<br>", tMax));
                sb.append(String.format("Tiempo total de vuelo (calculado): %.2f s<br><br>", tTotal));
            }

            // Si se tiene altura y queremos tiempos cuando la alcanza
            if (h != 0) {
                double a = -0.5 * g;
                double b = V0y;
                double c = y0 - h;
                double discriminante = b * b - 4 * a * c;
                if (discriminante < 0) {
                    sb.append("No hay solución real para el tiempo al alcanzar la altura dada.<br>");
                } else {
                    double t1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                    double t2 = (-b - Math.sqrt(discriminante)) / (2 * a);

                    if (t1 >= 0) {
                        sb.append(String.format("Tiempo para alcanzar %.2f m: %.2f s<br>", h, t1));
                    }
                    if (t2 >= 0 && Math.abs(t2 - t1) > 1e-6) {
                        sb.append(String.format("Tiempo para alcanzar %.2f m: %.2f s<br>", h, t2));
                    }
                    if (t1 < 0 && t2 < 0) {
                        sb.append("No hay tiempos positivos para la altura dada.<br>");
                    }
                }
                sb.append("<br>");
            }

            // Mostrar alcance horizontal
            if (V0x > 0 && tTotal > 0) {
                double alcanceCalc = V0x * tTotal;
                sb.append(String.format("Alcance horizontal: %.2f m<br>", alcanceCalc));
            } else if (alcance > 0) {
                sb.append(String.format("Alcance horizontal (dato ingresado): %.2f m<br>", alcance));
            } else {
                sb.append("No se pudo calcular el alcance horizontal con los datos dados.<br>");
            }

            sb.append("</html>");
            Respuesta.setText(sb.toString());

            // Mostrar fórmulas usadas (opcional)
            String formulas = "<html><b>Fórmulas usadas:</b><br>"
                    + "V₀x = V₀·cos(θ)<br>"
                    + "V₀y = V₀·sen(θ)<br>"
                    + "Altura máxima: y₀ + (V₀y²) / (2g)<br>"
                    + "Tiempo para altura máxima: V₀y / g<br>"
                    + "Posición vertical: y(t) = y₀ + V₀y·t - 0.5·g·t²<br>"
                    + "Alcance horizontal = V₀x · tiempo total<br>"
                    + "</html>";
            formula.setText(formulas);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: Ingresa solo números válidos.");
            Respuesta.setText("Error en los datos.");
            formula.setText("");
        }
    }//GEN-LAST:event_CalcularAceleracionActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        VelocidadInicialField.setText("");
        anguloField.setText("");
        alturaInicialField.setText("");
        tiempoTotalField.setText("");
        distanciaField.setText("");
        tiempoEnUnInstanteField.setText("");
        V0xField.setText("");
        V0yField.setText("");
        // Reiniciar los JComboBox a su primer elemento (opcional)
        unidadVelocidadInicial.setSelectedIndex(0);
        unidadAngulo.setSelectedIndex(0);
        unidadSalida.setSelectedIndex(0);
        unidadTiempo1.setSelectedIndex(0);
        unidadDistancia.setSelectedIndex(0);
        unidadTiempo.setSelectedIndex(0);
        // Limpiar los resultados y fórmulas mostradas
        Respuesta.setText("");
        formula.setText("");
    }//GEN-LAST:event_LimpiarActionPerformed
    private void unidadTiempo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadTiempo1ActionPerformed
    }//GEN-LAST:event_unidadTiempo1ActionPerformed
    private void hMaxFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hMaxFieldActionPerformed
    }//GEN-LAST:event_hMaxFieldActionPerformed
    private void unidadhMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadhMaxActionPerformed
    }//GEN-LAST:event_unidadhMaxActionPerformed
    private void unidadV0yActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadV0yActionPerformed
    }//GEN-LAST:event_unidadV0yActionPerformed
    private void V0yFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_V0yFieldActionPerformed
    }//GEN-LAST:event_V0yFieldActionPerformed
    private void V0xFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_V0xFieldActionPerformed
    }//GEN-LAST:event_V0xFieldActionPerformed
    private void unidadV0xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadV0xActionPerformed
    }//GEN-LAST:event_unidadV0xActionPerformed
    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        this.dispose();
        SeleccionProblemas volver = new SeleccionProblemas();
        volver.setVisible(true);
    }//GEN-LAST:event_VolverActionPerformed
    private void alturayFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alturayFieldActionPerformed
    }//GEN-LAST:event_alturayFieldActionPerformed

    private void unidadYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadYActionPerformed
    }//GEN-LAST:event_unidadYActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AceleracionLabel;
    private javax.swing.JButton CalcularAceleracion;
    private javax.swing.JButton Limpiar;
    private javax.swing.JLabel Respuesta;
    private javax.swing.JLabel TiempoLabel;
    private javax.swing.JTextField V0xField;
    private javax.swing.JTextField V0yField;
    private javax.swing.JLabel VelocidadFinalLabel1;
    private javax.swing.JTextField VelocidadInicialField;
    private javax.swing.JButton Volver;
    private javax.swing.JTextField alturaInicialField;
    private javax.swing.JTextField alturayField;
    private javax.swing.JTextField anguloField;
    private javax.swing.JTextField distanciaField;
    private javax.swing.JLabel formula;
    private javax.swing.JTextField hMaxField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField tiempoEnUnInstanteField;
    private javax.swing.JTextField tiempoTotalField;
    private javax.swing.JComboBox<String> unidadAngulo;
    private javax.swing.JComboBox<String> unidadDistancia;
    private javax.swing.JComboBox<String> unidadSalida;
    private javax.swing.JComboBox<String> unidadTiempo;
    private javax.swing.JComboBox<String> unidadTiempo1;
    private javax.swing.JComboBox<String> unidadV0x;
    private javax.swing.JComboBox<String> unidadV0y;
    private javax.swing.JComboBox<String> unidadVelocidadInicial;
    private javax.swing.JComboBox<String> unidadY;
    private javax.swing.JComboBox<String> unidadhMax;
    // End of variables declaration//GEN-END:variables
}
