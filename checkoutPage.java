package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;


public class checkoutPage extends Application {
	
	String pizza = "Pepperoni Olive Mushroom";
	String price = "12.76";
	
	Scene scene;
	BorderPane border;
	VBox v1;
	HBox h1;
	Button backButton, checkout;
	Text item, item2, item3;
	TextField id;
	
	//pizza = pizza.getName;
	//price = pizza.getPrice;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage stage) throws Exception {
		border = new BorderPane();
		border.setPadding(new Insets(15, 12, 15, 12));
		scene = new Scene(border, 1280, 720);
		
		//Image logo = new Image("logo.png");
		//ImageView view = new ImageView(logo);
		
		v1 = new VBox();
		v1.setPadding(new Insets(15, 12, 15, 12));
		v1.setSpacing(5);
		border.setCenter(v1);
		
		
		backButton = new Button("Back to Menu");
		v1.getChildren().add(backButton);
		backButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				//switch back to menu scene				
			}
			
		});
		

		item = new Text("Item:			" + pizza);
		item2 = new Text("Price: 			" + price);
		v1.getChildren().addAll(item, item2);
		
		h1 = new HBox();
		h1.setPadding(new Insets(15, 12, 15, 0));
		h1.setSpacing(10);
		border.setBottom(h1);
		
		item3 = new Text("Enter your Student ID:");
		id = new TextField();
		checkout = new Button("Checkout");
		h1.getChildren().addAll(item3,id,checkout);
		checkout.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent arg0) {
				if (id.getText() == "1111") { //swap 1111 for some pizza.id
					//add the requested pizza to the ordered queue
				}
				
			}
			
		});
		
		
		stage.setScene(scene);
		stage.show();
	}
}

