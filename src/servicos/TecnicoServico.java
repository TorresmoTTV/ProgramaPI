package servicos;

import java.util.ArrayList;

import dao.DAOFactory;
import dao.TecnicoDAO;
import model.Tecnico;

public class TecnicoServico {
        TecnicoDAO tDAO = DAOFactory.getTecnicoDAO();

    public void cadastrarTecnico(Tecnico tVO) {
        tDAO.cadastrarTecnico(tVO);
    }

    public ArrayList<Tecnico> listaTecnicos() {
        return tDAO.getTecnicos();
    }

    public Tecnico getTecnicoById(int IDTecnico) {
        return tDAO.getTecnicoById(IDTecnico);
    }

    public void atualizaTecnico(Tecnico tVO) {
        tDAO.atualizarTecnico(tVO);
    }

    public boolean deletarTecnico(int IDTecnico) {
        return tDAO.deletarTecnico(IDTecnico);
    }
}
