package problem_29;

import java.util.Scanner;

public class problem29_class {
    Scanner console = new Scanner(System.in);
    void char_identity(int t){
        for(int i=1;i<=t;i++){
            System.out.print("\nEnter any character: ");
            char ch = console.next().charAt(0);

            if(ch>='a'&&ch<='z'){            
                System.out.println("Lowercase character");
            }else if(ch>='A'&&ch<='Z'){
                System.out.println("Uppercase character");
            }else if(ch>='0'&&ch<='9'){
                System.out.println("Numericla Digit");
            }else{
                System.out.println("Special character");
            }
        }
    }
    
}
