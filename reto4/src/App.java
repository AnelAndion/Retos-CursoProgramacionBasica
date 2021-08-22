import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class App extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader f = new FXMLLoader(getClass().getResource("GUI.fxml"));
        Parent root = f.load();
        Scene scene = new Scene(root);
        primaryStage.setTitle("Sistema estadístico de calificaciones");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
