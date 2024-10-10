import java.util.Scanner;
public class EvilOdious
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=scan.nextInt();
        int t=a;
        String res="";
        while(t>0)
        {
            int d=t%2;
            res=d+res;
            t=t/2;
        }
        int t1=Integer.parseInt(res);
        System.out.println("Binary Equivalent: "+res);
        int ct=0;
        for(int i=0; i<res.length(); i++)
        {
            if(res.charAt(i)=='1')
            ct++;
        }
        if(ct%2==0)
        System.out.println("Evil");
        else
        System.out.println("Odious");
    }
}