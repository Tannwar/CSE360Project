import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
 
public class LoginPage extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        primaryStage.setTitle("Hello World!\n");
        BorderPane borderPane = new BorderPane();
        
        GridPane gridPane = new GridPane();
        
        InputStream inStream = new FileInputStream("coffeicon.jpg");
        Image img = new Image(inStream);
        ImageView imgView = new ImageView();
        imgView.setImage(img);
        imgView.setFitWidth(250);
        imgView.setPreserveRatio(true);
        //Group group = new Group(imgView);
        
        PasswordField pwdField = new PasswordField();
        //pwdField.setPromptText("");
        TextField userField = new TextField();
        Label pwdLabel = new Label("Password: ");
        Label userLabel = new Label("Username: ");
        
        gridPane.add(userLabel, 0, 0, 1, 1);
        gridPane.add(userField, 1, 0, 1, 1);
        gridPane.add(pwdLabel, 0, 1, 1, 1);
        gridPane.add(pwdField, 1, 1, 1, 1);
        
       /* gridPane.add(loginBtn, 0, 3, 1, 1);
        gridPane.add(crtAccount, 1, 3, 1, 1); */
        
        Button loginBtn = new Button("Login");
        Button crtAccount = new Button("Create Account");
        HBox h = new HBox();
        h.setAlignment(Pos.CENTER);
        h.setPadding(new Insets(15, 12, 15, 12));
        h.setSpacing(10);
        h.getChildren().add(loginBtn);
        h.getChildren().add(crtAccount);
        HBox hbxImg = new HBox();
        hbxImg.setAlignment(Pos.CENTER);
        hbxImg.getChildren().add(imgView);
        
        VBox v = new VBox(); // This is what I was going to use to align the labels/text fields

        borderPane.setTop(hbxImg);
        borderPane.setBottom(h);
        borderPane.setCenter(v);
        borderPane.setCenter(gridPane);
        
        
        
     /*   loginBtn.setOnAction(new EventHandler<ActionEvent>() {
        crtAccount.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        */
        
        StackPane root = new StackPane();
        root.getChildren().add(borderPane);
        primaryStage.setScene(new Scene(root, 600, 550));
        primaryStage.show();
    }
}
