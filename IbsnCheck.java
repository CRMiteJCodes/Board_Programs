//ISBN is a ten-digit unique number. With the help of the ISBN, we can easily find any book. 
//The ISBN number is a legal number when 1*Digit1 + 2*Digit2 + 3*Digit3 + 4*Digit4 + 5*Digit5 + 6*Digit6 + 7*Digit7 + 8*Digit8 + 9*Digit9 + 10*Digit10 is divisible by 11. 
//The digits are taken from right to left. So, if the ten-digit number is 7426985414, Digit1 and Digit10 will be 4 and 7, respectively.
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

          
