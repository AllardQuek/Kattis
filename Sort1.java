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
        int[] order = new int[C];

        for (int i = 0; i < N; i++) {
            initial[i] = sc.nextInt();
        }
        
        boolean done = false;
        for (int i = 0; i < N; i++) {
            done = false;
            for (int j = 0 ; j < C; j++) {
                if (initial[i] == j + 1) {
                    System.out.println("EHRE");
                    order[j] = initial[i];
                    done = true;
                    break;
                }
            }
        }
        // for (int i = 0; i < C; i++ ) {
        //     for (int j = 0; j < N; j++) {
        //         if (initial[j] == i + 1) {
        //             order[i] = initial[j];
        //             break;
        //         }
        //     }
        // }

        // int a = 0;
        // int b = 0;
        // for (int i = 0; i < N; i++) {
        //     counts[initial[i] - 1]++;
        //     if (initial[i] != a) {
        //         System.out.println(i);
        //         order[b] = initial[i];
        //         b++;
        //         a = initial[i];
        //     }
        // }
        System.out.println(Arrays.toString(order));



        // for (int i = 1; i < C; i++) {
        //     counts[i] = counts[i] + counts[i - 1];
        // }

        // System.out.println(Arrays.toString(counts));

        // int k = N - 1;

        // for (int i = 0; i < C; i++) {
        //     while (counts[i] > ) {
        //         initial[k] = i + 1;
        //         k--;
        //     }
            
            // int k = counts[i];  // k becomes 5
            // int x = 0;
            // if (i != 0) {
            //     x = counts[i - 1];
            // }
            // while (k > x) {
            //     initial[N - k + 1] = i + 1;
            //     k++;
            //     System.out.print(i + 1);
            //     System.out.print(" ");
            // }
            // System.out.println(Arrays.toString(initial));
        // }

        for (int i = 0; i < C; i++) {
            int k = counts[i];  // k becomes 5
            int x = 0;
            if (i != 0) {
                x = counts[i - 1];
            }
            while (k > x) {
                initial[k - 1] = i + 1;
                k--;
                // System.out.print(i + 1);
                // System.out.print(" ");
            }
            // System.out.println(Arrays.toString(initial));
            
        }

        for (int i = 0; i < N; i++) {
            
        }

        System.out.println(Arrays.toString(initial));


        System.out.println();
        sc.close();
    }
}
