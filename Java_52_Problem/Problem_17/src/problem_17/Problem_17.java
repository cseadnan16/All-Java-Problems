
package problem_17;

import java.util.Scanner;

public class Problem_17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("T = ");
        int T = input.nextInt();
        
        problem17_class a;
        a = new problem17_class();
        a.vowels_count(T);
    }
    
}
