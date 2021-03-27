package ChrevronOffshoreDefoamerApplication;

import javafx.scene.input.MouseEvent;

public class TankStatusController {
    public void exit(MouseEvent mouseEvent) {
        System.exit(0);
    }


    public void trendGraphSceneSwap(MouseEvent mouseEvent) {
        Main.trendGraphScene();
    }
}
