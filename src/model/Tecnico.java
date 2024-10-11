package model;

public class Tecnico {
    int IDTecnico;
    String Nome;
    String Telefone;
    String Email;
    String CPF;
    String UsuarioTec;
    String Senha;

    public Tecnico(){
    }
    
    public Tecnico(int iDTecnico, String nome, String telefone, String email, String cPF, String usuariotec, String senha) {
        IDTecnico = iDTecnico;
        Nome = nome;
        Telefone = telefone;
        Email = email;
        CPF = cPF;
        UsuarioTec = usuariotec;
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

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public String getUsuarioTec() {
        return UsuarioTec;
    }

    public void setUsuarioTec(String usuariotec) {
        UsuarioTec = usuariotec;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

}
