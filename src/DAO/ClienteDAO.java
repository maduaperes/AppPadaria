package DAO;

import model.Cliente;
import util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ClienteDAO {
    private Conexao conexao = new Conexao();

    public boolean inserirCliente(Cliente cliente) {
        try (Connection conn = conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO clientes (nome, cpf, telefone, email) VALUES (?, ?, ?, ?)")) {

            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getTelefone());
            stmt.setString(4, cliente.getEmail());

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean atualizarCliente(Cliente cliente) {
        try (Connection conn = conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement("UPDATE clientes SET nome = ?, cpf = ?, telefone = ?, email = ? WHERE idCliente = ?")) {

            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getTelefone());
            stmt.setString(4, cliente.getEmail());
            stmt.setInt(5, cliente.getIdCliente());

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean deletarCliente(int idCliente) {
        try (Connection conn = conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM clientes WHERE idCliente = ?")) {

            stmt.setInt(1, idCliente);

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}