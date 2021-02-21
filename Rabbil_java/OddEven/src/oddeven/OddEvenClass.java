
package oddeven;

public class OddEvenClass {
    public static void calculation(int a) //creat static function method
    {
        int i,count=0,count2=0;
        for(i=1;i<=a;i++)
        {
            if(i%2==0)
            {
                count++;
                //System.out.printf("Number %d is even\n",i);
            }
            else
            {
                count2++;
                //System.out.printf("Number %d is odd\n",i);
            }
        }
        System.out.println("Even number = "+count);
        System.out.println("Odd number = "+count2);     
    }
}
