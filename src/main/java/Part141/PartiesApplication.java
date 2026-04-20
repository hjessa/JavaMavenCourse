package Part141;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.min;

public class PartiesApplication extends Application {

    public void start(Stage stage){

        NumberAxis xAxis = new NumberAxis(1968,2008,4);
        NumberAxis yAxis = new NumberAxis(0,30,5);

        yAxis.setLabel("Value");
        xAxis.setLabel("Years");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis,yAxis);
        lineChart.setTitle("Partie i jakieś liczby");


        List<XYChart.Series<Number,Number>> seriesList = readWriteData("C:\\Users\\hubert\\IdeaProjects\\JavaLearningMaven\\src\\main\\java\\Part141\\partiesdata.csv");
        seriesList.forEach(it -> lineChart.getData().add(it));

        Scene scene = new Scene(lineChart);
        stage.setScene(scene);
        stage.show();
    }

    public List<XYChart.Series<Number,Number>> readWriteData(String filename){

        //Odczytam dane z pliku
        List<XYChart.Series<Number,Number>> seriesList = new ArrayList<>();

        try(Scanner file = new Scanner(Paths.get(filename))){
            //muszę pominąć 1 wiersz
            String years = file.nextLine();
            String[] splittedYears = years.split("\t");
            System.out.println(splittedYears[0]);
            System.out.println(splittedYears[1]);
            while(file.hasNextLine()){

                String line = file.nextLine();
                String[] row = line.split("\t");

                XYChart.Series<Number,Number> series = new XYChart.Series<>();

                //Ustawiam 1 jako nazwe
                series.setName(row[0]);
                for (int i = 1; i < min(row.length, splittedYears.length); i++) {
                    System.out.println("Year: "+Integer.valueOf(splittedYears[i])+"  Val: "+Double.valueOf(row[i]));
                    series.getData().add(new XYChart.Data<>(Integer.valueOf(splittedYears[i]),Double.valueOf(row[i])));
                }


                seriesList.add(series);


            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return seriesList;
    }
}
