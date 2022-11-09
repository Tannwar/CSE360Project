package application;
	

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;  



public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			
			
			//Add Pitch-fork
		     Image logo = new Image("file:///C:/Users/thoma/eclipse-workspace/ppage/src/application/logo.png");  //this path needs to be changed to work on multiple computers
		     ImageView view = new ImageView(logo);
			
			
		     
		     
		     
		  
			
		    //Set Labels
			Label Status = new Label("Your order is ready to cook. \n We will let you know when our chef starts cooking.");
			Status.setFont(new Font("Arial", 30));
			Status.setStyle("-fx-text-fill: green; -fx-font-weight: bold");
			Status.setTextAlignment(TextAlignment.CENTER);
			
			
			Label Info = new Label("\n\n\nThe location of pick up is \n 123 E University road Tempe AZ 85283");
			Info.setFont(new Font("Arial", 30));
			Info.setTextAlignment(TextAlignment.CENTER);
			Info.setStyle("-fx-font-weight: bold");
			
			Label Company = new Label("Thank You for Choosing Sundevil Pizza Company!!");
			Company.setFont(new Font("Arial", 40));
			Company.setTextAlignment(TextAlignment.CENTER);
			Company.setStyle("-fx-text-fill: red; -fx-font-weight: bold");
			
			 
			
//******************************************************************	button stuff	
			//Button Basically gets pressed to move to cooking, then pressed again to move to ready
			Button advance = new Button("Advance to Cooking");
//*******************************************************************	end button stuff

			
			//Make Box for Type Buttons and Add Them
			GridPane Layout = new GridPane();
			Layout.setPrefSize(1500, 700);
//********************************************************************		begin button stuff 
			Layout.add(advance, 0,1);
//********************************************************************		end button stuff
			Layout.add(view, 0,0);			
			Layout.add(Status, 1,2);
			Layout.add(Info, 1,  3);
			Layout.add(Company, 1, 0);
			
			//Root Layout
			BorderPane root = new BorderPane();
			root.setCenter(Layout);
	
	
			//Set Scene
			Scene scene = new Scene(root, 1500, 700, Color.WHITE);
	
					
			
			EventHandler<ActionEvent> advanceToReady = new EventHandler<ActionEvent>() 
			{
	            public void handle(ActionEvent e)
	            {	        
	            	Status.setText("Your Order is Ready!\n ");    
	 
	            }
			};
			
			
			
			
			
			EventHandler<ActionEvent> advanceToCook = new EventHandler<ActionEvent>() 
			{
	            public void handle(ActionEvent e)
	            {
	            	Status.setText("Your Order is Cooking\n ");                		
	 
	            	
	            	
//********************************************************************		begin button stuff 
	            		advance.setText("Advance to Ready");
	            		advance.setOnAction(advanceToReady);			//this line is important for changing what the action for advancing is.
//********************************************************************		end button stuff         
	            		
	            		
	            }
			};
				
			
			
			
			
	            
//********************************************************************		begin button stuff 
			advance.setOnAction(advanceToCook);
//********************************************************************		end button stuff          
    
	            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	            primaryStage.setScene(scene);
	            primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
