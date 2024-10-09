package model;

public class Administrador {
    int IDAdmin;
    String Senha;
    String Usuario;

    public Administrador(){
    }

    public Administrador(int iDAdmin, String senha, String usuario) {
        IDAdmin = iDAdmin;
        Senha = senha;
        Usuario = usuario;
    }

    public int getIDAdmin() {
        return IDAdmin;
    }

    public void setIDAdmin(int iDAdmin) {
        IDAdmin = iDAdmin;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

}
