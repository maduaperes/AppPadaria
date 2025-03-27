package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Cliente;
import util.Conexao;

public class ClienteDAO {
    private Conexao conexao = new Conexao();

    public boolean inserirCliente(Cliente cliente) {
        try (Connection conn = conexao.conectar();
             PreparedStatement novoCliente = conn.prepareStatement("INSERT INTO clientes (nome, cpf,telefone,email) VALUES (?, ?, ?, ?);") ) {

            novoCliente.setString(1, cliente.getNome());
            novoCliente.setString(2, cliente.getCpf());
            novoCliente.setString(3, cliente.getTelefone());
            novoCliente.setString(4, cliente.getEmail());

            int rowsAffected = novoCliente.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }
    public boolean atualizarCliente(Cliente cliente) {
        try (Connection conn = conexao.conectar();
             PreparedStatement clienteAtualizado = conn.prepareStatement("UPDATE clientes SET nome = ?, cpf = ?,telefone = ?,email = ? WHERE idCliente = ?;");){


            clienteAtualizado.setString(1, cliente.getNome());
            clienteAtualizado.setString(2, cliente.getCpf());
            clienteAtualizado.setString(3, cliente.getTelefone());
            clienteAtualizado.setString(4, cliente.getEmail());
            clienteAtualizado.setInt(4, cliente.getIdCliente());

            int rowsAffected = clienteAtualizado.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }
    public boolean deletarCliente(int idCliente) {
        try (Connection conn = conexao.conectar();
             PreparedStatement clienteDeletado = conn.prepareStatement("DELETE FROM clientes WHERE idCliente = ?;"); ) {

            clienteDeletado.setInt(1,idCliente);
            int rowsAffected = clienteDeletado.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }
}