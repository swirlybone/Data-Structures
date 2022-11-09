package Assign2;


public class SearchMethods {

    public static <T extends Comparable<T>> boolean linearSearch(T[] data, int min, int max, T target) {
        for (min = 0; min < max; min++) {
            // Return the index of the element if the element
            // is found
            if (data[min].compareTo(target) == 0) {
                System.out.println(data[min]);
                return true;

            } else if (max - min == 1) {
                System.out.println("Car not found in database.");
                return false;
            }
        }
        return false;
    }
//    public static <T extends Comparable<T>> int linearSearch(T[] data, int min, int max, T target) {
//        for (int i = 0; i < data.length; i++) {
//            if (data[i] == target) {
//                return i;
//            }
//        }
//        return -1;
//    }
    //}

                //return i;
            //return data.length;

        //checking info at index [min] to see if it matches target, if it is it returns index
//        if (min == data.length) {
//            return -1;
//        }
//        if (data[min].compareTo(target) == 0) {
//            return min;
//        }
        //recursively calls itself with a new index, min goes up by 1. called again and again til it reaches the end of the array
//        return linearSearch(data, min++, max, target);
        //return 0;

    public static <T extends Comparable<T>> int binarySearch(T[] data, int min, int max, T target) {
//        if(target == null)
//        return -1;
//
//        if(min > max)
//            return -1;
//
//        int mid = 0;
//        if(target.compareTo(data[mid]) > 0)
//            return binarySearch(data, min, max, target, mid++);
//
//        else if(target.compareTo(data[mid] ) < 0)
//            return binarySearch(data, target, min, mid-1);
//        else
//            return mid;
        return 0;

    }

    }





