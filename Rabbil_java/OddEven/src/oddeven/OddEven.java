
package oddeven;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        
        System.out.print("Enter the n: ");
        n = input.nextInt();
        
        OddEvenClass.calculation(n); // static function call without object
        //m = new OddEvenClass();
        //m.calculation(n);
        
    }
    
}
