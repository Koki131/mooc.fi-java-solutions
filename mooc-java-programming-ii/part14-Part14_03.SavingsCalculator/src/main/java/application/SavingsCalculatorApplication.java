package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.*;
import javafx.geometry.Pos;
import javafx.scene.chart.*;
import javafx.scene.layout.*;
import javafx.scene.control.Label;
import javafx.scene.control.*;

public class SavingsCalculatorApplication extends Application {
    
    
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Application.launch(args);
    }
    
    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();
        
        
        LineChart<Number, Number> chart = new LineChart<>(xAxis, yAxis);
        chart.setTitle("Savings Calculator");
        layout.setCenter(chart);
        chart.setLegendVisible(false);
                
        
        VBox box = new VBox();
        BorderPane monthlySavings = new BorderPane();
        Label label1 = new Label("Monthly savings");
        Label labelSlide = new Label("25");
        monthlySavings.setLeft(label1);
        monthlySavings.setRight(labelSlide);
        BorderPane yearlyInterest = new BorderPane();
        Label label2 = new Label("Yearly interest rate");
        Label labelSlide2 = new Label("0");
        yearlyInterest.setLeft(label2);
        yearlyInterest.setRight(labelSlide2);
        
        box.getChildren().addAll(monthlySavings, yearlyInterest);
        layout.setTop(box);
        
        Slider savingsSlider = new Slider(25, 250, 25);
        monthlySavings.setCenter(savingsSlider);
        savingsSlider.setShowTickMarks(true);
        savingsSlider.setShowTickLabels(true);
        savingsSlider.setBlockIncrement(0.1f);
        savingsSlider.setMajorTickUnit(25);
        
        Slider interestSlider = new Slider(0, 10, 0);
        yearlyInterest.setCenter(interestSlider);
        interestSlider.setShowTickMarks(true);
        interestSlider.setShowTickLabels(true);
        interestSlider.setBlockIncrement(0.1f);        
        interestSlider.setMinorTickCount(10);
        
        
        XYChart.Series savings = new XYChart.Series();
        XYChart.Series interest = new XYChart.Series();
        
        // Getting values for [25, 31]
        for (int n = 0; n < 31; n++) {
            savings.getData().add(new XYChart.Data(n, (savingsSlider.getValue() * (n * 12))));
        }
        // Monthly savings
        savingsSlider.valueProperty().addListener((event) -> {
            labelSlide.setText(String.valueOf(savingsSlider.getValue()));
            savings.getData().clear();
            for (int n = 0; n < 31; n++) {
                savings.getData().add(new XYChart.Data(n, (savingsSlider.getValue() * (n * 12))));
            }
        });
        
        // Interest + monthly savings
        interestSlider.valueProperty().addListener((event) -> {            
            double compound = interestSlider.getValue() / 100 + 1;
            double value = 0;
            labelSlide2.setText(String.valueOf(interestSlider.getValue()));
            interest.getData().clear();
            for (int n = 0; n < 31; n++) {
               interest.getData().add(new XYChart.Data(n, value)); 
               value = (value + savingsSlider.getValue() * 12) * compound;
               
            }
        });
        
        chart.getData().add(savings);
        chart.getData().add(interest);
        
                
        Scene scene = new Scene(layout, 320, 300);
        window.setTitle("Ghetto Savings Calculator");
        window.setScene(scene);
        window.show();
    }
}
