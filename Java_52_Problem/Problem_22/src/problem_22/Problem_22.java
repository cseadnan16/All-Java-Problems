
package problem_22;

import java.util.Scanner;


public class Problem_22 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                
        problem22_class a = new problem22_class();
        a.seive();
        
        System.out.print("T = ");
        int T = input.nextInt();
        a.prime_number(T);
    }
    
}
