/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import servicos.AdminTecnicoServico;
import servicos.ServicosFactory;
import model.Administrador;
import model.Tecnico;

/**
 *
 * @author 182310076
 */
public class AdminTecnico extends javax.swing.JFrame {

    /**
     * Creates new form AdminTecnico
     */
    public AdminTecnico() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextLogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSenha = new javax.swing.JPasswordField();
        jBLogarAdminTecnico = new javax.swing.JButton();
        jBVoltarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Login:");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel2.setText("Senha:");

        jBLogarAdminTecnico.setText("Entrar");
        jBLogarAdminTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLogarAdminTecnicoActionPerformed(evt);
            }
        });

        jBVoltarCliente.setText("Área Cliente");
        jBVoltarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBVoltarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(488, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBVoltarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBLogarAdminTecnico))
                    .addComponent(jTextLogin, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(169, 169, 169))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(189, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBLogarAdminTecnico)
                    .addComponent(jBVoltarCliente))
                .addGap(97, 97, 97))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBLogarAdminTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLogarAdminTecnicoActionPerformed
        // TODO add your handling code here:
        String login = jTextLogin.getText();
        String senha = new String(jSenha.getPassword());

        try {
            AdminTecnicoServico servico = ServicosFactory.getAdminTecnico();
            Object usuario = servico.loginUnico(login, senha);

            if (usuario instanceof Administrador) {
                javax.swing.JOptionPane.showMessageDialog(this, "Login realizado como Administrador!", "Sucesso", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                // Abra a interface para Administrador
                AdministradorView janelaa = new AdministradorView();
                janelaa.setVisible(true);
                setVisible(false);
            } else if (usuario instanceof Tecnico) {
                javax.swing.JOptionPane.showMessageDialog(this, "Login realizado como Técnico!", "Sucesso", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                // Abra a interface para Técnico
                TecnicoView janelat = new TecnicoView();
                janelat.setVisible(true);
                setVisible(false);
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Usuário ou senha inválidos!", "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro ao realizar login: " + e.getMessage());
        }
    }//GEN-LAST:event_jBLogarAdminTecnicoActionPerformed

    private void jBVoltarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBVoltarClienteActionPerformed
        // TODO add your handling code here:
        Principal Principal = new Principal();
        Principal.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jBVoltarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(AdminTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminTecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminTecnico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLogarAdminTecnico;
    private javax.swing.JButton jBVoltarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jSenha;
    private javax.swing.JTextField jTextLogin;
    // End of variables declaration//GEN-END:variables
}
