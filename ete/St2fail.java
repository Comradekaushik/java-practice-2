package ete;
import java.util.*;

public class St2fail {


    static String jumble(String str1,String str2){
        int sizea = str1.length();
        int sizeb = str2.length();
        String jumbles = new String("");
        if(sizea == 0){
            return str2;  
        }
        if(sizeb == 0){
            return str1;
        }

        if(sizea == 0 && sizeb == 0){
            return "";
        }
        int bindex = 0;
        for(int i = 0,j=0;i<sizea;i++){
            jumbles = jumbles + str1.charAt(i);
            if(j < sizeb){
                jumbles = jumbles + str2.charAt(j);
                j++;
                bindex++;
            } 
            else if(j >= sizeb){
                if(i+1 < sizea){
                  jumbles = jumbles + str1.substring(i+1);
                  break;  
                }  
            } 
        }
        if(bindex < sizeb){
            jumbles = jumbles + str2.substring(bindex);
        }
        return jumbles;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = new String("");
        String b = new String("");
        a = scan.nextLine();
        b = scan.nextLine();
        scan.close();
        System.out.println(jumble(a,b));

        


    }
    
}
