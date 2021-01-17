import java.util.Scanner;
import java.util.Arrays;

public class Cups {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int[] radii = new int[n];
    
        for (int i = 0; i < n; i++) {
            String[] line = sc.nextLine().split("\\s+");
            System.out.println(Arrays.toString(line));
            System.out.println(line[0]);
            System.out.println(line[1]);

            // Check if first item is integer using try

            // If integer radius is 1/2 of it, store radius and colour

            // Else store 2nd item as radius and colour

            // Sort in increasing order

            // e.g. 5 red 5 green 7 yellow: print every 2 items on new lines

        }

        sc.close();
    }
    
}
