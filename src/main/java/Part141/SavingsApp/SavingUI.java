package Part141.SavingsApp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.Axis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.control.Slider;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;


public class SavingUI extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        BorderPane components = new BorderPane();

        NumberAxis xAxisYears = new NumberAxis(0,30,1);
        NumberAxis yAxisValue = new NumberAxis();
        LineChart<Number,Number> linechart = new LineChart<>(xAxisYears,yAxisValue);

        components.setCenter(linechart);

        VBox topMenu = new VBox();

        BorderPane topMenuFirst = new BorderPane();

        Label topMenuFirstLeftLabel = new Label("Monthly savings");
        topMenuFirst.setLeft(topMenuFirstLeftLabel);
        Slider topMenuFirstCenterSlider = new Slider(25,250,25);
        topMenuFirst.setCenter(topMenuFirstCenterSlider);
        Label topMenuFirstRightLabel = new Label("25");
        topMenuFirst.setRight(topMenuFirstRightLabel);

        BorderPane topMenuSecond = new BorderPane();

        Label topMenuSecondLeftLabel = new Label("Yearly interest rate");
        topMenuSecond.setLeft(topMenuSecondLeftLabel);
        Slider topMenuSecondCenterSlider = new Slider(0,10,1);
        topMenuSecond.setCenter(topMenuSecondCenterSlider);
        Label topMenuSecondRightLabel = new Label("0");
        topMenuSecond.setRight(topMenuSecondRightLabel);

        topMenu.getChildren().addAll(topMenuFirst,topMenuSecond);
        components.setTop(topMenu);

        Scene firstScene = new Scene(components);
        Stage firstWindow = new Stage();
        firstWindow.setScene(firstScene);
        firstWindow.show();
    }
}
