import java.util.Scanner;
class java
{
    public static void main(String[]args)
    {
        int a,i;
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter number :");
        a=sc.nextInt();
        
        for(i=1; i<a; i++)
        {
            System.out.println("*");
        }
    }
}