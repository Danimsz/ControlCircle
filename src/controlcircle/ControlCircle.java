/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package controlcircle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;

/**
 *
 * @author usu2dam
 */
public class ControlCircle extends Application {
    
      //circulo 
        Pane pane = new Pane();
        Circle circle = new Circle(); {
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
    }    
        
             
        class Agrandar implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent e){
        circle.setRadius(circle.getRadius() +10);
            }
    }
        
        class Chico implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent e){
        circle.setRadius(circle.getRadius() -10);
            }
    }
    
    @Override
    public void start(Stage primaryStage) {
        
        Button btn = new Button();
        btn.setText("agrandar");
        
        Button btn2 = new Button();
        btn2.setText("Achicar");
        
        HBox root = new HBox();
        root.getChildren().add(btn);
        root.getChildren().add(btn2);
        root.getChildren().add(circle);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("ControlCircle");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        btn.setOnAction(new Agrandar());
        btn2.setOnAction(new Chico());
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
