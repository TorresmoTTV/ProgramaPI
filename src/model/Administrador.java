package model;

public class Administrador {
    int IDAdmin;
    String Senha;
    String UsuarioAdmin;

    public Administrador(){
    }

    public Administrador(int iDAdmin, String senha, String usuarioadmin) {
       IDAdmin = iDAdmin;
        Senha = senha;
        UsuarioAdmin = usuarioadmin;
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

    public String getUsuarioAdmin() {
        return UsuarioAdmin;
    }

    public void setUsuarioAdmin(String usuarioadmin) {
        UsuarioAdmin = usuarioadmin;
    }

}
