
package problem_5;
import java.util.Scanner;
public class Problem_5 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        
        System.out.print("T = ");
        int T = input.nextInt(); 
        
        Problem5_Class a = new Problem5_Class();
        a.box1(T);
        
        
    }
    
}
