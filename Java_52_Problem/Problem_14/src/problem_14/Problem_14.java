package problem_14;
import java.util.Scanner;
public class Problem_14 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("T = ");
       int T = input.nextInt();
       
       problem14_class a = new problem14_class();
       a.hour_of_characters(T);
    }
    
}
