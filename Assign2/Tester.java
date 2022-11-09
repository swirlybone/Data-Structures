package Assign2;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        SearchMethods searcher = new SearchMethods();
        ArrayList<Car>  listCars = new ArrayList<Car>();
        Car[] carsArray;
        Scanner scan = new Scanner(System.in);
        BufferedReader car = null;// uses a buffered reader to read the file
        try {
            car = new BufferedReader(new FileReader("cars.csv"));
        } catch (FileNotFoundException e) {
            System.out.println("Try again!");
        }
        String text;
        int listSize = 0;
        text = car.readLine();
        while (text != null) {
            text = car.readLine();
            if (text != null) {
                Car car1 = new Car(text.split(","));
                if (listSize > 0) {
                    for (int i = 0; i < listSize; i++) {
                        if (listCars.get(i).compareTo(car1) > 0) {
                            listCars.add(i, (car1));
                            listSize++;
                            break;
                        } else if (i == listCars.size() - 1) {
                            listCars.add(car1);
                            listSize++;
                            break;
                        }
                    }
                } else {
                    listCars.add(car1);
                    listSize++;
                }
            }
        }
        carsArray = new Car[listSize];
        for (int i = 0; i < listSize; i++) {
            carsArray[i] = listCars.get(i);
        }
        car.close();
        int response;
        do {
            System.out.println("1) Read List. 2) use Linear Search 3) Binary Search 4) Exit ");
            response = Integer.parseInt(scan.nextLine());
            switch (response) {
                case 1:
                    for (int i = 0; i < listCars.size(); i++) {
                        System.out.println(listCars.get(i).toString());
                    }
                    break;
                case 2:
                    System.out.println("Which car would you like to find?");
                    String input = scan.nextLine();
                    Car target = new Car(input);
                    searcher.linearSearch(carsArray, 0, listCars.size() - 1, target);
                    break;
                case 3:
                    System.out.println("Which car would you like to find?");
                    String input2 = scan.nextLine();
                    Car target2 = new Car(input2);
                    searcher.binarySearch(carsArray, 0, listCars.size() - 1, target2);
                    break;
                case 4:
                    System.out.println("Goodbye");
                    System.exit(0);
            }
        } while (response != 4);
    }

}





