
package problem_39;

import java.util.Scanner;

public class Problem_39 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("T = ");
        int T = input.nextInt();
        
        problem39_class a = new problem39_class();
        a.palindrom(T);
    }
    
}
