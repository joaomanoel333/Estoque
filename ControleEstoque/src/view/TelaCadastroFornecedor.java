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
import model.bean.Fornecedor;
import model.dao.FornecedorDAO;

/**
 *
 * @author Joao_Manoel
 */
public class TelaCadastroFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroFornecedor
     */
    public TelaCadastroFornecedor() {
        initComponents();
        DefaultTableModel dtmFornecedor = (DefaultTableModel) tblFornecedor.getModel();
        tblFornecedor.setRowSorter(new TableRowSorter(dtmFornecedor));
        tblFornecedor.getColumn("ID").setPreferredWidth(30);
        readJTable();
        lblFUsuario.setText("Usuário: " + Sessao.getInstance().getNomeUser());
    }

    public void readJTable() {
        DefaultTableModel dtmFornecedor = (DefaultTableModel) tblFornecedor.getModel();
        dtmFornecedor.setNumRows(0);
        FornecedorDAO fdao = new FornecedorDAO();
        for (Fornecedor f : fdao.read()) {

            dtmFornecedor.addRow(new Object[]{
                f.getIdFornecedor(),
                f.getNome(),
                f.getCNPJ(),
                f.getTelefone(),
                f.getResponsavel(),
                f.getTelefoneResponsavel(),});
        }
    }

    public void limpaFornecedor() {
        txtFNome.setText("");
        txtFCNPJ.setText("");
        txtFTelefone.setText("");
        txtFResponsavel.setText("");
        txtFTelResponsavel.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtFTelefone = new javax.swing.JFormattedTextField();
        txtFCNPJ = new javax.swing.JFormattedTextField();
        txtFNome = new javax.swing.JTextField();
        txtFResponsavel = new javax.swing.JTextField();
        txtFTelResponsavel = new javax.swing.JFormattedTextField();
        btnFCadastrar = new javax.swing.JButton();
        btnFAtualizar = new javax.swing.JButton();
        btnFExcluir = new javax.swing.JButton();
        lblFUsuario = new javax.swing.JLabel();
        btnFLimpar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFornecedor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Fornecedores");
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Fornecedor"));

        jLabel1.setText("Nome");

        jLabel2.setText("Responsavel");

        jLabel3.setText("Telefone do Responsavel");

        jLabel4.setText("CNPJ");

        jLabel5.setText("Telefone");

        try {
            txtFTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtFCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtFTelResponsavel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnFCadastrar.setText("Cadastrar");
        btnFCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFCadastrarActionPerformed(evt);
            }
        });

        btnFAtualizar.setText("Atualizar");
        btnFAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFAtualizarActionPerformed(evt);
            }
        });

        btnFExcluir.setText("Excluir");
        btnFExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFExcluirActionPerformed(evt);
            }
        });

        lblFUsuario.setText("Usuário: ");

        btnFLimpar.setText("Limpar");
        btnFLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 333, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFTelResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(btnFCadastrar)
                .addGap(219, 219, 219)
                .addComponent(btnFAtualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFLimpar)
                    .addComponent(btnFExcluir))
                .addGap(77, 77, 77))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblFUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(txtFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtFResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFTelResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFCadastrar)
                    .addComponent(btnFAtualizar)
                    .addComponent(btnFExcluir)))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Fornecedores Cadastrados"));

        tblFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "CNPJ", "TELEFONE", "RESPONSAVEL", "TELEFONE RESPONSAVEL"
            }
        ));
        tblFornecedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFornecedorMouseClicked(evt);
            }
        });
        tblFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblFornecedorKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblFornecedor);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFCadastrarActionPerformed

        boolean unico = true;
        Fornecedor f = new Fornecedor();
        FornecedorDAO dao = new FornecedorDAO();

        if (Sessao.getInstance().getEdicaoUser() == 0) {
            JOptionPane.showMessageDialog(null, "Usuário sem permissão de edição!");
        } else {
            for (int i = 0; i < tblFornecedor.getModel().getRowCount(); i++) {
                if (txtFNome.getText().toLowerCase().equals(tblFornecedor.getValueAt(i, 1).toString().toLowerCase())) {
                    unico = true;
                } else {
                    unico = false;
                }
            }
            System.out.println(unico + " " + tblFornecedor.getModel().getRowCount());

            if (unico == true) {
                JOptionPane.showMessageDialog(null, "Fornecedor já cadastrado!");
            } else {

                f.setNome(txtFNome.getText());
                f.setResponsavel(txtFResponsavel.getText());
                f.setCNPJ(txtFCNPJ.getText());
                f.setTelefone(txtFTelefone.getText());
                f.setTelefoneResponsavel(txtFTelResponsavel.getText());

                dao.create(f);

                txtFNome.setText("");
                txtFCNPJ.setText("");
                txtFTelefone.setText("");
                txtFResponsavel.setText("");
                txtFTelResponsavel.setText("");

                readJTable();
            }
        }
    }//GEN-LAST:event_btnFCadastrarActionPerformed

    private void btnFAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFAtualizarActionPerformed

        if (Sessao.getInstance().getEdicaoUser() == 0) {
            JOptionPane.showMessageDialog(null, "Usuário sem permissão de edição!");
        } else {
            if (tblFornecedor.getSelectedRow() != -1) {

                Fornecedor f = new Fornecedor();
                FornecedorDAO dao = new FornecedorDAO();
                f.setNome(txtFNome.getText());
                f.setCNPJ(txtFCNPJ.getText());
                f.setTelefone(txtFTelefone.getText());
                f.setResponsavel(txtFResponsavel.getText());
                f.setTelefoneResponsavel(txtFTelResponsavel.getText());
                f.setIdFornecedor((int) tblFornecedor.getValueAt(tblFornecedor.getSelectedRow(), 0));

                dao.update(f);

                txtFNome.setText("");
                txtFCNPJ.setText("");
                txtFTelefone.setText("");
                txtFResponsavel.setText("");
                txtFTelResponsavel.setText("");

                readJTable();
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum fornecedor selecionado!");
            }
        }
    }//GEN-LAST:event_btnFAtualizarActionPerformed

    private void btnFExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFExcluirActionPerformed

        if (Sessao.getInstance().getEdicaoUser() == 0) {
            JOptionPane.showMessageDialog(null, "Usuário sem permissão de edição!");
        } else {
            if (tblFornecedor.getSelectedRow() != -1) {
                if (JOptionPane.showConfirmDialog(null, "Deseja excluir o fornecedor selecionada?") == 0) {

                    Fornecedor f = new Fornecedor();
                    FornecedorDAO dao = new FornecedorDAO();
                    f.setIdFornecedor((int) tblFornecedor.getValueAt(tblFornecedor.getSelectedRow(), 0));

                    dao.delete(f);
                    readJTable();

                    txtFNome.setText("");
                    txtFCNPJ.setText("");
                    txtFTelefone.setText("");
                    txtFResponsavel.setText("");
                    txtFTelResponsavel.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Selecione um fornecedor para excluir!");
            }
        }
    }//GEN-LAST:event_btnFExcluirActionPerformed

    private void tblFornecedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFornecedorMouseClicked
        if (tblFornecedor.getSelectedRow() != -1) {

            txtFNome.setText(tblFornecedor.getValueAt(tblFornecedor.getSelectedRow(), 1).toString());
            txtFCNPJ.setText(tblFornecedor.getValueAt(tblFornecedor.getSelectedRow(), 2).toString());
            txtFTelefone.setText(tblFornecedor.getValueAt(tblFornecedor.getSelectedRow(), 3).toString());
            txtFResponsavel.setText(tblFornecedor.getValueAt(tblFornecedor.getSelectedRow(), 4).toString());
            txtFTelResponsavel.setText(tblFornecedor.getValueAt(tblFornecedor.getSelectedRow(), 5).toString());

        }
    }//GEN-LAST:event_tblFornecedorMouseClicked

    private void tblFornecedorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblFornecedorKeyReleased

        if (tblFornecedor.getSelectedRow() != -1) {

            txtFNome.setText(tblFornecedor.getValueAt(tblFornecedor.getSelectedRow(), 1).toString());
            txtFCNPJ.setText(tblFornecedor.getValueAt(tblFornecedor.getSelectedRow(), 2).toString());
            txtFTelefone.setText(tblFornecedor.getValueAt(tblFornecedor.getSelectedRow(), 3).toString());
            txtFResponsavel.setText(tblFornecedor.getValueAt(tblFornecedor.getSelectedRow(), 4).toString());
            txtFTelResponsavel.setText(tblFornecedor.getValueAt(tblFornecedor.getSelectedRow(), 5).toString());

        }

    }//GEN-LAST:event_tblFornecedorKeyReleased

    private void btnFLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFLimparActionPerformed
        limpaFornecedor();
    }//GEN-LAST:event_btnFLimparActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroFornecedor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFornecedor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFornecedor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroFornecedor.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFAtualizar;
    private javax.swing.JButton btnFCadastrar;
    private javax.swing.JButton btnFExcluir;
    private javax.swing.JButton btnFLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFUsuario;
    private javax.swing.JTable tblFornecedor;
    private javax.swing.JFormattedTextField txtFCNPJ;
    private javax.swing.JTextField txtFNome;
    private javax.swing.JTextField txtFResponsavel;
    private javax.swing.JFormattedTextField txtFTelResponsavel;
    private javax.swing.JFormattedTextField txtFTelefone;
    // End of variables declaration//GEN-END:variables
}
