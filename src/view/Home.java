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

        Sidebar menu = new Sidebar();



        Image imgIconStarbucks = new Image(getClass().getResourceAsStream("/view/img/starsbucks-48px.png"));
        Image imgBackgroud = new Image(getClass().getResourceAsStream("/view/img/background.jpg"));


        BorderPane layoutPrincipal = new BorderPane();
        layoutPrincipal.setLeft(menu);
        layoutPrincipal.setStyle("-fx-background-image: url('/view/img/background.jpg')");



        Scene scene = new Scene(layoutPrincipal, 1024, 700);



        janela.setTitle("Starbucks");

        janela.getIcons().add(imgIconStarbucks);

        janela.setScene(scene);

        janela.show();

    }
    public static void main(String[] Lifecycle) {
    launch(Lifecycle);
    }

}
