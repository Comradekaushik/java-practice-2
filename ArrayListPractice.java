import java.util.*;
import java.lang.*;

public class ArrayListPractice {
    public static void main(String args[]){
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        for(int j = 0;j<9;j++){
            arr1.add(j);
        }
        for(int k = 1;k<9;k=k+2){
            arr1.set(k,k+6);
        }
        for(int i =0;i< arr1.size();i++){
            System.out.println("Element number " +i+ " is equal to " + arr1.get(i) + "\n");
        }

        System.out.println(arr1);

        Collections.sort(arr1);
        System.out.println(arr1);
        for(int i =0;i< arr1.size();i++){
            System.out.println("Element number " +i+ " is equal to " + arr1.get(i) + "\n");
        }
        System.out.println(Collections.binarySearch( arr1, 7));
        System.out.println(Collections.max(arr1));
        System.out.println(Collections.min(arr1));


        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        arr2 = arr1;

        for(int w =0;w< arr2.size();w++){
            System.out.println("Element number " +w+ " is equal to " + arr1.get(w) + "\n");
        }

        arr2.set(0, 555);
        System.out.println(arr1.get(0));

        ArrayList<Integer> arr3 = new ArrayList<>();
        arr3.addAll(arr2);

        System.out.println("--------*--------");
        System.out.println(arr3);
        arr3.set(0, 558);
        System.out.println(arr1);
        System.out.println(arr3);
        


    }
    
}
