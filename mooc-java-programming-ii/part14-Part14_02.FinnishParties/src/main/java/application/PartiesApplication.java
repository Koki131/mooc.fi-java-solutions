package application;

import java.util.*;
import java.nio.file.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.*;

public class PartiesApplication extends Application {
    private HashMap<String, HashMap<Integer, Double>> values;


    
    public PartiesApplication() {
        this.values = read("partiesdata.tsv");

    }

    public static void main(String[] args) {
       
        Application.launch(args);
    }
    
    @Override
    public void start(Stage window) {
        NumberAxis xAxis = new NumberAxis(1967, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);
        xAxis.setLabel("Years");
        yAxis.setLabel("Percentage");
        
        LineChart<Number, Number> chart = new LineChart<>(xAxis, yAxis);
        chart.setTitle("Relative support for the parties");
        
        getData(chart);
        
        Scene scene = new Scene(chart, 640, 480);
        window.setScene(scene);
        window.show();
        
        
    }
    
    public HashMap<String, HashMap<Integer, Double>> read(String file) {
        List<Integer> years = new ArrayList<>();
        HashMap<String, HashMap<Integer, Double>> vals = new HashMap<>();
        
        try (Scanner reader = new Scanner(Paths.get("partiesdata.tsv"))) {
            String line = reader.nextLine();
            String[] items = line.split("\t");
            
            for (int n = 1; n < items.length; n++) {
                years.add(Integer.valueOf(items[n]));                  
            } 
            
           while (reader.hasNextLine()) {
               HashMap<Integer, Double> dataValues = new HashMap<>();
               String line2 = reader.nextLine();
               items = line2.split("\t");
               String party = items[0];
               for (int n = 1; n < items.length; n++) {
                   if (!items[n].equals("-")) {
                       dataValues.put(years.get(n-1), Double.valueOf(items[n]));
                   }
               }
               vals.put(party, dataValues);                                            
           }
                        
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return vals;
        
    }
    
    public void getData(LineChart<Number, Number> chart) {
        
        this.values.keySet().stream().forEach(party -> {
            XYChart.Series data = new XYChart.Series();
            data.setName(party);
            
            this.values.get(party).entrySet().stream().forEach(pair -> {
               data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue())); 
            });
            
            chart.getData().add(data);
        });
    }
    
   

}
