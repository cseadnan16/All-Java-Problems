
package problem_39;

import java.util.Scanner;

public class problem39_class {
    Scanner console = new Scanner(System.in);
    void palindrom(int t){        
        for(int i=1;i<=t;i++){
            System.out.print("\nEnter string: ");
            String s = console.next();
            palindrom_process(s);
            
        }
    }
    
    void palindrom_process(String string){
        int i,j,length,count=0;
        length = string.length();
        for(i=0,j=length-1;i<length;i++,j--){
            if(j>=0){
                if(string.charAt(i)==string.charAt(j)){
                    count++;
                }else{
                    System.out.println("Sorry! It is not palindrom.");
                    break;
                }
            }
            
        }
        if(count==length){
            System.out.println("Yes! It is palindrom.");
        }
    }
}
