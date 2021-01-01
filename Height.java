// * Insertion Sort: https://www.youtube.com/watch?v=lCDZ0IprFw4&ab_channel=JoeJames
import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int p = Integer.parseInt(sc.nextLine());
        int p = sc.nextInt();
        sc.nextLine();

        // Do p times for p datasets
        for (int i = 0; i < p; i++) {
            int k = sc.nextInt();           // Dataset number
            int[] heights = new int[20];    // Give me 20 slots for 20 heights
            
            for (int j = 0; j < 20; j++) {
                // Build my array of heights
                heights[j] = sc.nextInt(); 
            }
            sc.nextLine();    

            int steps = 0;

            // * Visualise students standing behind each other; students taller than him must STEP BACK
            for (int j = 0; j < 20; j++) {
                int next = heights[j];  // * This is the guy we want to swap, so create a tmp variable for him
                
                // * How do I know where to start checking from? From start of already sorted part
                // * inner loop: loop through all elements BEFORE jth element
                for (int z = j - 1; z >= 0; z--) {
                    // * Run only if z is positive
                    if (z >= 0) {
                        // * If you find someone taller than you
                        if (heights[z] > next) {
                            heights[z + 1] = heights[z];    // That guy steps back
                            heights[z] = next;              // You take his place
                            steps++;
                        } else {
                            break;
                        }
                    }
                }
            }
            System.out.println(k + " " + steps);
        }
        sc.close();
    }
}