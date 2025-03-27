package model;

import java.sql.SQLData;

public class Pedido {
    private int idPedido;
    private SQLData dataPedido;
    private String status;
    private int idCliente;

    public Pedido(int idCliente,String status) {
        this.idCliente = idCliente;
    }

    public int getIdPedido() { return idPedido; }
    public void setIdPedido(int idPedido) { this.idPedido = idPedido; }
    public SQLData getDataPedido() { return dataPedido; }
    public void setDataPedido(SQLData dataPedido) { this.dataPedido = dataPedido; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public int getIdCliente() { return idCliente; }
    public void setIdCliente(int idCliente) { this.idCliente = idCliente; }
}
