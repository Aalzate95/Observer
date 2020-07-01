package editor;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import publisher.EventManager;

public class Editor {
    public EventManager events;

    public Editor() {
        this.events = new EventManager("clickRojo","clickAmarillo","clickAzul");
    }
    public void ARojo(Button color, Pane root) {
        events.notify("clickRojo",color,root);
        
    }
    public void AAmarillo(Button color, Pane root) {
        events.notify("clickAmarillo",color,root);
        
    }
    public void AAzul(Button color, Pane root) {
        events.notify("clickAzul",color,root);
        
    }

}
