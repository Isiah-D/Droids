package com.zaycodes;

//Create Droid class
public class Droid{

    int batteryLevel;
    String name;

    //Constructor Method
    public Droid (String droidName)
    {
        //Every new instance of Droid will have a battery level of 100 and a name.
        batteryLevel = 100;
        name = droidName;
    }

    //toString that introduces Droid using it's name.
    public String toString()
    {
        return "Hello! I am " + name;
    }

    //Method for Droids performing tasks
    public void performTask(String task)
    {
        System.out.println (name +" is performing task: "+ task);
        batteryLevel = batteryLevel - 10;

    }

    //Method to report current energy level of Droid.
    public void energyReport(){
        System.out.println("Current battery level is " + batteryLevel);
    }

    /*
    public static void main(String [] args){
        Droid codey = new Droid("Codey");
        System.out.println(codey);
        codey.performTask("Dancing");
        codey.performTask("Coding");
        codey.energyReport();
    }

     */
}