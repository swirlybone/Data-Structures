package Assign2;

public class Car implements Comparable<Car> {
    public int cityMpg;
    public String classI;
    public String driveLine;
    public String engTyp;
    public String fuelType;
    public int height;
    public int highWay;
    public int horsePow;
    public boolean hybrid;
    public String iD;
    public int length;
    public String make;
    public String modelYear;
    public int forwardGears;
    public int torque;
    public String transmission;
    public int width;
    public int year;

    @Override
    public String toString(){
        return "City Mpg: " + cityMpg + ", "+ "Classification: " + classI + ", "+ "Driveline:" + ", " + driveLine + ", " + "Engine Type: " + engTyp + ", " +
                "Fuel Type: " + fuelType + ", " + "Height: " + height + ", " +  "Highway mpg" + highWay + ", " + "Horse Power: " + horsePow + ", " +
                "Is hybrid: " + hybrid + ", " + "Car Model ID: " + iD + ", " + "Length" + length + ", " + "Made by: " + make + ", " + "Model Year: " + modelYear + ", " +
                "Number of forward gears" + forwardGears + ", " + "Torque: " + torque + ", " + "Transmission: " + transmission + ", " + "Width: " + width + ", " +
                "Year: " + year;
    }

    @Override
    public int compareTo(Car car) {

        //return this.iD - car.iD;
        return 0;
    }
    //return ("City Mpg" + cityMpg);
    }

