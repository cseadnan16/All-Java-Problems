
package problem_6;
import java.util.Scanner;
public class Problem_6 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("T = ");
        int T = input.nextInt();
        
        Problem6_Class a; 
        a = new Problem6_Class();
        a.totalize(T);
    }
    
}
