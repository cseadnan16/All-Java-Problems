
package problem_21;

import java.util.Scanner;

public class Problem_21 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("T = ");
        int T = input.nextInt();
        
        problem21_class a = new problem21_class();
        a.string_reverse(T);
    }
    
}
