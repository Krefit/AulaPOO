/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tela;

import Modelos.PessoaFisica;
import Modelos.TipoPessoa;
import Modelos.PessoaJuridica;
import javax.swing.JOptionPane;

/**
 *
 * @author gusta
 */
public class TelaImpostoRenda extends javax.swing.JFrame {

    /**
     * Creates new form TelaImpostoRenda
     */
    TipoPessoa tp = TipoPessoa.FISICA;

    public TelaImpostoRenda() {
        initComponents();
        jLabelCPF.setVisible(false);
        jLabelSexo.setVisible(false);
        jTextFieldCPF.setVisible(false);
        jTextFieldSexo.setVisible(false);
        jLabelCNPJ.setVisible(false);
        jLabelRazaoSocial.setVisible(false);
        jTextFieldCNPJ.setVisible(false);
        jTextFieldRazaoSocial.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNome = new javax.swing.JLabel();
        jLabelEndereco = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelRendaBruta = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldEndereco = new javax.swing.JTextField();
        jTextFieldTelefone = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldRendaBruta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButtonCalcular = new javax.swing.JButton();
        jLabelSexo = new javax.swing.JLabel();
        jTextFieldSexo = new javax.swing.JTextField();
        jLabelCPF = new javax.swing.JLabel();
        jTextFieldCPF = new javax.swing.JTextField();
        jButtonFisica = new javax.swing.JButton();
        jButtonJuridica = new javax.swing.JButton();
        jLabelCNPJ = new javax.swing.JLabel();
        jLabelRazaoSocial = new javax.swing.JLabel();
        jTextFieldRazaoSocial = new javax.swing.JTextField();
        jTextFieldCNPJ = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelNome.setText("Nome");

        jLabelEndereco.setText("Endereço");

        jLabelTelefone.setText("Telefone");

        jLabelEmail.setText("Email");

        jLabelRendaBruta.setText("Renda Bruta");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButtonCalcular.setText("Calcular");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        jLabelSexo.setText("Sexo");

        jLabelCPF.setText("CPF");

        jButtonFisica.setText("FISICA");
        jButtonFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFisicaActionPerformed(evt);
            }
        });

        jButtonJuridica.setText("JURIDICA");
        jButtonJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJuridicaActionPerformed(evt);
            }
        });

        jLabelCNPJ.setText("CNPJ");

        jLabelRazaoSocial.setText("Razão Social");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelRendaBruta)
                            .addComponent(jLabelNome)
                            .addComponent(jLabelEndereco)
                            .addComponent(jLabelTelefone)
                            .addComponent(jLabelEmail)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCNPJ)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelCPF)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldRendaBruta, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabelRazaoSocial)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelSexo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldSexo))
                                    .addComponent(jTextFieldNome)
                                    .addComponent(jTextFieldEndereco)
                                    .addComponent(jTextFieldTelefone)
                                    .addComponent(jTextFieldEmail))
                                .addGap(134, 134, 134))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonFisica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonJuridica)
                                .addGap(159, 159, 159))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFisica)
                    .addComponent(jButtonJuridica))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabelTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabelRendaBruta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldRendaBruta)
                        .addComponent(jLabelSexo)
                        .addComponent(jTextFieldSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelRazaoSocial)
                        .addComponent(jTextFieldRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCPF)
                    .addComponent(jTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCNPJ)
                    .addComponent(jTextFieldCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCalcular))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
        // TODO add your handling code here:
        try {
            String nome = "";
            String email = "";
            String endereco = "";
            String telefone = "";
            float rendaBruta = 0;
            String CPF = "";
            String sexo = "";
            String CNPJ = "";
            String razaoSocial = "";

            String saida = "";

            nome = jTextFieldNome.getText();
            email = jTextFieldEmail.getText();
            endereco = jTextFieldEndereco.getText();
            telefone = jTextFieldTelefone.getText();
            rendaBruta = Float.parseFloat(jTextFieldRendaBruta.getText());
            
            if (tp == TipoPessoa.FISICA) {
                CPF = jTextFieldCPF.getText();
                sexo = jTextFieldSexo.getText();

                PessoaFisica pf = new PessoaFisica(nome, endereco, telefone, email, rendaBruta, CPF, sexo);
                
                saida = "Imposto de Renda: " + saida + pf.calculaImpostoRenda() + "\n" + pf.toString();

            } else if (tp == TipoPessoa.JURIDICA) {
                CNPJ = jTextFieldCNPJ.getText();
                razaoSocial = jTextFieldRazaoSocial.getText();

                PessoaJuridica pj = new PessoaJuridica(nome, endereco, telefone, email, rendaBruta, CNPJ, razaoSocial);

                saida = "Imposto de renda: " + saida + pj.calculaImpostoRenda() + "\n" + pj.toString();
            }

            jTextArea1.setText(saida);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e);
        }
    }//GEN-LAST:event_jButtonCalcularActionPerformed

    private void jButtonFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFisicaActionPerformed
        // TODO add your handling code here:
        jLabelCPF.setVisible(true);
        jTextFieldCPF.setVisible(true);
        jLabelSexo.setVisible(true);
        jTextFieldSexo.setVisible(true);
        jLabelCNPJ.setVisible(false);
        jLabelRazaoSocial.setVisible(false);
        jTextFieldCNPJ.setVisible(false);
        jTextFieldRazaoSocial.setVisible(false);
        tp = tp.FISICA;

    }//GEN-LAST:event_jButtonFisicaActionPerformed

    private void jButtonJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJuridicaActionPerformed
        // TODO add your handling code here:
        jLabelCPF.setVisible(false);
        jTextFieldCPF.setVisible(false);
        jLabelSexo.setVisible(false);
        jTextFieldSexo.setVisible(false);
        jLabelCNPJ.setVisible(true);
        jLabelRazaoSocial.setVisible(true);
        jTextFieldCNPJ.setVisible(true);
        jTextFieldRazaoSocial.setVisible(true);
        tp = tp.JURIDICA;
    }//GEN-LAST:event_jButtonJuridicaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaImpostoRenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaImpostoRenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaImpostoRenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaImpostoRenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaImpostoRenda().setVisible(true);

            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JButton jButtonFisica;
    private javax.swing.JButton jButtonJuridica;
    private javax.swing.JLabel jLabelCNPJ;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelRazaoSocial;
    private javax.swing.JLabel jLabelRendaBruta;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldCNPJ;
    private javax.swing.JTextField jTextFieldCPF;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldRazaoSocial;
    private javax.swing.JTextField jTextFieldRendaBruta;
    private javax.swing.JTextField jTextFieldSexo;
    private javax.swing.JTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
