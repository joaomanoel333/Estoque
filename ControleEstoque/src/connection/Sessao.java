
package connection;

import model.bean.Usuario;

public class Sessao {
    
//        private static Sessao instance = null;
//    private Usuario usuario;
//    
//    private Sessao(){
//    }
//    
//    public void setUsuario(Usuario usuario) {
//        this.usuario = usuario;
//    }
//    
//    public Usuario getUsuario(){
//        return usuario;
//    }
//    
//    public static Sessao getInstance(){
//        if(instance == null){
//            instance = new Sessao();
//        }
//        return instance;
//    }
//}
    
    

    private static Sessao instance = null;
    private static String nomeUsuario;
    
    
    private Sessao(){
    }
    
    public static void setUsuario(String usuario) {
        Sessao.nomeUsuario = usuario;
    }
    
    public static String getUsuario(){
        return nomeUsuario;
    }
    
    
    
    public static Sessao getInstance(){
        if(instance == null){
            instance = new Sessao();
        }
        return instance;
    }
}
