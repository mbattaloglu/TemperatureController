package com.example.temperature;

public class Value {
    private float temperature;
    private float humidity;
    private String wifi;

    public Value(int temperature, int humidity, String wifi) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.wifi = wifi;
    }

    public Value(){

    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public String getWifi() {
        return wifi;
    }

    public void setWifi(String wifi) {
        this.wifi = wifi;
    }
}
