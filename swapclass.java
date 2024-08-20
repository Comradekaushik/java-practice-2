
import java.util.*;
public class swapclass {

    void swap(int a,int b){
        int c = a;
        a = b;
        b = c; 
        System.out.println("  **  "+a+" **  "+ b);

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        swapclass swapobject = new swapclass();
        swapobject.swap(a,b);
        scan.close();



        
    }
    
}
