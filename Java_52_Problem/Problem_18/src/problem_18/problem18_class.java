
package problem_18;

import java.util.Scanner;

public class problem18_class {
    Scanner input = new Scanner(System.in);
    
    void vowel_consonent(int t){
        int i,j;
        for(i=1;i<=t;i++){
            System.out.print("\nEnter the string: ");
            String s = input.nextLine();
            
            for(j=0;j<s.length();j++){
                if(s.charAt(j)=='a'||s.charAt(j)=='e'||
                  s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u'){
                    
                    System.out.print(s.charAt(j));
                } 
            }
            System.out.print("\n");
            for(j=0;j<s.length();j++){
                if(s.charAt(j)!='a' && s.charAt(j)!='e' &&
                  s.charAt(j)!='i' && s.charAt(j)!='o' 
                  && s.charAt(j)!='u' && s.charAt(j)!=' '){
                    
                    System.out.print(s.charAt(j));
                } 
            }
            System.out.print("\n");
        }
        
       
    }
}
