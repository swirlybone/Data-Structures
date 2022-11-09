package Assign2;
public class Car implements Comparable {
    private String classification, driveline, engineType, fuelType, hybrid, id, make, modelYear, transmission, cityMpg, height, highwayMpg, horsepower, length, numberOfForwardGears, torque, width, year;


    public Car(String a[]){
        this.cityMpg = a[0];
        this.classification = a[1];
        this.driveline = a[2];
        this.engineType = a[3];
        this.fuelType = a[4];
        this.height = a[5];
        this.highwayMpg = a[6];
        this.horsepower = a[7];
        this.hybrid = a[8];
        this.id= a[9];
        this.length = a[10];
        this.make = a[11];
        this.modelYear= a[12];
        this.numberOfForwardGears = a[13];
        this.torque = a[14];
        this.transmission = a[15];
        this.width = a[16];
        this.year = a[17];
    }
    public Car(String b){
        this.id = b;
    }


    public int compareTo(Object a) {

        return id.compareTo(((Car)a).getId());

    }
    public String getId(){
        return id;
    }
    @Override
    public String toString(){
        return cityMpg +","+ classification +","+ driveline +","+ engineType +","+ fuelType +","+ height +","+ highwayMpg +","+ horsepower +","+ hybrid +","+ id +","+ length +","+ make +","+ modelYear +","+ numberOfForwardGears +","+ torque +","+ transmission +","+ width +","+ year;
    }

}

