package com.example.pizzafile;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class pizzaOrderPage extends StackPane {

    private boolean cheeseT, pepperoniT, veggiT;
    private boolean[] toppings;
    private int id = 1100;

    public pizzaOrderPage(){

        toppings = new boolean[4];
        StackPane layout = new StackPane();
        //Adding top left text
        Text t = new Text();
        t.setText("Joe's Pizza");
        t.setX(0);
        t.setY(0);
        layout.setAlignment(t, Pos.TOP_LEFT);
        layout.getChildren().add(t);

        //adding Button
        Button button = new Button("Calcualte Price");
        button.setPrefSize(500,40);
        layout.getChildren().add(button);
        layout .setAlignment(button, Pos.BOTTOM_CENTER);


        //adding toggle group
        Rectangle rectangle1 = new Rectangle();
        layout.setAlignment(rectangle1, Pos.CENTER_LEFT);
        rectangle1.setWidth(100);
        rectangle1.setHeight(60);
        rectangle1.setTranslateX(145);
        rectangle1.setArcWidth(30.0);
        rectangle1.setArcHeight(20.0);
        rectangle1.setStyle("-fx-fill: white; -fx-stroke: black; -fx-stroke-width: 1;");
        layout.getChildren().add(0, rectangle1);

        Text pizza = new Text("Pizza Type");
        layout.setAlignment(pizza, Pos.TOP_LEFT);
        pizza.setTranslateX(150);
        pizza.setTranslateY(100);
        layout.getChildren().add(pizza);

        RadioButton cheese  = new RadioButton("Cheese");
        RadioButton pepperoni  = new RadioButton("Pepperoni");
        RadioButton veggie  = new RadioButton("Veggie");

        ToggleGroup group = new ToggleGroup();
        cheese.setToggleGroup(group);
        pepperoni.setToggleGroup(group);
        veggie.setToggleGroup(group);

        layout.getChildren().add(1, cheese);
        layout.getChildren().add(1, pepperoni);
        layout.getChildren().add(1, veggie);

        layout.setAlignment(cheese,Pos.TOP_LEFT);
        layout.setAlignment(pepperoni,Pos.TOP_LEFT);
        layout.setAlignment(veggie,Pos.TOP_LEFT);

        cheese.setTranslateX(150);
        pepperoni.setTranslateX(150);
        veggie.setTranslateX(150);

        cheese.setTranslateY(150-20);
        pepperoni.setTranslateY(165-20);
        veggie.setTranslateY(180-20);


        //Adding check box
        Rectangle rectangle2 = new Rectangle();
        layout.setAlignment(rectangle2, Pos.CENTER_LEFT);
        rectangle2.setWidth(100);
        rectangle2.setHeight(60);
        rectangle2.setTranslateX(250);
        rectangle2.setArcWidth(30.0);
        rectangle2.setArcHeight(20.0);
        rectangle2.setStyle("-fx-fill: white; -fx-stroke: black; -fx-stroke-width: 1;");
        layout.getChildren().add(0, rectangle2);

        //adding toppings
        Text pizzaT = new Text("Toppings");
        layout.setAlignment(pizzaT, Pos.TOP_LEFT);
        pizzaT.setTranslateX(260);
        pizzaT.setTranslateY(100);
        layout.getChildren().add(pizzaT);

        CheckBox extraCheese = new CheckBox("Extra Cheese");
        CheckBox Bacon = new CheckBox("Bacon");
        CheckBox Olive = new CheckBox("Olive");
        CheckBox Mushroom = new CheckBox("Mushroom");

        layout.getChildren().add(extraCheese);
        layout.getChildren().add(Bacon);
        layout.getChildren().add(Olive);
        layout.getChildren().add(Mushroom);

        layout.setAlignment(extraCheese,Pos.TOP_LEFT);
        layout.setAlignment(Bacon,Pos.TOP_LEFT);
        layout.setAlignment(Olive,Pos.TOP_LEFT);
        layout.setAlignment(Mushroom,Pos.TOP_LEFT);

        extraCheese.setTranslateX(255);
        Bacon.setTranslateX(255);
        Mushroom.setTranslateX(255);

        extraCheese.setTranslateY(150-20);
        Bacon.setTranslateY(165-20);
        Mushroom.setTranslateY(180-20);





        /*----------------------------------------------------------------------//
        Event Handling
        /----------------------------------------------------------------------/*/


        button.setOnAction(new EventHandler<ActionEvent>() {
            double x = 0;
            @Override
            public void handle(ActionEvent event) {
                if (cheese.isSelected()) {
                    cheeseT = true;
                } else if (pepperoni.isSelected()) {
                    pepperoniT = true;
                } else if (veggie.isSelected()) {
                    veggiT = true;
                }
                if(extraCheese.isSelected()){
                    toppings[0] = true;
                }
                if (Olive.isSelected()){
                    toppings[1] = true;
                }
                if(Bacon.isSelected()){
                    toppings[2] = true;
                }
                if(Mushroom.isSelected()){
                    toppings[3] = true;
                }
        	pizza pizzaObj = new pizza(id, cheeseT, pepperoniT, veggiT, toppings);

            }
        });

        /*----------------------------------------------------------------------//
        Event Handling
        /----------------------------------------------------------------------/*/

        //creating pizza obj



    }

}
