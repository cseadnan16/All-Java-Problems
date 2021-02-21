
package problem_29;

import java.util.Scanner;


public class Problem_29 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("T = ");
        int T = input.nextInt();
        
        problem29_class a = new problem29_class();
        a.char_identity(T);
    }
    
}
