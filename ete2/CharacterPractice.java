package ete2;
import java.util.*;


public class CharacterPractice {

    public static void main(String[] args) {
        // System.out.println(Character.isLetter('a'));
        int[] myarr = new int[3];
        myarr[0] = 1;
        myarr[1] = 2;
        // myarr[2] = 3;


        try{
            System.out.println(myarr[2]);

            myfn(myarr);

        }
        catch(Exception e){
            System.out.println(e.getMessage());

        }
                
    }

    public static void myfn(int []array1) throws Exception{
        if(array1.length > 5 || array1[5] == 0){
            throw new Exception("Array index out of bounds or element is null");
        }
        
            System.out.println(array1[5]);

        

    } 

    
    
}
