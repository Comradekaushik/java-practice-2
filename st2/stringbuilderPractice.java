package st2;
import java.util.*;

public class stringbuilderPractice {

    public static void main(String[] args){
       StringBuilder a = new StringBuilder();
        a.append("hello"); 

        String[] words = {"hello","my","name","is","kaushik"};

        try{
            
            ArrayList<StringBuilder> newwords = new ArrayList<StringBuilder>();
            for(int i = 0;i<words.length;i++){
                newwords.add(new StringBuilder(words[i]));
            }

        }
        catch(Exception e){
            System.out.println(e.getMessage());

        }
        
        a.setCharAt(0, a.charAt(a.length()-1));
        System.out.println(a);

        
    }
    
}
