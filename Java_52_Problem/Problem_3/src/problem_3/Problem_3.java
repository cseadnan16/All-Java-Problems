
package problem_3;

import java.util.Scanner;
public class Problem_3 {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); 
        System.out.print("T = ");
        int T = input.nextInt();
        
        Problem3_Class a;
        a = new Problem3_Class();
        a.downward(T);
    }
}
