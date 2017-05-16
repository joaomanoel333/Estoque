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
import model.bean.Fornecedor;

public class FornecedorDAO {

    public void create(Fornecedor f) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("insert into fornecedor(Nome,Responsavel,CNPJ,Telefone,TelefoneResponsavel) VALUES(?,?,?,?,?)");
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getResponsavel());
            stmt.setString(3, f.getCNPJ());
            stmt.setString(4, f.getTelefone());
            stmt.setString(5, f.getTelefoneResponsavel());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public List<Fornecedor> read() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Fornecedor> fornecedores = new ArrayList<>();

        try {

            stmt = con.prepareStatement("SELECT * FROM fornecedor");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Fornecedor fornecedor = new Fornecedor();

                fornecedor.setIdFornecedor(rs.getInt("idFornecedor"));
                fornecedor.setNome(rs.getString("Nome"));
                fornecedor.setCNPJ(rs.getString("CNPJ"));
                fornecedor.setTelefone(rs.getString("Telefone"));
                fornecedor.setResponsavel(rs.getString("Responsavel"));
                fornecedor.setTelefoneResponsavel(rs.getString("TelefoneResponsavel"));
                fornecedores.add(fornecedor);

            }
        } catch (SQLException ex) {
            Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return fornecedores;
    }

    public void update(Fornecedor f) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE fornecedor SET Nome = ?, CNPJ = ?, Telefone = ? , Responsavel = ?, TelefoneResponsavel = ? WHERE idFornecedor = ?");
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getTelefone());
            stmt.setString(3, f.getCNPJ());
            stmt.setString(4, f.getResponsavel());
            stmt.setString(5, f.getTelefoneResponsavel());
            stmt.setInt(6, f.getIdFornecedor());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public void delete(Fornecedor f) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM fornecedor WHERE idFornecedor = ?");
            stmt.setInt(1, f.getIdFornecedor());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

}
