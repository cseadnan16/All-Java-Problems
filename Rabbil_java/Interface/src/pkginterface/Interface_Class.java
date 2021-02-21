package pkginterface;

interface first{
     void first_mathod();
}
interface second{
     void second_mathod();
}
interface sum{
     void third_mathod();
}
interface fourth{
     void fourth_mathod();
}

public class Interface_Class  implements first,sum{
    @Override
    public void first_mathod(){
        System.out.println("Adnan Al Nowshad");
    }
    public void third_mathod(){
        int  a = 5,b = 10,sum;
        sum = a+b;
        System.out.println("Sum Value = "+sum);
    }
    
}
