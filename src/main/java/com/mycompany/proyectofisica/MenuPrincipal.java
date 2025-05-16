package com.mycompany.proyectofisica;
public class MenuPrincipal extends javax.swing.JFrame {
 public MenuPrincipal() {
        initComponents();
    }
 
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        ConversionDeMedidas = new javax.swing.JButton();
        SolucionDeProblemasFisicos = new javax.swing.JButton();
        InformacionDelEstudiante = new javax.swing.JButton();
        Cerrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(213, 144, 166));
        jLabel1.setText("Bienvenido");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, -1, -1));

        ConversionDeMedidas.setBackground(new java.awt.Color(232, 195, 204));
        ConversionDeMedidas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        ConversionDeMedidas.setForeground(new java.awt.Color(213, 144, 166));
        ConversionDeMedidas.setText("Conversión de medidas");
        ConversionDeMedidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConversionDeMedidasActionPerformed(evt);
            }
        });
        getContentPane().add(ConversionDeMedidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 300, 50));

        SolucionDeProblemasFisicos.setBackground(new java.awt.Color(232, 195, 204));
        SolucionDeProblemasFisicos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        SolucionDeProblemasFisicos.setForeground(new java.awt.Color(213, 144, 166));
        SolucionDeProblemasFisicos.setText("Solución de problemas físicos");
        SolucionDeProblemasFisicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolucionDeProblemasFisicosActionPerformed(evt);
            }
        });
        getContentPane().add(SolucionDeProblemasFisicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 370, 50));

        InformacionDelEstudiante.setBackground(new java.awt.Color(232, 195, 204));
        InformacionDelEstudiante.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        InformacionDelEstudiante.setForeground(new java.awt.Color(213, 144, 166));
        InformacionDelEstudiante.setText("Información del estudiante");
        InformacionDelEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformacionDelEstudianteActionPerformed(evt);
            }
        });
        getContentPane().add(InformacionDelEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 340, 50));

        Cerrar.setBackground(new java.awt.Color(207, 136, 161));
        Cerrar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Cerrar.setForeground(new java.awt.Color(137, 55, 75));
        Cerrar.setText("Cerrar");
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });
        getContentPane().add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(213, 144, 166));
        jLabel2.setText("Seleccione alguna de las siguientes opciones:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 653, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\gomez\\Downloads\\b7832f34029ac968877bcb5dc9211c50 (2).jpg")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 990, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SolucionDeProblemasFisicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolucionDeProblemasFisicosActionPerformed
this.dispose();
SeleccionProblemas sp = new SeleccionProblemas();
sp.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_SolucionDeProblemasFisicosActionPerformed

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
this.dispose();    }//GEN-LAST:event_CerrarActionPerformed

    private void ConversionDeMedidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConversionDeMedidasActionPerformed
        this.dispose(); 
        SeleccionDeMedida seleccion = new SeleccionDeMedida();
        seleccion.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_ConversionDeMedidasActionPerformed

    private void InformacionDelEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformacionDelEstudianteActionPerformed
this.dispose();
InformacionEstudiante info = new InformacionEstudiante();
info.setVisible(true);
    }//GEN-LAST:event_InformacionDelEstudianteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cerrar;
    private javax.swing.JButton ConversionDeMedidas;
    private javax.swing.JButton InformacionDelEstudiante;
    private javax.swing.JButton SolucionDeProblemasFisicos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables
}
