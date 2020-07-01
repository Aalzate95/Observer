package listeners;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

public interface EventListener {

	void update(String eventType, Button boton, Pane root);
    
}
