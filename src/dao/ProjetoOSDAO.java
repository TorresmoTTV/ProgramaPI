package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexao.Conexao;
import model.ProjetoOS;

public class ProjetoOSDAO {

    public void cadastrarProjetoOS(ProjetoOS pVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "INSERT INTO Projeto_OrdemdeServico (Condicao, Descricao, LinkUnbonxing, DataInicio, DataFim)"
                    + "(?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, pVO.getCondicao());
            pst.setString(2, pVO.getDescricao());
            pst.setString(3, pVO.getLinkUnbonxing());
            pst.setString(4, pVO.getDataInicio());
            pst.setString(5, pVO.getDataFim());

            pst.execute();
            System.out.println("Projeto / Ordem de Servico cadastrado com sucesso.");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar Projeto / Ordem de Servico.\n" + e.getMessage());
        }
    }

    public ArrayList<ProjetoOS> getProjetoOS() {
        ArrayList<ProjetoOS> projetoOSs = new ArrayList<>();

        try {
            Connection con = Conexao.getConexao();
            String sql = "SELECT * FROM Projeto_OrdemdeServico";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                ProjetoOS p = new ProjetoOS();
                p.setIDOs(rs.getInt("IDOs"));
                p.setCondicao(rs.getString("Condicao"));
                p.setDescricao(rs.getString("Descricao"));
                p.setLinkUnbonxing(rs.getString("LinkUnbonxing"));
                p.setDataInicio(rs.getString("DataInicio"));
                p.setDataFim(rs.getString("DataFim"));
                projetoOSs.add(p);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar Projeto / Ordem de Servico.\n");
        }
        return projetoOSs;
    }
//Condicao, Descricao, LinkUnbonxing, DataInicio, DataFim
    public void atualizarProjetoOS(ProjetoOS pVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "Update Projeto_OrdemdeServico SET Condicao = ?, Descricao = ?, LinkUnbonxing = ?, DataInicio = ?, DataFim = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, "Condicao");
            pst.setString(2, "Descricao");
            pst.setString(3, "LinkUnbonxing");
            pst.setString(4, "DataInicio");
            pst.setString(5, "DataFim");

            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao editar Projeto / Ordem de Servico.\n"
                    + e.getMessage());
        }
    }

    public boolean deletarProjetoOS(int IDOs) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "delete from Projeto_OrdemdeServico where IDOs = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, IDOs);
            return pst.executeUpdate() != 0;
        } catch (SQLException e) {
            System.out.println("Erro ao deletar o Projeto / Ordem de Servico.\n" + e.getMessage());
        }
        return true;
    }

    public ProjetoOS getProjetoOSById(int IDOs) {
        ProjetoOS p = new ProjetoOS();

        try {
            Connection con = Conexao.getConexao();
            String sql = "SELECT * FROM Projeto_OrdemdeServico WHERE IDOs = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, IDOs);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                p = new ProjetoOS();
                p.setIDOs(rs.getInt("IDOs"));
                p.setCondicao(rs.getString("Condicao"));
                p.setDescricao(rs.getString("Descricao"));
                p.setDataInicio(rs.getString("DataInicio"));
                p.setDataFim(rs.getString("DataFim"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o Projeto / Ordem de Servico.\n"
                    + e.getMessage());
        }
        return p;
    }
}
