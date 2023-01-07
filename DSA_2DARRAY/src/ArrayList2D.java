import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList2D {
    public static void main(String[] args) {
                      //2D ArrayList implementation adding elements at specific position
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
            for (int j = 0; j < 3; j++) {
                list.get(i).add(j,j*i+4);
            }
        }
        System.out.println(list);

        //2D ArrayList implmentation adding an Array into the 2D list
        ArrayList<ArrayList<Integer>> flag = new ArrayList<>();

        //Creating Index and adding a group of values in it
        flag.add(0,new ArrayList<>(Arrays.asList(1,2,3,4)));
        flag.add(1,new ArrayList<>(Arrays.asList(5,6,7)));

        //If we again give the same index name it will not append it in the row instead it appends it to that postion and move others ahead
        flag.add(0,new ArrayList<>(Arrays.asList(500,61,712)));

        //This will add the values in the new index value
        flag.add(new ArrayList<>(Arrays.asList(20)));

        //Append values to R1 if R1 not created it throws the error
        flag.get(1).addAll(Arrays.asList(9, 10, 11));

        // Append values to R1, but start appending from C3 which Starts from C0
        flag.get(1).addAll(3, Arrays.asList(22, 1000));

        System.out.println(flag.get(0).get(1));


        //Return type is List
    }
}
