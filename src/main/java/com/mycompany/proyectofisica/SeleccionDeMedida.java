package com.mycompany.proyectofisica;

public class SeleccionDeMedida extends javax.swing.JFrame {

    public SeleccionDeMedida() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Longitud = new javax.swing.JButton();
        Masa = new javax.swing.JButton();
        Tiempo = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Longitud.setBackground(new java.awt.Color(241, 191, 217));
        Longitud.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Longitud.setForeground(new java.awt.Color(190, 108, 157));
        Longitud.setText("LONGITUD");
        Longitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LongitudActionPerformed(evt);
            }
        });
        getContentPane().add(Longitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 220, 50));

        Masa.setBackground(new java.awt.Color(241, 191, 217));
        Masa.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Masa.setForeground(new java.awt.Color(190, 108, 157));
        Masa.setText("MASA");
        Masa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasaActionPerformed(evt);
            }
        });
        getContentPane().add(Masa, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 180, 40));

        Tiempo.setBackground(new java.awt.Color(241, 191, 217));
        Tiempo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Tiempo.setForeground(new java.awt.Color(190, 108, 157));
        Tiempo.setText("TIEMPO");
        Tiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiempoActionPerformed(evt);
            }
        });
        getContentPane().add(Tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 180, 40));

        Volver.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Volver.setForeground(new java.awt.Color(190, 108, 157));
        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });
        getContentPane().add(Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 110, 30));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(190, 108, 157));
        jLabel1.setText("Eliga que desea convertir:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 430, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\gomez\\Downloads\\64017 (1).png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        this.dispose();
        MenuPrincipal volver = new MenuPrincipal();
        volver.setVisible(true);
    }//GEN-LAST:event_VolverActionPerformed

    private void LongitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LongitudActionPerformed
        this.dispose();

        ConvertirLongitud longitud = new ConvertirLongitud();
        longitud.setVisible(true);
    }//GEN-LAST:event_LongitudActionPerformed

    private void MasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasaActionPerformed
        this.dispose();
        ConvertirMasa masa = new ConvertirMasa();
        masa.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_MasaActionPerformed

    private void TiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiempoActionPerformed
        this.dispose();
        ConvertirTiempo tiempo = new ConvertirTiempo();
        tiempo.setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_TiempoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Longitud;
    private javax.swing.JButton Masa;
    private javax.swing.JButton Tiempo;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
