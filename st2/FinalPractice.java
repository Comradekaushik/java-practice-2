package st2;
import java.util.*;

public class FinalPractice {
    public static void main(String[] args){
        int newarr[] = new int[5];
        char newarr2[] = new char[5];

        newarr[0] = 1;
        newarr[1] = 2;

        newarr2[0] = 'a';
        newarr2[1] = 'b';
        System.out.println(newarr.length);
        System.out.println(newarr2.length);
        try{
            System.out.println("Null"+newarr2[3]+"xxxxxx");


        }
        catch(Exception e){
            System.out.println(e.getMessage());

        }


        ArrayList<Integer> newlist = new ArrayList<Integer>();
        newlist.add(5);
        newlist.add(6);
        System.out.println(newlist.size());
        newlist.set(1,25);
        System.out.println(newlist.get(1));
        String abc = new String("HELLO");
        System.out.println(abc.length());
        // abc.setcharAt(1,'b');
        // abc = abc.replace(1,2,'b');
        char[] abcchararr = abc.toCharArray();
        abcchararr[1] = 'y';
        abc = new  String(abcchararr);
        System.out.println(abc);

        ArrayList<Integer> newarrlist = new ArrayList<Integer>();
        newarrlist.add(5);
        newarrlist.add(2);
        newarrlist.add(7);
        newarrlist.add(40);
        newarrlist.add(-5);
        System.out.println(newarrlist);
        Collections.sort(newarrlist);
        System.out.println(newarrlist);
        Collections.reverse(newarrlist);
        System.out.println(newarrlist);
        Collections.reverse(newarrlist);
        System.out.println(newarrlist);
        System.out.println(Collections.binarySearch(newarrlist, 7));


        System.out.println(newarrlist);
        System.out.println("**********-***********");
        String teststring = new String("My name is Kaushik");
        System.out.println(teststring.indexOf("Kaushik"));
        System.out.println(teststring.contains("Kaushik"));
        System.out.println(teststring.contains("Elephant"));

        StringBuffer sb = new StringBuffer(teststring);
        System.out.println(sb.indexOf("Kaushik"));


        int arr231[] = new int[5];
        arr231[0] = 13;
        arr231[0] = 14;
        arr231[0] = 15;
        arr231[0] = 16;
        arr231[0] = 17;
        System.out.println(Integer.parseInt(Integer.toBinaryString(15),2));


    }
    
}
