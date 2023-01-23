package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.*;


public class ShanghaiApplication extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start(Stage window) {
        NumberAxis xAxis = new NumberAxis(2006, 2018, 2);
        NumberAxis yAxis = new NumberAxis(0, 100, 20);
        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");
        
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki, Shanghai ranking");
        
        XYChart.Series shanghai = new XYChart.Series();
        shanghai.setName("Shanghai");
        shanghai.getData().add(new XYChart.Data(2007, 73));
        shanghai.getData().add(new XYChart.Data(2008, 68));
        shanghai.getData().add(new XYChart.Data(2009, 72));
        shanghai.getData().add(new XYChart.Data(2010, 72));
        shanghai.getData().add(new XYChart.Data(2011, 74));
        shanghai.getData().add(new XYChart.Data(2012, 73));
        shanghai.getData().add(new XYChart.Data(2013, 76));
        shanghai.getData().add(new XYChart.Data(2014, 73));
        shanghai.getData().add(new XYChart.Data(2015, 67));
        shanghai.getData().add(new XYChart.Data(2016, 56));
        shanghai.getData().add(new XYChart.Data(2017, 56));
        
        lineChart.getData().add(shanghai);
        
        Scene scene = new Scene(lineChart, 640, 480);
        window.setScene(scene);
        window.show();
        
        

        
    }

}
