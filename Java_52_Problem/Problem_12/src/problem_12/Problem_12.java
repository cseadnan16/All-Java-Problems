package problem_12;

import java.util.Scanner;

public class Problem_12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("T = ");
        int T = input.nextInt();
        
        problem12_class a; 
        a = new problem12_class();
        a.factorial_100(T);
    }
    
}
