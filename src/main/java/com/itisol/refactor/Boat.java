package com.itisol.refactor;

public class Boat implements Transport {

    private static String name = "";
    private static int maxSpeed = 180;

    @Override
    public void travelOnLand() {

    }

    @Override
    public void travelOnWater() {

        System.out.println("Turning on boat with name: " + name);

        //Accelerate
        int va = 5;

        while (va <= maxSpeed) {
            va = va + 5;
        }

    }

    public String getJsonData() {
        //Code to return boat data on JSON format { "name" : "Black Pearl", "maxSpeed" : 180 }
        return null;
    }

    public String getXMLData() {
        //Code to return boat data on XML format <boat name="Black Pearl"> <maxSpeed>180</maxSpeed> </boat>
        return null;
    }
}
