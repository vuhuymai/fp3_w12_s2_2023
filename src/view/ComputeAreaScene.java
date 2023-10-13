package view;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class ComputeAreaScene {

	public String getTitle() {
		return "Calculate Area";
	}
	
	public Scene getScene() {
		
		// Load the FXML store the root UI using a reference
		FXMLLoader loader = new FXMLLoader(getClass().getResource("compute_area.fxml"));
		
		Parent rootUI = null;
		try {
			rootUI = loader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Scene scene = new Scene(rootUI);
		
		return scene;
		
	}
	
}
