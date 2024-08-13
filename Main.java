
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        System.out.println("Anand");
        // for(int i = 0; i< 5;i++){
        //     System.out.println(i);
        // }
        int[] array = {1,2,3,4,5};
        // System.out.println(array[2]);

        int[] array5 = {1,5,7,9,11,13,15,17};

        int lower = 0;
        int higher = array5.length - 1;
        boolean found = false;
        int toFind = 7;
        int foundAt = -1;
        int midIndex = (lower+higher+1)/2;
        while(!found && lower <= higher){
            if(array5[midIndex] == toFind){
                foundAt = midIndex;
                found = true;
                break;

            }
            else if(array5[midIndex] < toFind){
                lower = midIndex + 1;

            }
            else if(array5[midIndex] > toFind){
                higher = midIndex - 1;

            }


        }
        if(found){
            System.out.println(foundAt);
        } 
        else{
            System.out.println("Not found");
        }   



    }
    
}
