
package problem_20;

import java.util.Scanner;

public class Problem_20 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.print("T = ");
        //int T = input.nextInt();
        
        String s = "food".replace('o', '\0');
        char[] ch = {'A','d','\0','n','a','n'};
        System.out.println(ch);
        
   
        System.out.println(s.indexOf('\0')); // "1"
        System.out.println(s.indexOf('d')); // "3"
        System.out.println(s.length()); // "4"
        System.out.println(s.hashCode() == 'f'*31*31*31 + 'd'); // "true"
    }
    
}
