package application;
	
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application{
	static Cart cart = new Cart();
	
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) {
		//set title 
		NewWindow window = new NewWindow();
		primaryStage.setScene(window.BroncoID(primaryStage, cart));
		
		primaryStage.show();
		
	}
}
	
