
package problem_52;

import java.util.Scanner;

public class problem52_class {
    Scanner console = new Scanner(System.in);
    void search_2(int t){
        for(int i=1;i<=t;i++){
            System.out.print("\nEnter String1 and String2: ");
            String s1=console.next();
            
            //System.out.print("Enter String 2: ");
            String s2=console.next();
            substring_finding(s1, s2);
            
        }
    }
    
    void substring_finding(String s1,String s2){
        int length1=s1.length(), length2=s2.length();
        //System.out.println("Length1: "+s1.length());
        int i,j,count=0;
        for(i=0;i<length1;i++){
            if(s2.charAt(0)==s1.charAt(i)){
                for(j=1;j<length2;j++){
                    if(s2.charAt(j)!=s1.charAt(j+i)){
                        break;
                    }                                           
                }
                if(j==length2){
                    count++; 
                    //System.out.printf("i = %d\n",i);
                    System.out.printf("Count = %d\n",count);
                }
            }
        }
       //System.out.printf("i = %d\n",i);
        //System.out.printf("Count = %d\n",count);        
        
        
        
    }
}


