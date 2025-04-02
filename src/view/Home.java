package view;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import view.components.Sidebar;


import static javafx.application.Application.launch;

public class Home extends Application {
    public void start(Stage janela) throws Exception {
        Sidebar menuLateral = new Sidebar();

        Image imgIconStarbucks = new Image(getClass().getResourceAsStream("/view/img/starsbucks-48px.png"));
        Image imgBackground = new Image(getClass().getResourceAsStream("/view/img/background.jpg"));

        BorderPane layoutPrincipal = new BorderPane();
        layoutPrincipal.setLeft(menuLateral);
        menuLateral.setStyle("-fx-background-color: white; -fx-padding: 30px");
        layoutPrincipal.setStyle("-fx-background-image: url('/view/img/background.jpg');");

        Scene scene = new Scene(layoutPrincipal,1024,700);
        janela.setScene(scene);
        janela.setTitle("Starbucks");
        janela.getIcons().add(imgIconStarbucks);
        janela.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}