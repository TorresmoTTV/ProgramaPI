package model;

public class Cliente {

    int IDUsuario;
    String Nome;
    String Email;
    String Endereco;
    String CPF;
    String Telefone;
    String Usuario;
    String Senha;

    public Cliente(){
    }

    public Cliente(int iDUsuario, String nome, String email, String endereco, String cPF, String telefone, String usuario,
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

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
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
