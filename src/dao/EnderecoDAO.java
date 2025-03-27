package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Endereco;
import util.Conexao;

public class EnderecoDAO {
    private Conexao conexao = new Conexao();

    public boolean inserirEndereco(Endereco endereco) {
        try (Connection conn = conexao.conectar();
             PreparedStatement novoEndereco = conn.prepareStatement("INSERT INTO enderecos (logradouro, numero, bairro, cidade, estado, cep, idCliente) VALUES (?, ?, ?, ?, ?, ?, ?);")) {

            novoEndereco.setString(1, endereco.getLogradouro());
            novoEndereco.setString(2, endereco.getNumero());
            novoEndereco.setString(3, endereco.getBairro());
            novoEndereco.setString(4, endereco.getCidade());
            novoEndereco.setString(5, endereco.getEstado());
            novoEndereco.setString(6, endereco.getCep());
            novoEndereco.setInt(7, endereco.getIdCliente());

            int rowsAffected = novoEndereco.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean atualizarEndereco(Endereco endereco) {
        try (Connection conn = conexao.conectar();
             PreparedStatement enderecoAtualizado = conn.prepareStatement("UPDATE enderecos SET logradouro = ?, numero = ?, bairro = ?, cidade = ?, estado = ?, cep = ? WHERE idEndereco = ?;")) {

            enderecoAtualizado.setString(1, endereco.getLogradouro());
            enderecoAtualizado.setString(2, endereco.getNumero());
            enderecoAtualizado.setString(3, endereco.getBairro());
            enderecoAtualizado.setString(4, endereco.getCidade());
            enderecoAtualizado.setString(5, endereco.getEstado());
            enderecoAtualizado.setString(6, endereco.getCep());
            enderecoAtualizado.setInt(7, endereco.getIdEndereco());

            int rowsAffected = enderecoAtualizado.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean deletarEndereco(int idEndereco) {
        try (Connection conn = conexao.conectar();
             PreparedStatement enderecoDeletado = conn.prepareStatement("DELETE FROM enderecos WHERE idEndereco = ?;")) {

            enderecoDeletado.setInt(1, idEndereco);
            int rowsAffected = enderecoDeletado.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }
}
