package view;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import view.components.Sidebar;

public class Cliente extends Application {

    public void start(Stage janela) throws Exception {

        Image imgIconStarbucks = new Image(getClass().getResourceAsStream("/view/resouces/img/starbucks-48px.png"));
        Sidebar menuLateral = new Sidebar();
        BorderPane layoutPrincipal = new BorderPane();
        layoutPrincipal.setTop(menuLateral);
        Scene scene = new Scene(layoutPrincipal, 1024, 700);
        janela.setScene(scene);
        janela.setTitle("Starbucks");
        janela.getIcons().add(imgIconStarbucks);
        janela.getIcons().add(imgIconStarbucks);
        janela.show();

    }

    public static void main(String[] args) {

        launch(args);

    }

}
