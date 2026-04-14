package Part141;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    public void start(Stage stage){

        NumberAxis xAxis = new NumberAxis(1000,2000,2);
        NumberAxis yAxis = new NumberAxis(0,100,5);

        yAxis.setLabel("Value");
        xAxis.setLabel("Years");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis,yAxis);
        lineChart.setTitle("Partie i jakieś liczby");

        XYChart.Series<Number,Number> xyChart = new XYChart.Series<>();
        xyChart.setName("linia 1");
        xyChart.getData().add(new XYChart.Data<>(1,1));

        //Metoda do tworzenia serii

        Scene scene = new Scene(lineChart);
        stage.setScene(scene);
        stage.show();
    }

    public void readWriteData(String filename){

        //Odczytam dane z pliku
        //Pierwsza linia mi nada nazwy serii
        //Kolejna będzie wstawiać do serii
        //na końcu dodam do linechartu wszystkie serie

        //pytanie jak efektywnie przeczytać plik wierszami czy kolumnami
    }
}
