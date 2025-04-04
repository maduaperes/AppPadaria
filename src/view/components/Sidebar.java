package view.components;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;


public class Sidebar extends VBox {

    public Button btnFornecedor = new Button("Fornecedor");
    public Button btnProduto = new Button("Produto");
    public Button btnCliente = new Button("Cliente");
    public Button btnPedido = new Button("Pedido");

    //construtor para inicializar o componentes (como um objeto) em outras janelas
    public Sidebar() {

        //Carregamento de imagens
        Image imgIconFornecedor = new Image(getClass().getResourceAsStream("/view/resources/img/icon-fornecedor.png"));
        Image imgIconProduto = new Image(getClass().getResourceAsStream("/view/resources/img/icon-produto.png"));
        Image imgIconCliente = new Image(getClass().getResourceAsStream("/view/resources/img/icon-cliente.png"));
        Image imgIconPedido = new Image(getClass().getResourceAsStream("/view/resources/img/icon-pedido.png"));
        Image imgIconStarbucks = new Image(getClass().getResourceAsStream("/view/resources/img/starbucks96px.png"));

        //Carregamento de fontes
        Font fontNegrito = Font.loadFont(getClass().getResourceAsStream("/view/resources/fonts/Jost-Bold.ttf"), 14);
        Font fontLight = Font.loadFont(getClass().getResourceAsStream("/view/resources/fonts/Jost-Light.ttf"), 14);

        ImageView imgViewIconStarbucks = new ImageView(imgIconStarbucks);
        imgViewIconStarbucks.setFitHeight(50);
        imgViewIconStarbucks.setFitWidth(50);



        //Determina como as imagens serão visualizadas (por exemplo: largura, altura, opacidade...)
        ImageView imgViewIconCliente = new ImageView(imgIconCliente);
        imgViewIconCliente.setFitHeight(25);  //Altura
        imgViewIconCliente.setFitWidth(25);   //Largura
        btnCliente.setGraphic(imgViewIconCliente);  //Adicionar a imagem no botão

        ImageView imgViewIconFornecedor = new ImageView(imgIconFornecedor);
        imgViewIconFornecedor.setFitHeight(25);
        imgViewIconFornecedor.setFitWidth(25);
        btnFornecedor.setGraphic(imgViewIconFornecedor);

        ImageView imgViewIconProduto = new ImageView(imgIconProduto);
        imgViewIconProduto.setFitHeight(25);
        imgViewIconProduto.setFitWidth(25);
        btnProduto.setGraphic(imgViewIconProduto);

        ImageView imgViewIconPedido = new ImageView(imgIconPedido);
        imgViewIconPedido.setFitHeight(25);
        imgViewIconPedido.setFitWidth(25);
        btnPedido.setGraphic(imgViewIconPedido);

        //Estilo personalizado para o botão
        String styleButton  = "-fx-background-color: transparent;" +
                "-fx-border-color: transparent;" +
                "-fx-font-size: 14px;" +
                "-fx-font-weight: bold;" +
                "-fx-text-fill: black;" +
                "-fx-alignment: center;" +
                "-fx-graphic-text-gap: 20px;" +
                "-fx-font-family: " + fontLight.getFamily() + ";";
        btnCliente.setStyle(styleButton);
        btnProduto.setStyle(styleButton);
        btnPedido.setStyle(styleButton);
        btnFornecedor.setStyle(styleButton);

        Label lblMenu = new Label("Starbucks");
        lblMenu.setFont(Font.font(fontNegrito.getFamily(),28));
        lblMenu.setGraphic(imgViewIconStarbucks);
        lblMenu.setGraphicTextGap(10);
        setMargin(lblMenu, new Insets(0,0,20,0));

        btnCliente.setOnMouseEntered(e -> btnCliente.setStyle(styleButton.replace("transparent", "#e4e3e3;")));
        btnCliente.setOnMouseExited(e -> btnCliente.setStyle(styleButton.replace("#e4e3e3", "transparent;")));

        btnProduto.setOnMouseEntered(e -> btnProduto.setStyle(styleButton.replace("transparent", "#e4e3e3;")));
        btnProduto.setOnMouseExited(e -> btnProduto.setStyle(styleButton.replace("#e4e3e3", "transparent;")));

        btnPedido.setOnMouseEntered(e -> btnPedido.setStyle(styleButton.replace("transparent", "#e4e3e3;")));
        btnPedido.setOnMouseExited(e -> btnPedido.setStyle(styleButton.replace("#e4e3e3", "transparent;")));

        btnFornecedor.setOnMouseEntered(e -> btnFornecedor.setStyle(styleButton.replace("transparent", "#e4e3e3;")));
        btnFornecedor.setOnMouseExited(e -> btnFornecedor.setStyle(styleButton.replace("#e4e3e3", "transparent;")));

        //A seta -> não é aleatória e se trata de uma arrow function
        //Arrow function são chamadas quando uma ação está em andamento e você deseja iniciar uma próxima simultaneamente

        getChildren().addAll(lblMenu, btnFornecedor, btnProduto, btnCliente, btnPedido);
    }
}