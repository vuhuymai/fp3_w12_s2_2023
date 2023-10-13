import javafx.application.Application;
import javafx.stage.Stage;
import view.ComputeAreaScene;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		ComputeAreaScene scene = new ComputeAreaScene();
		
		primaryStage.setTitle(scene.getTitle());
		primaryStage.setScene(scene.getScene());
		primaryStage.show();

	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
