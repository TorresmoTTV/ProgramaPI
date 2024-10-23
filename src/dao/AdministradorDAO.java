package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexao.Conexao;
import model.Administrador;

public class AdministradorDAO {

    public void cadastrarAdministrador(Administrador aVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "INSERT INTO Administrador (Usuario, Senha) VALUES (?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, aVO.getUsuarioAdmin());
            pst.setString(2, aVO.getSenha());

            pst.execute();
            System.out.println("Administrador cadastrado com sucesso.");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar Administrador.\n" + e.getMessage());
        }
    }

    public ArrayList<Administrador> getAdministradores() {
        ArrayList<Administrador> AdministradorS = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            String sql = "SELECT * FROM Administrador";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Administrador a = new Administrador();
                a.setIDAdmin(rs.getInt("IDAdmin"));
                a.setUsuarioAdmin(rs.getString("Usuario"));
                a.setSenha(rs.getString("Senha"));
                AdministradorS.add(a);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar Administrador.\n"
                    + e.getMessage());
        }
        return AdministradorS;
    }

    public void atualizarAdministrador(Administrador aVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "UPDATE Administrador SET Usuario = ?, Senha = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, aVO.getUsuarioAdmin());
            pst.setString(2, aVO.getSenha());

            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao editar Cliente.\n"
                    + e.getMessage());
        }
    }

    public boolean deletarAdministrador(int IDAdmin) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "delete from Administrador where IDAdmin = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, IDAdmin);
            return pst.executeUpdate() != 0;
        } catch (SQLException e) {
            System.out.println("Erro ao deletar o Administrador.\n" + e.getMessage());
        }
        return true;
    }

    public Administrador getAdministradorById(int IDAdmin) {
        Administrador a = new Administrador();

        try {
            Connection con = Conexao.getConexao();
            String sql = "delete from Administrador where IDAdmin = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(IDAdmin, IDAdmin);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                a = new Administrador();
                a.setIDAdmin(rs.getInt("IDAdmin"));
                a.setUsuarioAdmin(rs.getString("Usuario"));
                a.setSenha(rs.getString("Senha"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o Cliente.\n"
                    + e.getMessage());
        }
        return a;
    }

    public Administrador buscarAdministradorPorLoginSenha(String login, String senha) throws SQLException {
        Connection conexao = Conexao.getConexao();
        Administrador administrador = null;

        String sql = "SELECT * FROM Administrador WHERE UsuarioAdmin = ? AND Senha = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, login);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                administrador = new Administrador();
                administrador.setIDAdmin(rs.getInt("IDAdmin"));
                System.out.println("Administrador encontrado: " + administrador.getIDAdmin());
            } else {
                System.out.println("Administrador não encontrado.");
            }
        }
        return administrador;
    }
}
