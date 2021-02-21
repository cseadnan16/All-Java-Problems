package problem_9;
import java.util.Scanner;
public class Problem_9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("T = ");
        int T = input.nextInt();
        
        Problem9_class a;
        a = new Problem9_class() ;
        a.full_Square(T);
    }
    
}
