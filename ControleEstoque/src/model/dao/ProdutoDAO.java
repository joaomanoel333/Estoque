/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Produto;

/**
 *
 * @author João
 */
public class ProdutoDAO {
    
    public List<Produto> read() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Produto> produtos = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM produto");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Produto produto = new Produto();

                produto.setIdProduto(rs.getInt("idFornecedor"));
                produto.setNome(rs.getString("Nome"));
                produto.setDescricao(rs.getString("Descricao"));
                produto.setValorCompra(rs.getDouble("ValorCompra"));
                produto.setValorVenda(rs.getDouble("ValorVenda"));
                produto.setQuantidade(rs.getInt("Quantidade"));
                produto.setFornecedor(rs.getInt("Fornecedor"));
                produto.setCategoria(rs.getInt("Categoria"));
                produto.setPadaria(rs.getInt("Padaria"));
                produtos.add(produto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return produtos;
    }
    
     public void create(Produto p) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("insert into produto(Nome,Descricao,ValorCompra,ValorVenda,Quantidade,Fornecedor,Categoria,Padaria) VALUES(?,?,?,?,?,?,?,?)");
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getDescricao());
            stmt.setDouble(3, p.getValorCompra());
            stmt.setDouble(4, p.getValorVenda());
            stmt.setInt(5, p.getQuantidade());
            stmt.setInt(6, p.getFornecedor());
            stmt.setInt(7, p.getCategoria());
            stmt.setInt(8, p.getPadaria());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        } 
    }
     
     public void update(Produto p) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE produto SET Nome = ?, Descricao = ?,ValorCompra = ?,ValorVenda = ?,Quantidade = ?,Fornecedor = ?,Categoria = ?,Padaria = ? WHERE idProduto = ?");
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getDescricao());
            stmt.setDouble(3, p.getValorCompra());
            stmt.setDouble(4, p.getValorVenda());
            stmt.setInt(5, p.getQuantidade());
            stmt.setInt(6, p.getFornecedor());
            stmt.setInt(7, p.getCategoria());
            stmt.setInt(8, p.getPadaria());
            stmt.setInt(9, p.getIdProduto());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
     
         public void delete(Produto p) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM produto WHERE idProduto = ?");
            stmt.setInt(1, p.getIdProduto());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
}
