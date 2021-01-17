import java.util.Scanner;

public class SyncLists {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        while (n != 0) {
            int[] firstArr = new int[n];
            int[] secondArr = new int[n];

            for (int i = 0; i < n; i++) { firstArr[i] = sc.nextInt(); }

            for (int i = 0; i < n; i++) { secondArr[i] = sc.nextInt(); }

            // Sort both lists (make copy of first list)

            // Find index given each item in first list

            // Use that index to find the corresponding element in the second list
            
            // Print the integer on a line
            n = sc.nextInt();
        }
        sc.close();
        return;

    }
    
}
