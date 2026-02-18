import java.util.Scanner;
class java
{
    public static void main(String[]args)
    {
        int num,num1,rev=0,rem;
        Scanner hv=new Scanner(System.in);
        System.out.println("enter number :");
        num=hv.nextInt();
        num1=num;
        while(num>0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
            // System.out.println("sum="+rev);
        if(rev==num1)
        {
            System.out.println("palidream");
        }
        else
        {
            System.out.println("not palidream");
        }
    }
} 