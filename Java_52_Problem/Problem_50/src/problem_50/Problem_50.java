
package problem_50;

import java.util.Scanner;


public class Problem_50 {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("T = ");
        int T = input.nextInt();
        
        problem50_class a = new problem50_class();
        a.left_right(T);
    }
    
}
