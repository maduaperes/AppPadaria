package DAO;

import model.ItemPedido;
import util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ItemPedidoDAO {
    private Conexao conexao = new Conexao();

    public boolean inserirItemPedido(ItemPedido itemPedido) {
        try (Connection conn = conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO itensPedidos (idPedido, idProduto, quantidade, precoUnitario) VALUES (?, ?, ?, ?)")) {

            stmt.setInt(1, itemPedido.getIdPedido());
            stmt.setInt(2, itemPedido.getIdProduto());
            stmt.setInt(3, itemPedido.getQuantidade());
            stmt.setDouble(4, itemPedido.getPreco());
            

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean atualizarItemPedido(ItemPedido itemPedido) {
        try (Connection conn = conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement("UPDATE itensPedidos SET idPedido = ?, idProduto = ?, quantidade = ?, precoUnitario = ? WHERE idItemPedido = ?")) {

            stmt.setInt(1, itemPedido.getIdPedido());
            stmt.setInt(2, itemPedido.getIdProduto());
            stmt.setInt(3, itemPedido.getQuantidade());
            stmt.setDouble(4, itemPedido.getPreco());
            stmt.setInt(5, itemPedido.getIdItemPedido());

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean deletarItemPedido(int idItemPedido) {
        try (Connection conn = conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM itensPedidos WHERE idItemPedido = ?")) {

            stmt.setInt(1, idItemPedido);

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}