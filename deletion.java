import java.util.Scanner;
public class deletion
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
        System.out.println("Enter the pos to delete");
        int pos=scan.nextInt();
        for(int i=pos-1; i<a.length-1; i++)
        {
            a[i]=a[i+1];
        }
        System.out.println("Array");
        for(int i=0; i<a.length-1; i++)
        System.out.println(a[i]);
    }
}