package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {

	//private AnchorPane rootLayout;	
	public Stage primaryStage;
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("view/Layouts.fxml"));
			//rootLayout = (AnchorPane) loader.load();
            //Scene scene = new Scene(rootLayout);
			AnchorPane root = loader.load();
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
			primaryStage.show();
			//Font.loadFont(getClass().getResourceAsStream("view/Sunset Boulevard.otf"), 20);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}