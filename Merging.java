import java.util.Scanner;
public class Merging
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 5 elements");
        int a[]=new int[5];
        for(int i=0; i<a.length; i++)
        {
            a[i]=scan.nextInt();
        }
        System.out.println("Enter 5 elements");
        int b[]=new int[5];
        for(int i=0; i<b.length; i++)
        {
            b[i]=scan.nextInt();
        }
        int c[]=new int[a.length+b.length];
        int count=-1;
        for(int i=0; i<a.length; i++)
        {
            c[++count]=a[i];
        }
        for(int i=0; i<b.length; i++)
        {
            c[++count]=b[i];
        }
        System.out.println("Array");
        for(int i=0; i<c.length; i++)
        {
            System.out.println(c[i]);
        }
    }
} 