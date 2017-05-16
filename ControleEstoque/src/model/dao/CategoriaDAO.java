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
import model.bean.Categoria;



public class CategoriaDAO {
        public void create(Categoria d) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("insert into categoria(Nome,Descricao) VALUES(?,?)");
            stmt.setString(1,d.getNome() );
            stmt.setString(2,d.getDescricao() );

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Salvar "+ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
        
        public List<Categoria> read(){
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            List<Categoria> categorias = new ArrayList<>();
            
            
            try {
                
                stmt = con.prepareStatement("SELECT * FROM categoria");
                rs = stmt.executeQuery();
                
                while (rs.next()){
                    Categoria categoria = new Categoria();
                    
                    categoria.setIdCategoria(rs.getInt("idCategoria"));
                    categoria.setNome(rs.getString("Nome"));
                    categoria.setDescricao(rs.getString("Descricao"));
                    categorias.add(categoria);
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(CategoriaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                ConnectionFactory.closeConnection(con, stmt, rs);
            }
            return categorias;
        }
    
}
