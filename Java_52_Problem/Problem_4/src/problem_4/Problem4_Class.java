
package problem_4;
import java.util.Scanner;
public class Problem4_Class {
    void factorize(int T){
        Scanner input1 = new Scanner(System.in);
        int i,j,N;
        
        for(i=1;i<=T;i++){
            System.out.print("\nEnter the value of N: ");
            N = input1.nextInt();
            
            System.out.print("Case: ");
            for(j=1;j<=N;j++){
                if(N%j!=0){
                    System.out.print(j);
                    System.out.print(" \t");
                }
            }
            System.out.print("\n");
        }
    }
}
