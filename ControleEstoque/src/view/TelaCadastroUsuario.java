/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import connection.Sessao;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Usuario;
import model.dao.UsuarioDAO;

/**
 *
 * @author Joao_Manoel
 */
public class TelaCadastroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroUsuario1
     */
    public TelaCadastroUsuario() {
        initComponents();
        System.out.println("Erro load 1");
        DefaultTableModel dtmUsuario = (DefaultTableModel) tblUsuario.getModel();
        tblUsuario.setRowSorter(new TableRowSorter(dtmUsuario));
        readJTable();
        lblUUsuario.setText("Usuário: " + Sessao.getUsuario());
        System.out.println("Erro load 2");
    }

    public void readJTable() {
        System.out.println("Erro read 1");
        String edicao = null;
        DefaultTableModel dtmUsuario = (DefaultTableModel) tblUsuario.getModel();
        dtmUsuario.setNumRows(0);
        UsuarioDAO dao = new UsuarioDAO();
        for (Usuario u : dao.read()) {

            if (u.getEdicao() == 1) {
                edicao = "Sim";
            } else {
                edicao = "Não";
            }
            dtmUsuario.addRow(new Object[]{
                u.getIdUsuario(),
                u.getNome(),
                u.getSenha(),
                edicao
            });
        }
        System.out.println("Erro read 2");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        chkPermissao = new javax.swing.JCheckBox();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        txtConfirmaSenha = new javax.swing.JTextField();
        btnUCadastrar = new javax.swing.JButton();
        btnUAtualizar = new javax.swing.JButton();
        btnUExcluir = new javax.swing.JButton();
        lblUUsuario = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuario = new javax.swing.JTable();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Usuário");
        setAlwaysOnTop(true);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Usuário"));

        jLabel1.setText("Usuário");

        jLabel2.setText("Senha");

        jLabel3.setText("Confirmar Senha");

        chkPermissao.setText("Permissão de Edição");

        btnUCadastrar.setText("Cadastrar");
        btnUCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUCadastrarActionPerformed(evt);
            }
        });

        btnUAtualizar.setText("Atualizar");
        btnUAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUAtualizarActionPerformed(evt);
            }
        });

        btnUExcluir.setText("Excluir");
        btnUExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUExcluirActionPerformed(evt);
            }
        });

        lblUUsuario.setText("Usuário: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnUCadastrar)
                        .addGap(64, 64, 64)
                        .addComponent(btnUAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(btnUExcluir)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(chkPermissao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(txtUsuario)
                            .addComponent(txtSenha)
                            .addComponent(txtConfirmaSenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblUUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(lblUUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConfirmaSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(chkPermissao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUCadastrar)
                    .addComponent(btnUAtualizar)
                    .addComponent(btnUExcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuários Cadastrados"));

        tblUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "SENHA", "EDIÇÃO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuarioMouseClicked(evt);
            }
        });
        tblUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblUsuarioKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsuario);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUCadastrarActionPerformed
        boolean unico = false;
        Usuario u = new Usuario();
        UsuarioDAO dao = new UsuarioDAO();
        System.out.println("Erro cadastrar 1");
        if (txtSenha.getText().equals(txtConfirmaSenha.getText())) {

            //Valida se já existe um item salvo
            for (int i = 0; i < tblUsuario.getModel().getRowCount(); i++) {
                if (txtUsuario.getText().equals(tblUsuario.getValueAt(i, 1))) {
                    unico = true;
                    System.out.println("Erro cadastrar 2");
                } else {
                    unico = false;
                    System.out.println("Erro cadastrar 3");
                }
            }
            System.out.println("Erro cadastrar 4");

            if (unico == true) {
                JOptionPane.showMessageDialog(null, "Usuário já cadastrado!");
            } else {

                System.out.println("Erro cadastrar 5");
                u.setNome(txtUsuario.getText());
                u.setSenha(txtSenha.getText());
                u.setEdicao(0);
                if (chkPermissao.isSelected()) {
                    u.setEdicao(1);
                    System.out.println("Erro cadastrar 6");
                } else {
                    u.setEdicao(0);
                    System.out.println("Erro cadastrar 7");
                }

                dao.create(u);
                System.out.println("Erro cadastrar 8");

                txtUsuario.setText("");
                txtSenha.setText("");
                txtConfirmaSenha.setText("");
                chkPermissao.setSelected(unico);
                System.out.println("Erro cadastrar 8");
                readJTable();
                System.out.println("Erro cadastrar 9");
            }
        } else {
            JOptionPane.showMessageDialog(null, "A senha digitada precisa ser igual em ambos os campos!");
        }
    }//GEN-LAST:event_btnUCadastrarActionPerformed

    private void btnUAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUAtualizarActionPerformed

        if (tblUsuario.getSelectedRow() != -1) {

            Usuario u = new Usuario();
            UsuarioDAO dao = new UsuarioDAO();
            u.setNome(txtUsuario.getText());
            u.setSenha(txtSenha.getText());
            u.setEdicao(0);
            if (chkPermissao.isSelected()) {
                u.setEdicao(1);
            } else {
                u.setEdicao(0);
            }

            u.setIdUsuario((int) tblUsuario.getValueAt(tblUsuario.getSelectedRow(), 0));

            dao.update(u);

            txtUsuario.setText("");
            txtSenha.setText("");
            txtConfirmaSenha.setText("");
            readJTable();

        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma categoria selecionada!");
        }
    }//GEN-LAST:event_btnUAtualizarActionPerformed

    private void btnUExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUExcluirActionPerformed
        if (tblUsuario.getSelectedRow() != -1) {
            if (JOptionPane.showConfirmDialog(null, "Deseja excluir a categoria selecionada?") == 0) {
                Usuario u = new Usuario();
                UsuarioDAO dao = new UsuarioDAO();
                u.setIdUsuario((int) tblUsuario.getValueAt(tblUsuario.getSelectedRow(), 0));

                dao.delete(u);

                txtUsuario.setText("");
                txtSenha.setText("");
                txtConfirmaSenha.setText("");
                readJTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma categoria para excluir");
        }
    }//GEN-LAST:event_btnUExcluirActionPerformed

    private void tblUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuarioMouseClicked
       
        if (tblUsuario.getSelectedRow() != -1) {

            txtUsuario.setText(tblUsuario.getValueAt(tblUsuario.getSelectedRow(), 1).toString());
            txtSenha.setText(tblUsuario.getValueAt(tblUsuario.getSelectedRow(), 2).toString());
            txtConfirmaSenha.setText(tblUsuario.getValueAt(tblUsuario.getSelectedRow(), 2).toString());
            if(tblUsuario.getValueAt(tblUsuario.getSelectedRow(), 3).equals("Sim")){
                chkPermissao.setSelected(true);
            }else{
                chkPermissao.setSelected(false);
            }
        }
    }//GEN-LAST:event_tblUsuarioMouseClicked

    private void tblUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblUsuarioKeyReleased
        if (tblUsuario.getSelectedRow() != -1) {

            txtUsuario.setText(tblUsuario.getValueAt(tblUsuario.getSelectedRow(), 1).toString());
            txtSenha.setText(tblUsuario.getValueAt(tblUsuario.getSelectedRow(), 2).toString());
            txtConfirmaSenha.setText(tblUsuario.getValueAt(tblUsuario.getSelectedRow(), 2).toString());
            if(tblUsuario.getValueAt(tblUsuario.getSelectedRow(), 3).equals("Sim")){
                chkPermissao.setSelected(true);
            }else{
                chkPermissao.setSelected(false);
            }
        }
    }//GEN-LAST:event_tblUsuarioKeyReleased

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
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUAtualizar;
    private javax.swing.JButton btnUCadastrar;
    private javax.swing.JButton btnUExcluir;
    private javax.swing.JCheckBox chkPermissao;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUUsuario;
    private javax.swing.JTable tblUsuario;
    private javax.swing.JTextField txtConfirmaSenha;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
