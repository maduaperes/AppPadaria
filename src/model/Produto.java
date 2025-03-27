package model;

public class Produto {

    private int idProduto;
    private String nome;
    private double preco;
    private int idFornecedor;

    public Produto(String nome, double preco, int idFornecedor) {
        this.nome = nome;
        this.preco = preco;
        this.idFornecedor = idFornecedor;
    }

    public double getPreco() {return preco;}
    public void setPreco(double preco) {this.preco = preco;}
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public int getIdProduto() {return idProduto;}
    public void setIdProduto(int idProduto) {this.idProduto = idProduto;}
    public int getIdFornecedor() {return idFornecedor;}
    public void setIdFornecedor(int idFornecedor) {this.idFornecedor = idFornecedor;}
}
