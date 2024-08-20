public class factorial {

    static int findfactorial(int f){
        if(f == 1){
            return 1;
        }
        else{
            
            return (f * findfactorial(f-1));
        }
        

    }
    public static void main(String[] args) {
        System.out.println(factorial.findfactorial(10));

        
    }
    
}
