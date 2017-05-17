
package model.dao;

import connection.Sessao;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bean.Usuario;


public class UsuarioDAO {
    
    public List<Usuario> read(){
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
            List<Usuario> usuarios = new ArrayList<>();
            
            
            try {
                
                stmt = con.prepareStatement("SELECT * FROM usuario");
                rs = stmt.executeQuery();
                
                while (rs.next()){
                    Usuario usuario = new Usuario();
                    
                    usuario.setIdUsuario(rs.getInt("idUsuario"));
                    usuario.setNome(rs.getString("Nome"));
                    usuario.setEdicao(rs.getBoolean("Edicao"));
                    usuarios.add(usuario);
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                ConnectionFactory.closeConnection(con, stmt, rs);
            }
            return usuarios;
        }
    
    
        
    public boolean checkLogin(String login, String senha){
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            boolean check = false;
            Usuario usuario = new Usuario();
            
            try {
                
                stmt = con.prepareStatement("SELECT * FROM usuario WHERE Nome = ? and Senha = ?");
                stmt.setString(1, login);
                stmt.setString(2, senha);
                rs = stmt.executeQuery();
                
                if(rs.next()){
                    
                    check = true;
                    Sessao.getInstance().setUsuario(login);
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                ConnectionFactory.closeConnection(con, stmt, rs);
            }
            return check;
        }
    
    
    
    
}
