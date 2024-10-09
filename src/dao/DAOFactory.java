package dao;

public class DAOFactory {
    
    public static ClienteDAO getClienteDAO(){
        return new ClienteDAO();
    }

    public static AdministradorDAO getAdministradorDAO(){
        return new AdministradorDAO();
    }

    public static TecnicoDAO getTecnicoDAO(){
        return new TecnicoDAO();
    }

    public static ProjetoOSDAO getProjetoOSDAO(){
        return new ProjetoOSDAO();
    }

}
