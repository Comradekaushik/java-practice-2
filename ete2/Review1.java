package ete2;

import java.util.ArrayList;

public class Review1 {
    public static void main(String[] args){
        // int i = 0;
        double d  = 15.879891455;
        // char c = 'c';
        // long l = 9223372036854775807L; //Always attach l or L at the end
        // Double d1 = d;
        String roundedoff = String.format("%.2f", d);
        String newdoubleString = Double.toString(d);
        String newdoubleString2 = new String("");
        String newdoubleString3 = new String("");

        int j = 0;
        for(int i = 0; i < newdoubleString.length();i++){
            if(newdoubleString.charAt(i) != '.'){
                newdoubleString2 = newdoubleString2 + newdoubleString.charAt(i);

            }
            if(newdoubleString.charAt(i) == '.'){
                newdoubleString3 = newdoubleString.substring(i,i+3);
                break;

                
            }

        }


        Double d2 = Double.parseDouble(newdoubleString2 + newdoubleString3);

        // System.out.println(d2);
        System.out.println(Add1toeach(9595));

    }

    public static int Add1toeach(int a){
        
        String number =  Integer.toString(a);
        String newnum = new String("");
        for(int i = 0;i<number.length();i++){
            int dig = Integer.parseInt(Character.toString(number.charAt(i)));
            dig = dig + 1;
            newnum = newnum + Integer.toString(dig);

        } 

        return Integer.parseInt(newnum);

    }
    
}
