package ChrevronOffshoreDefoamerApplication;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class TankSettingsController {

    @FXML
    public void exit(MouseEvent mouseEvent) {
        System.exit(0);
    }


    public void notificationScreenSwitch(MouseEvent mouseEvent) throws IOException {
        Main.notificationScene();
    }

    public void tankStatusSwitchScreen(MouseEvent mouseEvent) {
        Main.tankStatusScene();
    }

}
