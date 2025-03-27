package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Fornecedor;
import util.Conexao;

public class FornecedorDAO {
    private Conexao conexao = new Conexao();

    public boolean inserirFornecedor(Fornecedor fornecedor) {
        try (Connection conn = conexao.conectar();
             PreparedStatement novoFornecedor = conn.prepareStatement("INSERT INTO fornecedores (nome, cpf, telefone, email) VALUES (?, ?, ?, ?);")) {

            novoFornecedor.setString(1, fornecedor.getNome());
            novoFornecedor.setString(2, fornecedor.getCpf());
            novoFornecedor.setString(3, fornecedor.getTelefone());
            novoFornecedor.setString(4, fornecedor.getEmail());

            int rowsAffected = novoFornecedor.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean atualizarFornecedor(Fornecedor fornecedor) {
        try (Connection conn = conexao.conectar();
             PreparedStatement fornecedorAtualizado = conn.prepareStatement("UPDATE fornecedores SET nome = ?, cpf = ?, telefone = ?, email = ? WHERE idFornecedor = ?;")) {

            fornecedorAtualizado.setString(1, fornecedor.getNome());
            fornecedorAtualizado.setString(2, fornecedor.getCpf());
            fornecedorAtualizado.setString(3, fornecedor.getTelefone());
            fornecedorAtualizado.setString(4, fornecedor.getEmail());
            fornecedorAtualizado.setInt(5, fornecedor.getIdFornecedor());

            int rowsAffected = fornecedorAtualizado.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean deletarFornecedor(int idFornecedor) {
        try (Connection conn = conexao.conectar();
             PreparedStatement fornecedorDeletado = conn.prepareStatement("DELETE FROM fornecedores WHERE idFornecedor = ?;")) {

            fornecedorDeletado.setInt(1, idFornecedor);
            int rowsAffected = fornecedorDeletado.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }
}
