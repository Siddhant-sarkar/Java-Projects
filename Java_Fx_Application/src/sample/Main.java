package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        GridPane root=new GridPane();
//        root.setAlignment(Pos.CENTER);
//        root.setVgap(10);
//        root.setHgap(10);
//
//        Label greeting =new Label("Hello GUI world!");
//        greeting.setTextFill(Color.BLUE);
//        greeting.setFont(Font.font("Time New Roman", FontWeight.BOLD,70));
//
//        root.getChildren().add(greeting);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 800, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
