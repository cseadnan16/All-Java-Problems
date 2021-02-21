
package problem_11;
import java.util.Scanner;
public class problem11_class {
    
    void factorial(int T){
        Scanner input = new Scanner(System.in);
        int i,j,n;
        long fact;
        for(i=1;i<=T;i++){
            System.out.print("\nEnter the Value: ");
            n = input.nextInt();
            
            fact=1;
            j=1;
            while(j<=n){
               fact = fact*j;
               j++;
            }
            System.out.println("Factorial Value: "+fact);
        }
        
    }
}
