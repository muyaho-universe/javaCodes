package edu.handong.csee.java.lab06.task1;

public class Clock {
    private String currentTime;
    private String color;
    private String type;

    public void setCurrentTime(String cT){
        currentTime = cT;
    }

    public String getCurrentTime(){
        return currentTime;
    }

    public void setColor(String c){
        color = c;
    }

    public String getColor(){
        return color;
    }

    public void setType(String t){
        type = t;
    }

    public String getType(){
        return type;
    }

}