package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexao.Conexao;
import model.Cliente;

public class ClienteDAO {

    public void cadastrarCliente(Cliente cVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "INSERT INTO Cliente (Nome, Email, Endereco, CPF, Telefone, UsuarioCliente, Senha)"
                    + "VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cVO.getNome());
            pst.setString(2, cVO.getEmail());
            pst.setString(3, cVO.getEndereco());
            pst.setString(4, cVO.getCPF());
            pst.setString(5, cVO.getTelefone());
            pst.setString(6, cVO.getUsuarioCliente());
            pst.setString(7, cVO.getSenha());

            pst.execute();
            System.out.println("Cliente cadastrado com sucesso.");
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar Cliente.\n" + e.getMessage());
        }
    }

    // (Nome, Email, Endereco, CPF, Telefone, Usuario, Senha)
    public ArrayList<Cliente> getClientes() {
        ArrayList<Cliente> clienteS = new ArrayList<>();
        try {
            Connection con = Conexao.getConexao();
            String sql = "SELECT * FROM Cliente";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setIDUsuario(rs.getInt("IDUsuario"));
                c.setNome(rs.getString("Nome"));
                c.setEmail(rs.getString("Email"));
                c.setEndereco(rs.getString("Endereco"));
                c.setCPF(rs.getString("CPF"));
                c.setTelefone(rs.getString("Telefone"));
                c.setUsuarioCliente(rs.getString("UsuarioCliente"));
                c.setSenha(rs.getString("Senha"));
                clienteS.add(c);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar Cliente.\n"
                    + e.getMessage());
        }
        return clienteS;
    }

    public void atualizarCliente(Cliente cVO) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "UPDATE Cliente SET Nome = ?, Email = ?, Endereco = ?, CPF = ?, Telefone = ?, UsuarioCliente = ?, Senha = ? where IDUsuario = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, cVO.getNome());
            pst.setString(2, cVO.getEmail());
            pst.setString(3, cVO.getEndereco());
            pst.setString(4, cVO.getCPF());
            pst.setString(5, cVO.getTelefone());
            pst.setString(6, cVO.getUsuarioCliente());
            pst.setString(7, cVO.getSenha());
            pst.setInt(8, cVO.getIDUsuario());

            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao editar Cliente.\n"
                    + e.getMessage());
        }
    }

    public void deletarCliente(int IDUsuario) {
        try {
            Connection con = Conexao.getConexao();
            String sql = "delete from Cliente where IDUsuario = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, IDUsuario);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao deletar o Cliente.\n" + e.getMessage());
        }
    }

    public Cliente getClienteById(int IDUsuario) {
        Cliente c = new Cliente();

        try {
            Connection con = Conexao.getConexao();
            String sql = "SELECT * FROM Cliente WHERE IDUsuario = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, IDUsuario);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                c = new Cliente();
                c.setIDUsuario(rs.getInt("IDUsuario"));
                c.setNome(rs.getString("Nome"));
                c.setEmail(rs.getString("Email"));
                c.setEndereco(rs.getString("Endereco"));
                c.setCPF(rs.getString("CPF"));
                c.setTelefone(rs.getString("Telefone"));
                c.setUsuarioCliente(rs.getString("UsuarioCliente"));
                c.setSenha(rs.getString("Senha"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar o Cliente.\n"
                    + e.getMessage());
        }
        return c;
    }

    public Cliente buscarClientePorLoginSenha(String login, String senha) throws SQLException {
        Connection conexao = Conexao.getConexao();
        Cliente cliente = null;

        String sql = "SELECT * FROM Cliente WHERE UsuarioCliente = ? AND Senha = ?";

        try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
            stmt.setString(1, login);
            stmt.setString(2, senha);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                
                cliente = new Cliente();
                cliente.setIDUsuario(rs.getInt("IDUsuario"));
                cliente.setNome(rs.getString("Nome"));
                cliente.setEmail(rs.getString("Email"));
                
            }
        }

        return cliente;
    }

}
