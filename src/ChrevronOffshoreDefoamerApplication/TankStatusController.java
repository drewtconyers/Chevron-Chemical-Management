package ChrevronOffshoreDefoamerApplication;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.input.MouseEvent;

import javax.xml.soap.Text;
import java.net.URL;
import java.util.ResourceBundle;

public class TankStatusController implements Initializable {
    public void exit(MouseEvent mouseEvent) {
        System.exit(0);
    }

    public void trendGraphSceneSwap(MouseEvent mouseEvent) {
        Main.trendGraphScene();
    }

    public void tankSettingsSceneSwap(MouseEvent mouseEvent) {
        Main.tankSettingsScene();
    }

    @FXML
    private PieChart tankLevelChart;

/*    @FXML
    private Text defoamerInches;

    @FXML
    private Text miscellaneousInches;*/

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        /*
        Tank Status Pie Chart
         */
        ObservableList<PieChart.Data> tankLevelData = FXCollections.observableArrayList(
                new PieChart.Data("Defoamer Chemical", 1),
                new PieChart.Data("Miscellaneous", 2),
                new PieChart.Data("Remaining", 3));
        tankLevelChart.setData(tankLevelData);
        applyCustomColorSequence(tankLevelData,"#5a80fb", "#beceff","#edf1fe");

        /*
        Tank Status Pie Chart Data
         */
        //defoamerInches.setText("Hello");

    }

    private void applyCustomColorSequence(ObservableList<PieChart.Data> tankLevelData, String... pieColors) {
        int i = 0;
        for(PieChart.Data data : tankLevelData) {
            data.getNode().setStyle("-fx-pie-color: " + pieColors[i % pieColors.length] + ";");
            i++;
        }
    }

}
