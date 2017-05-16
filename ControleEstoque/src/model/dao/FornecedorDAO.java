package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
            JOptionPane.showMessageDialog(null, "Erro ao Salvar "+ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
