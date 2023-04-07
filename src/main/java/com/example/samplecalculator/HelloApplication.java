package com.example.samplecalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.LoadException;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
       try {
           FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

           Scene scene = null;
           try {
               scene = new Scene(fxmlLoader.load(), 500, 500);
           } catch (IOException e) {
               throw new LoadException(e);
           }

           stage.setTitle("Simple Calculator!");
           stage.setScene(scene);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
interface   Shape{
    void draw();

}
class Circle implements  Shape{
   @Override
    public  void draw(){
        Circle circle = new Circle();
        circle.draw();
    }
    Circle circle = new Circle();
}
 class  Rectangle implements  Shape{
    @Override
     public  void draw(){
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
    }
 }