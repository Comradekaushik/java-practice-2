
import java.util.Scanner;

public class newh {
    public static void main(String[] args) {
        int[] array5 = {1, 5, 7, 9, 11, 13, 15, 17};
        int lower = 0;
        int higher = array5.length - 1;
        boolean found = false;
        int toFind = 7;
        int foundAt = -1; // Initialize with an invalid index
        while (!found && lower <= higher) {
            int midIndex = (lower + higher) / 2; // Calculate midIndex within the loop
            if (array5[midIndex] == toFind) {
                foundAt = midIndex;
                found = true;
            } else if (array5[midIndex] < toFind) {
                lower = midIndex + 1; // Adjust lower bound
            } else {
                higher = midIndex - 1; // Adjust upper bound
            }
        }
        if (found) {
            System.out.println("Found at index: " + foundAt);
        } else {
            System.out.println("Not found");
        }
    }
}

