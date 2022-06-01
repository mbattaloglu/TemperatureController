package com.example.temperature;

public class Value {
    private int temperature;
    private int humidity;
    private boolean isEngineWorking;

    public Value(int temperature, int humidity, boolean isEngineWorking) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.isEngineWorking = isEngineWorking;
    }

    public Value(){

    }

    public boolean getIsEngineWorking() {
        return isEngineWorking;
    }

    public void setIsEngineWorking(boolean engineWorking) {
        isEngineWorking = engineWorking;
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
