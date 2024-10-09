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
            String sql = "";
            PreparedStatement pst = con.prepareStatement(sql);
            // sets
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

            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar Projeto / Ordem de Servico.\n");
        }
        return projetoOSs;
    }

    public void atualizarProjetoOS(ProjetoOS pVO) {

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
            String sql = "";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, IDOs);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                p = new ProjetoOS();
                // sets
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o Projeto / Ordem de Servico.\n"
                    + e.getMessage());
        }
        return p;
    }
}
