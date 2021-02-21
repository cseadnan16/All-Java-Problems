
package problem_1;
import java.util.Scanner;

public class Problem_1 {
    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        
        System.out.print("T = ");
        int T = input.nextInt();
        
        Problem1_Class a;
        a = new Problem1_Class();
        a.odd_even(T);  
    }   
}
