package model;

import java.sql.Date;

public class Pedido {
    private int idPedido;
    private Date dataPedido;
    private String statusPedido;
    private int idCliente;

    public Pedido(Date dataPedido, String statusPedido, int idCliente) {
        this.dataPedido = dataPedido;
        this.statusPedido = statusPedido;
        this.idCliente = idCliente;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(String statusPedido) {
        this.statusPedido = statusPedido;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
}
