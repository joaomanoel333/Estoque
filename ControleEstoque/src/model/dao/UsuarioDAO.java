package model.dao;

import connection.ConnectionFactory;
import connection.Sessao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Usuario;

public class UsuarioDAO {

    public List<Usuario> read() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        System.out.println("Erro no list 1");
        List<Usuario> usuarios = new ArrayList<>();

        try {

            System.out.println("Erro no list 1");
            stmt = con.prepareStatement("SELECT * FROM usuario");
            rs = stmt.executeQuery();
            System.out.println("Erro no list 1.5");
            while (rs.next()) {
                Usuario usuario = new Usuario();
                System.out.println("Erro no list 2");
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                usuario.setNome(rs.getString("Nome"));
                usuario.setSenha(rs.getString("Senha"));
                usuario.setEdicao(rs.getInt("Edicao"));
                usuarios.add(usuario);
                System.out.println("Erro no list 2.5");
            }
            System.out.println("Erro no list 3");
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
            System.out.println("Erro no list 4");
        }
        return usuarios;
    }

    public boolean checkLogin(String login, String senha) {
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

            if (rs.next()) {

                check = true;
                Sessao.getInstance().setUsuario(login);

            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return check;
    }

    public void create(Usuario u) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("insert into usuario(Nome,Senha,Edicao) VALUES(?,?,?)");
            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getSenha());
            stmt.setInt(3, u.getEdicao());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public void update(Usuario u) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE usuario SET Nome = ?, Senha = ?, Edicao = ? WHERE idUsuario = ?");
            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getSenha());
            stmt.setInt(3, u.getEdicao());
            stmt.setInt(4, u.getIdUsuario());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public void delete(Usuario u) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM usuario WHERE idUsuario = ?");
            stmt.setInt(1, u.getIdUsuario());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

}
