
package problem_19;

import java.util.Scanner;

public class Problem_19 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("T = ");
        int T = input.nextInt();
        
        problem19_class a = new problem19_class();
        a.word_count1(T);
    }
    
}
