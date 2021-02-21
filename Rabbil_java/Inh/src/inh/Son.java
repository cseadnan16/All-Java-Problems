
package inh;
/* 
below, Declare Inharitance by "extends" keyword.
Here, Father is a super class and Son is a sub class.
*/
public class Son extends Father{
    public void add() // here, function overloading
    {
        this.c = this.a-this.b;
        System.out.println(this.c);
    }
}
