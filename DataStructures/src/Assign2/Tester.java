package Assign2;
import java.io.*;
import java.util.*;

public class Tester {
    private static final String COMMA_DELIMITER = ",";


    public static void main(String[] args) {
        Scanner scanner = null;
        File cars = new File("cars.csv");
        ArrayList<Car> carList = new ArrayList();


        //System.out.println(carList.toString());


        try {
            scanner = new Scanner(cars);
            //scanner.useDelimiter(COMMA_DELIMITER);


            scanner.nextLine();
            while (scanner.hasNext()) {
                //reading the line and splitting into an array list
                String carlist = scanner.nextLine();
                String fields[] = carlist.split(",");
                Car newCar = new Car();
                newCar.cityMpg = Integer.parseInt(fields[0]);
                newCar.classI = fields[1];
                newCar.driveLine = fields[2];
                newCar.engTyp = fields[3];
                newCar.fuelType = fields[4];
                newCar.height = Integer.parseInt(fields[5]);
                newCar.highWay = Integer.parseInt(fields[6]);
                newCar.horsePow = Integer.parseInt(fields[7]);
                newCar.hybrid = Boolean.parseBoolean(fields[8]);
                newCar.iD = fields[9];
                newCar.length = Integer.parseInt(fields[10]);
                newCar.make = fields[11];
                newCar.modelYear = fields[12];
                newCar.forwardGears = Integer.parseInt(fields[13]);
                newCar.torque = Integer.parseInt(fields[14]);
                newCar.transmission = fields[15];
                newCar.width = Integer.parseInt(fields[16]);
                newCar.year = Integer.parseInt(fields[17]);


                carList.add(newCar);

            }
            //sort method
            //Arrays.sort(iD);

        } catch (FileNotFoundException fe) {
            fe.printStackTrace();
        } finally {
            scanner.close();
        }
        int choice = 0;
        Scanner scan = new Scanner(System.in);
        while (choice != 4) {
            System.out.println("----------");
            System.out.println("What would you like to do?");
            System.out.println("Select 1 to view information.");
            System.out.println("Select 2 to perform linear search.");
            System.out.println("Select 3 to perform binary search.");
            System.out.println("Select 4 to close program.");
            try {
                choice = Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Not a valid response.");
            }
            switch (choice) {
                case 1:
                    for (Car aCar : carList) {
                        System.out.println(aCar);
                    }
                    break;

                case 2:
                    SearchMethods search = new SearchMethods();
                    Scanner in = new Scanner(System.in);
                    System.out.println("Enter car model ID: ");
                    String target = in.nextLine();
                    //new string array to hold the car list, has the appropriate size since its based on the carlist size
                    String [] carInfo = new String [carList.size()];
                    for(int i = 0; i < carList.size(); i++) {
                        //goes into carlist and stores information in carinfo
                        carInfo[i] = carList.get(i).iD;
                    }
                    boolean index = search.linearSearch(carInfo, 0, 0, target);
                    System.out.println(index);


                    //case 3:
                    //StringBuilder newString = new StringBuilder();
                    //String [] carInfo2 = new String [carList.size()];
                    //for(String word : carInfo2)
//                    {
//                        newString.append(word + " ");
//                        newString1 = newString1 + word + " ";
//                    }
            }

            //}

//    if (choice == 1){
//        for(Car aCar: carList) {
//            System.out.println(aCar);
//        }
//        }


        }
        //for(int i = 0; i < carList.size(); i++){
        //System.out.println(i + " - " + carList.get(i).toString());
        //}
        //for(Car aCar: carList){
//            System.out.println(aCar);
//        }
        //}
        // System.out.println(carList.toString());
        //}


        //try {
        //FileInputStream file = new FileInputStream(new File("cars.csv"));


        //} catch (FileNotFoundException e) {
        //e.printStackTrace();
        //}

    }
}




