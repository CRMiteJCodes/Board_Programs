import java.util.Scanner;
public class StrongNumber
{
    public static double Factorial(int n)
    {
        int f=1;
        for(int i=1; i<=n; i++)
        {
            f=f*i;
        }
        return f;
    }
    public static double Sum(int num)
    {
        double sum=0;
        int dig=0;
        while(num>0)
        {
            dig=num%10;
            sum=sum+Factorial(dig);
            num=num/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=scan.nextInt();
        double sum=Sum(a);
        if(a==sum)
        System.out.println("It's a strong number");
        else 
        System.out.println("Not a strong number");
        System.exit(0);
    }
}
 