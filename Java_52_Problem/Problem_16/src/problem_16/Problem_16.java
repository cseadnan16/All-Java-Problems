
package problem_16;
import java.util.Scanner;

public class Problem_16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("T = ");
        int T  = input.nextInt();
        
        problem16_class a = new problem16_class();
        a.word_disaster(T);
        
    }
    
}
