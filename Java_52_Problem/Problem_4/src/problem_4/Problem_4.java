package problem_4;
import java.util.Scanner;
public class Problem_4 {    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("T = ");
       int T = input.nextInt();
       
       Problem4_Class a;
       a = new Problem4_Class();
       a.factorize(T);
    }  
}
