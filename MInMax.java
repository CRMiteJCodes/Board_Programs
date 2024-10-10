import java.util.Scanner;
public class MInMax
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 10 elements");
        int a[]=new int[10];
        for(int i=0; i<a.length; i++)
        {
            a[i]=scan.nextInt();
        }
        int max=0;
        int min=a[0];
        for(int i=0; i<a.length; i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
            else if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("Max :"+max);
        System.out.println("Min :"+min);
    }
}