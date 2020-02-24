package funWithJavaFXCard;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class FunWithJavaFXBall extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		//Create a ball plane class that has a circle in it
		BallPane BallPane = new BallPane();

		//Create an HBox to contain the buttons
		HBox buttonOptions = new HBox(10);

		//Create Buttons
		Button left = new Button("Left");
		Button right = new Button("Right");
		Button up = new Button("Up");
		Button down = new Button("Down");

		//Set Buttons into the HBox
		buttonOptions.getChildren().add(left);
		buttonOptions.getChildren().add(right);
		buttonOptions.getChildren().add(up);
		buttonOptions.getChildren().add(down);

		//Create a Border plane to set the BallPane and HBox into
		BorderPane BorderPane = new BorderPane();
		BorderPane.setCenter(BallPane.original());
		BorderPane.setBottom(buttonOptions);
		BorderPane.setAlignment(buttonOptions, Pos.BOTTOM_CENTER);

		//Actions for Buttons
		left.setOnAction(e -> BallPane.left());
		right.setOnAction(e -> BallPane.right());
		up.setOnAction(e -> BallPane.up());
		down.setOnAction(e -> BallPane.down());

		//Set the Border Pane to the scene
		Scene scene = new Scene(BorderPane);
		primaryStage.setScene(scene);
		primaryStage.setWidth(400);
		primaryStage.setHeight(400);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
