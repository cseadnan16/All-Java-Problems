
package problem_15;
import java.util.Scanner;
public class problem15_class {
    Scanner input = new Scanner(System.in);
    void character_count(int T){
        int i,j;
        for(i=1;i<=T;i++){
            System.out.print("\nEnter the string: ");
            String s = input.nextLine();
            
            char_proccess(s);                        
        }
    }
    
    void char_proccess(String s){
        int c,i;
        int[] count; // Arry declare.
        count = new int[26]; // Arry creation.
       
        for(int x : count) //for each loop
        {
            x = 0;
        }
        /*
        for(i=0;i<26;i++){
            count[i]=0;
        }*/
        
    
        for(i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){                
                    count[s.charAt(i)-'a']++;            
            } 
        }
        
        for(i=0;i<26;i++)
        {
            if(count[i]!=0){
                System.out.printf("%c = %d\n",'a'+i,count[i]);
            }
        }
    }  
    
}
