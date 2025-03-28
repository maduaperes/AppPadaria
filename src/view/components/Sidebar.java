package view.components;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;




public class Sidebar extends VBox {
    public Button btnFornecedor = new Button("Fornecedor");
    public Button btnProdutos = new Button("Produtos");
   public Button btnClientes = new Button("Clientes");
   public Button btnPedidos= new Button("Pedidos");




    public Sidebar() {
        Label lblMenu = new Label("Starbucks");
        lblMenu.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");

       getChildren().addAll(lblMenu, btnProdutos, btnClientes, btnPedidos);

    }
}
