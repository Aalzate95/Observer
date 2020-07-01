package components;


import javafx.scene.control.Button;

public class MyButton {
	protected String Color;
	protected String RGB;
	protected float X ,Y,SizeX,SizeY;
	
	public MyButton(String Color, float x, float y) {
		this.Color = Color;
		this.X = x;
		this.Y = y;
		this.SizeX = 180;
		this.SizeY = 20;
	}
	public Button CreateButton() {
		Button button = new Button(this.Color);
		button.setLayoutX(this.X);
		button.setLayoutY(this.Y);
		button.setPrefSize(this.SizeX, this.SizeY);
		
            
		return button;
	}
	
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public String getRGB() {
		return RGB;
	}
	public void setRGB(String rGB) {
		RGB = rGB;
	}
}
