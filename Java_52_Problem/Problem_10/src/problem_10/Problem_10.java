
package problem_10;

import java.util.Scanner;

public class Problem_10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("T = ");
        int T = input.nextInt();
        
        Problem10_class a = new Problem10_class();
        a.run_rate(T);
    }
    
}
