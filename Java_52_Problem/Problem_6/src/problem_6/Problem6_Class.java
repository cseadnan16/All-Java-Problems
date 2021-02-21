package problem_6;
import java.util.Scanner;
public class Problem6_Class {

    void totalize(int T){
        Scanner input = new Scanner(System.in);
        int i,n,sum,LSD,MSD;
        
        for(i=1;i<=T;i++){
            System.out.print("\nEnter value of n: ");
            n = input.nextInt();
            
            LSD = n%10;
            //System.out.println("LSD = "+LSD);
            int count =0;
            while(n!=0){
               MSD = n%10;
               n = (n-MSD)/10;
               count++;
               if(n==0){
                   if(count<5){
                       System.out.println("Sorry ! Your digit less than 5\n"
                               + "Please enter the 5 digit.");
                   }
                   else if(count>5){
                       System.out.println("Sorry ! Your digit more than 5\n"
                               + "Please enter the 5 digit.");
                   }
                   else{
                        sum = MSD + LSD;
                        System.out.println("Sum = "+sum); 
                   }
                   
               }
            } 
        }
    
    }
}
