/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Cliente;
import servicos.ClienteServico;
import servicos.ServicosFactory;
import model.LoginCliente;
import servicos.ProjetoOSServico;

/**
 *
 * @author 182310076
 */
public class EditarConta extends javax.swing.JFrame {

    int idEdit;
    private int idCliente = LoginCliente.getInstancia().getIdCliente();;

    /**
     * Creates new form CriarConta
     */
    public EditarConta() {
        initComponents();
        EditarContaCliente();
    }

    public void EditarContaCliente() {
        ClienteServico cs = ServicosFactory.getClienteServico();
        Cliente c = cs.getClienteById(idCliente);

        jNomeCliente.setText(c.getNome());
        jEmailCliente.setText(c.getEmail());
        jCPFCliente.setText(c.getCPF());
        jEndrecoCliente.setText(c.getEndereco());
        jTelefoneCliente.setText(c.getTelefone());
        jUsuarioCliente.setText(c.getUsuarioCliente());
        jSenhaCliente.setText(c.getSenha());
    }

    public boolean validaInputs() {
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jBAtualizarContaCliente = new javax.swing.JButton();
        jNomeCliente = new javax.swing.JTextField();
        jEmailCliente = new javax.swing.JTextField();
        jCPFCliente = new javax.swing.JTextField();
        jTelefoneCliente = new javax.swing.JTextField();
        jUsuarioCliente = new javax.swing.JTextField();
        jSenhaCliente = new javax.swing.JPasswordField();
        jBSairedicao = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jEndrecoCliente = new javax.swing.JTextField();
        jBDeletarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Editar conta");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Telefone:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Email:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("CPF:");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Usuário:");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Senha:");

        jBAtualizarContaCliente.setText("Atualizar Conta");
        jBAtualizarContaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAtualizarContaClienteActionPerformed(evt);
            }
        });

        jCPFCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCPFClienteActionPerformed(evt);
            }
        });

        jBSairedicao.setText("Voltar para página de pedidos");
        jBSairedicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairedicaoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Endereço:");

        jBDeletarCliente.setBackground(new java.awt.Color(153, 0, 0));
        jBDeletarCliente.setText("Deletar Cliente");
        jBDeletarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDeletarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBAtualizarContaCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBDeletarCliente))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jNomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                    .addComponent(jEmailCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                    .addComponent(jCPFCliente)
                                    .addComponent(jTelefoneCliente)
                                    .addComponent(jEndrecoCliente)
                                    .addComponent(jUsuarioCliente, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSenhaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(193, 193, 193)
                .addComponent(jBSairedicao)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jNomeCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jEmailCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCPFCliente))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jEndrecoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTelefoneCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jUsuarioCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSenhaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSairedicao)
                    .addComponent(jBAtualizarContaCliente)
                    .addComponent(jBDeletarCliente))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSairedicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairedicaoActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jBSairedicaoActionPerformed

    private void jBAtualizarContaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtualizarContaClienteActionPerformed
        if (validaInputs()) {
            Cliente c = new Cliente();

            c.setIDUsuario(idCliente);
            c.setNome(jNomeCliente.getText().toUpperCase());
            c.setEmail(jEmailCliente.getText());
            c.setCPF(jCPFCliente.getText());
            c.setEndereco(jEndrecoCliente.getText());
            c.setTelefone(jTelefoneCliente.getText());
            c.setUsuarioCliente(jUsuarioCliente.getText());
            c.setSenha(jSenhaCliente.getText());// verificar encriptação senha

            ClienteServico usuarioS = ServicosFactory.getClienteServico();
            try {
                usuarioS.atualizaCliente(c);
                javax.swing.JOptionPane.showMessageDialog(this, "Conta atualizada com sucesso!", "Sucesso", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                setVisible(false);
            } catch (Exception e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Erro ao atualizar a conta: " + e.getMessage(), "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jBAtualizarContaClienteActionPerformed

    private void jCPFClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCPFClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCPFClienteActionPerformed

    private void jBDeletarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDeletarClienteActionPerformed
        // TODO add your handling code here:
        // erro com a tabela do projeto_ordemdeservico porque ele possui a chave estrangeira
        String nome = (String) jNomeCliente.getText();
        Object[] btnMSG = {"Sim", "Não"};
        int resp = JOptionPane.showOptionDialog(this, "Deseja realmente deletar " + nome, ".: Deletar :.",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, btnMSG, btnMSG[0]);
        if (resp == 0) {
            ProjetoOSServico POCs = ServicosFactory.getProjetoOSServico();
            POCs.deletarProjetoOSByIdCliente(idCliente);
            ClienteServico CLIs = ServicosFactory.getClienteServico();
            CLIs.deletarCliente(idCliente);
            JOptionPane.showMessageDialog(this, "Cliente " + nome + " deletado com sucesso!");
            setVisible(false);
            Principal p = new Principal();
            p.setVisible(true);                    
        } else {
            JOptionPane.showMessageDialog(this, "Ok, delete cancelado com sucesso!");
        }
    }//GEN-LAST:event_jBDeletarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(EditarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarConta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAtualizarContaCliente;
    private javax.swing.JButton jBDeletarCliente;
    private javax.swing.JButton jBSairedicao;
    private javax.swing.JTextField jCPFCliente;
    private javax.swing.JTextField jEmailCliente;
    private javax.swing.JTextField jEndrecoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jNomeCliente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JPasswordField jSenhaCliente;
    private javax.swing.JTextField jTelefoneCliente;
    private javax.swing.JTextField jUsuarioCliente;
    // End of variables declaration//GEN-END:variables
}
