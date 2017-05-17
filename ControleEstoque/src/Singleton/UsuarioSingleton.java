
package Singleton;


public final class UsuarioSingleton {
    
    private static final UsuarioSingleton INSTANCE = new UsuarioSingleton(); 
    private static String nome;
    private UsuarioSingleton(){
    
        
    }
    
    public static UsuarioSingleton getInstance(){
        return INSTANCE;
    }
    

    public static String getUsuario() {
        return UsuarioSingleton.nome;
    }

    public static void setUsuario(String usuario) {
        UsuarioSingleton.nome = usuario;
    }
    
    public static boolean getPermissao(int edicao){
        boolean permicao = false;
        if(edicao == 1){
            permicao = true;
        }else{
            permicao = false;
        }
        return permicao;
    }
    
}
