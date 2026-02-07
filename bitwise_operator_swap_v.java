import java.util.Scanner;

class Multiplication
{
    public static void main(String[] args)
    {
        int a,b,c;
        
        Scanner harvir= new Scanner(System.in);

        System.out.print("Enter first number: ");
         a =harvir.nextInt(); 
         b =harvir.nextInt(); 

        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}