package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import components.MyButton;

public class Main extends Application {

	public static void main(String[] args) {
        
        launch(args);
        
    }
	public void start(Stage primaryStage) throws Exception {
		Pane root = new Pane();
		Scene scene = new Scene(root,900,640);
		
		MyButton MiAmarillo =  new MyButton("Amarillo",360,280);
		MyButton MiRojo =  new MyButton("Rojo",360,330);
		MyButton MiAzul =  new MyButton("Azul",360,380);
		
		Button btnAmarillo = MiAmarillo.CreateButton();
		Button btnRojo = MiRojo.CreateButton();
		Button btnAzul = MiAzul.CreateButton();
		
		
		root.getChildren().addAll(btnAmarillo, btnRojo, btnAzul);
		primaryStage.setScene(scene);
        primaryStage.show();
	}
	
}
