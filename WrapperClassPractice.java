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

        char[] chararray1 = new char[5];
        chararray1[0] = 'a';
        chararray1[1] = 'b';
        chararray1[4] = 'x';
        chararray1[2] = 'm';
        chararray1[3] = 'e';
        Arrays.sort(chararray1);
        System.out.println(chararray1);

        String str234 = new String(chararray1);
        System.out.println("****-****"+str234);

        

    }
    
}
