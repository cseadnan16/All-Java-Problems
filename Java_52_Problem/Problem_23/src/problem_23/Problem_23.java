
package problem_23;

import java.util.Scanner;

public class Problem_23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("T = ");
        int T = input.nextInt();
        
        problem23_class a = new problem23_class();
        a.letter_to_num(T);
    }
    
}
