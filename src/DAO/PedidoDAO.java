
package DAO;

import model.Pedido;
import util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PedidoDAO {
    private Conexao conexao = new Conexao();

    public boolean inserirPedido(Pedido pedido) {
        try (Connection conn = conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO pedidos (idCliente, status) VALUES (?,?)")) {

            stmt.setInt(1, pedido.getIdCliente());

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean atualizarPedido(Pedido pedido) {
        try (Connection conn = conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement("UPDATE pedidos SET status = ? WHERE idPedido = ?")) {

            stmt.setString(1, pedido.getStatus());
            stmt.setInt(5, pedido.getIdPedido());

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean deletarPedido(int idPedido) {
        try (Connection conn = conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM pedidos WHERE idPedido = ?")) {

            stmt.setInt(1, idPedido);

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}