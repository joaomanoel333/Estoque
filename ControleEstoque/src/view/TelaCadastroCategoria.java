/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import connection.Sessao;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Categoria;
import model.dao.CategoriaDAO;

/**
 *
 * @author João
 */
public class TelaCadastroCategoria extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroCategoria
     */
    public TelaCadastroCategoria() {
        initComponents();
        DefaultTableModel dtmCategorias = (DefaultTableModel) tblCategoria.getModel();
        tblCategoria.setRowSorter(new TableRowSorter(dtmCategorias));

        //seta o tamanho das colunas
        tblCategoria.getColumn("ID").setPreferredWidth(35);
        tblCategoria.getColumn("NOME").setPreferredWidth(120);
        tblCategoria.getColumn("DESCRIÇÃO").setPreferredWidth(227);
        readJTable();
        lblCUsuario.setText("Usuário: " + Sessao.getUsuario());

    }

    public void readJTable() {
        DefaultTableModel dtmCategorias = (DefaultTableModel) tblCategoria.getModel();
        dtmCategorias.setNumRows(0);
        CategoriaDAO cdao = new CategoriaDAO();
        for (Categoria c : cdao.read()) {

            dtmCategorias.addRow(new Object[]{
                c.getIdCategoria(),
                c.getNome(),
                c.getDescricao()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCDescricao = new javax.swing.JTextArea();
        btnCCadastrar = new javax.swing.JButton();
        btnCAtualizar = new javax.swing.JButton();
        btnCExcluir = new javax.swing.JButton();
        lblCUsuario = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCategoria = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Categorias");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados da Categoria"));

        jLabel1.setText("Nome");

        jLabel2.setText("Descrição");

        txtCDescricao.setColumns(20);
        txtCDescricao.setRows(5);
        jScrollPane1.setViewportView(txtCDescricao);

        btnCCadastrar.setText("Cadastrar");
        btnCCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCCadastrarActionPerformed(evt);
            }
        });

        btnCAtualizar.setText("Atualizar");
        btnCAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCAtualizarActionPerformed(evt);
            }
        });

        btnCExcluir.setText("Excluir");
        btnCExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCExcluirActionPerformed(evt);
            }
        });

        lblCUsuario.setText("Usuário: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCNome))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCCadastrar)
                        .addGap(67, 67, 67)
                        .addComponent(btnCAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addComponent(btnCExcluir))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblCUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblCUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCCadastrar)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnCAtualizar)
                        .addComponent(btnCExcluir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Categorias Cadastradas"));

        tblCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "DESCRIÇÃO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCategoria.setToolTipText("");
        tblCategoria.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCategoriaMouseClicked(evt);
            }
        });
        tblCategoria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblCategoriaKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblCategoria);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnCCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCCadastrarActionPerformed

        boolean unico = false;
        Categoria c = new Categoria();
        CategoriaDAO dao = new CategoriaDAO();

        //Valida se já existe um item salvo
        for (int i = 0; i < tblCategoria.getModel().getRowCount(); i++) {
            if (txtCNome.getText().equals(tblCategoria.getValueAt(i, 1))) {
                unico = true;
            } else {
                unico = false;
            }
        }

        System.out.println(unico + " " + tblCategoria.getModel().getRowCount());

        if (unico == true) {
            JOptionPane.showMessageDialog(null, "Categoria já cadastrada!");
        } else {

            c.setNome(txtCNome.getText());
            c.setDescricao(txtCDescricao.getText());

            dao.create(c);

            txtCNome.setText("");
            txtCDescricao.setText("");
            readJTable();
        }
    }//GEN-LAST:event_btnCCadastrarActionPerformed

    private void tblCategoriaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblCategoriaKeyReleased

        if (tblCategoria.getSelectedRow() != -1) {

            txtCNome.setText(tblCategoria.getValueAt(tblCategoria.getSelectedRow(), 1).toString());
            txtCDescricao.setText(tblCategoria.getValueAt(tblCategoria.getSelectedRow(), 2).toString());

        }

    }//GEN-LAST:event_tblCategoriaKeyReleased

    private void btnCExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCExcluirActionPerformed

        if (tblCategoria.getSelectedRow() != -1) {
            if (JOptionPane.showConfirmDialog(null, "Deseja excluir a categoria selecionada?") == 0) {
                Categoria c = new Categoria();
                CategoriaDAO dao = new CategoriaDAO();
                c.setIdCategoria((int) tblCategoria.getValueAt(tblCategoria.getSelectedRow(), 0));

                dao.delete(c);

                txtCNome.setText("");
                txtCDescricao.setText("");
                readJTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione uma categoria para excluir");
        }
    }//GEN-LAST:event_btnCExcluirActionPerformed

    private void tblCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCategoriaMouseClicked

        if (tblCategoria.getSelectedRow() != -1) {

            txtCNome.setText(tblCategoria.getValueAt(tblCategoria.getSelectedRow(), 1).toString());
            txtCDescricao.setText(tblCategoria.getValueAt(tblCategoria.getSelectedRow(), 2).toString());
        }
    }//GEN-LAST:event_tblCategoriaMouseClicked

    private void btnCAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCAtualizarActionPerformed

        if (tblCategoria.getSelectedRow() != -1) {

            Categoria c = new Categoria();
            CategoriaDAO dao = new CategoriaDAO();
            c.setNome(txtCNome.getText());
            c.setDescricao(txtCDescricao.getText());
            c.setIdCategoria((int) tblCategoria.getValueAt(tblCategoria.getSelectedRow(), 0));

            dao.update(c);

            txtCNome.setText("");
            txtCDescricao.setText("");
            readJTable();

        } else {
            JOptionPane.showMessageDialog(null, "Nenhuma categoria selecionada!");
        }

    }//GEN-LAST:event_btnCAtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCAtualizar;
    private javax.swing.JButton btnCCadastrar;
    private javax.swing.JButton btnCExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCUsuario;
    private javax.swing.JTable tblCategoria;
    private javax.swing.JTextArea txtCDescricao;
    private javax.swing.JTextField txtCNome;
    // End of variables declaration//GEN-END:variables
}
