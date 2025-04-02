package view.components;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;




public class Sidebar extends VBox {
    public Button btnFornecedor = new Button("Fornecedor");
    public Button btnProdutos = new Button("Produtos");
   public Button btnClientes = new Button("Clientes");
   public Button btnPedidos= new Button("Pedidos");

    public Sidebar() {

        Image imgIconFornecedor = new Image(getClass().getResourceAsStream("/view/img/icon-fornecedor.png"));
        Image imgIconProduto = new Image(getClass().getResourceAsStream("/view/img/icon-produto.png"));
        Image imgIconPedido = new Image(getClass().getResourceAsStream("/view/img/icon-pedido.png"));
        Image imgIconCliente = new Image(getClass().getResourceAsStream("/view/img/icon-cliente.png"));

        ImageView imgViewIconCliente = new ImageView(imgIconCliente);
        imgViewIconCliente.setFitHeight(25);
        imgViewIconCliente.setFitWidth(25);
        btnClientes.setGraphic(imgViewIconCliente);

        ImageView imgViewIconFornecedor = new ImageView(imgIconFornecedor);
        imgViewIconFornecedor.setFitHeight(25);
        imgViewIconFornecedor.setFitWidth(25);
        btnFornecedor.setGraphic(imgViewIconFornecedor);

        ImageView imgViewIconProduto = new ImageView(imgIconProduto);
        imgViewIconProduto.setFitHeight(25);
        imgViewIconProduto.setFitWidth(25);
        btnProdutos.setGraphic(imgViewIconProduto);

        ImageView imgViewIconPedido = new ImageView(imgIconPedido);
        imgViewIconPedido.setFitHeight(25);
        imgViewIconPedido.setFitWidth(25);
        btnPedidos.setGraphic(imgViewIconPedido);

        String styleButton =
                "-fx-background-color: transparent;" +
                "-fx-border-color: transparent;" +
                "-fx-font-size: 12px;" +
                "-fx-font-weight: bold;" +
                "-fx-text-fill: black;" +
                "-fx-alignment: center;" +
                "-fx-graphic-text-gap: 10px;";

        btnClientes.setStyle(styleButton);
        btnFornecedor.setStyle(styleButton);
        btnProdutos.setStyle(styleButton);
        btnPedidos.setStyle(styleButton);

        Label lblMenu = new Label("Starbucks");
        lblMenu.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");


       getChildren().addAll(lblMenu, btnProdutos, btnClientes, btnPedidos, btnFornecedor);

    }
}
