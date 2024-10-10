import java.util.Scanner;
public class Automorphic
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=scan.nextInt();
        int sqr=a*a;
        int sq=a*a;
        int c=-1;
        System.out.println(sqr);
        while(sq!=0)
        {
            sq=sq/10;
            c++;
            System.out.println(sq);
        }
        System.out.println(c);
        int m=(int)(sqr%Math.pow(10,c));
        if(a==m)
        System.out.println("aoutomorphic number");
        else      
        System.out.println("Not automorphic number");
    }
}