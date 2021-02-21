
package inh;
public class Inh {

    
    public static void main(String[] args) {
        
        Father fath_obj;
        fath_obj = new Father();
        fath_obj.add();
        
        Son son_objt;
        son_objt = new Son();
        son_objt.add();
        System.out.println(son_objt.a);
        System.out.println(son_objt.b);
        System.out.println("Valeu of C = "+son_objt.c);
        
    }
    
}
