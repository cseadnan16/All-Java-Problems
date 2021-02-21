
package inh;

public class Father {
     int a=20,b=30,c; //here a, b and c is instance Variable.
    
    public void add(){
        this.c = this.a+this.b;
        System.out.println(this.c);
    }
}
