package ba.unsa.etf.rpr;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ResourceBundle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        GeografijaDAO model = GeografijaDAO.getInstance();
        //model.napuni();
        ResourceBundle bundle = ResourceBundle.getBundle("Translation");
        FXMLLoader loader = new FXMLLoader( getClass().getResource(
                "/biblioteka.fxml" ), bundle);

        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        loader.setController(new GeografijaDAO(model));
        Parent root = loader.load();
        primaryStage.setTitle("Geografija");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
