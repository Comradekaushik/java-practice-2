package ete2;
import java.util.*;

public class StringSort {

    public static void main(String[] args) {
        // String a = new String("AabB");

        // char[] arr1 = a.toCharArray();
        // Arrays.sort(arr1);
        // System.out.println(Arrays.toString(arr1));
        wordsbreak("My name  is  Kaushik the    great");
    }

    public static void wordsbreak(String s) {
        s = s.trim();
        String word = new String("");
        ArrayList<String> words = new ArrayList<String>();

        for(int i = 0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i)) || 
            Character.isLetter(s.charAt(i))){
                word = word + s.charAt(i);
            }
            
            if(s.charAt(i) == ' ' && s.charAt(i-1) == ' ' ){
                continue;
            }
            if(s.charAt(i) == ' ' || i == s.length()-1){
                words.add(word);
                word = "";
                continue;

            }
            
            
        }
        for(int i = 0;i<words.size();i++){
            System.out.println(words.get(i));
        }


        



    }

    
}
