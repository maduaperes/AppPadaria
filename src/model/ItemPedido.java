package model;

public class ItemPedido {
    private int idItemPedido;
    private int idPedido;
    private int idProduto;
    private int quantidade;
    private double preco;

    public ItemPedido(int idPedido, int idProduto, int quantidade, double preco) {
       this.idPedido = idPedido;
       this.idProduto = idProduto;
       this.quantidade = quantidade;
       this.preco = preco;
    }
    public int getIdItemPedido() { return idItemPedido; }
    public void setIdItemPedido(int idItemPedido) { this.idItemPedido = idItemPedido; }
    public int getIdPedido() { return idPedido; }
    public void setIdPedido(int idPedido) { this.idPedido = idPedido; }
    public int getIdProduto() { return idProduto; }
    public void setIdProduto(int idProduto) { this.idProduto = idProduto; }
    public int getQuantidade() { return quantidade; }
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
}
