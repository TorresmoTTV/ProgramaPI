package model;

public class LoginCliente {

    private static LoginCliente instancia;
    private int idCliente;

    public LoginCliente() {
    }

    public static LoginCliente getInstancia() {
        if (instancia == null) {
            instancia = new LoginCliente();
        }
        return instancia;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}
