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

    public Cliente(){
    }

    public Cliente(int iDUsuario, String nome, String email, String endereco, int cPF, int telefone, String usuario,
            String senha) {
        IDUsuario = iDUsuario;
        Nome = nome;
        Email = email;
        Endereco = endereco;
        CPF = cPF;
        Telefone = telefone;
        Usuario = usuario;
        Senha = senha;
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
