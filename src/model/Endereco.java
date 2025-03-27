package model;

public class Endereco {




    private int idEndereco;
    private String cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
    private String numero;
    private int idCliente;
    private int idFornecedor;
        public Endereco(String cep, String logradouro, String bairro, String cidade, String estado, String numero, int idCliente, int idFornecedor) {
            this.cep = cep;
            this.logradouro = logradouro;
            this.bairro = bairro;
            this.cidade = cidade;
            this.estado = estado;
            this.numero = numero;
            this.idCliente = idCliente;
            this.idFornecedor = idFornecedor;

        }
    public int getIdEndereco() {return idEndereco;}
    public void setIdEndereco(int idEndereco) {this.idEndereco = idEndereco;}
    public String getCep() {return cep;}
    public void setCep(String cep) {this.cep = cep;}
    public String getLogradouro() {return logradouro;}
    public void setLogradouro(String logradouro) {this.logradouro = logradouro;}
    public String getBairro() {return bairro;}
    public void setBairro(String bairro) {this.bairro = bairro;}
    public String getCidade() {return cidade;}
    public void setCidade(String cidade) {this.cidade = cidade;}
    public String getEstado() {return estado;}
    public void setEstado(String estado) {this.estado = estado;}
    public String getNumero() {return numero;}
    public void setNumero(String numero) {this.numero = numero;}
    public int getIdCliente() {return idCliente;}
    public void setIdCliente(int idCliente) {this.idCliente = idCliente;}
    public int getIdFornecedor() {return idFornecedor;}
    public void setIdFornecedor(int idFornecedor) {this.idFornecedor = idFornecedor;}

    }

