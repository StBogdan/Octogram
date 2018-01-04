package sample;


import javafx.application.Application;

import javafx.scene.Group;

import javafx.scene.Scene;

import javafx.scene.shape.Line;

import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Line line = new Line(450 , 150, 450, 450);

        //Creating a Group object
        Group root = new Group();

        //Creating a scene object
        Scene scene = new Scene(root, 900, 900);
        root.getChildren().add(line);


        //Adding scene to the stage
        primaryStage.setScene(scene);

        //Displaying the contents of the stage
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
