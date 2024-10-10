import java.util.Scanner;
public class insertion
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 10 array elems");
        int a[]=new int[10+1];
        for(int i=0; i<a.length-1; i++)
        {
            a[i]=scan.nextInt();
        }
        System.out.println("Enter an element to insert");
        int b=scan.nextInt();
        System.out.println("Enter the position"); 
        int pos=scan.nextInt();
        for(int i=a.length-1; i>=pos; i--)
        {
            a[i]=a[i-1];
        } 
        a[pos-1]=b;
        System.out.println("New Array");
        for(int i=0; i<a.length; i++)
        System.out.println(a[i]);
    }
}  