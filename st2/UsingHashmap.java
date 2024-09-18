package st2;
import java.util.*;

public class UsingHashmap {


    public static void main(String[] args){
        HashMap<String,String> charmapping = new HashMap<String,String>();
        // charmapping.put("a","codea");

        // String as = Integer.toString(65);
        String as = Character.toString((char) 65);
        String acy = Integer.toBinaryString(65); 
        System.out.println("this is a string"+ acy);
        String bs = new String("code".concat(as)); 

        charmapping.put(as,bs);

        System.out.println(charmapping.get("A")) ;


        String new1 = new String("abc+xyz+mno");
        String[] arr = new1.split("\\+",2);

        System.out.println(arr[0]);


        System.out.println("abc+xyz+mno".split("\\+", 2));
        System.out.println(Arrays.toString("abc+xyz+mno".split("\\+", 2)));

        // System.out.println();

        // for(int i = )
    }
    

    
}
