package problem_2;
import java.util.Scanner;
public class problem2_Class {
     void odd_even(int T){
         for(int i=1; i<=T;i++){
             
             Scanner input1 = new Scanner(System.in);
             System.out.print("\nInput: ");
             String s = input1.nextLine();
             
             int len = s.length();
             System.out.println("Number Length: "+len);
             char ch = s.charAt(len-1); /* "charAt()" means "character at the 
                                        specified index in a string"*/
             
             if(ch%2==0){
                 System.out.println("Number Type: Even");
             }else{
                 System.out.println("Number Type: Odd");
             } 
             
             /*System.out.println("Output: "+s);
             System.out.println("Last value : "+ch);*/  
         } 
     }

    
     

    
}
