package st2;

public class newstrpractice {
    static String capitalizeFirstChar(String str){
        String[] words = str.split(" ",0);
        StringBuffer sb = new StringBuffer("");
        for(int i = 0 ; i< words.length;i++){
            String capitalizednewstringfirstchar = Character.toString(words[i].charAt(0)).toUpperCase();
            sb.append(capitalizednewstringfirstchar);
            sb.append(new String(words[i]).substring(1));
            if(i!= words.length - 1){
            sb.append(" ");
            } 
        }
        return sb.toString();
 
    }
    public static void main(String[] args) {
        System.out.println(capitalizeFirstChar("hello my friend"));
    }
}
