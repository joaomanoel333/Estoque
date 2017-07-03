
package connection;

import model.bean.Usuario;

public class Sessao {
    private static Sessao instance = null;
    private Usuario usuario;
    
    private Sessao(){
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public Usuario getUsuario(){
        return usuario;
    }
    
    public String getNomeUser(){
        return usuario.getNome();
    }
    
    public int getEdicaoUser(){
        return usuario.getEdicao();
    }
    
    public int getIdUsuario(){
        return usuario.getIdUsuario();
    }
    
    public static Sessao getInstance(){
        if(instance == null){
            instance = new Sessao();
        }
        return instance;
    }
}
