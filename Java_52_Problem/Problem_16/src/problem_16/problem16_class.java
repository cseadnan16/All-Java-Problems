
package problem_16;

import java.util.Scanner;
 
public class problem16_class {
    Scanner input = new Scanner(System.in);
    void word_disaster(int t){                
        String[] s = new String[t];
        for(int i=0;i<t;i++){            
            //System.out.print("\nEnter String: ");
            s[i] = input.nextLine();
            
            System.out.print("Length = "+s[i].length());
            System.out.printf("\n%s\n",s[i]);
            
            //main_process(s);                        
        }
    }
    void main_process(String s){
        int j,k;
        char[] word = new char[s.length()];
        
        for(j=0,k=0;j<s.length();j++){
                if(s.charAt(j)!=' '){
                    word[k] = s.charAt(j);
                    k++;
                }else if(k>0){
                    //word[k]= '\0';
                    print_reverse(word);
                    k=0;
                }
            }if(k>0){
                //word[k]='\0';
                print_reverse(word);
                System.out.println();
            }
        
    }
    void print_reverse(char word[]){
        for(int i=word.length;i>=0;i--){
            System.out.printf("%c",word[i]);
        }
    }
    
}
