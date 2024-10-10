package servicos;

import java.util.ArrayList;

import dao.AdministradorDAO;
import dao.DAOFactory;
import model.Administrador;

public class AdministradorServico {
    AdministradorDAO aDAO = DAOFactory.getAdministradorDAO();

    public void cadastrarAdministrador(Administrador aVO) {
        aDAO.cadastrarAdministrador(aVO);
    }

    public ArrayList<Administrador> listaAdministradores() {
        return aDAO.getAdministradores();
    }

    public Administrador getAdministradorById(int IDAdmin) {
        return aDAO.getAdministradorById(IDAdmin);
    }

    public void atualizaAdministrador(Administrador aVO) {
        aDAO.atualizarAdministrador(aVO);
    }

    public boolean deletarAdministrador(int IDAdmin) {
        return aDAO.deletarAdministrador(IDAdmin);
    }
}
