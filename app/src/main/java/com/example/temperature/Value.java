package com.example.temperature;

public class Value {
    private int temperature;
    private int humidity;

    public Value(int temperature, int humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    public Value(){

    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}
