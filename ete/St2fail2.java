package ete;
import java.util.*;

public class St2fail2 {

    static String[] lottery(String[] namesarr){
        String[] namessorted = namesarr;

        Arrays.sort(namessorted, (a, b) -> Integer.compare(a.length(),b.length() )); 

        

        return namessorted;

    }

    public static void main(String[] args) {

        String arr [] = new String[5];
        Scanner scan = new Scanner(System.in);
        for(int i = 0;i<5;i++){
            arr[i] = scan.nextLine();
        }
        scan.close();
        System.out.println(Arrays.toString(lottery(arr)));
        
    }
    
}
