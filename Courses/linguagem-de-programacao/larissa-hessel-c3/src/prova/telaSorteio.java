package prova;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class telaSorteio extends javax.swing.JFrame {

    Jogo joguinho;
    
    List<Integer> listaNumeros =  Arrays.asList();
    
    public telaSorteio() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btMegaSena = new javax.swing.JButton();
        btLotofacil = new javax.swing.JButton();
        btQuina = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbNumeroSorteado = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbValorGanho = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbNumerosAcertados = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbNomeJogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btMegaSena.setText("Sorteio da Mega Sena");
        btMegaSena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMegaSenaActionPerformed(evt);
            }
        });

        btLotofacil.setText("Sorteio da Loto fácil");
        btLotofacil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLotofacilActionPerformed(evt);
            }
        });

        btQuina.setText("Sorteio da Quina");
        btQuina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQuinaActionPerformed(evt);
            }
        });

        jLabel1.setText("Números sorteados:");

        lbNumeroSorteado.setText("--------------");

        jLabel3.setText("Ganhou os R$");

        lbValorGanho.setText("(valor)");

        jLabel5.setText("da ");

        jLabel6.setText("Você acertou ");

        lbNumerosAcertados.setText("(X)");

        jLabel8.setText("números");

        lbNomeJogo.setText("(nome jogo)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNumerosAcertados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbValorGanho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNomeJogo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lbNumeroSorteado))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btMegaSena)
                        .addGap(18, 18, 18)
                        .addComponent(btLotofacil)
                        .addGap(18, 18, 18)
                        .addComponent(btQuina)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btMegaSena)
                    .addComponent(btLotofacil)
                    .addComponent(btQuina))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbNumeroSorteado))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbValorGanho)
                    .addComponent(jLabel5)
                    .addComponent(lbNomeJogo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lbNumerosAcertados)
                    .addComponent(jLabel8))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btMegaSenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMegaSenaActionPerformed
         
        joguinho = new MegaSena();
         
         lbNumeroSorteado.setText(joguinho.getSorteador());
         lbNomeJogo.setText(joguinho.getNomeJogo());
         lbValorGanho.setText(joguinho.getValorPremio().toString());
         
         Random sorteador = new Random();
         
        
         
        // for (int i = 0; i <= 29; i++) {
            //List<listaNumeros.add>(lbNumeroSorteado("aaaaa"));}
    }//GEN-LAST:event_btMegaSenaActionPerformed

    private void btLotofacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLotofacilActionPerformed
        
        joguinho = new LotoFacil();
         
         lbNumeroSorteado.setText(joguinho.getSorteador());
         lbNomeJogo.setText(joguinho.getNomeJogo());
         
         lbValorGanho.setText(joguinho.getValorPremio().toString());
         
    }//GEN-LAST:event_btLotofacilActionPerformed

    private void btQuinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQuinaActionPerformed
        
        joguinho = new Quina ();
         
         lbNumeroSorteado.setText(joguinho.getSorteador());
         lbNomeJogo.setText(joguinho.getNomeJogo());
         
         lbValorGanho.setText(joguinho.getValorPremio().toString());
    }//GEN-LAST:event_btQuinaActionPerformed

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
            java.util.logging.Logger.getLogger(telaSorteio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaSorteio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaSorteio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaSorteio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaSorteio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLotofacil;
    private javax.swing.JButton btMegaSena;
    private javax.swing.JButton btQuina;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbNomeJogo;
    private javax.swing.JLabel lbNumeroSorteado;
    private javax.swing.JLabel lbNumerosAcertados;
    private javax.swing.JLabel lbValorGanho;
    // End of variables declaration//GEN-END:variables

    private Integer lbNumeroSorteado(String aaaaa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
