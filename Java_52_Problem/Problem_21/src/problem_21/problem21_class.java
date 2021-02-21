
package problem_21;

import java.util.Scanner;


public class problem21_class {
    Scanner input = new Scanner(System.in);
    void string_reverse(int t){
        int i,j;
        for(i=1;i<=t;i++){
            System.out.print("\nEnter the String: ");
            String s = input.nextLine();
            print_reverse(s);
            
        }
    }
    void print_reverse(String s){
        char[] temp = new char[1];
        int j,k;
        for(j=s.length()-1,k=0;j>=0;j--){
            temp[k] = s.charAt(j);
            System.out.printf("%c",temp[k]);
        }
        System.out.println(); 
    }
}
