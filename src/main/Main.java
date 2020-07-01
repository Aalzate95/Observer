package main;

import editor.Editor;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import listeners.AzulListener;
import listeners.AmarilloListener;
import listeners.RojoListener;


public class Main extends Application {
	
	@Override
	public void start(Stage arg) throws Exception {
		
		Stage stage = new Stage();
		HBox root = new HBox();
		Editor editor = new Editor();
		
		Button btnRojo = new Button("Rojo");
		Button btnAmarillo = new Button("Amarillo");
		Button btnAzul = new Button("Azul");
		
        editor.ARojo(btnRojo,root);
        editor.events.subscribe("clickRojo", new RojoListener());
        editor.AAmarillo(btnAmarillo,root);
        editor.events.subscribe("clickAmarillo", new AmarilloListener());
        editor.AAzul(btnAzul,root);
        editor.events.subscribe("clickAzul", new AzulListener());
		
		root.getChildren().addAll(btnRojo,btnAmarillo,btnAzul);
		root.setAlignment(Pos.CENTER);
		Scene scene = new Scene(root, 360,360);
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
