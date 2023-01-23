package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class UnfairAdvertisementApplication extends Application {

    @Override
    public void start(Stage window) {
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();
        BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);
        yAxis.setLabel("Faster and better!");
        barChart.setTitle("Internet Speed");
        barChart.setLegendVisible(false);
        
        XYChart.Series data = new XYChart.Series();
        data.getData().add(new XYChart.Data("NDA", 78));
        data.getData().add(new XYChart.Data("Fastie", 76.5));
        data.getData().add(new XYChart.Data("Supernet", 80));
        data.getData().add(new XYChart.Data("Meganet", 75.5));
        
        barChart.getData().add(data);
        Scene scene = new Scene(barChart, 640, 480);
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(UnfairAdvertisementApplication.class);
    }

}
