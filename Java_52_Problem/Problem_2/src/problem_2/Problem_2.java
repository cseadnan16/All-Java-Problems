package problem_2;

import java.util.Scanner;
public class Problem_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("T = ");
        int T = input.nextInt();
        
        problem2_Class x;
        x = new problem2_Class();
        x.odd_even(T);
    }
    
}
