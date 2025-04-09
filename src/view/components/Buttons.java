package view.components;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;


public class Buttons extends HBox {

    public Button btnDelete = new Button("Delete");
    public Button btnEdit = new Button("Edit");
    public Button btnPlus = new Button("Plus");

    //construtor para inicializar o componentes (como um objeto) em outras janelas
    public Buttons() {

        //Carregamento de imagens
        Image imgIconDelete = new Image(getClass().getResourceAsStream("/view/resources/img/delete.png"));
        Image imgIconEdit = new Image(getClass().getResourceAsStream("/view/resources/img/edit.png"));
        Image imgIconPlus = new Image(getClass().getResourceAsStream("/view/resources/img/plus.png"));

        Font fontNegrito = Font.loadFont(getClass().getResourceAsStream("/view/resources/fonts/Jost-Bold.ttf"), 14);
        Font fontLight = Font.loadFont(getClass().getResourceAsStream("/view/resources/fonts/Jost-Light.ttf"), 14);

        //Determina como as imagens serão visualizadas (por exemplo: largura, altura, opacidade...)
        ImageView imgViewIconDelete = new ImageView(imgIconDelete);
        imgViewIconDelete.setFitHeight(25);  //Altura
        imgViewIconDelete.setFitWidth(25);   //Largura
        btnDelete.setGraphic(imgViewIconDelete);  //Adicionar a imagem no botão

        ImageView imgViewIconEdit = new ImageView(imgIconEdit);
        imgViewIconEdit.setFitHeight(25);
        imgViewIconEdit.setFitWidth(25);
        btnEdit.setGraphic(imgViewIconEdit);

        ImageView imgViewIconPlus = new ImageView(imgIconPlus);
        imgViewIconPlus.setFitHeight(25);
        imgViewIconPlus.setFitWidth(25);
        btnPlus.setGraphic(imgViewIconPlus);

        //Estilo personalizado para o botão
        String styleButton  = "-fx-background-color: transparent;" +
                "-fx-border-color: transparent;" +
                "-fx-alignment: center;" +
                "-fx-text-fill: white;" +
                "-fx-graphic-text-gap: 19.5px;";

        btnDelete.setFont(Font.font(fontNegrito.getFamily(),14));
        btnEdit.setFont(Font.font(fontNegrito.getFamily(),14));
        btnPlus.setFont(Font.font(fontNegrito.getFamily(),14));
        btnDelete.setStyle(styleButton);
        btnEdit.setStyle(styleButton);
        btnPlus.setStyle(styleButton);

        btnDelete.setOnMouseEntered(e -> btnDelete.setStyle(styleButton.replace("transparent", "#e4e3e3;")));
        btnDelete.setOnMouseExited(e -> btnDelete.setStyle(styleButton.replace("#e4e3e3", "transparent;")));

        btnEdit.setOnMouseEntered(e -> btnEdit.setStyle(styleButton.replace("transparent", "#e4e3e3;")));
        btnEdit.setOnMouseExited(e -> btnEdit.setStyle(styleButton.replace("#e4e3e3", "transparent;")));

        btnPlus.setOnMouseEntered(e -> btnPlus.setStyle(styleButton.replace("transparent", "#e4e3e3;")));
        btnPlus.setOnMouseExited(e -> btnPlus.setStyle(styleButton.replace("#e4e3e3", "transparent;")));

        //A seta -> não é aleatória e se trata de uma arrow function
        //Arrow function são chamadas quando uma ação está em andamento e você deseja iniciar uma próxima simultaneamente

        getChildren().addAll(btnDelete, btnEdit, btnPlus);

    }
}