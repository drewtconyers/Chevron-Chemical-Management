package ChrevronOffshoreDefoamerApplication;

import javafx.application.Application;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;



public class Main extends Application {
    public static Parent tankSettings;
    public static Parent notifications;
    private static Parent tankStatus;
    private static Parent trendGraph;
    private static Stage window;
    Parent layout;

    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("Chevron Chemical Management");

        tankSettings = FXMLLoader.load(getClass().getResource("tankSettings.fxml"));
        notifications = FXMLLoader.load(getClass().getResource("notificationsSettings.fxml"));
        trendGraph = FXMLLoader.load(getClass().getResource("trendGraph.fxml"));
        tankStatus = FXMLLoader.load(getClass().getResource("tankStatus.fxml"));

        Scene startingScene = new Scene(tankSettings);

        window.setScene(startingScene);
        window.setFullScreen(true);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static void tankSettingsScene() { swapScenes(tankSettings);}
    public static void notificationScene() {
        swapScenes(notifications);
    }
    public static void tankStatusScene() {
        swapScenes(tankStatus);
    }
    public static void trendGraphScene() {
        swapScenes(trendGraph);
    }
    public static void swapScenes(Parent newContent) {
        window.getScene().setRoot(newContent);
    }



}
