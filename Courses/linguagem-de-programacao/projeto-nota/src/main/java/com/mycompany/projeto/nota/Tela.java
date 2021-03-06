/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.nota;

/**
 *
 * @author Aluno
 */
public class Tela extends javax.swing.JFrame {

    Boletim boletim;
    /**
     * Creates new form Tela
     */
    public Tela() {
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

        btResultadoBandtec = new javax.swing.JButton();
        btResultadoEsquina = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbResultado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfNota = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfFrequencia = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btResultadoBandtec.setText("Ver resultado bandtec");
        btResultadoBandtec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResultadoBandtecActionPerformed(evt);
            }
        });

        btResultadoEsquina.setText("Ver resultado UniEsquina");
        btResultadoEsquina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResultadoEsquinaActionPerformed(evt);
            }
        });

        jLabel1.setText("Resultado:");

        lbResultado.setText("-----------");

        jLabel2.setText("Nota:");

        tfNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNotaActionPerformed(evt);
            }
        });

        jLabel3.setText("Frequencia:");

        tfFrequencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFrequenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfFrequencia, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tfNota, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btResultadoBandtec)
                        .addGap(18, 18, 18)
                        .addComponent(btResultadoEsquina))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lbResultado)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(tfFrequencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btResultadoBandtec)
                    .addComponent(btResultadoEsquina))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbResultado))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btResultadoBandtecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResultadoBandtecActionPerformed
        Double nota = Double.valueOf(tfNota.getText());
        Double frequencia = Double.valueOf(tfFrequencia.getText());
        boletim = new BoletimBandtec(nota, frequencia);
        lbResultado.setText(boletim.getResultado());
    }//GEN-LAST:event_btResultadoBandtecActionPerformed

    private void tfNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNotaActionPerformed
       
    }//GEN-LAST:event_tfNotaActionPerformed

    private void tfFrequenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFrequenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFrequenciaActionPerformed

    private void btResultadoEsquinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResultadoEsquinaActionPerformed
        Double nota = Double.valueOf(tfNota.getText());
        Double frequencia = Double.valueOf(tfFrequencia.getText());
        boletim = new BoletimUniEsquina(nota, frequencia);
        lbResultado.setText(boletim.getResultado());
    }//GEN-LAST:event_btResultadoEsquinaActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btResultadoBandtec;
    private javax.swing.JButton btResultadoEsquina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbResultado;
    private javax.swing.JTextField tfFrequencia;
    private javax.swing.JTextField tfNota;
    // End of variables declaration//GEN-END:variables
}
