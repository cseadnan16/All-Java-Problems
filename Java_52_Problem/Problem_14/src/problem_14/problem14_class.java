
package problem_14;
import java.util.Scanner;
public class problem14_class {
    Scanner input =   new Scanner (System.in);
    void hour_of_characters(int T)
    {
        for(int i=1;i<=T;i++){            
                        
            System.out.print("\nEnter the string: ");
            String s = input.nextLine();
            
        
            System.out.print("Chose your any Character: ");
            char ch = input.next().charAt(0);
        
            int len = s.length();
            int letter_num = find_caracter(s,ch,len);

            if(letter_num>0){
                System.out.printf("Occurence of '%c' in '%s' = %d\n",ch,s,letter_num);
            }else{
                System.out.printf("'%c' is not present\n",ch);
            }
            input.nextLine();
        }
    }
    
    int find_caracter(String s, char ch, int len){
        int j,count=0;
        for(j=0;j<len;j++){
            if(s.charAt(j)==ch){
                count++;
            }
        }
        return count;
    }    
}
