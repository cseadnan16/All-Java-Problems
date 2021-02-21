package problem_22;

import java.util.Scanner;

public class problem22_class {

    int[] array = new int[26];

    void seive() {

        try {

            System.out.println("Array length =  " + array.length);
            for (int i = 2; i < array.length; i++) {
                array[i] = 1;
            }

            int root = (int) Math.sqrt(array.length);
            System.out.println("root value =  " + root);

            //int i = 2;
            for (int i = 2; i < root; i++) {
                for (int j = i; j <= array.length;) {
                    if (array[i] == 1) {
                        array[j + i] = 0;
                    }
                    j = j + i;
                    //System.out.printf("j=%d, i=%d\n", j, i);
                }
                //i = i + 1;
                System.out.printf("i=%d\n", i);
            }
        } catch (Exception e) {
            System.out.println("Problem =  " + e);
        }

    }

    void prime_number(int t) {
        Scanner console = new Scanner(System.in);
        int i, j, count;
        for (i = 1; i <= t; i++) {
            System.out.printf("\nEnter the value a & b: ");
            int a = console.nextInt(), b = console.nextInt();

            count = 0;
            for (j = a; j <= b; j++) {
                //System.out.println("Array[2] =  " + array[a]);
                try {
                    if (array[j] == 1) {
                        count++;
                        System.out.printf("Array[%d] = %d\n", j, array[j]);
                    }
                } catch (Exception e) {
                    System.out.println("Problem =  " + e);
                }

            }
            System.out.printf("%d\n", count);

        }
    }

}
