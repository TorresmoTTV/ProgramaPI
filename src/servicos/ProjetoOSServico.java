package servicos;

import java.util.ArrayList;

import dao.DAOFactory;
import dao.ProjetoOSDAO;
import model.ProjetoOS;

public class ProjetoOSServico {
        ProjetoOSDAO pOSDAO = DAOFactory.getProjetoOSDAO();

    public void cadastrarProjetoOS(ProjetoOS pOSVO) {
        pOSDAO.cadastrarProjetoOS(pOSVO);
    }

    public ArrayList<ProjetoOS> listaProjetoOSs() {
        return pOSDAO.getProjetoOS();
    }
    
    public ArrayList<ProjetoOS> listaProjetoOSsPorCliente(int idCliente) {
        return pOSDAO.getProjetoOSByCliente(idCliente);
    }

    public ProjetoOS getProjetoOSById(int IDOs) {
        return pOSDAO.getProjetoOSById(IDOs);
    }

    public void atualizaProjetoOS(ProjetoOS pOSVO) {
        pOSDAO.atualizarProjetoOS(pOSVO);
    }

    public boolean deletarProjetoOS(int IDOs) {
        return pOSDAO.deletarProjetoOS(IDOs);
    }
    
    public void deletarProjetoOSByIdCliente (int IDCliente) {
        pOSDAO.deletarProjetoOSByIdCliente(IDCliente);
    }
    
}
