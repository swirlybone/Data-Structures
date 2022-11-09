package Assign2;

public class SearchMethods {

    public static <T extends Comparable<T>> boolean linearSearch(T[] data, int min, int max, T target) {
        for (min = 0; min < max; min++) {
            // Return the index of the element if the element
            // is found
            if (data[min].compareTo(target) == 0) {
                System.out.println(data[min]);
                return true;
            }else if(max-min == 1){
                System.out.println("Car not found in database.");
                return false;
            }

        }


        return false;
    }
    public static <T extends Comparable<T>> boolean binarySearch(T[] data, int min, int max, T target) {
        if (max >= min) {
            int mid = min + (max - min) / 2;
            // If the element is present at the
            // middle itself
            if (max - min <= 1 && data[min].compareTo(target) != 0 && data[max].compareTo(target) != 0) {
                System.out.println("Car not found in database.");
                return false;
            }
            else if (data[mid].compareTo(target) == 0) {
                System.out.println(data[mid]);
                return true;
            }
            // If element is smaller than mid, then
            // it can only be present in left subarray
            else if (data[mid].compareTo(target) > 0) {
                return binarySearch(data, min, mid - 1, target);
            } else {
                // Else the element can only be present
                // in right subarray
                return binarySearch(data, mid + 1, max, target);
            }


        }
        return true;
    }

}
