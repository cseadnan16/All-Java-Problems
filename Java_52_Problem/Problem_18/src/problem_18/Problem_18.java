
package problem_18;

import java.util.Scanner;


public class Problem_18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("T = ");
        int T = input.nextInt();
        
        problem18_class a = new problem18_class();
        a.vowel_consonent(T);
    }
    
}
