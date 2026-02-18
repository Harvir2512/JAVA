import java.util.Scanner;
class java
{
    public static void main(String[]args)
    {
        int num,num1,sum=0,d;
        Scanner hv=new Scanner(System.in);
        System.out.println("enter number :");
        num=hv.nextInt();
        num1=num;
        while(num>0)
        {
            d=num%10;
            sum=sum+(d*d*d);
            num=num/10;
        }
            // System.out.println("sum="+rev);
        if(num1==sum)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("not Armstrong");
        }
    }
}