package edu.columbusstate.datastructures;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    String[] route1 = {"140", "134", "Unicentro", "100", "30", "R", "Marsella", "Mu", "Bosa"};
        String[] route2 = {"Germania", "19", "Sabana", "R", "Espec", "F"};
        String[] route3 = {"Gu", "Santiago", "SENA", "Mu", "Timiza"};

        Scanner in = new Scanner(System.in);

        do {

            System.out.println("Route 1");
            printRoute(route1);
            System.out.println("--------------");

            System.out.println("Route 2");
            printRoute(route2);
            System.out.println("--------------");

            System.out.println("Route 3");
            printRoute(route3);
            System.out.println("--------------");


            System.out.println("Input source station");
            String src = in.nextLine();

            System.out.println("Input dest station");
            String dest = in.nextLine();

            String[] path = null;
            if(sameRoute(route1, src, dest))
            {
                path = getPath(route1, src, dest);
            }
            else if(sameRoute(route2, src, dest))
            {
                path = getPath(route2, src, dest);
            }
            else if(sameRoute(route3, src, dest))
            {
                path = getPath(route3, src, dest);
            }
            else
            {
                //are in two different stations

                if(findStation(route1, src) != -1 && findStation(route2, dest) != -1) // from route 1 to route 2
                {
                    String[] p1 = getPath(route1, src, "R");
                    String[] p2 =  getPath(route2, "R", dest);

                    path = joinRoutes(p1, p2);
                }
                else if(findStation(route2, src) != -1 && findStation(route1, dest) != -1) // from route 2 to route 1
                {
                    String[] p1 = getPath(route2, src, "R");
                    String[] p2 =  getPath(route1, "R", dest);

                    path = joinRoutes(p1, p2);
                }
                else if(findStation(route1, src) != -1 && findStation(route3, dest) != -1) // from route 1 to route 3
                {
                    String[] p1 = getPath(route1, src, "Mu");
                    String[] p2 =  getPath(route3, "Mu", dest);

                    path = joinRoutes(p1, p2);
                }
                else if(findStation(route3, src) != -1 && findStation(route1, dest) != -1) // from route 3 to route 1
                {
                    String[] p1 = getPath(route3, src, "Mu");
                    String[] p2 =  getPath(route1, "Mu", dest);

                    path = joinRoutes(p1, p2);
                }
                else
                {
                    if(findStation(route2, src) != -1 && findStation(route3, dest) != -1) // from route 2 to route 3
                    {
                        String[] p1 = getPath(route2, src, "R");
                        String[] p2 =  getPath(route1, "R", "Mu");

                        p1 = joinRoutes(p1, p2);
                        p2 =  getPath(route3, "Mu", dest);

                        path = joinRoutes(p1, p2);

                    }
                    else if(findStation(route3, src) != -1 && findStation(route2, dest) != -1) // from route 3 to route 2
                    {
                        String[] p1 = getPath(route3, src, "Mu");
                        String[] p2 =  getPath(route1, "Mu", "R");

                        p1 = joinRoutes(p1, p2);
                        p2 =  getPath(route2, "R", dest);

                        path = joinRoutes(p1, p2);
                    }
                }

            }

            if(path!= null) {
                System.out.println("Path to take: ");
                printRoute(path);
            }
            else
            {
                System.out.println("At least one of your stations is not in the system ");
            }

            System.out.println("Would you like to find the path between two other stations (type Y to continue) ?");
        }while(in.nextLine().equals("Y"));
    }

    // check if two stations are in the same route
    public static boolean sameRoute(String[] route, String st1, String st2)
    {
        int val1 = findStation(route, st1);
        int val2 = findStation(route, st2);
        return (val1 != -1) && (val2 != -1);
    }

    /*
        This method given two routes, it returns a new route joining the two.
        It assumes that the last station of the first route is the first one of the second.
     */
    public static String[] joinRoutes(String[] route1, String[] route2)
    {
        String[] newPath = new String[route1.length + route2.length - 1];

        for(int i = 0; i < route1.length - 1;  i++)
        {
            newPath[i] = route1[i];
        }

        for(int i = 0; i < route2.length; i++)
        {
            newPath[route1.length - 1 + i] = route2[i];
        }
        return newPath;
    }

    public static int findStation(String[] route, String station)
    {
        for(int i = 0; i < route.length; i++){
            if(route[i].equals(station))
            {
                return i;
            }
        }

        return -1;
    }

    /*
        Given a route and src and dest in the same route, the method return the path between them.
    */
    public static String[] getPath(String[] route, String src, String dest)
    {
        int posStart = findStation(route, src);
        int posEnd = findStation(route, dest);
        String[] newRoute = null;

        if(posStart < posEnd)
        {
            newRoute = new String[posEnd - posStart + 1];
            for(int i = posStart; i <= posEnd; i++)
            {
                newRoute[i - posStart] = route[i];
            }

        }
        else
        {
            newRoute = new String[posStart - posEnd + 1];

            for(int i = posStart; i >= posEnd; i--)
            {
                newRoute[posStart - i] = route[i];
            }
        }

        return newRoute;
    }

    /* Given a route/path, it prints the stations in it*/
    public static void printRoute(String[] route)
    {
        StringBuilder str = new StringBuilder();

        for(String station : route)
        {
            str.append(station + " ");
        }

        System.out.println(str.toString());
    }

}
