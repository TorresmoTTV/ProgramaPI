package model;

public class Tecnico {
    int IDTecnico;
    String Nome;
    int Telefone;
    String Email;
    int CPF;
    String Usuario;
    String Senha;

    public Tecnico(){
    }
    
    public Tecnico(int iDTecnico, String nome, int telefone, String email, int cPF, String usuario, String senha) {
        IDTecnico = iDTecnico;
        Nome = nome;
        Telefone = telefone;
        Email = email;
        CPF = cPF;
        Usuario = usuario;
        Senha = senha;
    }

    public int getIDTecnico() {
        return IDTecnico;
    }

    public void setIDTecnico(int iDTecnico) {
        IDTecnico = iDTecnico;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int telefone) {
        Telefone = telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int cPF) {
        CPF = cPF;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

}
