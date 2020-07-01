package listeners;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public class AzulListener implements EventListener {
	
	public AzulListener() {
		
	}
	@Override
	public void update(String eventType, Button btn, Pane root) {
		
		btn.setOnAction(e -> root.setStyle("-fx-background-color: Blue"));

	}
}