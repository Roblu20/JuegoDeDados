package juegodedados;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MejorDe5 extends javax.swing.JFrame {

    public static int dado1J1;
    public static int dado2J1;
    public static int dado1J2;
    public static int dado2J2;
    
    public MejorDe5() {       
    }
     public MejorDe5(String jugador1, String jugador2) {
        initComponents();        
        setLocationRelativeTo(null);
        setTitle("Juego de dados");
        setResizable(false);
        lblJugador1.setText(jugador1);
        lblJugador2.setText(jugador2);
        txtResultadoJ1.setVisible(false);
        txtResultadoJ2.setVisible(false);
        txtResultadoJ3.setVisible(false);
        txtResultadoJ4.setVisible(false);
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblJugador1 = new javax.swing.JLabel();
        lblJugador2 = new javax.swing.JLabel();
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
        btnReiniciar = new javax.swing.JButton();
        txtGanadas1 = new javax.swing.JTextField();
        txtGanadas2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Turno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblJugador1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblJugador1.setText("Jugador 1");

        lblJugador2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblJugador2.setText("Jugador 2");

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

        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        txtGanadas1.setText("0");
        txtGanadas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGanadas1ActionPerformed(evt);
            }
        });

        txtGanadas2.setText("0");
        txtGanadas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGanadas2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Turno #");

        Turno.setText("1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtSuma1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton1))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(lblJugador1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtGanadas1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(76, 76, 76)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblJugador2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtGanadas2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtSuma2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton2))))
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Turno))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtResultadoJ1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtResultadoJ2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(118, 118, 118)
                            .addComponent(txtResultadoJ3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtResultadoJ4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnReiniciar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Turno)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblJugador1)
                                    .addComponent(lblJugador2)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGanadas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGanadas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSuma2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtResultadoJ3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtResultadoJ4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSuma1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtResultadoJ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtResultadoJ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addComponent(btnReiniciar))
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
            
           String suma1 = "" ;
           String suma2 = "";
           suma1 = txtSuma1.getText();
           suma2 = txtSuma2.getText();
           
            if (Integer.parseInt(suma1) > Integer.parseInt(suma2))  {                       
                    
            int result1 = 0; 
            result1 = Integer.parseInt(txtGanadas1.getText()) + 1;           
            txtGanadas1.setText(Integer.toString(result1));            
        } 
            if(Integer.parseInt(suma1) < Integer.parseInt(suma2)){
                
            int result2 = 0;            
            result2 = Integer.parseInt(txtGanadas2.getText()) + 1;           
            txtGanadas2.setText(Integer.toString(result2));                
    }
            if(Integer.parseInt(suma1) == Integer.parseInt(suma2)){
              
                int result1 = 0; 
            result1 = Integer.parseInt(txtGanadas1.getText()) + 1;           
            txtGanadas1.setText(Integer.toString(result1));   
            
                int result2 = 0;            
            result2 = Integer.parseInt(txtGanadas2.getText()) + 1;           
            txtGanadas2.setText(Integer.toString(result2));                
            }
            int contadorturno = Integer.parseInt(Turno.getText());
            contadorturno = contadorturno + 1;
            Turno.setText(Integer.toString(contadorturno));
            
            if(Integer.parseInt(Turno.getText()) > 5){
                 JOptionPane.showMessageDialog(null, "Fin de la partida", "ERROR", JOptionPane.WARNING_MESSAGE);
            }

            /*int contadorturno = Integer.parseInt(Turno.getText());        
        String resultado = "";
        for(int x =0; x < 5; x++){
            contadorturno = contadorturno + 1;
            //Turno.setText(Integer.toString(contadorturno));
        }
        Turno.setText(Integer.toString(contadorturno));
    */
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtSuma1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSuma1ActionPerformed
        
    }//GEN-LAST:event_txtSuma1ActionPerformed
    
    private void txtSuma2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSuma2ActionPerformed
        
    }//GEN-LAST:event_txtSuma2ActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        
       String nombre1 = lblJugador1.getText();
       String nombre2 = lblJugador2.getText();
       new Principal(nombre1,nombre2).setVisible(true);
       dispose();
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void txtGanadas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGanadas1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGanadas1ActionPerformed

    private void txtGanadas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGanadas2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGanadas2ActionPerformed

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
            java.util.logging.Logger.getLogger(MejorDe5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MejorDe5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MejorDe5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MejorDe5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MejorDe5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Dado1Jug1;
    private javax.swing.JLabel Dado1Jug2;
    private javax.swing.JLabel Dado2Jug1;
    private javax.swing.JLabel Dado2Jug2;
    private javax.swing.JLabel Turno;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblJugador1;
    private javax.swing.JLabel lblJugador2;
    private javax.swing.JTextField txtGanadas1;
    private javax.swing.JTextField txtGanadas2;
    private javax.swing.JTextField txtResultadoJ1;
    private javax.swing.JTextField txtResultadoJ2;
    private javax.swing.JTextField txtResultadoJ3;
    private javax.swing.JTextField txtResultadoJ4;
    private javax.swing.JTextField txtSuma1;
    private javax.swing.JTextField txtSuma2;
    // End of variables declaration//GEN-END:variables
}
