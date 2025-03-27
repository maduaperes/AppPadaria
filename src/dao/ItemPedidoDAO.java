package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.ItemPedido;
import util.Conexao;

public class ItemPedidoDAO {
    private Conexao conexao = new Conexao();

    public boolean inserirItemPedido(ItemPedido itemPedido) {
        try (Connection conn = conexao.conectar();
             PreparedStatement novoItemPedido = conn.prepareStatement("INSERT INTO item_pedido (idPedido, idProduto, quantidade, precoUnitario) VALUES (?, ?, ?, ?);")) {

            novoItemPedido.setInt(1, itemPedido.getIdPedido());
            novoItemPedido.setInt(2, itemPedido.getIdProduto());
            novoItemPedido.setInt(3, itemPedido.getQuantidade());
            novoItemPedido.setDouble(4, itemPedido.getPrecoUnitario());

            int rowsAffected = novoItemPedido.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean atualizarItemPedido(ItemPedido itemPedido) {
        try (Connection conn = conexao.conectar();
             PreparedStatement itemPedidoAtualizado = conn.prepareStatement("UPDATE item_pedido SET idPedido = ?, idProduto = ?, quantidade = ?, precoUnitario = ? WHERE idItemPedido = ?;")) {

            itemPedidoAtualizado.setInt(1, itemPedido.getIdPedido());
            itemPedidoAtualizado.setInt(2, itemPedido.getIdProduto());
            itemPedidoAtualizado.setInt(3, itemPedido.getQuantidade());
            itemPedidoAtualizado.setDouble(4, itemPedido.getPrecoUnitario());
            itemPedidoAtualizado.setInt(5, itemPedido.getIdItemPedido());

            int rowsAffected = itemPedidoAtualizado.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean deletarItemPedido(int idItemPedido) {
        try (Connection conn = conexao.conectar();
             PreparedStatement itemPedidoDeletado = conn.prepareStatement("DELETE FROM item_pedido WHERE idItemPedido = ?;")) {

            itemPedidoDeletado.setInt(1, idItemPedido);
            int rowsAffected = itemPedidoDeletado.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }
}
