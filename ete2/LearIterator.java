package ete2;
import java.util.*;


public class LearIterator {

    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<>();
        for(int i = 0;i<15;i= i+2){
            a1.add(Integer.toBinaryString(i));
        }

        for(int i = 0;i<15;i= i+2){
            a1.add(Integer.toString(i));
        }
        Iterator<String> itr = a1.iterator();
        while(itr.hasNext()){
            if(itr.next().equals("12")){
                itr.remove();
                
            }
            System.out.println(itr.next());
        }


    
    }
    
}
