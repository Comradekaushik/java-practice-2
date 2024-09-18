package st2;

public class ImplementingInterfaces implements ExtendingInterfaces {
    @Override public void mymethod1(){
        System.out.println("Hello");


    }
    @Override public void walking(){
        System.out.println("Bye");

    }


    public static void main(String[] args){
        ImplementingInterfaces newclass = new ImplementingInterfaces();
        newclass.mymethod1();
        newclass.walking();

    }

    
}
