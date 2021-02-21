
package overloading;

import java.util.Scanner;
public class OverLoading {

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int x,y;
        System.out.print("Enter x: ");
        x = input.nextInt();
        System.out.print("Enter y: ");
        y = input.nextInt();
        
        OverLoadingClass m; // Object creat. here m is object
        m = new OverLoadingClass();
        m.sum(x, y);
        m.sum(x, y, 10);
    }
    
}
