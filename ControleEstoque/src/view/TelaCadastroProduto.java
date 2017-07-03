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
import model.bean.Categoria;
import model.bean.Fornecedor;
import model.bean.Produto;
import model.dao.CategoriaDAO;
import model.dao.FornecedorDAO;
import model.dao.ProdutoDAO;

/**
 *
 * @author 106292010
 */
public class TelaCadastroProduto extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroProduto
     */
    public TelaCadastroProduto() {
        initComponents();
        DefaultTableModel dtmProduto = (DefaultTableModel) tblProduto.getModel();
        tblProduto.setRowSorter(new TableRowSorter(dtmProduto));
        
        tblProduto.getColumn("ID").setPreferredWidth(30);
        tblProduto.getColumn("DESCRIÇÃO").setPreferredWidth(100);
        tblProduto.getColumn("QUANTIDADE").setPreferredWidth(40);

        lblPUsuario.setText("Usuário: " + Sessao.getInstance().getNomeUser());

        //popula o combobox categoria
        CategoriaDAO cdao = new CategoriaDAO();
        for (Categoria c : cdao.read()) {
            cbCategoria.addItem(c);
        }
        readJTable();
        //popula combobox fornecedor
        FornecedorDAO ddao = new FornecedorDAO();
        for (Fornecedor f : ddao.read()) {
            cbFornecedor.addItem(f);
        }
        
        //codigo para colocar no botao
        /*
        Categoria categoria = (Categoria) cbCategoria.getSelectedItem();
        //pegar o id fica - categoria.getICategoria
         */
    }

    public void readJTable() {
        DefaultTableModel dtmProduto = (DefaultTableModel) tblProduto.getModel();
        dtmProduto.setNumRows(0);
        ProdutoDAO pdao = new ProdutoDAO();
        String padaria = null;
        for (Produto p : pdao.read()) {

            if (p.getPadaria() == 1) {
                padaria = "Sim";
            } else {
                padaria = "Não";
            }

            dtmProduto.addRow(new Object[]{
                p.getIdProduto(),
                p.getNome(),
                p.getDescricao(),
                p.getQuantidade(),
                "R$ " + p.getValorCompra(),
                "R$ " + p.getValorVenda(),
                p.getNomeFornecedor(),
                p.getNomeCategoria(),
                padaria,});
        }
    }

    public void limpaProduto() {
        txtPNome.setText("");
        txtPDescricao.setText("");
        txtPValor.setText("");
        txtPLucro.setText("");
        txtPQuantidade.setText("");
        txtPNome.setText("");
        cbFornecedor.setSelectedItem("Selecionar");
        cbCategoria.setSelectedItem("Selecionar");
        chkPadaria.setSelected(false);
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
        txtPNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPQuantidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPDescricao = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPLucro = new javax.swing.JTextField();
        btnPCadastrar = new javax.swing.JButton();
        btnPAtualizar = new javax.swing.JButton();
        btnPExcluir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbFornecedor = new javax.swing.JComboBox<>();
        cbCategoria = new javax.swing.JComboBox<>();
        chkPadaria = new javax.swing.JCheckBox();
        lblPUsuario = new javax.swing.JLabel();
        txtPValor = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        btnPLimpar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produtos");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Produto"));

        jLabel1.setText("Nome");

        jLabel2.setText("Quantidade");

        txtPQuantidade.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel3.setText("Descrição");

        txtPDescricao.setColumns(20);
        txtPDescricao.setRows(5);
        jScrollPane1.setViewportView(txtPDescricao);

        jLabel4.setText("Valor de Compra");

        jLabel5.setText("Lucro(%)");

        txtPLucro.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnPCadastrar.setText("Cadastrar");
        btnPCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPCadastrarActionPerformed(evt);
            }
        });

        btnPAtualizar.setText("Atualizar");
        btnPAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPAtualizarActionPerformed(evt);
            }
        });

        btnPExcluir.setText("Excluir");
        btnPExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPExcluirActionPerformed(evt);
            }
        });

        jLabel6.setText("Fornecedor");

        jLabel7.setText("Categoria");

        cbFornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));

        chkPadaria.setText("Padaria");

        lblPUsuario.setText("Usuário: ");

        txtPValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        txtPValor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel8.setText("R$");

        btnPLimpar.setText("Limpar");
        btnPLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnPCadastrar)))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPAtualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(chkPadaria, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(233, 233, 233))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPLimpar)
                            .addComponent(btnPExcluir))
                        .addGap(32, 32, 32))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblPUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtPNome, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(123, 123, 123)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPValor, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(280, 280, 280)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(106, 106, 106))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPLucro, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblPUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPLucro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addComponent(chkPadaria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPLimpar)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPCadastrar)
                            .addComponent(btnPAtualizar)
                            .addComponent(btnPExcluir)))
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtos Cadastrados"));

        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOME", "DESCRIÇÃO", "QUANTIDADE", "VALOR COMPRA", "VALOR VENDA", "FORNECEDOR", "CATEGORIA", "PADARIA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdutoMouseClicked(evt);
            }
        });
        tblProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblProdutoKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblProduto);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
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
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPCadastrarActionPerformed

        //carrega combobox do fornecedor e categoria
        Fornecedor fornecedorcb = (Fornecedor) cbFornecedor.getSelectedItem();
        Categoria categoriacb = (Categoria) cbCategoria.getSelectedItem();

        Produto p = new Produto();
        ProdutoDAO dao = new ProdutoDAO();
        if (Sessao.getInstance().getEdicaoUser() == 0) {
            JOptionPane.showMessageDialog(null, "Usuário sem permissão de edição!");
        } else {
        //op para converter valor de compra para double
        String valorCompra = txtPValor.getText();
        Double valorCompraDouble = new Double(valorCompra.replace(",", "."));

        //op para calcular valor de venda com porcentagem do lucro
        String lucro = txtPLucro.getText();
        Double lucrod = new Double(lucro.replace(",", "."));
        Double lucrodouble = lucrod / 100;
        Double valorVenda = (valorCompraDouble * lucrodouble) + valorCompraDouble;

        p.setNome(txtPNome.getText());
        p.setDescricao(txtPDescricao.getText());
        p.setValorCompra(valorCompraDouble);
        p.setValorVenda(valorVenda);
        p.setQuantidade(Integer.parseInt(txtPQuantidade.getText()));
        p.setFornecedor(fornecedorcb.getIdFornecedor());
        p.setCategoria(categoriacb.getIdCategoria());
        if (chkPadaria.isSelected()) {
            p.setPadaria(1);
        } else {
            p.setPadaria(0);
        }

        dao.create(p);
        readJTable();
        limpaProduto();
        }
    }//GEN-LAST:event_btnPCadastrarActionPerformed

    private void btnPAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPAtualizarActionPerformed
        
        
        if (Sessao.getInstance().getEdicaoUser() == 0) {
            JOptionPane.showMessageDialog(null, "Usuário sem permissão de edição!");
        } else {
        if (tblProduto.getSelectedRow() != -1) {

        //carrega combobox do fornecedor e categoria
        Fornecedor fornecedorcb = (Fornecedor) cbFornecedor.getSelectedItem();
        Categoria categoriacb = (Categoria) cbCategoria.getSelectedItem();

        Produto p = new Produto();
        ProdutoDAO dao = new ProdutoDAO();

        //op para converter valor de compra para double
        String valorCompra = txtPValor.getText();
        Double valorCompraDouble = new Double(valorCompra.replace(",", "."));

        //op para calcular valor de venda com porcentagem do lucro
        String lucro = txtPLucro.getText();
        Double lucrod = new Double(lucro.replace(",", "."));
        Double lucrodouble = lucrod / 100;
        Double valorVenda = (valorCompraDouble * lucrodouble) + valorCompraDouble;

        p.setNome(txtPNome.getText());
        p.setDescricao(txtPDescricao.getText());
        p.setValorCompra(valorCompraDouble);
        p.setValorVenda(valorVenda);
        p.setQuantidade(Integer.parseInt(txtPQuantidade.getText()));
        p.setFornecedor(fornecedorcb.getIdFornecedor());
        p.setCategoria(categoriacb.getIdCategoria());
        if (chkPadaria.isSelected()) {
            p.setPadaria(1);
        } else {
            p.setPadaria(0);
        }
            p.setIdProduto((int) tblProduto.getValueAt(tblProduto.getSelectedRow(), 0));

            dao.update(p);
            readJTable();
            limpaProduto();
        }
        }
    }//GEN-LAST:event_btnPAtualizarActionPerformed

    private void tblProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutoMouseClicked
        
         ProdutoDAO dao = new ProdutoDAO();
         
         
        
        if (tblProduto.getSelectedRow() != -1) {
            
            String nomezinho = tblProduto.getValueAt(tblProduto.getSelectedRow(), 6).toString();
            txtPNome.setText(tblProduto.getValueAt(tblProduto.getSelectedRow(), 1).toString());
            txtPDescricao.setText(tblProduto.getValueAt(tblProduto.getSelectedRow(), 2).toString());
            txtPQuantidade.setText(tblProduto.getValueAt(tblProduto.getSelectedRow(), 3).toString());
            txtPValor.setText(tblProduto.getValueAt(tblProduto.getSelectedRow(), 4).toString());
            cbCategoria.setSelectedItem(dao.buscaFornecedor(nomezinho));
            
            if (tblProduto.getValueAt(tblProduto.getSelectedRow(), 8).equals("Sim")) {
                chkPadaria.setSelected(true);
            } else {
                chkPadaria.setSelected(false);
            }

        }
    }//GEN-LAST:event_tblProdutoMouseClicked

    private void tblProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblProdutoKeyReleased

            if (tblProduto.getSelectedRow() != -1) {
            
            txtPNome.setText(tblProduto.getValueAt(tblProduto.getSelectedRow(), 1).toString());
            txtPDescricao.setText(tblProduto.getValueAt(tblProduto.getSelectedRow(), 2).toString());
            txtPQuantidade.setText(tblProduto.getValueAt(tblProduto.getSelectedRow(), 3).toString());
            txtPValor.setText(tblProduto.getValueAt(tblProduto.getSelectedRow(), 4).toString());
            
            if (tblProduto.getValueAt(tblProduto.getSelectedRow(), 8).equals("Sim")) {
                chkPadaria.setSelected(true);
            } else {
                chkPadaria.setSelected(false);
            }

        }
    }//GEN-LAST:event_tblProdutoKeyReleased

    private void btnPExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPExcluirActionPerformed
       if (Sessao.getInstance().getEdicaoUser() == 0) {
            JOptionPane.showMessageDialog(null, "Usuário sem permissão de edição!");
        } else {
        if (tblProduto.getSelectedRow() != -1) {
            if (JOptionPane.showConfirmDialog(null, "Deseja excluir o produto selecionado?") == 0) {

                Produto p = new Produto();
                ProdutoDAO dao = new ProdutoDAO();
                p.setIdProduto((int) tblProduto.getValueAt(tblProduto.getSelectedRow(), 0));

                dao.delete(p);
                readJTable();
                limpaProduto();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto para excluir!");
        }
       }
        
    }//GEN-LAST:event_btnPExcluirActionPerformed

    private void btnPLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPLimparActionPerformed
        limpaProduto();
    }//GEN-LAST:event_btnPLimparActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPAtualizar;
    private javax.swing.JButton btnPCadastrar;
    private javax.swing.JButton btnPExcluir;
    private javax.swing.JButton btnPLimpar;
    private javax.swing.JComboBox<Object> cbCategoria;
    private javax.swing.JComboBox<Object> cbFornecedor;
    private javax.swing.JCheckBox chkPadaria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblPUsuario;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextArea txtPDescricao;
    private javax.swing.JTextField txtPLucro;
    private javax.swing.JTextField txtPNome;
    private javax.swing.JTextField txtPQuantidade;
    private javax.swing.JFormattedTextField txtPValor;
    // End of variables declaration//GEN-END:variables
}
