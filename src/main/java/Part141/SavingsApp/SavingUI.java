package Part141.SavingsApp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.Axis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Slider;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import jdk.jfr.Percentage;


public class SavingUI extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        BorderPane components = new BorderPane();

        NumberAxis xAxisYears = new NumberAxis(0,30,1);
        NumberAxis yAxisValue = new NumberAxis();
        LineChart<Number,Number> linechart = new LineChart<>(xAxisYears,yAxisValue);
        XYChart.Series<Number,Number> savingsLine = new XYChart.Series<>();
        linechart.getData().add(savingsLine);

        XYChart.Series<Number,Number> interestLine = new XYChart.Series<>();
        linechart.getData().add(interestLine);

        components.setCenter(linechart);

        VBox topMenu = new VBox();

        BorderPane topMenuFirst = new BorderPane();

        Label topMenuFirstLeftLabel = new Label("Monthly savings");
        topMenuFirst.setLeft(topMenuFirstLeftLabel);
        Slider topMenuFirstCenterSlider = new Slider(0,250,25);
        topMenuFirstCenterSlider.setMajorTickUnit(1);
        topMenuFirstCenterSlider.setMinorTickCount(0);
        topMenuFirstCenterSlider.setSnapToTicks(true);

        topMenuFirst.setCenter(topMenuFirstCenterSlider);
        Label topMenuFirstRightLabel = new Label("25");
        topMenuFirst.setRight(topMenuFirstRightLabel);

        BorderPane topMenuSecond = new BorderPane();

        Label topMenuSecondLeftLabel = new Label("Yearly interest rate");
        topMenuSecond.setLeft(topMenuSecondLeftLabel);
        Slider topMenuSecondCenterSlider = new Slider(0,10,1);
        topMenuSecondCenterSlider.setMajorTickUnit(1);
        topMenuSecondCenterSlider.setMinorTickCount(0);
        topMenuSecondCenterSlider.setSnapToTicks(true);
        topMenuSecond.setCenter(topMenuSecondCenterSlider);
        Label topMenuSecondRightLabel = new Label("0");
        topMenuSecond.setRight(topMenuSecondRightLabel);

        topMenuFirstCenterSlider.valueProperty().addListener((obs, oldVal, newVal) -> {
            savingsLine.getData().clear();
            double value = topMenuFirstCenterSlider.getValue();
            System.out.println(value);
            double upperBound = xAxisYears.getUpperBound();
            System.out.println(upperBound);
            double increment = xAxisYears.getTickUnit();
            System.out.println(increment);


            for (double i = 0; i < upperBound; i++) {
                savingsLine.getData().add(new XYChart.Data<>(i,value*i*12));
            }

        });

        topMenuSecondCenterSlider.valueProperty().addListener((observable, oldVal, newVal)->{
            interestLine.getData().clear();

            double monthly = topMenuFirstCenterSlider.getValue();
            double rate = topMenuSecondCenterSlider.getValue();

            double total = 0;

            double upperBound = xAxisYears.getUpperBound();

            for (int i = 1; i <= upperBound; i++) {

                // dodajesz roczne wpłaty
                total += monthly * 12;

                // naliczasz procent
                total = total * (1 + rate / 100);

                interestLine.getData().add(new XYChart.Data<>(i, total));
            }
        });

        topMenu.getChildren().addAll(topMenuFirst,topMenuSecond);
        components.setTop(topMenu);

        Scene firstScene = new Scene(components);
        Stage firstWindow = new Stage();
        firstWindow.setScene(firstScene);
        firstWindow.show();
    }
}
