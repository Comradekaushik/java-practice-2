package st2;

public class SplitStrings {
    public static void main(String[] args) {
        String myname = "King of the ring conqueror of the holy place the ruin of empires the end of civilizations the slayer of the kings the leader of the lost Commandeer PETN Salamat Anand Kaushik";

        // Corrected split method usage
        String[] newarr = myname.split(" ",5);

        // Printing the array elements
        for (String word : newarr) {
            System.out.println(word);
        }
    }
}
