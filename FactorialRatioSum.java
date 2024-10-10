//i by iFactorial, i from 1 to a
import java.util.Scanner;
public class FactorialRatioSum
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the limit for FofF");
        int a=scan.nextInt();
        int f=1;
        int sum=0;
        for(int i=1; i<=a; i++)
        {
            f=f*i;
            //System.out.println(f);
            sum+=i/f;
        }
        System.out.println(sum);
    }
}