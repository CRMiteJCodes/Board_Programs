import java.util.Scanner;
public class PhoneNo_freq
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Phone no");
        long q=scan.nextLong();
        long rem1=0;
        int a[]=new int[10];
        int rem=0;
        long num=q;
        for(int j=9; j>=0; j--)
        {
        while(num>0)
        {
            rem1=num%10;
            rem=(int)rem1;
            a[j]=rem;
            num=num/10;
            j--;
        }
        }
        int c1=0, c2=0, c3=0, c4=0, c5=0, c6=0, c7=0, c8=0, c9=0, c0=0;
        for(int i=0; i<10; i++)
        {
            if(a[i]==1)
            {
                c1++;
            }
            else if(a[i]==2)
            {
                c2++;
            }
            else if(a[i]==3)
            {
                c3++;
            }
            else if(a[i]==4)
            {
                c4++;
            }
            else if(a[i]==5)
            {
                c5++;
            }
            else if(a[i]==6)
            {
                c6++;
            }
            else if(a[i]==7)
            {
                c7++;
            }
            else if(a[i]==8)
            {
                c8++;
            }
            else if(a[i]==9)
            {
                c9++;
            }
            else
            {
                c0++;
            }
        }
        System.out.println("Frequency of Numbers:");
        System.out.println("1    "+c1);
        System.out.println("2    "+c2);
        System.out.println("3    "+c3);
        System.out.println("4    "+c4);
        System.out.println("5    "+c5);
        System.out.println("6    "+c6);
        System.out.println("7    "+c7);
        System.out.println("8    "+c8);
        System.out.println("9    "+c9);
        System.out.println("0    "+c0);
    }
}