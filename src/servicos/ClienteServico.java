package servicos;

import java.util.ArrayList;

import dao.ClienteDAO;
import dao.DAOFactory;
import model.Cliente;

public class ClienteServico {
    ClienteDAO cDAO = DAOFactory.getClienteDAO();

    public void cadastrarCliente(Cliente cVO) {
        cDAO.cadastrarCliente(cVO);
    }

    public ArrayList<Cliente> listaClientes() {
        return cDAO.getClientes();
    }

    public Cliente getClienteById(int IDCliente) {
        return cDAO.getClienteById(IDCliente);
    }

    public void atualizaCliente(Cliente cVO) {
        cDAO.atualizarCliente(cVO);
    }

    public boolean deletarCliente(int IDCliente) {
        return cDAO.deletarCliente(IDCliente);
    }
}
