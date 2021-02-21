
package problem_50;

import java.util.Scanner;

public class problem50_class {
    Scanner console = new Scanner(System.in);
    void left_right(int t){
        int i,j,k;
        
        for(i=1;i<=t;i++){
            System.out.print("\nEnter string: ");
            String s = console.next();
            char[]temp = new char[s.length()];
            
            for(j=0,k=0;j<s.length();j++){
                if((s.charAt(j)=='L')){
                   temp[k]= s.charAt(j-1);
                   System.out.printf("%c",temp[k]);
                }else if(s.charAt(j)=='R'){
                    temp[k]= s.charAt(j+1);
                    System.out.printf("%c",temp[k]);
                }else{
                    temp[k]= s.charAt(j);
                    System.out.printf("%c",temp[k]);
                }
            }
            System.out.println();
        }       
        
    }
        
    
}
