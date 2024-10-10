import java.util.Scanner;
public class splitting
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an array with 10 elems");
        int a[]=new int[10];
        for(int i=0; i<a.length; i++)
        {
            a[i]=scan.nextInt();
        }
        
        int e[]=new int[10];
        int o[]=new int [10];
        int ei=-1;
        int oi=-1;
        for(int i=0; i<a.length; i++)
        {
            if(a[i]%2==0)
            e[++ei]=a[i];
            else
            o[++oi]=a[i];
        }
        System.out.println("even elements");
        for(int i=0; i<=ei; i++)
        {
            System.out.println(e[i]);
        }
        System.out.println("odd elements");
        for(int i=0; i<=oi; i++)
        {
            System.out.println(o[i]);
        }
    }
}