package ChrevronOffshoreDefoamerApplication;

import javafx.scene.input.MouseEvent;

public class TrendGraphController {
    public void exit(MouseEvent mouseEvent) {
        System.exit(0);
    }

    public void tankSettingsSceneSwap(MouseEvent mouseEvent) {
        Main.tankSettingsScene();
    }

    public void tankStatusSceneSwap(MouseEvent mouseEvent) {
        Main.tankStatusScene();
    }
}
