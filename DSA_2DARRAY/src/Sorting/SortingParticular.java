package Sorting;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

//Here If we want to sort an 2D array based on the particular columns in it, we use this comparator operator.
public class SortingParticular {
    public static void main(String[] args) {

        int [] [] arr = {{6,8,2},{4,5,2},{7,8,0}};
        //Here if we want to sort these rows based on the third column in int we use the below function
        //This will compare all the third columns in the each rows and sort ascending order.

        System.out.println("sorting the 2D arrays using the 3rd column in Ascending order");
        Arrays.sort(arr,(first, second)-> {
            if(first[2]-second[2]==0){
                return first[1]-second[1];
            }
            return first[2]-second[2];
        });
        System.out.println(Arrays.deepToString(arr));

        //This will compare all the third columns in the each rows and sort descending order.
        System.out.println("sorting the 2D arrays using the 3rd column in Descending order");
        Arrays.sort(arr,(first, second)-> {
            if(second[2]-first[2]==0){
                return second[1]-first[1];
            }
            return second[2] - first[2];
        });
        System.out.println(Arrays.deepToString(arr));

        System.out.println("Sorting Arrays in the reverse order");

        int [] nums ={11,2,55,32,4,0,1,9,7,35,5,56,40};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
