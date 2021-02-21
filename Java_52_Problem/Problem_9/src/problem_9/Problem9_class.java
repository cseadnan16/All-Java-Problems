
package problem_9;
import java.util.Scanner;

public class Problem9_class {
    
    void full_Square(int T){
        Scanner input = new Scanner(System.in);
        int i,n; 
        for(i=1;i<=T;i++){
            System.out.print("\nEnter n: ");
            n = input.nextInt();
            
            double root = Math.sqrt(n);
            //System.out.println("Rott value: "+root);
            if((int)root * (int)root == n){
                System.out.println("Yes..! Number is full Square.");
            }else{
                System.out.println("Sorry..! Number is not full Square.");
            }
         }
    }
    
    
}
