package st2;
import java.util.*;

public class ExceptionPractice {

    public static void main(String[] args ){
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        scan.close();

        try {
            // Throw an object of user defined exception

            if(a>0){
               throw new Myexception("Custom Exception"); 
            }

            if(a<0){
                
            throw new ArrayIndexOutOfBoundsException("This Index is not present");
            }
            if(a==0){
                throw new Exception("General Exception");
            }

            

        }
        
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());

        }
        catch (Myexception ex) {
            System.out.println("Caught");

            // Print the message from MyException object
            System.out.println(ex.getMessage());
            System.out.println(ex.errorString);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());


        }
    }

    
}
class Myexception extends Exception{
    String errorString = new String("");
    public Myexception(String s)
    {
        super(s);
        this.errorString = s;
       
        
    }
}
