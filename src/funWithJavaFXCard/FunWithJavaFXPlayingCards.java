package funWithJavaFXCard;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class FunWithJavaFXPlayingCards extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {

		//Create Pane for Cards to be Displayed
		GridPane GridPane = new GridPane();
		GridPane.setHgap(10);
		GridPane.setVgap(10);

		//Display Random Cards
		for(int i = 0; i < 4; i++){
			GridPane.add(returnImagesView(), i, 0);
		}

		//Create button and Action
		Button refreshButton = new Button("Refresh");
		refreshButton.setOnAction(e -> {
				for(int i = 0; i < 4; i++) GridPane.add(returnImagesView(), i, 0);
				} );

		//Create BorderPane for Cards and Button
		BorderPane BorderPane = new BorderPane();
		BorderPane.setCenter(GridPane);
		BorderPane.setBottom(refreshButton);
		BorderPane.setAlignment(refreshButton,Pos.BOTTOM_CENTER);

		//Add Scene
		Scene scene = new Scene(BorderPane);
		primaryStage.setScene(scene);
		primaryStage.setWidth(1240.0);
		primaryStage.setHeight(460.0);
		primaryStage.show();

	}

	public static Image returnRandomImage(){
		int randomNumber = 1 + (int) (Math.random() * (13 - 1 + 1));
		int randomType = 1 + (int) (Math.random() * (4 - 1 + 1));
		String[] numbers = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
		String[] types = {"diamonds", "clubs", "spades", "hearts"};
		String path = "images/" + numbers[randomNumber - 1] + "_of_" + types[randomType - 1] + ".png";
		Image card = new Image(path);
		return card;
	}

	public static ImageView returnImagesView(){
		ImageView displayCard = new ImageView(returnRandomImage());
		displayCard.setFitHeight(400);
		displayCard.setFitWidth(300);
		return displayCard;
	}

	public static void main(String[] args) {
		launch(args);
	}
}
