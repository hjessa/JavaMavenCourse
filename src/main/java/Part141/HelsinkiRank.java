package Part141;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class HelsinkiRank extends Application {


    public void start(Stage stage) {
        // create the x and y axes that the chart is going to use
        NumberAxis xAxis= new NumberAxis(2005, 2017, 2);
        NumberAxis yAxis = new NumberAxis(0,100,10);

        // set the titles for the axes
        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");


        // create the line chart. The values of the chart are given as numbers
        // and it uses the axes we created earlier
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki");

        // create the data set that is going to be added to the line chart
        XYChart.Series<Number,Number> rkpData = new XYChart.Series<>();
        rkpData.setName("RKP");
        // and single points into the data set
        rkpData.getData().add(new XYChart.Data<>(2006, 73));
        rkpData.getData().add(new XYChart.Data<>(2007, 68));
        rkpData.getData().add(new XYChart.Data<>(2008, 72));
        rkpData.getData().add(new XYChart.Data<>(2009, 72));
        rkpData.getData().add(new XYChart.Data<>(2010, 74));
        rkpData.getData().add(new XYChart.Data<>(2011, 73));
        rkpData.getData().add(new XYChart.Data<>(2012, 76));
        rkpData.getData().add(new XYChart.Data<>(2013, 73));
        rkpData.getData().add(new XYChart.Data<>(2014, 67));
        rkpData.getData().add(new XYChart.Data<>(2015, 56));
        rkpData.getData().add(new XYChart.Data<>(2016, 56));


        // add the data set to the line chart
        lineChart.getData().add(rkpData);

        // display the line chart
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }
}
