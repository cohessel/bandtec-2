/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.larissa.hessel.c2;


public class telaPolitico extends javax.swing.JFrame {

    Politico polytico;
        
    public telaPolitico() {
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

        btPresidente = new javax.swing.JButton();
        btSenador = new javax.swing.JButton();
        btPrefeito = new javax.swing.JButton();
        btTempoDeGov = new javax.swing.JButton();
        btSalario = new javax.swing.JButton();
        btOQueFaz = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbEstudandoOCargoDe = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbTempoDeGov = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbSalario = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lbOqueFaz = new javax.swing.JLabel();

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

        btTempoDeGov.setText("Tempo de Governo");
        btTempoDeGov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTempoDeGovActionPerformed(evt);
            }
        });

        btSalario.setText("Salário");
        btSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalarioActionPerformed(evt);
            }
        });

        btOQueFaz.setText("O que faz");
        btOQueFaz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOQueFazActionPerformed(evt);
            }
        });

        jLabel1.setText("Selecione o cargo para estudar");

        jLabel2.setText("Clique para saber a informação desejada ");

        jLabel3.setText("Estudando o cargo de:");

        lbEstudandoOCargoDe.setText("---");

        jLabel5.setText("Tempo de governo:");

        lbTempoDeGov.setText("---");

        jLabel7.setText("anos");

        jLabel8.setText("Salário: R$");

        lbSalario.setText("---");

        jLabel10.setText(" O que faz: ");

        lbOqueFaz.setText("---");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbEstudandoOCargoDe, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btSalario))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(jLabel8)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(lbSalario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(jLabel5)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(lbTempoDeGov)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel7)))
                                                .addGap(39, 39, 39))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(169, 169, 169))
                                            .addComponent(btPrefeito))
                                        .addGap(95, 95, 95))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btPresidente)
                                            .addComponent(jLabel1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(btSenador)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(lbOqueFaz, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(21, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btTempoDeGov)
                        .addGap(101, 101, 101)
                        .addComponent(btOQueFaz)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btPresidente, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btSenador)
                        .addComponent(btPrefeito)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbEstudandoOCargoDe))
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btTempoDeGov)
                    .addComponent(btOQueFaz)
                    .addComponent(btSalario))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lbTempoDeGov)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lbSalario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbOqueFaz)
                    .addComponent(jLabel10))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPresidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPresidenteActionPerformed
        
       polytico = new Presidente();
       lbEstudandoOCargoDe.setText(polytico.getCargoEstudando());
        
        /*lbTempoDeGov.setText(presidente.getTempoDeGov().toString());
        lbOqueFaz.setText(presidente.getOQueFaz());
        lbSalario.setText(presidente.getSalario().toString());*/
    }//GEN-LAST:event_btPresidenteActionPerformed

    private void btSenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSenadorActionPerformed
         polytico = new Senador ();
         lbEstudandoOCargoDe.setText(polytico.getCargoEstudando());
      
    }//GEN-LAST:event_btSenadorActionPerformed

    private void btSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalarioActionPerformed
       lbSalario.setText(polytico.getSalario().toString());
      
    }//GEN-LAST:event_btSalarioActionPerformed

    private void btOQueFazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOQueFazActionPerformed
         lbOqueFaz.setText(polytico.getOQueFaz());
    }//GEN-LAST:event_btOQueFazActionPerformed

    private void btTempoDeGovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTempoDeGovActionPerformed
        lbTempoDeGov.setText(polytico.getTempoDeGov().toString());
    }//GEN-LAST:event_btTempoDeGovActionPerformed

    private void btPrefeitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrefeitoActionPerformed
        polytico = new Prefeito();
        
        lbEstudandoOCargoDe.setText(polytico.getCargoEstudando());
    }//GEN-LAST:event_btPrefeitoActionPerformed

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
            java.util.logging.Logger.getLogger(telaPolitico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaPolitico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaPolitico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaPolitico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaPolitico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btOQueFaz;
    private javax.swing.JButton btPrefeito;
    private javax.swing.JButton btPresidente;
    private javax.swing.JButton btSalario;
    private javax.swing.JButton btSenador;
    private javax.swing.JButton btTempoDeGov;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbEstudandoOCargoDe;
    private javax.swing.JLabel lbOqueFaz;
    private javax.swing.JLabel lbSalario;
    private javax.swing.JLabel lbTempoDeGov;
    // End of variables declaration//GEN-END:variables
}
