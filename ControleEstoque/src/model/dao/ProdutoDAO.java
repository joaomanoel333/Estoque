
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bean.Fornecedor;


public class ProdutoDAO {
    
    public void create(Fornecedor f){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO fornecedor (Nome,Responsavel,CNPJ,Telefone,TelefoneResponsavel,UsuarioCadastro,DataCadastro) VALUES(?,?,?,?,?,?,?)");
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getResponsavel());
            stmt.setInt(3, f.getCNPJ());
            stmt.setInt(4, f.getTelefone());
            stmt.setInt(5, f.getTelefoneresponsavel());
            stmt.setInt(6, f.getUsuariocadastro());
            stmt.setDate(7, f.getDataCadastro());
            
                    
                    } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}