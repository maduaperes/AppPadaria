package DAO;

import model.Fornecedor;
import util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class FornecedorDAO {
    private Conexao conexao = new Conexao();

    public boolean inserirFornecedor(Fornecedor fornecedor) {
        try (Connection conn = conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO fornecedors (nome, cnpj, telefone, email) VALUES (?, ?, ?, ?)")) {

            stmt.setString(1, fornecedor.getNome());
            stmt.setString(2, fornecedor.getCnpj());
            stmt.setString(3, fornecedor.getTelefone());
            stmt.setString(4, fornecedor.getEmail());

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean atualizarFornecedor(Fornecedor fornecedor) {
        try (Connection conn = conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement("UPDATE fornecedor SET nome = ?, cnpj = ?, telefone = ?, email = ? WHERE idFornecedor = ?")) {

            stmt.setString(1, fornecedor.getNome());
            stmt.setString(2, fornecedor.getCnpj());
            stmt.setString(3, fornecedor.getTelefone());
            stmt.setString(4, fornecedor.getEmail());
            stmt.setInt(5, fornecedor.getIdFornecedor());

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean deletarFornecedor(int idFornecedor) {
        try (Connection conn = conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM fornecedors WHERE idFornecedor = ?")) {

            stmt.setInt(1, idFornecedor);

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}