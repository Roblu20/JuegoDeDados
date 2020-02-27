package juegodedados;

import java.util.Random;
import javax.swing.ImageIcon;

public class MayorPuntaje extends javax.swing.JFrame {

    public static int dado1J1;
    public static int dado2J1;
    public static int dado1J2;
    public static int dado2J2;
    
    public MayorPuntaje() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Dado2Jug2 = new javax.swing.JLabel();
        Dado1Jug2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Dado2Jug1 = new javax.swing.JLabel();
        Dado1Jug1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtResultadoJ1 = new javax.swing.JTextField();
        txtResultadoJ2 = new javax.swing.JTextField();
        txtResultadoJ3 = new javax.swing.JTextField();
        txtResultadoJ4 = new javax.swing.JTextField();
        txtSuma1 = new javax.swing.JTextField();
        txtSuma2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Jugador 1");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Jugador 2");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        Dado2Jug2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegodedados/Dado5.png"))); // NOI18N

        Dado1Jug2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegodedados/Dado3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Dado1Jug2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(Dado2Jug2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Dado2Jug2, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(Dado1Jug2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        Dado2Jug1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegodedados/Dado1.png"))); // NOI18N

        Dado1Jug1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juegodedados/Dado6.png"))); // NOI18N
        Dado1Jug1.setMaximumSize(new java.awt.Dimension(60, 60));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Dado1Jug1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(Dado2Jug1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Dado1Jug1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Dado2Jug1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jButton1.setText("Inicio Jugador 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Inicio Jugador 2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtSuma1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSuma1ActionPerformed(evt);
            }
        });

        txtSuma2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSuma2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtResultadoJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtResultadoJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jButton2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(txtResultadoJ3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtResultadoJ4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(txtSuma1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSuma2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtResultadoJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResultadoJ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResultadoJ3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResultadoJ4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSuma1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSuma2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(156, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Random rnd = new Random();
            dado1J1 = 0;
            dado1J1 = ((int)(rnd.nextDouble()*6));
            dado2J1 = 0;
            dado2J1 = ((int)(rnd.nextDouble()*6));
            
            Integer sumaFinal1 = 0;
            String resultado1 = "";
            String resultado2 = "";
            
            if (dado1J1==0){
            Dado1Jug1.setIcon(new ImageIcon(getClass().getResource("Dado1.png")));
            txtResultadoJ1.setText("1");
            }
                else if (dado1J1==1){
                Dado1Jug1.setIcon(new ImageIcon(getClass().getResource("Dado2.png")));
                txtResultadoJ1.setText("2");
                }
                else if (dado1J1==2){
                Dado1Jug1.setIcon(new ImageIcon(getClass().getResource("Dado3.png")));
                txtResultadoJ1.setText("3");
                }
                else if (dado1J1==3){
                Dado1Jug1.setIcon(new ImageIcon(getClass().getResource("Dado4.png")));
                txtResultadoJ1.setText("4");
                }
                else if (dado1J1==4){
                Dado1Jug1.setIcon(new ImageIcon(getClass().getResource("Dado5.png")));
                txtResultadoJ1.setText("5");
                }
                else if (dado1J1==5){
                Dado1Jug1.setIcon(new ImageIcon(getClass().getResource("Dado6.png")));
                txtResultadoJ1.setText("6");
                }
            if (dado2J1==0){
            Dado2Jug1.setIcon(new ImageIcon(getClass().getResource("Dado1.png")));
            txtResultadoJ2.setText("1");
            }
                else if (dado2J1==1){
                Dado2Jug1.setIcon(new ImageIcon(getClass().getResource("Dado2.png")));
                txtResultadoJ2.setText("2");
                }
                else if (dado2J1==2){
                Dado2Jug1.setIcon(new ImageIcon(getClass().getResource("Dado3.png")));
                txtResultadoJ2.setText("3");
                }
                else if (dado2J1==3){
                Dado2Jug1.setIcon(new ImageIcon(getClass().getResource("Dado4.png")));
                txtResultadoJ2.setText("4");
                }
                else if (dado2J1==4){
                Dado2Jug1.setIcon(new ImageIcon(getClass().getResource("Dado5.png")));
                txtResultadoJ2.setText("5");
                }
                else if (dado2J1==5){
                Dado2Jug1.setIcon(new ImageIcon(getClass().getResource("Dado6.png")));
                txtResultadoJ2.setText("6");
                }
            
            resultado1 = txtResultadoJ1.getText();
            resultado2 = txtResultadoJ2.getText();
            
            sumaFinal1 = Integer.parseInt(resultado1) + Integer.parseInt(resultado2);
            txtSuma1.setText(sumaFinal1.toString());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Random rnd = new Random();
            dado1J2 = 0;
            dado1J2 = ((int)(rnd.nextDouble()*6));
            dado2J2 = 0;
            dado2J2 = ((int)(rnd.nextDouble()*6));
            
            Integer sumaFinal2 = 0;
            String resultado3 = "";
            String resultado4 = "";
            
            if (dado1J2==0){
                Dado1Jug2.setIcon(new ImageIcon(getClass().getResource("Dado1.png")));
                txtResultadoJ3.setText("1");
                }
                else if (dado1J2==1){
                Dado1Jug2.setIcon(new ImageIcon(getClass().getResource("Dado2.png")));
                txtResultadoJ3.setText("2");
                }
                else if (dado1J2==2){
                Dado1Jug2.setIcon(new ImageIcon(getClass().getResource("Dado3.png")));
                txtResultadoJ3.setText("3");
                }
                else if (dado1J2==3){
                Dado1Jug2.setIcon(new ImageIcon(getClass().getResource("Dado4.png")));
                txtResultadoJ3.setText("4");
                }
                else if (dado1J2==4){
                Dado1Jug2.setIcon(new ImageIcon(getClass().getResource("Dado5.png")));
                txtResultadoJ3.setText("5");
                }
                else if (dado1J2==5){
                Dado1Jug2.setIcon(new ImageIcon(getClass().getResource("Dado6.png")));
                txtResultadoJ3.setText("6");
                }
            if (dado2J2==0){
            Dado2Jug2.setIcon(new ImageIcon(getClass().getResource("Dado1.png")));
            txtResultadoJ4.setText("1");
            }
                else if (dado2J2==1){
                Dado2Jug2.setIcon(new ImageIcon(getClass().getResource("Dado2.png")));
                txtResultadoJ4.setText("2");
                }
                else if (dado2J2==2){
                Dado2Jug2.setIcon(new ImageIcon(getClass().getResource("Dado3.png")));
                txtResultadoJ4.setText("3");
                }
                else if (dado2J2==3){
                Dado2Jug2.setIcon(new ImageIcon(getClass().getResource("Dado4.png")));
                txtResultadoJ4.setText("4");
                }
                else if (dado2J2==4){
                Dado2Jug2.setIcon(new ImageIcon(getClass().getResource("Dado5.png")));
                txtResultadoJ4.setText("5");
                }
                else if (dado2J2==5){
                Dado2Jug2.setIcon(new ImageIcon(getClass().getResource("Dado6.png")));
                txtResultadoJ4.setText("6");
                }
            resultado3 = txtResultadoJ3.getText();
            resultado4 = txtResultadoJ4.getText();
            
            sumaFinal2 = Integer.parseInt(resultado3) + Integer.parseInt(resultado4);
            txtSuma2.setText(sumaFinal2.toString());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtSuma1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSuma1ActionPerformed
        
    }//GEN-LAST:event_txtSuma1ActionPerformed
    
    private void txtSuma2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSuma2ActionPerformed
        
    }//GEN-LAST:event_txtSuma2ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MayorPuntaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MayorPuntaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MayorPuntaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MayorPuntaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MayorPuntaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dado1Jug1;
    private javax.swing.JLabel Dado1Jug2;
    private javax.swing.JLabel Dado2Jug1;
    private javax.swing.JLabel Dado2Jug2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtResultadoJ1;
    private javax.swing.JTextField txtResultadoJ2;
    private javax.swing.JTextField txtResultadoJ3;
    private javax.swing.JTextField txtResultadoJ4;
    private javax.swing.JTextField txtSuma1;
    private javax.swing.JTextField txtSuma2;
    // End of variables declaration//GEN-END:variables
}
