package application;
	


import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;  



public class progress_page extends GridPane
{
			
		
	public Image logo;
	public ImageView view;	
	public Label Status;	
	public Label Info;	
	public Label Company;
	public String[] stats;
	public int i;
	
	
	public progress_page() //constructor
	{
		    	 
		//Image for Logo 	 
		Image logo = new Image("file:C:\\Users\\thoma\\eclipse-workspace\\PhaseThree\\src\\application\\logo.png");  //this path needs to be changed to work on multiple computers	
		ImageView view = new ImageView(logo);				
			     
		//Different Status Labels
		stats = new String[3];
		i = 0;
		stats[0] = "Your order is ready to cook. \n We will let you know when our chef starts cooking!";
		stats[1] = "Your Order is Cooking!\n";
		stats[2] = "Your Order is Ready!\n";
		
		//Status
		Status = new Label(stats[i]);		
		Status.setFont(new Font("Arial", 30));		
		Status.setStyle("-fx-text-fill: green; -fx-font-weight: bold");				
		Status.setTextAlignment(TextAlignment.CENTER);
			
		//Info Label
		Info = new Label("\n\n\nThe location of pick up is \n 123 E University road Tempe AZ 85283");	
		Info.setFont(new Font("Arial", 30));		
		Info.setTextAlignment(TextAlignment.CENTER);		
		Info.setStyle("-fx-font-weight: bold");
					
		//Top Company Label
		Company = new Label("Thank You for Choosing Sundevil Pizza Company!!");		
		Company.setFont(new Font("Arial", 40));		
		Company.setTextAlignment(TextAlignment.CENTER);		
		Company.setStyle("-fx-text-fill: red; -fx-font-weight: bold");
			
		//Add Components Make Grid Layout
		this.setPrefSize(1500, 700);	
		this.add(view, 0,0);						
		this.add(Status, 1,2);		
		this.add(Info, 1,  3);					
		this.add(Company, 1, 0);
				            
	}//end constructor
	
	
	public void update()
	{
		if (this.i < 2) 
		{
			this.i += 1;
			this.Status.setText(stats[i]);
			
		}
	}//end update (call when want to move to next step in process
			
}
		