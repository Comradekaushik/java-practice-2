package ete2;



import java.util.*;
// Other imports go here
// Do NOT change the class name
public class TestpadPractice
{
    public static void main(String[] args)
    {
        // int a = 5;
        // double b = 18.00;
        // double c = b*a;
        // System.out.println(String.format("%.3f",c));
        // Write your code here
        // Square mySquare = new Square(10);
        // System.out.println(mySquare.toString());
        // System.out.println(Integer.parseInt(""));
        // System.out.println("-----*-------" + Solution.isKaprekar(10000)+"--------*-----");
        System.out.println(Sorting.Sortedasc(756910));
        System.out.println(Sorting.Sorteddesc(756910));
    }
}

interface methods {
    int perimeter();
    int area();

}
class Square implements methods{
    int side;
    Square(int i){
        this.side = i;
    }
    @Override
    public int perimeter(){
        return (4*this.side);
        

    }
    @Override
    public int area(){
        return (this.side*this.side);

    }
    public String toString(){

        String toReturn = "Area = ["+Integer.toString(area())+"] Perimeter = ["+Integer.toString(perimeter())+"]";

        return toReturn;
    }
}
class Solution {
    static int isKaprekar(int N) {
        String numstr = Integer.toString(N*N);
        String part1 = new String("");
        String part2 = new String("");
        
        for(int i = 0;i<numstr.length()-1;i++){
            part1 = numstr.substring(0,i+1);
            part2 = numstr.substring(i+1);
            System.out.println(part1 + "--------*--------" + part2);
            if(part2.equals("")){
                part2 = "0";
            }
            if(Integer.parseInt(part1) == 0 ){
                continue;
            }
            if( Integer.parseInt(part2) == 0){
                break;
            }
            if((Integer.parseInt(part1) + Integer.parseInt(part2)) == N){
                return 1;
                
            }
        }
        return 0;
    }
}
class Sorting{
    static int Sortedasc(int n){
        String nstr = Integer.toString(n);
        int[] arr = new int[nstr.length()];
        for(int i = 0;i<nstr.length();i++){
            arr[i] = Integer.parseInt(Character.toString(nstr.charAt(i)));
        }
        Arrays.sort(arr);
        String nstr2 = new String("");
        for(int i = 0;i<arr.length;i++){
            nstr2 = nstr2 + arr[i];
        }
        return Integer.parseInt(nstr2);

    }
    static int Sorteddesc(int n){
        String nstr = Integer.toString(n);
        int[] arr = new int[nstr.length()];
        for(int i = 0;i<nstr.length();i++){
            arr[i] = Integer.parseInt(Character.toString(nstr.charAt(i)));
        }
        Arrays.sort(arr);
        ArrayList<Integer> digs = new ArrayList<>();
        for(int i : arr){
            digs.add(i);
        }
        for(Integer i :digs){
            System.out.println(i);

        }
        Collections.reverse(digs);
        System.out.println(digs.toString());
        
        String nstr2 = new String("");
        for(int i = 0;i<digs.size();i++){
            nstr2 = nstr2 + digs.get(i);
        }
        return Integer.parseInt(nstr2);

    }
}
