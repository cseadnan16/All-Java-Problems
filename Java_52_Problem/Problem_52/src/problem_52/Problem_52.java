package problem_52;

import java.util.Scanner;

public class Problem_52 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("T = ");
        int T = input.nextInt();
        
        problem52_class a = new problem52_class();
        a.search_2(T);
    }
    
}
