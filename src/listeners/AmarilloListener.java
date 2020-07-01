package listeners;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class AmarilloListener implements EventListener {
	
	public AmarilloListener() {	
	}
	
	@Override
	public void update(String eventType, Button btn, Pane root) {
		
		btn.setOnAction(e -> {root.setStyle("-fx-background-color: Yellow");System.out.println("Amarillo");});

	}
}
