package DAO;

import model.Produto;
import util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProdutoDAO {
    private Conexao conexao = new Conexao();

    public boolean inserirProduto(Produto produto) {
        try (Connection conn = conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO produtos (nome, preco, idFornecedor) VALUES ( ?, ?, ?)")) {

            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getIdFornecedor());

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean atualizarProduto(Produto produto) {
        try (Connection conn = conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement("UPDATE produtos SET nome = ?, preco = ?, idFornecedor = ? WHERE idProduto = ?")) {

            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getIdFornecedor());
            stmt.setInt(4, produto.getIdProduto());

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean deletarProduto(int idProduto) {
        try (Connection conn = conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM produtos WHERE idProduto = ?")) {

            stmt.setInt(1, idProduto);

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}