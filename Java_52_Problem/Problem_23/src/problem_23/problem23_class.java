package problem_23;

import java.util.Scanner;

public class problem23_class {
    Scanner console = new Scanner(System.in);
    void letter_to_num(int t){
        for(int i=1;i<=t;i++){
            System.out.print("\nPlease enter UpperCase Letter: ");
            String s = console.nextLine();
            
            int count =0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)>='A' && s.charAt(j)<='Z'){
                    count++;
                }else{
                    System.out.println("Sorry! Your input has lowercase letter,"
                            + "Please enter UpperCase Letter.");  
                    break;
                }
            }
            
            if(s.length()==count){
                for(int j=0;j<s.length();j++){               
                    System.out.printf("%d",s.charAt(j)-64);              
                }
            }           
            System.out.println();  
        }
    }
}
