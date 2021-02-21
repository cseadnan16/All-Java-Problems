
package problem_1;
import java.util.Scanner;

public class Problem1_Class {
    void odd_even(int T){
        Scanner input1; 
        input1 = new Scanner(System.in);
        
        for(int i=1;i<=T;i++){
            System.out.print("Enter n = "); 
            int n = input1.nextInt();
            
            if(n%2==0){
                System.out.print("Even\n");
            }
            else{
                System.out.print("Odd\n");
            }    
        }
    }
}
