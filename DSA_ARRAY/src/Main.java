import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //To convert array to list the array data type should be wrapper class
        Integer [] arr = {3,5,6,8,4,1,0};
        List<Integer> list =  Arrays.asList(arr);
        System.out.println("Array converted to List :"+list);

        //Printing all the values in the array
        int[] nums ={11,12,14,15,16,1,2,3};
        System.out.println("ARRAY IS :"+Arrays.toString(nums));

        //Sort the array
        Arrays.sort(nums);
        System.out.println("Sorted Array :"+Arrays.toString(nums));

        //To Search in an array using binary search first sort the array
        //Will return the index of the value(0-based index)
        System.out.println(Arrays.binarySearch(nums,3));

        //compare two arrays

        int [] arr1 = {1,3,2};
        int[] arr2 ={1,4,3};

        System.out.println(Arrays.equals(arr1,arr2));
        System.out.println(Arrays.compare(arr1,arr2));
    }
}
