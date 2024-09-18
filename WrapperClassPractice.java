import java.util.*;
import java.lang.*;
public class WrapperClassPractice {
    public static void main(String[] args){

        char b = 'A';
        int a = (int) b;
        System.out.println(a);
        ArrayList<Character> arr  = new ArrayList<Character>();
        
        arr.add('d');
        arr.add('b');
        arr.add('c');
        arr.add('a');
        arr.add('u');
        arr.add('e');
        
        arr.add('o');
        arr.add('i');

        Collections.sort(arr);
        System.out.println(arr);
        

    }
    
}
