package application.control;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainFX extends Application {
	
	Stage stage;
	
	/**
	 * Construir la aplicación
	 */
	@Override
	public void start(Stage stage){
		
		this.stage = stage;
		
		showProfile();
	}
	
	/**
	 * Arrancar la aplicación
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
	
	/**
	 * Construir la ventana principal
	 */
	private void showProfile() {

		try {

			FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/Profile.fxml"));
			AnchorPane pane = loader.load();

			Scene scene = new Scene(pane);

			Font.loadFont(
					getClass().getResourceAsStream(
							"../view/assets/PoiretOne-Regular.ttf"), 20);
			
			stage.setScene(scene);
			stage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}