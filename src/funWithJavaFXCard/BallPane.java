package funWithJavaFXCard;

import javafx.application.Application;
import javafx.scene.shape.Circle;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class BallPane extends Pane{

	private int XPosition = 200;
//   int whatever =  pane.widthProperty().divide(2));

	private int YPosition = 180;
	private Circle circle = new Circle(XPosition,YPosition, 50);

	public Pane original(){
		circle.setStroke(Color.BLACK);
		circle.setFill(Color.WHITE);
		Pane originalPane = new Pane();
		originalPane.getChildren().add(circle);
		return originalPane;
	}

	public void up(){
		YPosition -= 10;
		circle.setCenterY(this.YPosition);
	}

	public void down(){
		YPosition += 10;
		circle.setCenterY(YPosition);
	}

	public void right(){
		XPosition += 10;
		circle.setCenterX(XPosition);
	}

	public void left(){
		XPosition -= 10;
		circle.setCenterX(XPosition);
	}

}
