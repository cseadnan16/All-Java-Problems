package problem_5;
import java.util.Scanner;
public class Problem5_Class {
    Scanner input = new Scanner(System.in);
    void box1(int T){
        int i,j,k,n;
        for(i=1;i<=T;i++){
            System.out.print("\nEnter the value of n: ");
            n = input.nextInt();
            
            for(j=1;j<=n;j++){
                for(k=1;k<=n;k++){
                    System.out.print("*");
                }
                System.out.println(); //System.out.print("\n")
            }
        }
    }
}
