import java.util.Scanner;
public class IbsnCheck
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a 10 digit isbn no");
        long a=scan.nextLong();
        String b=a+"";
        if(b.length() !=10)
        {
            System.out.println("Not legal 10 digits required");
        }
        long sum=0;
        for(int i=0; i<b.length(); i++)
        {
            String w=b.charAt(i)+"";
            int q=Integer.parseInt(w);
            sum+=(i+1)*q;
        }
        if(sum%11==0)
        System.out.println("legal ibsn");
        else
        System.out.println("illegal ibsn");
    }
}

          