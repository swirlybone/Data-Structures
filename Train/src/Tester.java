import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
   public static void main(String[] args){
      ArrayList<Station> route1ArrayList = new ArrayList<Station>();

      route1ArrayList.add(new Station("140"));
      route1ArrayList.add(new Station("134"));
      route1ArrayList.add(new Station("Unicentro"));
      route1ArrayList.add(new Station("100"));
      route1ArrayList.add(new Station("30"));
      route1ArrayList.add(new Station("R"));
      route1ArrayList.add(new Station("Marsella"));
      route1ArrayList.add(new Station("Mu"));
      route1ArrayList.add(new Station("Bosa"));

      ArrayList<Station> route2ArrayList = new ArrayList<Station>();
      route2ArrayList.add(new Station("Germania"));
      route2ArrayList.add(new Station( "19"));
      route2ArrayList.add(new Station("Sabana"));
      route2ArrayList.add(new Station("R"));
      route2ArrayList.add(new Station("Espec"));
      route2ArrayList.add(new Station("F"));

      ArrayList<Station> route3ArrayList = new ArrayList<Station>();
      route3ArrayList.add(new Station("Gu"));
      route3ArrayList.add(new Station("Santiago"));
      route3ArrayList.add(new Station("SENA"));
      route3ArrayList.add(new Station("Mu"));
      route3ArrayList.add(new Station("Timiza"));

      for(int i = 0; i < route1ArrayList.size(); i++){
         System.out.println(route1ArrayList.get(i).toString());
      }
      for(int i = 0; i < route2ArrayList.size(); i++){
         System.out.println(route1ArrayList.get(i).toString());
      }
      for(int i = 0; i < route3ArrayList.size(); i++){
         System.out.println(route1ArrayList.get(i).toString());
      }

      Scanner scan = new Scanner(System.in);

      System.out.println("Please enter the first station index");
      int choice1 = Integer.parseInt(scan.nextLine());
      System.out.println("Please enter the second station index");
      int choice2 = Integer.parseInt(scan.nextLine());
   }

}
