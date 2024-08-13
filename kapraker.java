
import java.util.ArrayList;
public class kapraker {


    public static void main(String args[]){



    }
    public static boolean isKapraker(int a){


        boolean result = false;

        int asquare = a*a;
        String asquString = Integer.toString(asquare);
        // ArrayList<String> subarr = new ArrayList<String>();

        ArrayList<Integer> subintarr = new ArrayList<Integer>();


        for(int i = 0; i< asquString.length();i++){
            for(int j = i+1; j< asquString.length()+1;j++){
                // subarr.add(asquString.substring(i,j));
                subintarr.add(Integer.parseInt(asquString.substring(i,j)));

            }

        }

        for(int i = 0; i<subintarr.size();i++){
            for(int j = ;j<subintarr.size();j++){

            }
        }

        return result;

    }
    
}
