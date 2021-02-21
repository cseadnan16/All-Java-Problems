
package problem_11;

import java.util.Scanner;

public class Problem_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("T = ");
        int T = input.nextInt();
        
        problem11_class a;
        a = new problem11_class();
        a.factorial(T);
    }
    
}
