public class StringPractice {
    public static void main(String[] args){
        String str1 = "Hello i am kaushik";
        System.out.println(str1);
        char[] arr2 = {'a','b','c'};
        System.out.println(arr2[0]);
        System.out.println(str1.charAt(2));

        System.out.println(str1.length());
        System.out.println(str1.charAt(2));
        System.out.println(str1.substring(1, 6));
        System.out.println(str1.substring(1));

        String kw = new String("I am king");
        System.out.println(kw.equals(str1));
        char[] arr34 = str1.toCharArray();
        for(int i = 0;i<arr34.length;i++){
            System.out.println(arr34[i]);
        }
    }
    
}
