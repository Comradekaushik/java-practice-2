import java.util.ArrayList;

public class arrayPractice {

    public static void main(String[] args){
        // String name = "And this is shit";
        // System.out.println(name.charAt(2));
        // String name2 = "Sweetheart";
        // String name3 = name +" "+ name2;
        // System.out.println(name3);
        // System.out.println(name3.substring(1,5));
        // String strarray[] = {"hello", "there", name, name2, name3};
        // System.out.println("------------*--------------");
        // for (String strarrayelements : strarray ) {
        //     System.out.println(strarrayelements);            
        // }

        //All the substrings of a string

        // String testarray[] = new String[5] ;
        // testarray[0] = "Hello";

        // System.out.println(testarray[2]);

        // arrayofsubstrings("My name is kaushik");
           issubstring("name","what is your name?" );
        

    }
    public static void arrayofsubstrings(String argument){
        
        ArrayList<String> substrarr  = new ArrayList<String>(5);
        for(int i = 0;i<argument.length();i++){
            for(int j = i+1;j<argument.length()+1;j++){
                substrarr.add(argument.substring(i,j));

            };
        }

        for(String substr: substrarr){
            System.out.println(substr);
        }


    }

    public static void issubstring(String substring, String argument){
        
        ArrayList<String> substrarr  = new ArrayList<String>(5);
        for(int i = 0;i<argument.length();i++){
            for(int j = i+1;j<argument.length()+1;j++){
                substrarr.add(argument.substring(i,j));

            };
        }

        for(String substr: substrarr){
            if(substr.equals(substring) ){
                System.out.println("Yes");
                return;
            }

            // System.out.println("hello");
        }



    }

    public static void main(int array[][]){
        
    }
    
}

