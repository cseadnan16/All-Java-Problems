
package overloading;

public class OverLoadingClass {
    public void sum(int a, int b){
        int c = a+b;
        System.out.println("Integer Result is: "+c); 
    }
    
    public void sum(int a,int b,int d){
        float c = a+b+d;
        System.out.println("Floating Result is: "+c); 
    }
}
