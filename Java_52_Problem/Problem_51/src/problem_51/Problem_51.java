
package problem_51;

import java.util.Scanner;


public class Problem_51 {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("T = ");
        int T = input.nextInt();
        
        problem51_class a = new problem51_class();
        a.search_1(T);
    }
    
}
