package com.example.assignment2;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        Scene scene = new Scene(new Group());
        Random rand = new Random();
        ArrayList<PieChart.Data> pieChartData = new ArrayList<PieChart.Data>();
        ArrayList<Map<String, Object>> users = DBUtility.getAllPoliticalAds();

        stage.setTitle("Pie chart for Political Ads");

        stage.getIcons().add(new Image(Main.class.getResourceAsStream("images/download.jpeg")));
        stage.setWidth(500);
        stage.setHeight(500);

        for (Map<String, Object> user : users) {
            String ad_text = user.get("adText").toString();
            int int_random = rand.nextInt(25);
            int ad_spend = Integer.parseInt(user.get("adImpression").toString());
            pieChartData.add(new PieChart.Data(ad_text, ad_spend));

        }
        ObservableList<PieChart.Data> siteList = FXCollections.observableArrayList(pieChartData);
        final PieChart chart = new PieChart(siteList);
        chart.setTitle("Pie chart for Political Ads");

        ((Group) scene.getRoot()).getChildren().add(chart);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}