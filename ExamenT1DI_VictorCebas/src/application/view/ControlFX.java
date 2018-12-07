package application.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ControlFX implements Initializable{
	
	@FXML
	JFXButton btnInicio;
	
	@FXML
	JFXButton btnPasswd;
	
	@FXML
	JFXButton btnCancel;
	
	@FXML
	JFXButton btnSave;
	
	@FXML
	ImageView imagen;
	
	Stage secondStage;
	
	/**
	 * Controlador del botón btnInicio que construye la sengunda ventana y lo arranca
	 */
	@FXML
	public void sendStage() {
		
		try {
			// Load the fxml file and create a new stage for the popup.
			FXMLLoader loader = new FXMLLoader(getClass().getResource("GetMe.fxml"));
			AnchorPane page = (AnchorPane) loader.load();
			
			secondStage = new Stage();
			
			Scene scene=new Scene(page);
			
			secondStage.setScene(scene);
			secondStage.show();
			

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Controlador del btnCancel
	 */
	@FXML
	public void closeStage() {
		secondStage.close();
	}
	
	/**
	 * Controlador del btnPasswd
	 */
	public void c_btnPasswd() {
		System.out.println("Cambiar contraseña");
	}
	
	/**
	 * Controlador del btnSave
	 */
	public void c_btnSave() {
		System.out.println("Datos guardados");
		secondStage.close();
	}

	/**
	 * Método para arrancar tipos de animaciones
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		FadeTransition fadeTransition = new FadeTransition(Duration.seconds(3), imagen);
		fadeTransition.setFromValue(0);
		fadeTransition.setToValue(1);
		fadeTransition.play();
		
		imagen.setOnMouseClicked(event ->{
			System.out.println("Cambiar imagen");
		});
	}
}