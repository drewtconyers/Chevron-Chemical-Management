package ChrevronOffshoreDefoamerApplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;

public class Main extends Application {
    Stage window;
    Scene tankSettings, notifications, tankStatus, trendGraph;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("tankSettings.fxml"));


        primaryStage.setTitle("Chevron Chemical Management");
        primaryStage.setScene(new Scene(root, 1280, 800));
        primaryStage.show();
        primaryStage.setFullScreen(true);
/*
        Button button1 = new Button("loading");
        button1.setOnAction(e -> window.setScene(tankSettings));*/
    }


    public static void main(String[] args) {
        launch(args);
    }
}
