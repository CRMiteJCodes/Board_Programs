import java.util.Scanner;
public class Bouncy
{
    public static void main(String args[] )
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("ENter a no.");
        int a=scan.nextInt();
        int t=a;
        int p=t%10;
        boolean inc=true, dec=true;
        while(t!=0)
        {
            int d=t/10;
            if(p<d)
            {
                inc=false;
                break;
            }
            p=d;
            t/=10;
        }
        t=a;
        p=t%10;
        while(t!=0)
        {
            int d=t%10;
            if(p>d)
            {
                dec=false;
                break;
            }
            p=d;
            t/=10;
        }
        if(inc==false && dec==false)
        System.out.println("Bouncy");
        else
        System.out.println("Not b");
    }
}

        