package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double averageTemperature() {
        double average = 0;
        int quantity = 0;
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            average = average + temperature.getValue();
            quantity++;
        }
        if (quantity > 0) {
            return average / quantity;
        } else {
            return -273.15;
        }
    }

    public double medianTemperature() {
        double temp;
        int quantity = 0;
        int m;
        int n = 0;
        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            quantity++;
        }
        double[] toSort = new double[quantity];

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {
            toSort[n] = temperature.getValue();
            n++;
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if (toSort[i] > toSort[j]) {
                    temp = toSort[i];
                    toSort[i] = toSort[j];
                    toSort[j] = temp;
                }
            }
        }
        if (n % 2 == 1) {
            m = n/2;
            return toSort[m];
        } else {
            m = (n-1)/2;
            return (toSort[m]+toSort[m+1])/2;
        }
    }
}