/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.larissa.hessel.refazendo.c2;

/**
 *
 * @author hessinho
 */
public class tela extends javax.swing.JFrame {

    Politico poly;
    
    public tela() {
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

        jLabel5 = new javax.swing.JLabel();
        btPresidente = new javax.swing.JButton();
        btSenador = new javax.swing.JButton();
        btPrefeito = new javax.swing.JButton();
        btOqueFaz = new javax.swing.JButton();
        btSalario = new javax.swing.JButton();
        btTempodeGoverno = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbOqueEscolheuParaEstudar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbSalario = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbTempoGoverno = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbOqueFaz = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jLabel5.setText("Quem você escolheu para estudar:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btPresidente.setText("Presidente");
        btPresidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPresidenteActionPerformed(evt);
            }
        });

        btSenador.setText("Senador");
        btSenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSenadorActionPerformed(evt);
            }
        });

        btPrefeito.setText("Prefeito");
        btPrefeito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrefeitoActionPerformed(evt);
            }
        });

        btOqueFaz.setText("O que faz");
        btOqueFaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOqueFazActionPerformed(evt);
            }
        });

        btSalario.setText("Salário");
        btSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalarioActionPerformed(evt);
            }
        });

        btTempodeGoverno.setText("Tempo de governo");
        btTempodeGoverno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTempodeGovernoActionPerformed(evt);
            }
        });

        jLabel1.setText("Quem você escolheu para estudar:");

        lbOqueEscolheuParaEstudar.setText("-----");

        jLabel3.setText("Salário: R$");

        lbSalario.setText("-----");

        jLabel7.setText("Tempo de governo:");

        lbTempoGoverno.setText("-----");

        jLabel9.setText("O que faz:");

        lbOqueFaz.setText("-----");

        jLabel11.setText("anos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btPresidente)
                                .addGap(38, 38, 38)
                                .addComponent(btSenador)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(btPrefeito))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lbOqueEscolheuParaEstudar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btTempodeGoverno)
                        .addGap(38, 38, 38)
                        .addComponent(btSalario)
                        .addGap(50, 50, 50)
                        .addComponent(btOqueFaz)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(lbOqueFaz, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(lbSalario, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                        .addGap(247, 247, 247))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(lbTempoGoverno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPresidente)
                    .addComponent(btSenador)
                    .addComponent(btPrefeito))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbOqueEscolheuParaEstudar))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btTempodeGoverno)
                    .addComponent(btSalario)
                    .addComponent(btOqueFaz))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lbTempoGoverno)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbSalario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lbOqueFaz))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btTempodeGovernoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTempodeGovernoActionPerformed
         lbTempoGoverno.setText(poly.getTempoDeGoverno().toString());
    }//GEN-LAST:event_btTempodeGovernoActionPerformed

    private void btPresidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPresidenteActionPerformed
       poly = new Presidente();
       lbOqueEscolheuParaEstudar.setText(poly.getoQueEstaEstudando());
       
    }//GEN-LAST:event_btPresidenteActionPerformed

    private void btSenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSenadorActionPerformed
       poly = new Senador();
       lbOqueEscolheuParaEstudar.setText(poly.getoQueEstaEstudando());
    }//GEN-LAST:event_btSenadorActionPerformed

    private void btPrefeitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrefeitoActionPerformed
       poly = new Prefeito();
       lbOqueEscolheuParaEstudar.setText(poly.getoQueEstaEstudando());
    }//GEN-LAST:event_btPrefeitoActionPerformed

    private void btSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalarioActionPerformed
         lbSalario.setText(poly.getSalario().toString());
    }//GEN-LAST:event_btSalarioActionPerformed

    private void btOqueFazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOqueFazActionPerformed
         lbOqueFaz.setText(poly.getoQueFaz());
    }//GEN-LAST:event_btOqueFazActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btOqueFaz;
    private javax.swing.JButton btPrefeito;
    private javax.swing.JButton btPresidente;
    private javax.swing.JButton btSalario;
    private javax.swing.JButton btSenador;
    private javax.swing.JButton btTempodeGoverno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbOqueEscolheuParaEstudar;
    private javax.swing.JLabel lbOqueFaz;
    private javax.swing.JLabel lbSalario;
    private javax.swing.JLabel lbTempoGoverno;
    // End of variables declaration//GEN-END:variables
}
