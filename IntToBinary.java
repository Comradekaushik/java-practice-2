import java.util.*;
import java.lang.*;

public class IntToBinary {
    public static int tobinaryfn(int a){
        ArrayList <Integer> newarr = new ArrayList<Integer>();
        


        while(true){
            newarr.add(a%2);
            a = a/2;
            if(a == 1 || a==0){
                newarr.add(a);
                break;
            }
            






        }
        String bnryString = new String();
        for(int i = newarr.size()-1;i>=0;i--){
            bnryString = bnryString + Integer.toString(newarr.get(i));

        }

        return (Integer.parseInt(bnryString));


        
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(tobinaryfn(a));

        scan.close();

    }
}
