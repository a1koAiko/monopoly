package application;
	
import java.awt.Button;
import java.awt.Label;
import java.awt.Rectangle;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;


public class Main extends Application  {


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("GridPane Experiment");
        Button r1 = new Button();
//        Button button1 = new Button("Button 1");
//        Button button2 = new Button("Button 2");
//        Button button3 = new Button("Button 3");
//        Button button4 = new Button("Button 4");
//        Button button5 = new Button("Button 5");
//        Button button6 = new Button("Button 6");

        GridPane grid = new GridPane();
        grid.add(r1, 1, 1);
//        gridPane.add(button1, 0, 0, 1, 1);
//        gridPane.add(button2, 1, 0, 1, 1);
//        gridPane.add(button3, 2, 0, 1, 1);
//        gridPane.add(button4, 0, 1, 1, 1);
//        gridPane.add(button5, 1, 1, 1, 1);
//        gridPane.add(button6, 2, 1, 1, 1);

        Scene scene = new Scene(grid, 240, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}

