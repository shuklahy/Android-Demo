package com.example.hitendra.chartviewdemo;

import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridLayout;

import com.dzaitsev.android.widget.RadarChartView;

import java.util.LinkedHashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Prepare the data. We're going to show the top ten cheese producing U.S. states in 2013 (in 1,000 pounds)
        // IQ, CREATIVITY, STRENGTH, ENDURANCE, CHARISMA, LEADERSHIP
        final Map<String, Float> axis = new LinkedHashMap<>(6);
        axis.put("IQ", 500.0F);
        axis.put("CV", 100.0F);
        axis.put("ST", 500.0F);
        axis.put("EN", 500.0F);
        axis.put("CH", 500.0F);
        axis.put("LD", 500.0F);


        // Set your data to the view
        final RadarChartView chartView = (RadarChartView) findViewById(R.id.chartView);
        chartView.setAxis(axis);
        chartView.setAxisColor(Color.BLACK);
        chartView.setAxisMax(500.0F);         // set max value for the chart
        //chartView.addOrReplace("WI", 2855.681F); // add new axis
        //chartView.addOrReplace("OH", 281.59F);   // change the existing value
        chartView.setAutoSize(true);             // auto balance the chart
        chartView.setCirclesOnly(false);          // if you want circles instead of polygons
        chartView.setChartStyle(Paint.Style.FILL);           // chart drawn with this style will be filled not stroked
        System.out.println("In chart View :)");
    }
}
