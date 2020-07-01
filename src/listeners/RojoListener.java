package listeners;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class RojoListener implements EventListener {
	
	public RojoListener() {
		
	}
	@Override
	public void update(String eventType, Button btn, Pane root) {
		
		btn.setOnAction(e -> {root.setStyle("-fx-background-color: Red");System.out.println("Rojo");});
		
	}
}
