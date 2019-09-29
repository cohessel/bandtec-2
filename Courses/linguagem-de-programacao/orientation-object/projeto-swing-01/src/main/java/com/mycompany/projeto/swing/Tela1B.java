package com.mycompany.projeto.swing;

import java.awt.Color;

public class Tela1B extends javax.swing.JFrame {

    /**
     * Creates new form Tela1B
     */
    public Tela1B() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lbTexto1 = new javax.swing.JLabel();
        lbTexto2 = new javax.swing.JLabel();
        lbTexto3 = new javax.swing.JLabel();
        btAcaoA = new javax.swing.JButton();
        btAcaoB = new javax.swing.JButton();

        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Bom dia");

        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Boa tarde ");

        jLabel3.setText("Boa noite");

        jButton1.setText("Ação A");

        jButton2.setText("Ação B");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTexto1.setForeground(new java.awt.Color(0, 102, 51));
        lbTexto1.setText("Bom dia");

        lbTexto2.setForeground(new java.awt.Color(255, 0, 51));
        lbTexto2.setText("Boa tarde");

        lbTexto3.setText("Boa noite");

        btAcaoA.setText("Ação A");
        btAcaoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAcaoAActionPerformed(evt);
            }
        });

        btAcaoB.setText("Ação B");
        btAcaoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAcaoBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTexto3)
                            .addComponent(lbTexto2)
                            .addComponent(lbTexto1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAcaoA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addComponent(btAcaoB)
                        .addGap(58, 58, 58))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lbTexto1)
                .addGap(30, 30, 30)
                .addComponent(lbTexto2)
                .addGap(30, 30, 30)
                .addComponent(lbTexto3)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAcaoA)
                    .addComponent(btAcaoB))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAcaoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAcaoAActionPerformed
        lbTexto1.setText("NumCreio!!!");
    }//GEN-LAST:event_btAcaoAActionPerformed

    private void btAcaoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAcaoBActionPerformed
       lbTexto2.setText(lbTexto3.getText());
       
       lbTexto3.setForeground(Color.ORANGE);
       
       lbTexto2.setForeground(lbTexto3.getForeground());
    }//GEN-LAST:event_btAcaoBActionPerformed

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
            java.util.logging.Logger.getLogger(Tela1B.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela1B.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela1B.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela1B.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela1B().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAcaoA;
    private javax.swing.JButton btAcaoB;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbTexto1;
    private javax.swing.JLabel lbTexto2;
    private javax.swing.JLabel lbTexto3;
    // End of variables declaration//GEN-END:variables
}