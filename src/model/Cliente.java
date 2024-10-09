package model;

public class Cliente {

    int IDUsuario;
    String Nome;
    String Email;
    String Endereco;
    int CPF;
    int Telefone;
    String Usuario;
    String Senha;

    public Cliente(int IDUsuario, String Nome, String Email, String Endereco, int CPF, int Telefone, String Usuario, String Senha) {
        this.IDUsuario = IDUsuario;
        this.Nome = Nome;
        this.Email = Email;
        this.Endereco = Endereco;
        this.CPF = CPF;
        this.Telefone = Telefone;
        this.Usuario = Usuario;
        this.Senha = Senha;
    }

    public int getIDUsuario() {
        return IDUsuario;
    }

    public void setIDUsuario(int IDUsuario) {
        this.IDUsuario = IDUsuario;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int Telefone) {
        this.Telefone = Telefone;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

}
