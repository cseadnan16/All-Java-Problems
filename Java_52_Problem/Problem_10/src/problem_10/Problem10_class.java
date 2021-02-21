package problem_10;
 
import java.util.Scanner;
public class Problem10_class {
    Scanner input = new Scanner(System.in);
    void run_rate(int T){
        int i,r1,r2,ball;
        double current_rr,required_rr;
        
        for(i=1;i<=T;i++){
            System.out.print("\nr1, r2 & ball: ");
            r1 = input.nextInt();
            r2 = input.nextInt();
            ball = input.nextInt();
            
            double played_over = (300-ball)/6.0;
            System.out.printf("Played Over: %.2f\n",played_over);
            
            double remaining_over = ball/6.0;
            System.out.printf("Remaining Over: %.2f\n",remaining_over);
            
            current_rr = r2/played_over;
            required_rr =((r1-r2)+1)/remaining_over;
            
            System.out.printf("Current Run Rate: %.2f\n",current_rr);
            System.out.printf("Required Run Rate: %.2f\n",required_rr);
            
        }
    }
}
