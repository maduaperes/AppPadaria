package view;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Home extends Application {
    public void start(Stage janela) throws Exception{
    Image imgIconStarbucks = new Image(getClass().getResourceAsStream("/view/img/" + "starbucks48px.png"));
    Image imgBackground = new Image(getClass().getResourceAsStream("/view/img/" + "background.jpg"));
        BorderPane layoutPrincipal = new BorderPane();
        Scene scene = new Scene(layoutPrincipal, 1024, 700);
        layoutPrincipal.setStyle("-fx-background-image: url('/view/img/background.jpg')");
        janela.setTitle("Starbucks");
        janela.getIcons().add(imgIconStarbucks);
        janela.setScene(scene);
        janela.show();
    }

    public static void main(String[] lifecycle) {
        launch(lifecycle);
    }
}
