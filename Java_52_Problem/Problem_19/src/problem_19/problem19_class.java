
package problem_19;

import java.util.Scanner;

public class problem19_class {
    Scanner input = new Scanner(System.in);
    void word_count1(int t){
        int i,j,count;
        for(i=1;i<=t;i++){
            System.out.print("\nEnter the string: ");
            String s = input.nextLine();
            
            for(j=0,count=0;s.charAt(j)!='\0';j++){
                if(s.charAt(j)==' '){
                    count++;
                }
            }
            System.out.println("Count = "+(count+1));
                    
        }
    }
}
