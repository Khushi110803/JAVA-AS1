package com.example.assignment2;

import com.example.assignment2.PoliticalAd;
import javafx.scene.chart.XYChart;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DBUtility {
    private static String dbUser = "Khushi200539535";
    private static String password = "-GVdYtmgzR";

    // JDBC URL for your database
    private static String connectURL = "jdbc:mysql://172.31.22.43:3306/Khushi200539535";

    public static ArrayList<Map<String,Object>> getAllPoliticalAds() {
        ArrayList<Map<String,Object>> adList = new ArrayList<>();

        String sql = "SELECT * FROM political_ads";

        try (
                Connection conn = DriverManager.getConnection(connectURL, dbUser, password);
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {
            while (resultSet.next()) {
                int adId = resultSet.getInt("ad_id");
//                String pageName = resultSet.getString("page_number");
                String adText = resultSet.getString("ad_text");
                int adImpression = resultSet.getInt("ad_impression");
                int adClicks = resultSet.getInt("ad_clicks");
                double adSpend = resultSet.getDouble("ad_spend");
                String targetAudience = resultSet.getString("target_audience");
                String adDate = resultSet.getString("ad_date");
                String adCampaign = resultSet.getString("ad_campaign");

                Map<String,Object> ad = new HashMap<>();
                ad.put("adId",adId);
//                ad.put("pageName",pageName);
                ad.put("adText",adText);
                ad.put("adImpression",adImpression);
                ad.put("adClicks",adClicks);
                ad.put("targetAudience",targetAudience);
                ad.put("adSpend",adSpend);
                ad.put("adDate",adDate);
                ad.put("adCampaign",adCampaign);

                adList.add(ad);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return adList;
    }




    // Add methods for querying and working with the political_ads table as needed
}
