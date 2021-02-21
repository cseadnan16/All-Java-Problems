
package problem_17;

import java.util.Scanner;


public class problem17_class {
    Scanner input = new Scanner(System.in);
    
    void vowels_count(int t){
        int i,j,count;
        //char[] s = new char[1000];
        for(i=1;i<=t;i++){
            System.out.print("\nEnter the string: ");
            String s = input.nextLine();
            String x = null;
            //s = input.next().toCharArray();
            /*for(j=0,count=0;j<s.length;j++){
                System.out.printf("%c",s[j]);
            }
            System.out.print("\n");*/
        
            for(j=0,count=0;j<s.length();j++){
                if(s.charAt(j)=='a'||s.charAt(j)=='e'||
                  s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u'){
                    count++;
                }                
            }
            System.out.println("Number of vowels = "+count);
        
        }
        
    }
}
