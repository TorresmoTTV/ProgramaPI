package servicos;

import dao.AdministradorDAO;
import dao.TecnicoDAO;
import dao.DAOFactory;
import java.sql.SQLException;
import model.Administrador;
import model.Tecnico;

/**
 *
 * @author grand
 */
public class AdminTecnicoServico {

    AdministradorDAO aDAO = DAOFactory.getAdministradorDAO();
    TecnicoDAO tDAO = DAOFactory.getTecnicoDAO();

    public Object loginUnico(String login, String senha) throws SQLException {
        Administrador admin = aDAO.buscarAdministradorPorLoginSenha(login, senha);
        if (admin != null) {
            return admin; // Retorna o administrador se encontrado
        }

        Tecnico tecnico = tDAO.buscarTecnicoPorLoginSenha(login, senha);
        if (tecnico != null) {
            return tecnico; // Retorna o técnico se encontrado
        }

        return null; // Se não for encontrado, retorna null
    }
}
