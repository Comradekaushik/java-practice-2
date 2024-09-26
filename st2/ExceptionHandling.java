package st2;

import java.util.Scanner;
import java.util.*;
// Other imports go here
// Do NOT change the class name
class ExceptionHandling{
    public static void main(String[] args)
    {
      Scanner scan = new Scanner(System.in);
      int sizeofarray = 0;
      sizeofarray = scan.nextInt();
      scan.nextLine();
      int arr[] = new int[sizeofarray];
      int i = 0;
      while(scan.hasNextInt() && i < sizeofarray){
        
        arr[i] = scan.nextInt();
        i++;
      }
      scan.nextLine();
      int noofqueries = 0;
      noofqueries = scan.nextInt();
      scan.nextLine();
      int j = 0;
      int indextoretrieve = 0;
      while(j<noofqueries){
        try{
          indextoretrieve = scan.nextInt();
          if(j!= noofqueries - 1){
            scan.nextLine();
          }
          
          if(indextoretrieve < 0 ||
             indextoretrieve > sizeofarray-1){
             throw new Exception("Array Index out of bound");
          }
          else{
            System.out.println(arr[indextoretrieve]);
          }
        }
        catch(Exception e){
          System.out.println("Out of Bounds");
        }
        j++;
      }

      scan.close();

    }
}


// package st2;

// import java.util.Scanner;

// class ExceptionHandling {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
        
//         // Read the size of the array
//         int sizeofarray = scan.nextInt();
//         int arr[] = new int[sizeofarray];
        
//         // Read the array elements
//         for (int i = 0; i < sizeofarray; i++) {
//             arr[i] = scan.nextInt();
//         }
//         scan.nextLine();
        
//         // Read the number of queries
//         int noofqueries = scan.nextInt();
        
//         // Process each query
//         for (int j = 0; j < noofqueries; j++) {
//             try {
//                 int indextoretrieve = scan.nextInt();
//                 if(j!=noofqueries-1){
//                     scan.nextLine();
//                 }
                
//                 if (indextoretrieve < 0 || indextoretrieve >= sizeofarray) {
//                     throw new ArrayIndexOutOfBoundsException("Array Index out of bound");
//                 } else {
//                     System.out.println(arr[indextoretrieve]);
//                 }
//             } catch (ArrayIndexOutOfBoundsException e) {
//                 System.out.println("Out of Bounds");
//             }
//         }
        
//         scan.close();
//     }
// }
