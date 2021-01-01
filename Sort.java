import java.util.Scanner;

import javax.xml.namespace.QName;

import java.util.Arrays;
import java.util.Collections;


// * Counting Sort
public class Sort {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // Number of ints we have
        int C = sc.nextInt();   // Max number of different ints
        sc.nextLine();
        int[] initial = new int[N];
        int[] counts = new int[C];

        for (int i = 0; i < N; i++) {
            initial[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            counts[initial[i] - 1]++;
        }

        for (int i = 1; i < C; i++) {
            counts[i] = counts[i] + counts[i - 1];
        }

        System.out.println(Arrays.toString(counts));

        for (int i = 0; i < C; i++) {
            int k = counts[i];  // k becomes 5
            int x = 0;
            if (i != 0) {
                x = counts[i - 1];
            }
            while (k > x) {
                initial[k - 1] = i + 1;
                k--;
                System.out.print(i + 1);
                System.out.print(" ");
            }
            // System.out.println(Arrays.toString(initial));
            
        }
        // System.out.println(Arrays.toString(initial));

        System.out.println();
        sc.close();
    }
}
