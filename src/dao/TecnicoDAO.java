package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexao.Conexao;
import model.Tecnico;

public class TecnicoDAO {

    public void cadastrarTecnico(Tecnico tVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "INSERT INTO Tecnico (Nome, Telefone, Email, CPF, Usuario, Senha)"
                    + "(?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, tVO.getNome());
            pst.setInt(2, tVO.getTelefone());
            pst.setString(3, tVO.getEmail());
            pst.setInt(4, tVO.getCPF());
            pst.setString(5, tVO.getUsuario());
            pst.setString(6, tVO.getSenha());
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar Tecnico.\n" + e.getMessage());
        }
    }

    public ArrayList<Tecnico> getTecnicos() {
        ArrayList<Tecnico> tecnicoS = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            String sql = "SELECT * FROM Tecnico";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Tecnico t = new Tecnico();
                t.setIDTecnico(rs.getInt("IDTecnico"));
                t.setNome(rs.getString("Nome"));
                t.setTelefone(rs.getInt("Telefone"));
                t.setEmail(rs.getString("Email"));
                t.setCPF(rs.getInt("CPF"));
                t.setUsuario(rs.getString("Usuario"));
                t.setSenha(rs.getString("Senha"));
                tecnicoS.add(t);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar Tecnico.\n"
                    + e.getMessage());
        }
        return tecnicoS;
    }
//(Nome, Telefone, Email, CPF, Usuario, Senha)
    public void atualizarTecnico(Tecnico tVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "UPDATE Tecnico SET Nome = ?, Telefone = ?, Email = ?, CPF = ?, Usuario = ?, Senha = ? where IDTecnico = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, tVO.getNome());
            pst.setInt(2, tVO.getTelefone());
            pst.setString(3, tVO.getEmail());
            pst.setInt(4, tVO.getCPF());
            pst.setString(5, tVO.getUsuario());
            pst.setString(6, tVO.getSenha());

            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao editar Tecnico.\n"
                    + e.getMessage());
        }
    }

    public boolean deletarTecnico(int IDTecnico) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "delete from Tecnico where IDTecnico = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, IDTecnico);
            return pst.executeUpdate() != 0;
        } catch (SQLException e) {
            System.out.println("Erro ao deletar o Tecnico.\n" + e.getMessage());
        }
        return true;
    }

    public Tecnico getTecnicoById(int IDTecnico) {
        Tecnico t = new Tecnico();

        try {
            Connection con = Conexao.getConexao();
            String sql = "SELECT * FROM Tecnico WHERE IDTecnico = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, IDTecnico);
            ResultSet rs = pst.executeQuery();
//(Nome, Telefone, Email, CPF, Usuario, Senha)
            if (rs.next()) {
                t = new Tecnico();
                t.setIDTecnico(rs.getInt("IDTecnico"));
                t.setNome(rs.getString("Nome"));
                t.setTelefone(rs.getInt("Telefone"));
                t.setEmail(rs.getString("Email"));
                t.setCPF(rs.getInt("CPF"));
                t.setUsuario(rs.getString("Usuario"));
                t.setSenha(rs.getString("Senha"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o Tecnico.\n"
                    + e.getMessage());
        }
        return t;
    }
}
