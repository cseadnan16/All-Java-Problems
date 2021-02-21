
package problem_15;
import java.util.Scanner;
public class Problem_15 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("T = ");
       int T = input.nextInt();
       
       problem15_class a = new problem15_class();
       a.character_count(T);
    }
    
}
