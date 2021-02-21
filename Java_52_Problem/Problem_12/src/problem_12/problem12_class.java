package problem_12;

import java.util.Scanner;

public class problem12_class {
    
    void factorial_100(int T){
        Scanner input = new Scanner(System.in);
        int i,n;
        
        for(i=1;i<=T;i++){
            System.out.print("\nEnter n: ");
            n = input.nextInt();            
            
            int zero_num = zero_count(n);
            System.out.println("Ending Zero is: "+zero_num);
        }            
    }
    
    int zero_count(int n)
    {
        int i,temp,zero = 0;
        for(i=5;i<=n;i=i+5){
            zero++;
            temp = i/5;
            while(temp>=5 && temp%5==0){                
                zero++;
                temp = temp/5;                
            }
        }
        return zero;        
    }
}
