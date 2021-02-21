package problem_3;

import java.util.Scanner;
public class Problem3_Class {
    
    void downward(int T){
        int i,j,n;        
        for(j=1;j<=T;j++){
            Scanner input1 = new Scanner(System.in); 
            System.out.print("\nEnter the value of n: ");
            n = input1.nextInt();
            for(i=n;i>=1;i--){
                if(i%5==0){
                    System.out.print("\n");
                }
                    
                System.out.print(i);
                System.out.print("\t");                 
            }
            System.out.print("\n");
        } 
    }
}
